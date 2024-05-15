package pt.up.fe.comp2024.optimization_jasmin;

import pt.up.fe.comp.jmm.ast.JmmNode;
import pt.up.fe.comp.jmm.ast.PostorderJmmVisitor;
import pt.up.fe.specs.util.SpecsCheck;
import pt.up.fe.specs.util.exceptions.NotImplementedException;
import pt.up.fe.comp.jmm.analysis.table.SymbolTable;
import pt.up.fe.comp.jmm.analysis.table.Symbol;
import pt.up.fe.comp.jmm.analysis.table.Type;

import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;

import org.specs.comp.ollir.Field;

import java.util.List;

public class JasminExprGeneratorVisitor extends PostorderJmmVisitor<StringBuilder, Void> {

    private static final String NL = "\n";
    private static final String TAB = "   ";

    private final Map<String, Integer> currentRegisters;
    private final SymbolTable table;

    //keeps track of object registers for when to use aload and iload
    private Set<Integer> objectRegisters = new HashSet<>();

    private final Map<String, String> typeDictionary = new HashMap<String, String>() {{
        put("int", "I");
        put("boolean", "Z");
        put("String", "[Ljava/lang/String;");
        put("void", "V");
    }};

    public JasminExprGeneratorVisitor(Map<String, Integer> currentRegisters, SymbolTable table) {
        this.currentRegisters = currentRegisters;
        this.table = table;
    }

    @Override
    protected void buildVisitor() {
        // Using strings to avoid compilation problems in projects that
        // might no longer have the equivalent enums in Kind class.
        addVisit("BinaryExpression", this::visitBinaryExpr); 
        addVisit("IntegerLiteral", this::visitIntegerLiteral);
        addVisit("ThisReferenceExpression",this::visitThisExpr);
        addVisit("VariableReferenceExpression", this::visitVarRefExpr);
        addVisit("ClassInstantiationExpression",this::visitClassExpr);
        addVisit("FunctionCallExpression",this::visitFunctionExpr);
        addVisit("Parameter",this::visitParamExpr);
        addVisit("ParenthesisExpression",this::visitParentheses);

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

        // get the operation
        var op = switch (binaryExpr.get("operation")) {
            case "+" -> "iadd";
            case "-" -> "isub";
            case "*" -> "imul";
            case "/" -> "idiv";
            case "&&" -> "iand";
            case "||" -> "ior";

            // case "<" -> "iflt";
            // case ">" -> "ifgt";
            // case "<=" -> "ifle";
            // case ">=" -> "ifge";
            // case "==" -> "ifeq";
            // case "!=" -> "ifne";
            default -> throw new NotImplementedException(binaryExpr.get("operation"));
        };

        // apply operation
        code.append(op).append(NL);

        return null;
    }

    private Void visitClassExpr(JmmNode classExpr, StringBuilder code) {
        String className = classExpr.get("classname");
        code.append("new ").append(className).append(NL);
        code.append("dup").append(NL);

        String assignedName = classExpr.getParent().get("variable");

        var reg = currentRegisters.get(assignedName);
        objectRegisters.add(reg);

        code.append("astore_").append(reg).append(NL);
        code.append("aload_").append(reg).append(NL);
        code.append(String.format("invokespecial %s/<init>()V",className)).append(NL);

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
                    code.append("I");
                }
            }

            if(table.getMethods().contains(objectName)){
                //if its on the table then we can see the return type
                code.append(")" + typeDictionary.get(table.getReturnType(objectName).getName()));
            }
           else{
                //else we assume its import and imports we are always assuming they're returning null
                code.append(")V"); 
           }
            code.append(NL);

        }
        //Calls a class function
        else{
            String objectType = table.getReturnType(functionName).getName();
            code.append("invokevirtual ").append(table.getClassName()).append("/").append(functionName).append("(");
            //parameters
            for(Symbol param : table.getParameters(functionName)){
                code.append(typeDictionary.get(param.getType().getName()));
            }
            code.append(")").append(typeDictionary.get(objectType));
            code.append(NL);
        }

        return null;
    }

    private Void visitThisExpr(JmmNode thisStmt, StringBuilder code) {
        code.append("aload_0").append(NL);
        return null;
    }
    
    //does nothing
    private Void visitParamExpr(JmmNode paramExpr, StringBuilder code) {
        return null;
    }

    //does nothing
    private Void visitParentheses(JmmNode parenthesesExpr, StringBuilder code) {
        return null;
    }

    //checks to see if an object is a part of the imports
    private boolean importContains(String object){
        for(String imp : table.getImports()){
            if(imp.contains(object)){
                return true;
            }
        }
        return false;

    }

    //get full import path for a class
    private String getFullImportPath(String object){
        for(String imp : table.getImports()){
            if(imp.contains(object)){
                return imp.replace('.', '/');
            }
        }
        return "";
    }
}
