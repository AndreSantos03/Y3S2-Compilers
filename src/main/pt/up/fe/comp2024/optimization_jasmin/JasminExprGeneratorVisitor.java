package pt.up.fe.comp2024.optimization_jasmin;

import pt.up.fe.comp.jmm.ast.JmmNode;
import pt.up.fe.comp.jmm.ast.PostorderJmmVisitor;
import pt.up.fe.specs.util.SpecsCheck;
import pt.up.fe.specs.util.exceptions.NotImplementedException;

import java.util.Map;

public class JasminExprGeneratorVisitor extends PostorderJmmVisitor<StringBuilder, Void> {

    private static final String NL = "\n";

    private final Map<String, Integer> currentRegisters;

    public JasminExprGeneratorVisitor(Map<String, Integer> currentRegisters) {
        this.currentRegisters = currentRegisters;
    }

    @Override
    protected void buildVisitor() {
        // Using strings to avoid compilation problems in projects that
        // might no longer have the equivalent enums in Kind class.
        addVisit("IntegerLiteral", this::visitIntegerLiteral);
        addVisit("VariableReferenceExpression", this::visitVarRefExpr);
        addVisit("BinaryExpression", this::visitBinaryExpr); 
    }

    private Void visitIntegerLiteral(JmmNode integerLiteral, StringBuilder code) {
        String value = integerLiteral.get("value");
        code.append("iconst_" + value + NL);
        return null;
    }

    private Void visitVarRefExpr(JmmNode varRefExpr, StringBuilder code) {
        var name = varRefExpr.get("variable");

        // get register
        var reg = currentRegisters.get(name);
        SpecsCheck.checkNotNull(reg, () -> "No register mapped for variable '" + name + "'");

        code.append("iload " + reg + NL);

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

}
