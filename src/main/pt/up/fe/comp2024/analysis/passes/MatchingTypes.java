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
public class MatchingTypes extends AnalysisVisitor {

    private String currentMethod;
    private final List<String> conditionalOperators = Arrays.asList("&&","||");
    private final List<String> arithmeticOperators = Arrays.asList("+", "-", "*", "/","<",">","==","!=");


    @Override
    public void buildVisitor() {
        addVisit("BinaryExpression",this::visitBinaryExpression );
        addVisit("MethDeclaration", this::visitMethodDecl);
    }

    private Void visitMethodDecl(JmmNode method, SymbolTable table) {
        currentMethod = method.get("methodName");
        return null;
    }
    
    private Void visitBinaryExpression(JmmNode binaryOp, SymbolTable table){

        JmmNode leftOperator = binaryOp.getChild(0); 
        JmmNode rightOperator = binaryOp.getChild(1);
        
        Type leftType = null;
        if(leftOperator.getKind().equals("BooleanLiteral")){
            leftType = new Type("boolean",false);
        }
        else if(leftOperator.getKind().equals("IntegerLiteral")){
            leftType = new Type("int",false);
        }
        else{
            leftType= getVariableType(leftOperator.get("variable"),table,currentMethod);
        }

        Type rightType = null;
        if(rightOperator.getKind().equals("BooleanLiteral")){
            rightType = new Type("boolean",false);
        }
        else if(rightOperator.getKind().equals("IntegerLiteral")){
            rightType = new Type("int",false);
        }
        else{
            rightType= getVariableType(rightOperator.get("variable"),table,currentMethod);
        }

        //CONDITIONAL OPERATIONS
        if (conditionalOperators.contains(binaryOp.get("operation"))) {
            if (!leftType.getName().equals("boolean") || !rightType.getName().equals("boolean")) {
                String errorMessage;
                if (!leftType.getName().equals("boolean")) {
                    errorMessage = "Left operator '%s' must be boolean";
                } else {
                    errorMessage ="Right operator '%s' must be boolean";
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

}
