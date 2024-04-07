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
public class ArrayAccess extends AnalysisVisitor {

    private String currentMethod;
   

    @Override
    public void buildVisitor() {
        addVisit("MethDeclaration", this::visitMethodDecl);
        addVisit("ArrayAccessExpression",this::arrayAccess);
    }

    private Void visitMethodDecl(JmmNode method, SymbolTable table) {
        currentMethod = method.get("methodName");
        return null;
    }

    private Void arrayAccess(JmmNode arrayAccessExpression, SymbolTable table){
        JmmNode accessedArray = arrayAccessExpression.getChild(0);
        if(!getVariableType(accessedArray,table,currentMethod).isArray()){
            addReport(Report.newError(
                Stage.SEMANTIC,
                NodeUtils.getLine(arrayAccessExpression),
                NodeUtils.getColumn(arrayAccessExpression),
                "You have to access an array!",
                null)
            );
        }

        JmmNode indexExpression = arrayAccessExpression.getChild(1);
        Type indexType = getVariableType(indexExpression, table, currentMethod);
        if(indexType.getName()!="int"){
            addReport(Report.newError(
                Stage.SEMANTIC,
                NodeUtils.getLine(arrayAccessExpression),
                NodeUtils.getColumn(arrayAccessExpression),
                "You have to access an array through an index!",
                null)
            );
        }

        return null;
    }
    
  
}
