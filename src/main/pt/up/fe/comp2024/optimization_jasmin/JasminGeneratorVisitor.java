package pt.up.fe.comp2024.optimization_jasmin;

import pt.up.fe.comp.jmm.analysis.table.SymbolTable;
import pt.up.fe.comp.jmm.analysis.table.Type;
import pt.up.fe.comp.jmm.ast.AJmmVisitor;
import pt.up.fe.comp.jmm.ast.JmmNode;
import pt.up.fe.specs.util.SpecsCheck;
import pt.up.fe.specs.util.utilities.StringLines;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import org.fusesource.jansi.AnsiRenderer.Code;

import java.util.HashSet;
import java.util.List;
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
        put("int...","I");
    }};


    private static final String NL = "\n";
    private static final String TAB = "   ";

    private final SymbolTable table;

    private JasminExprGeneratorVisitor exprGenerator;

    private String currentMethod;
    private int nextRegister;
    private int nextIfFuncCounter;
    private int nextWhileFuncCounter;


    private Map<String, String> classFields = new HashMap<>();
    private Map<String,String> methodFieldsAndArgs;

    private Map<String, Integer> currentRegisters;

    public JasminGeneratorVisitor(SymbolTable table) {
        this.table = table;
        this.exprGenerator = null;
        currentMethod = null;
        nextRegister = -1;
        currentRegisters = null;
        nextIfFuncCounter = 1;
        nextWhileFuncCounter = 1;
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
        addVisit("Block",this::visitBlockStmt);
        addVisit("ArgumentDecl",this::visitArgStmt);
        addVisit("IfStatement", this::visitIfStmt);
        addVisit("WhileStatement", this::visitWhileStmt);
        addVisit("ArrayInitializationExpression", this::visitArrayInitializationExpr);
        addVisit("AssignmentArray",this::visitArrayAssigExpr);

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
        code.append(".class public ").append(className).append(NL);

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

        int numLocals = 1;
        int numStack = 0;

        methodFieldsAndArgs= new HashMap<>();

        String methodName;
        if(methodDecl.hasAttribute("methodName")){
            methodName = methodDecl.get("methodName");
        }
        else{
            methodName = "main";
        }
        currentMethod = methodName;
    
        //set the current register up
        if(methodDecl.hasAttribute("isStatic") && !methodName.equals("main")){
            nextRegister = 0;
        }
        else{
            nextRegister = 1;
        }


        // initialize register map and set parameters
        currentRegisters = new HashMap<>();
        for (var param : methodDecl.getChildren("ArgumentDecl")) {
            String argName = param.get("argName");
            currentRegisters.put(argName, nextRegister);
            nextRegister++;
            methodFieldsAndArgs.put(argName, methodName);
            numLocals++;
            System.out.println(param);
        }

        for(var locals : methodDecl.getChildren("FieldDeclaration")){
            String typeField = locals.getChild(0).get("typeName");
            String fieldName = locals.get("variable");
            methodFieldsAndArgs.put(fieldName, typeField);
            numLocals++;
            System.out.println(locals);
        }
        

        //Add onto the varies stuff that stores values
        numLocals += methodDecl.getDescendants("IfStatement").size();
        


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
                Type paramType = param.getType();
                parameterString+=paramType.isArray() ? "[" : "";
                parameterString+=typeDictionary.get(paramType.getName());
            }
        }

        Type methodRetType = table.getReturnType(methodName);

        parameterString+=")";
        parameterString +=  methodRetType.isArray() ? "[" : "";
        parameterString+=typeDictionary.get(methodRetType.getName()); //return type


        code.append("\n.method ").append(publicString).append(staticString).append(methodName).append(parameterString).append(NL);

        // Add limits
        code.append(TAB).append(".limit stack 99").append(NL);
        code.append(TAB).append(".limit locals ").append(numLocals).append(NL);


        // Get code for statement, split into lines and insert the necessary indentation
        for(var stmt :  methodDecl.getChildren()){    

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

        JmmNode childNode = assignStmt.getChild(0);


        //array initialization is done in normal order, so we use this visitor for it
        if(childNode.getKind().equals("ArrayInitializationExpression")){   
            code.append(visit(childNode));

            return code.toString();
        }


        //NORMAL VARIABLE ASSIGNMENT
        if(methodFieldsAndArgs.containsKey(destName)){        
            // get register
            var reg = currentRegisters.get(destName);
            // If no mapping, variable has not been assigned yet, create mapping
            if (reg == null) {
                //checks to see if it's a field
                reg = nextRegister;
                currentRegisters.put(destName, reg);
                nextRegister++;
            }
            exprGenerator.visit(childNode, code);


            //Class stores differently, its directly in the generator visitor, same goes for arrays
            if(!childNode.getKind().equals("ClassInstantiationExpression") && !childNode.getKind().equals("NewIntArrayExpression")){

                code.append("istore ").append(reg).append(NL);
            }    
        }        
        //Fields
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

        // //load onto the stack the return value if a variable is not called
        // //as its the last call of the function we dont need to deal with the logic of creating a new value onto currentRegisters
        // code.append("istore ").append(nextRegister).append(NL);
        // code.append("iload ").append(nextRegister).append(NL);

        //if array we use areturn
        if(table.getReturnType(currentMethod).isArray() == true){
            code.append("areturn").append(NL);
        }
        else{
            code.append("ireturn").append(NL);
        }

        return code.toString();
    }


    private String visitIfStmt(JmmNode ifStmt, Void unused) {
        var code = new StringBuilder();
        int currentIfCount = nextIfFuncCounter;
        nextIfFuncCounter++;

        //generate code for the conditional
        JmmNode conditionalNode = ifStmt.getChild(0);
        exprGenerator.visit(conditionalNode,code);

        //store the result of the comparison
        String varName = "cmp" + nextRegister; //name is irrelevant
        currentRegisters.put(varName, nextRegister);
        code.append("istore ").append(nextRegister).append(NL);
        code.append("iload ").append(nextRegister).append(NL);
        nextRegister++;



        code.append("ifne if").append(currentIfCount).append(NL);

        List<JmmNode> blocks = ifStmt.getChildren("Block");
        JmmNode ifBlock;
        JmmNode elseBlock;
        if(blocks.size() != 0){
            ifBlock = blocks.get(0);
            elseBlock = blocks.get(1);
        }
        else{
            //if there's no block and is there just a simple expression after it
            ifBlock = ifStmt.getChild(1);
            elseBlock = ifStmt.getChild(2);
        }

        
        //generate code for the else
        code.append(visit(elseBlock));

        //conditional jump to the end of the if
        code.append("goto endif").append(currentIfCount).append(NL);

        //conditional jump for the positive
        code.append("if").append(currentIfCount).append(":").append(NL);
        code.append(visit(ifBlock));


        //end the ifs
        code.append("endif").append(currentIfCount).append(":").append(NL);

        return code.toString();
    }


    private String visitWhileStmt(JmmNode whileStmt, Void unused) {
        var code = new StringBuilder();
        int currentWhileFunc = nextWhileFuncCounter;
        nextWhileFuncCounter++; 


        JmmNode condition = whileStmt.getChild(0);
        JmmNode block = whileStmt.getChild(1);


        code.append("whileCond").append(currentWhileFunc).append(":").append(NL);

        //visit expression condition and generate code
        exprGenerator.visit(condition,code);


        //control the flow of the conditional value
        code.append("ifne whileLoop").append(currentWhileFunc).append(NL);
        code.append("goto whileEnd").append(currentWhileFunc).append(NL);


        code.append("whileLoop").append(currentWhileFunc).append(":").append(NL);


        //generate normal generator code for block
        code.append(visit(block));

        //go back to the beggining of the while
        code.append("goto whileCond").append(currentWhileFunc).append(NL);

        //end code generation
        code.append("whileEnd").append(currentWhileFunc).append(":").append(NL);

    
        return code.toString();
    }

    private String visitArrayInitializationExpr(JmmNode arrayInitStmt, Void unused) {
        var code = new StringBuilder();

        int arrayLenght = arrayInitStmt.getNumChildren();
        String arrayName = arrayInitStmt.getParent().get("variable");


        //allocate register
        var reg = currentRegisters.get(arrayName);
        // If no mapping, variable has not been assigned yet, create mapping
        if (reg == null) {
            //checks to see if it's a field
            reg = nextRegister;
            currentRegisters.put(arrayName, reg);
            nextRegister++;
        }

        //initialize and store array
        code.append("iconst_").append(arrayLenght).append(NL);
        code.append("newarray int").append(NL);
        code.append("astore_").append(reg).append(NL);

        //loop through values to be put onto array and generate expressions
        for(int i =0 ; i < arrayLenght; i++){
            code.append("aload_").append(reg).append(NL);
            code.append("iconst_").append(i).append(NL);
            //generate postorder
            exprGenerator.visit(arrayInitStmt.getChild(i),code);
            code.append("iastore").append(NL);
        }


        return code.toString();
    }

    private String visitArrayAssigExpr(JmmNode arrayAssignStmt, Void unused){
        var code = new StringBuilder();

        String arrayName = arrayAssignStmt.get("variable");
        JmmNode index = arrayAssignStmt.getChild(0);
        JmmNode newValue = arrayAssignStmt.getChild(1);

        var reg = currentRegisters.get(arrayName);

        //load array
        code.append("aload_").append(reg).append(NL);
        //load the index
        exprGenerator.visit(index,code);
        //load the value
        exprGenerator.visit(newValue,code);
        //store the value
        code.append("iastore").append(NL);

        return code.toString();
    }

    //used mostly for simple function calls, for example a print
    private String visitSimpleStmt(JmmNode simpleStmt, Void unused) {
        

        var code = new StringBuilder();

        JmmNode childNode = simpleStmt.getChild(0);

        exprGenerator.visit(childNode, code);

        return code.toString();
    }    

    //visit block
    private String visitBlockStmt(JmmNode blockStmt, Void unused) {
        var code = new StringBuilder();

        //we are visiting the statements inside the block
        for(JmmNode child : blockStmt.getChildren()){
            code.append(visit(child));
        }

        return code.toString();
    }


    //we don't need to anything with it
    private String visitArgStmt(JmmNode ArgStmt, Void unused){
        return "";
    }
    
}
