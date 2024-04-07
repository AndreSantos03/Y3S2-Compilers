package pt.up.fe.comp2024.analysis.passes;

import pt.up.fe.comp.jmm.analysis.table.SymbolTable;
import pt.up.fe.comp.jmm.analysis.table.Symbol;
import pt.up.fe.comp.jmm.analysis.table.Type;

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
        

        Type leftType = getVariableType(leftOperator.get("variable"),table);

        System.out.println("Type = " + leftType.getName() + "\n");

        return null;
    }

    private Type getVariableType(String varName,SymbolTable table){
 
        //Checks in the local fields
        for(Symbol symbol : table.getLocalVariables(currentMethod)){
            if(symbol.getName().equals(varName))
            {
                return symbol.getType();
            }
        }

        //Checks in the methods arguments
        for(Symbol symbol : table.getParameters(currentMethod)){
            if(symbol.getName().equals(varName))
            {
                return symbol.getType();
            }
        }

        //Checks in the class fields
        for(Symbol symbol : table.getFields()){
            if(symbol.getName().equals(varName))
            {
                return symbol.getType();
            }
        }

        return null;
    }
}
