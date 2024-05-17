package pt.up.fe.comp2024.optimization_jasmin;

import pt.up.fe.comp.jmm.ast.JmmNode;
import pt.up.fe.comp.jmm.ast.PostorderJmmVisitor;
import pt.up.fe.comp2024.JavammParser.BooleanContext;
import pt.up.fe.specs.util.SpecsCheck;
import pt.up.fe.specs.util.exceptions.NotImplementedException;
import pt.up.fe.comp.jmm.analysis.table.SymbolTable;
import pt.up.fe.comp.jmm.analysis.table.Symbol;
import pt.up.fe.comp.jmm.analysis.table.Type;

import java.util.Map;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;

import org.specs.comp.ollir.Field;

import jas.StringCP;

import java.util.List;

public class JasminExprGeneratorVisitor extends PostorderJmmVisitor<StringBuilder, Void> {

    private static final String NL = "\n";
    private static final String TAB = "   ";
    private final List<String> conditionalOperators = Arrays.asList("&&","||");
    private final List<String> comparisonOperators = Arrays.asList("<",">","==","!=");
    private final List<String> arithmeticOperators = Arrays.asList("+", "-", "*", "/","<",">","==","!=");

    private final Map<String, Integer> currentRegisters;
    private final SymbolTable table;
    private int currentComparisonFunction;

    //keeps track of object registers for when to use aload and iload
    private Set<Integer> objectRegisters = new HashSet<>();

    private final Map<String, String> typeDictionary = new HashMap<String, String>() {{
        put("int", "I");
        put("boolean", "Z");
        put("String", "Ljava/lang/String;");
        put("void", "V");
    }};

    public JasminExprGeneratorVisitor(Map<String, Integer> currentRegisters, SymbolTable table) {
        this.currentRegisters = currentRegisters;
        this.currentComparisonFunction = 1;

        this.table = table;
    }

    @Override
    protected void buildVisitor() {
        // Using strings to avoid compilation problems in projects that
        // might no longer have the equivalent enums in Kind class.
        addVisit("BinaryExpression", this::visitBinaryExpr); 
        addVisit("IntegerLiteral", this::visitIntegerLiteral);
        addVisit("BooleanLiteral", this::visitBooleanLiteral);
        addVisit("StringLiteral", this::visitStringLiteral);
        addVisit("ThisReferenceExpression",this::visitThisExpr);
        addVisit("VariableReferenceExpression", this::visitVarRefExpr);
        addVisit("ClassInstantiationExpression",this::visitClassExpr);
        addVisit("FunctionCallExpression",this::visitFunctionExpr);
        addVisit("Parameter",this::doesNothing);
        addVisit("ParenthesisExpression",this::doesNothing);
        addVisit("Block",this::doesNothing);
        addVisit("SimpleExpression",this::doesNothing);

    }

    private Void visitIntegerLiteral(JmmNode integerLiteral, StringBuilder code) {
        String valueString = integerLiteral.get("value");
        int value = Integer.parseInt(valueString);
        String constInstruction;
        if (value >= -1 && value <= 5) {
            constInstruction = "iconst_";
        } else if (value >= -128 && value <= 127) {
            constInstruction = "bipush ";
        } else if (value >= -32768 && value <= 32767) {
            constInstruction = "sipush ";
        } else {
            constInstruction = "ldc ";
        }
        code.append(constInstruction + value + NL);
        return null;
    }

    private Void visitBooleanLiteral(JmmNode booleanLiteral, StringBuilder code) {
        String valueString = booleanLiteral.get("value");
        boolean valueBoolean = Boolean.parseBoolean(valueString);
        int value = 0;
        if (valueBoolean) value = 1;
        String constInstruction = "iconst_";
        code.append(constInstruction + value + NL);
        return null;
    }

    private Void visitStringLiteral(JmmNode stringLiteral, StringBuilder code) {
        String value = stringLiteral.get("value");
        String constInstruction = "ldc ";
        code.append(constInstruction + value + NL);
        return null;
    }

    private Void visitVarRefExpr(JmmNode varRefExpr, StringBuilder code) {
        var name = varRefExpr.get("variable");

        
        var reg = currentRegisters.get(name);

        if(reg == null){
            //CHECK FOR FIELD
            for(Symbol field : table.getFields()){
                if(field.getName().equals(name)){
                    code.append("aload_0").append(NL);
                    String type = field.getType().getName();
                    code.append(String.format("getfield %s/%s %s",
                    table.getClassName(),name,typeDictionary.get(type)));
                    code.append(NL);
                    return null;
                }
            }
            return null;
        }
        //checks to see if its a class
        if( objectRegisters.contains(reg)){
            code.append("aload_" + reg + NL);
        }
        else{
            code.append("iload_" + reg + NL);
        }
        return null;
    }

    private Void visitBinaryExpr(JmmNode binaryExpr, StringBuilder code) {

        // since this is a post-order visitor that automatically visits the children
        // we can assume the value for the operation are already loaded in the stack

        String operator = binaryExpr.get("operation");

        String compOperator = null;

        
        // get the operation
        switch (operator) {
            case "+": 
                code.append("iadd").append(NL);

            case "-":
                code.append("isub").append(NL);;
            case "*" :
                code.append("imul").append(NL);

                case "/":
                code.append("idiv").append(NL);
                break;
        
            case "&&":
                code.append("iand").append(NL);
                break;
        
            case "||":
                code.append("ior").append(NL);
                break;

            case "<":
                compOperator = "iflt";
                break;
            case ">":
                compOperator = "ifgt";
                break;
            default:
                throw new NotImplementedException(operator);
        };

        //code for executional jumps in comparison
        if(compOperator != null){

            //we are creating a loop where if the conditional is false we give it 0 and if it's true we give it value 1!
            code.append("isub").append(NL);  
            code.append(compOperator).append(" cmp_").append(this.currentComparisonFunction).append("_true").append(NL);
            code.append("iconst_0").append(NL);
            code.append("goto cmp_").append(this.currentComparisonFunction).append("_end").append(NL).append(NL);

            code.append("cmp_").append(this.currentComparisonFunction).append("_true:").append(NL);
            code.append("iconst_m1").append(NL).append(NL);

            code.append("cmp_").append(this.currentComparisonFunction).append("_end:").append(NL);
            this.currentComparisonFunction++;
        }

        return null;
    }

    private Void visitClassExpr(JmmNode classExpr, StringBuilder code) {
        String className = classExpr.get("classname");
        code.append("new ").append(className).append(NL);
        code.append("dup").append(NL);

        String assignedName = classExpr.getParent().get("variable");

        var reg = currentRegisters.get(assignedName);
        objectRegisters.add(reg);

        code.append(String.format("invokespecial %s/<init>()V",className)).append(NL);
        code.append("astore_").append(reg).append(NL);

        return null;
    }

    private Void visitFunctionExpr(JmmNode functionStmt, StringBuilder code) {
        String functionName = functionStmt.get("value");
        JmmNode objectNode = functionStmt.getChild(0);
        String objectName;
        //checks for THIS
        if(objectNode.getKind().equals("ThisReferenceExpression")){
            objectName = table.getClassName();
        }
        else{
            objectName = objectNode.get("variable");
        }

        Type objectType = getVariableType(objectName, objectNode);
        String objectTypeString;
        if(objectType != null){
            objectTypeString = objectType.getName();
        }
        else{
            objectTypeString = "";
        }

        boolean isInImports = importContains(objectName);
        //Static method call for imports and static functions
        if(isInImports || functionStmt.hasAttribute("isStatic") ){
            String objectPath;
            if(isInImports){
                objectPath = getFullImportPath(objectName);
            }
            else{
                objectPath = objectName;
            }
            code.append("invokestatic ").append(objectPath).append("/").append(functionName).append("(");
            if(functionStmt.getChildren().size() > 1){
                //parameters
                JmmNode paramNode = functionStmt.getChild(1);

                //we're assuming imports only take as valuable ints
                //adding a int parameter for each variable
                for( int i = 0;i < paramNode.getChildren().size(); i++){
                    String typeName =getVariableType(paramNode.getChild(i), table).getName();
                    code.append(typeDictionary.get(typeName));
                }
            }

            if(table.getMethods().contains(objectName)){
                //if its on the table then we can see the return type
                code.append(")" + typeDictionary.get(table.getReturnType(objectName).getName()));
            }
           else{
                String returnType;
                if(isInImports){
                    if(functionStmt.getParent().getKind().equals("Assignment")){
                        returnType = getVariableType(functionStmt.getParent().get("variable"), functionStmt).getName();
                    }
                    else{
                        returnType = "void";
                    }
                }
                else{
                    returnType = table.getReturnType(functionName).getName();
                }
                code.append(")").append(typeDictionary.get(returnType));
           }
            code.append(NL);

        }
        //Calls a class function
        else{
            String objectPath;
            String returnType;
            if(importContains(objectTypeString)){
                objectPath = getFullImportPath(objectType.getName());
                if(functionStmt.getParent().getKind().equals("Assignment")){
                    returnType = getVariableType(functionStmt.getParent().get("variable"), functionStmt).getName();
                }
                else{
                    returnType = "void";
                }
            }            
            else{
                objectPath = table.getClassName();
                returnType = table.getReturnType(functionName).getName();
            }

            code.append("invokevirtual ").append(objectPath).append("/").append(functionName).append("(");
            //parameters
            for(Symbol param : table.getParameters(functionName)){
                code.append(typeDictionary.get(param.getType().getName()));
            }
            code.append(")").append(typeDictionary.get(returnType));
            code.append(NL);
        }

        return null;
    }

    private Void visitThisExpr(JmmNode thisStmt, StringBuilder code) {
        code.append("aload_0").append(NL);
        return null;
    }
    
    //does nothing
    private Void doesNothing(JmmNode paramExpr, StringBuilder code) {
        return null;
    }

    private Type getVariableType( String var,JmmNode expr){
        JmmNode currentMethod = expr.getAncestor("MethodDeclaration").get();
        String methodName ;
        if(currentMethod.hasAttribute("methodName")){
            methodName = currentMethod.get("methodName");
        }
        else{
            methodName = "main";
        }
        for( Symbol local : table.getLocalVariables(methodName)){
            if(local.getName().equals(var)){
                return local.getType();
            }
        }
        if(!methodName.equals("main")){
            for(Symbol param : table.getParameters(methodName)){
                if(param.getName().equals(var)){
                    return param.getType();
                }
            }
        }

        for(Symbol field : table.getFields()){
            if(field.getName().equals(var)){
                return field.getType();
            }
        }
        return null;
    }

    private Type getVariableType(JmmNode var,SymbolTable table){
        if(var.getKind().equals("ParenthesisExpression")){
            var = var.getChild(0);
        }

        if(var.getKind().equals("BooleanLiteral")){
            return new Type("boolean",false);
        }
        else if(var.getKind().equals("IntegerLiteral")){
            return new Type("int",false);
        }
        else if(var.getKind().equals("StringLiteral")){
            return new Type("String",false);
        }

        if(var.getKind().equals("BinaryExpression")){
            if(arithmeticOperators.contains(var.get("operation"))){
                return new Type("int",false);
            }
            else{
                return new Type("boolean",false);
            }
        }        



        String varName = var.get("variable");
        

        return getVariableType(varName, var);
    }
    
    //checks to see if an object is a part of the imports
    private boolean importContains(String object){
        for(String imp : table.getImports()){
            String[] parts = imp.split("\\.");
            for (String part : parts) {
                if(part.equals(object)){
                    return true;
                }
            }
        }
        return false;

    }

    //get full import path for a class
    private String getFullImportPath(String object){
        for(String imp : table.getImports()){
            String[] parts = imp.split("\\.");
            for (String part : parts) {
                if(part.equals(object)){
                    // return imp.replace('.', '/');
                    return imp;
                }
            }
        }
        return "";
    }
}
