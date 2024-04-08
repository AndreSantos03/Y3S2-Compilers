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
import java.util.Optional;

/**
 * Checks if the type of the expression in a return statement is compatible with the method return type.
 *
 * @author JBispo
 */
public class Methods extends AnalysisVisitor {

    private String currentMethod;
   

    @Override
    public void buildVisitor() {
        addVisit("MethDeclaration", this::visitMethodDecl);
        addVisit("FunctionCallExpression",this::visitFunctionCall);
    }

    private Void visitMethodDecl(JmmNode method, SymbolTable table) {
        currentMethod = method.get("methodName");
        return null;
    }

    private Void visitFunctionCall(JmmNode functionCallExpr, SymbolTable table){

        //checks if the call is from an imported class, assumes everything is well
        Type baseObjectType = getVariableType(functionCallExpr.getChild(0), table, currentMethod);
        if(table.getImports().contains(baseObjectType.getName())){
            return null;
        }

        String calledMethodName = functionCallExpr.get("value");

        if(!table.getMethods().contains(calledMethodName)){
            addReport(Report.newError(
                Stage.SEMANTIC,
                NodeUtils.getLine(functionCallExpr),
                NodeUtils.getColumn(functionCallExpr),
                "Calls for an undefined method!",
                null)
            );
        }

        //check parameter
        int counter = 0;
        List<Symbol> argumentsMethod = table.getParameters(calledMethodName);
        for(JmmNode parameter: functionCallExpr.getChildren("Parameter")){
            JmmNode parameterChild = parameter.getChild(0);
            Type type = getVariableType(parameterChild, table, currentMethod);
            if(!type.equals(argumentsMethod.get(counter).getType())){
                addReport(Report.newError(
                    Stage.SEMANTIC,
                    NodeUtils.getLine(functionCallExpr),
                    NodeUtils.getColumn(functionCallExpr),
                    "Function call parameter must match method arguments!",
                    null)
                );
                return null;
            }
            counter++;
        }
        return null;
    }
    
  
}
