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

import org.specs.comp.ollir.Field;

import java.util.List;

public class JasminExprGeneratorVisitor extends PostorderJmmVisitor<StringBuilder, Void> {

    private static final String NL = "\n";

    private final Map<String, Integer> currentRegisters;
    private final SymbolTable table;

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
        addVisit("IntegerLiteral", this::visitIntegerLiteral);
        addVisit("VariableReferenceExpression", this::visitVarRefExpr);
        addVisit("BinaryExpression", this::visitBinaryExpr); 
        addVisit("ClassInstantiationExpression",this::visitClassExpr);
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
        }
        code.append("iload_" + reg + NL);

        return null;
    }

    private Void visitBinaryExpr(JmmNode binaryExpr, StringBuilder code) {

        // since this is a post-order visitor that automatically visits the children
        // we can assume the value for the operation are already loaded in the stack

        // get the operation
        var op = switch (binaryExpr.get("operation")) {
            case "+" -> "iadd";
            case "*" -> "imul";
            default -> throw new NotImplementedException(binaryExpr.get("operation"));
        };

        // apply operation
        code.append(op).append(NL);

        return null;
    }

    private Void visitClassExpr(JmmNode classExpr, StringBuilder code) {
        String className = classExpr.get("classname");
        code.append("new ").append(className).append(NL);

        String assignedName = classExpr.getParent().get("variable");

        var reg = currentRegisters.get(assignedName);

        code.append("astore_").append(reg).append(NL);
        code.append("aload_").append(reg).append(NL);
        code.append(String.format("invokespecial %s/<init>()V",className)).append(NL);

        return null;
    }
}
