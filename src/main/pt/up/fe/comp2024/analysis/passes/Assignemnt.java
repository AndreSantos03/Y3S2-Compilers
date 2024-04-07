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
public class Assignemnt extends AnalysisVisitor {

    private String currentMethod;
   

    @Override
    public void buildVisitor() {
        addVisit("MethDeclaration", this::visitMethodDecl);
        addVisit("Assignment",this::assignment);
    }

    private Void visitMethodDecl(JmmNode method, SymbolTable table) {
        currentMethod = method.get("methodName");
        return null;
    }

    private Void assignment(JmmNode assignmentExpression, SymbolTable table){
        Type variableType = getVariableType(assignmentExpression, table, currentMethod);

        JmmNode assigned = assignmentExpression.getChild(0);
        Type assignedType = getVariableType(assigned, table, currentMethod);

        if(!variableType.equals(assignedType)){
            addReport(Report.newError(
                Stage.SEMANTIC,
                NodeUtils.getLine(assignmentExpression),
                NodeUtils.getColumn(assignmentExpression),
                "Mismatch Types!",
                null)
            );
        }

        return null;
    }
    
  
}
