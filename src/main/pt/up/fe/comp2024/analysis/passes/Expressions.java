package pt.up.fe.comp2024.analysis.passes;

import pt.up.fe.comp.jmm.analysis.table.SymbolTable;
import pt.up.fe.comp.jmm.analysis.table.Symbol;
import pt.up.fe.comp.jmm.analysis.table.Type;
import java.util.Arrays;
import java.util.List;
import pt.up.fe.comp.jmm.ast.JmmNode;
import pt.up.fe.comp.jmm.report.Report;
import pt.up.fe.comp.jmm.report.Stage;
import pt.up.fe.comp2024.analysis.AnalysisVisitor;
import pt.up.fe.comp2024.ast.Kind;
import pt.up.fe.comp2024.ast.NodeUtils;
import pt.up.fe.specs.util.SpecsCheck;

/**
 * Checks if the type of the expression in a return statement is compatible with the method return type.
 *
 * @author JBispo
 */
public class Expressions extends AnalysisVisitor {

    private String currentMethod;
    private final List<String> conditionalOperators = Arrays.asList("&&","||");
    private final List<String> arithmeticOperators = Arrays.asList("+", "-", "*", "/","<",">","==","!=");


    @Override
    public void buildVisitor() {
        addVisit("MethDeclaration", this::visitMethodDecl);
        addVisit("BinaryExpression",this::visitBinaryExpression );
        addVisit("IfStatement",this::conditionCheck);
        addVisit("WhileStatement",this::conditionCheck);
    }

    private Void visitMethodDecl(JmmNode method, SymbolTable table) {
        currentMethod = method.get("methodName");
        return null;
    }
    
    private Void visitBinaryExpression(JmmNode binaryOp, SymbolTable table){

        JmmNode leftOperator = binaryOp.getChild(0); 
        JmmNode rightOperator = binaryOp.getChild(1);

        Type leftType= getVariableType(leftOperator,table,currentMethod);
        Type rightType= getVariableType(rightOperator,table,currentMethod);
        
        //ARRAY OPERATIONS
        if (rightType != null && leftType != null && (rightType.isArray() || leftType.isArray())) {
            addReport(Report.newError(
                Stage.SEMANTIC,
                NodeUtils.getLine(binaryOp),
                NodeUtils.getColumn(binaryOp),
                "Cannot perform operation with array type",
                null)
            );
        }

        //CONDITIONAL OPERATIONS
        if (conditionalOperators.contains(binaryOp.get("operation"))) {
            if (!leftType.getName().equals("boolean") || !rightType.getName().equals("boolean")) {
                String errorMessage;
                if (!leftType.getName().equals("boolean")) {
                    errorMessage = "Left operator must be boolean";
                } else {
                    errorMessage ="Right operator must be boolean";
                }
                addReport(Report.newError(
                    Stage.SEMANTIC,
                    NodeUtils.getLine(binaryOp),
                    NodeUtils.getColumn(binaryOp),
                    errorMessage,
                    null)
                );
            }
            return null;//not needed, just saves a few iterations of the
        }


        //ARITHMETIC OPERATIONS
        if (arithmeticOperators.contains(binaryOp.get("operation"))) {
            if (!leftType.getName().equals("int") || !rightType.getName().equals("int")) {
                String errorMessage;
                if (!leftType.getName().equals("int")) {
                    errorMessage = "Left operand '%s' must be int";
                } else {
                    errorMessage = "Right operand '%s' must be int";
                }
                addReport(Report.newError(
                    Stage.SEMANTIC,
                    NodeUtils.getLine(binaryOp),
                    NodeUtils.getColumn(binaryOp),
                    errorMessage,
                    null)
                );
            }
        }
        return null;
    }

    //Check for bool conditionals after While and If
    private Void conditionCheck(JmmNode loopExpr, SymbolTable table){
        JmmNode conditionalExpr = loopExpr.getChild(0);
        if(getVariableType(conditionalExpr, table, currentMethod).getName().equals("boolean")){
            return null;
        }
        if(!conditionalOperators.contains(conditionalExpr.get("operation"))){
            addReport(Report.newError(
                Stage.SEMANTIC,
                NodeUtils.getLine(loopExpr),
                NodeUtils.getColumn(loopExpr),
                "Must have a boolean as a conditional!",
                null)
            );
            return null;
        }
        return null;
    }


}
