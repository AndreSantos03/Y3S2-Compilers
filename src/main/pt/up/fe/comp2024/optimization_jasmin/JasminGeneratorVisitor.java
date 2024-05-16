package pt.up.fe.comp2024.optimization_jasmin;

import pt.up.fe.comp.jmm.analysis.table.SymbolTable;
import pt.up.fe.comp.jmm.ast.AJmmVisitor;
import pt.up.fe.comp.jmm.ast.JmmNode;
import pt.up.fe.specs.util.SpecsCheck;
import pt.up.fe.specs.util.utilities.StringLines;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.HashSet;
import java.util.Set;

import pt.up.fe.comp.jmm.analysis.table.Symbol;


public class JasminGeneratorVisitor extends AJmmVisitor<Void, String> {

    private final int  stackLimit = 99;
    private final int  localsLimit = 99;

    private final Map<String, String> typeDictionary = new HashMap<String, String>() {{
        put("int", "I");
        put("boolean", "Z");
        put("String", "[Ljava/lang/String;");
        put("void", "V");
    }};

    private static final String NL = "\n";
    private static final String TAB = "   ";

    private final SymbolTable table;

    private JasminExprGeneratorVisitor exprGenerator;

    private String currentMethod;
    private int nextRegister;

    private Map<String, String> classFields = new HashMap<>();
    private Map<String,String> methodFields = new HashMap<>();

    private Map<String, Integer> currentRegisters;

    public JasminGeneratorVisitor(SymbolTable table) {
        this.table = table;
        this.exprGenerator = null;
        currentMethod = null;
        nextRegister = -1;
        currentRegisters = null;
    }


    @Override
    protected void buildVisitor() {
        // Using strings to avoid compilation problems in projects that
        // might no longer have the equivalent enums in Kind class.
        addVisit("Program", this::visitProgram);
        addVisit("ClassDecl", this::visitClassDecl);
        addVisit("MethodDeclaration", this::visitMethodDecl);
        addVisit("Assignment", this::visitAssignStmt);
        addVisit("ReturnDeclaration", this::visitReturnStmt);
        addVisit("SimpleExpression",this::visitSimpleStmt);
        addVisit("ArgumentDecl",this::visitArgStmt);
    }


    private String visitProgram(JmmNode program, Void unused) {
        // Get class decl node
        var classDecl = program.getChildren("ClassDecl").get(0); //imports are child of program, this makes sure class is always accessed
        SpecsCheck.checkArgument(classDecl.isInstance("ClassDecl"), () -> "Expected a node of type 'ClassDecl', but instead got '" + classDecl.getKind() + "'");

        return visit(classDecl);
    }

    private String visitClassDecl(JmmNode classDecl, Void unused) {
        var code = new StringBuilder();
        

        // generate class name
        var className = table.getClassName();
        code.append(".class ").append(className).append(NL);

        String superClassName = table.getSuper();
        
        //no super class
        if(superClassName == ""){
            code.append(".super java/lang/Object").append(NL); //default
        }
        else{
            code.append(".super " + superClassName ).append(NL);
        }

        //class fields
        for(Symbol field : table.getFields()){
            classFields.put(field.getName(),field.getType().getName());
            code.append(".field private ");
            code.append(field.getName()).append(" ");
            code.append(typeDictionary.get(field.getType().getName())).append(NL);
        }

        //default method constructor
        code.append("""
                    .method public <init>()V                                      
                    """);

        code.append(TAB).append(String.format(".limit stack %d",stackLimit)).append(NL);
        code.append(TAB).append(String.format(".limit locals %d",localsLimit)).append(NL);
        code.append(TAB).append("aload_0").append(NL);
        code.append(TAB).append("invokespecial ");
        if(superClassName == ""){
            code.append("java/lang/Object");
        }
        else{
            code.append(table.getSuper());
        }
        code.append("/<init>()V").append(NL);
        code.append(TAB).append("return").append(NL);
        code.append(".end method").append(NL);


        // generate code for all other methods
        for (var method : classDecl.getChildren("MethodDeclaration")) {
            code.append(visit(method));
        }

        return code.toString();
    }

    private String visitMethodDecl(JmmNode methodDecl, Void unused) {

        String methodName;
        if(methodDecl.hasAttribute("methodName")){
            methodName = methodDecl.get("methodName");
        }
        else{
            methodName = "main";
        }
        currentMethod = methodName;

        // set next register that can be used
        // if method is static, then can start at 0
        // if method is not static, 0 contains 'this', and must start at 1
        // for the initial language, there are no static methods
        if(methodDecl.hasAttribute("isStatic")){
            nextRegister = 0;
        }
        else{
            nextRegister = 1;
        }

        // initialize register map and set parameters
        currentRegisters = new HashMap<>();
        for (var param : methodDecl.getChildren("ArgumentDecl")) {
            currentRegisters.put(param.get("argName"), nextRegister);
            nextRegister++;
        }



        exprGenerator = new JasminExprGeneratorVisitor(currentRegisters,table);

        var code = new StringBuilder();
 
        // var publicString = methodDecl.getObject("isPublic", Boolean.class) ? "public " : "";
        var publicString = methodDecl.hasAttribute("isPublic") ? "public " : "";
        var staticString = methodDecl.hasAttribute("isStatic") ? "static " : "";

        var parameterString = "(";
        if(methodName =="main"){
            //if its main function
            parameterString+=typeDictionary.get("String");
        }else{
            for(Symbol param :table.getParameters(methodName)){
                parameterString+=typeDictionary.get(param.getType().getName());
            }
        }
        parameterString+=")";
        parameterString+=typeDictionary.get(table.getReturnType(methodName).getName()); //return type


        code.append("\n.method ").append(publicString).append(staticString).append(methodName).append(parameterString).append(NL);

        // Add limits
        code.append(TAB).append(".limit stack 99").append(NL);
        code.append(TAB).append(".limit locals 99").append(NL);


        // Get code for statement, split into lines and insert the necessary indentation
        for(var stmt :  methodDecl.getChildren()){    

            //Adding to the list of methods locals
            if(stmt.getKind().equals("FieldDeclaration")){
                String typeField = stmt.getChild(0).get("typeName");
                String fieldName = stmt.get("variable");
                methodFields.put(fieldName, typeField);
            }
            //ignore the type child of the method and the field declare
            if(stmt.getKind() !="type" && !stmt.hasAttribute("typeName") && !stmt.getKind().equals("FieldDeclaration")){
                var instCode = StringLines.getLines(visit(stmt)).stream()
                    .collect(Collectors.joining(NL + TAB, TAB, NL));
                code.append(instCode);
            }
        }

        //add return if it's void, it isn't added by default
        if(table.getReturnType(methodName).getName().equals("void")){
            code.append(TAB).append("return").append(NL);
        }

        code.append(".end method\n");

        // reset information
        exprGenerator = null;
        nextRegister = -1;
        currentRegisters = null;
        currentMethod = null;

        return code.toString();
    }

    private String visitAssignStmt(JmmNode assignStmt, Void unused) {
        var code = new StringBuilder();

        // store value in top of the stack in destination
        var destName = assignStmt.get("variable");




        //NORMAL VARIABLE ASSIGNMENT
        if(methodFields.containsKey(destName)){        
            // get register
            var reg = currentRegisters.get(destName);
            // If no mapping, variable has not been assigned yet, create mapping
            if (reg == null) {
                //checks to see if it's a field
                reg = nextRegister;
                currentRegisters.put(destName, reg);
                nextRegister++;
            }
            JmmNode childNode = assignStmt.getChild(0);
            exprGenerator.visit(childNode, code);


            //Class stores differently, its directly in the generator visitor
            if(!childNode.getKind().equals("ClassInstantiationExpression")){

                code.append("istore_").append(reg).append(NL);
            }    
        }        //Fields
        else{ 
            //check if there's a field declaration with the same name
            code.append("aload_0").append(NL); //always 0 because it references the this object
            exprGenerator.visit(assignStmt.getChild(0), code);
            String destType = typeDictionary.get(classFields.get(destName));
            code.append(String.format("putfield %s/%s %s",
            table.getClassName(),destName,destType));

        }

        return code.toString();
    }

    private String visitReturnStmt(JmmNode returnStmt, Void unused) {

        var code = new StringBuilder();

        // generate code that will put the value of the return on the top of the stack

        exprGenerator.visit(returnStmt.getChild(0), code);
        code.append("ireturn").append(NL);

        return code.toString();
    }

    //used mostly for simple function calls, for example a print
    private String visitSimpleStmt(JmmNode simpleStmt, Void unused) {
        var code = new StringBuilder();

        JmmNode childNode = simpleStmt.getChild(0);
    
        exprGenerator.visit(childNode, code);

        return code.toString();
    }


    //we don't need to anything with it
    private String visitArgStmt(JmmNode ArgStmt, Void unused){
        return "";
    }
    
}
