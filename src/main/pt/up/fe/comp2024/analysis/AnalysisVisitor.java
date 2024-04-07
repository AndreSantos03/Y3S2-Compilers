package pt.up.fe.comp2024.analysis;

import pt.up.fe.comp.jmm.analysis.table.Symbol;
import pt.up.fe.comp.jmm.analysis.table.SymbolTable;
import pt.up.fe.comp.jmm.analysis.table.Type;
import pt.up.fe.comp.jmm.ast.JmmNode;
import pt.up.fe.comp.jmm.ast.PreorderJmmVisitor;
import pt.up.fe.comp.jmm.report.Report;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public abstract class AnalysisVisitor extends PreorderJmmVisitor<SymbolTable, Void> implements AnalysisPass {

    private List<Report> reports;

    public AnalysisVisitor() {
        reports = new ArrayList<>();
        setDefaultValue(() -> null);
    }

    protected void addReport(Report report) {
        reports.add(report);
    }

    protected List<Report> getReports() {
        return reports;
    }


    @Override
    public List<Report> analyze(JmmNode root, SymbolTable table) {
        // Visit the node
        visit(root, table);

        // Return reports
        return getReports();
    }

    //Defined by me, works for all the passes
    //We can pass an empty string as well, works the same
    protected static Type getVariableType(JmmNode var,SymbolTable table,String currentMethod){
 

        if(var.getKind().equals("BooleanLiteral")){
            return new Type("boolean",false);
        }
        else if(var.getKind().equals("IntegerLiteral")){
            return new Type("int",false);
        }
        String varName = var.get("variable");
        
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
