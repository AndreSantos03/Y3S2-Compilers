package pt.up.fe.comp2024.optimization_jasmin;

import pt.up.fe.comp.jmm.analysis.JmmSemanticsResult;
import pt.up.fe.comp.jmm.ast2jasmin.AstToJasmin;
import pt.up.fe.comp.jmm.jasmin.JasminResult;

import pt.up.fe.comp.jmm.ast.JmmNode;

import java.util.Collections;

public class AstToJasminImpl implements AstToJasmin {
    @Override
    public JasminResult toJasmin(JmmSemanticsResult semanticsResult) {

        var generator = new JasminGeneratorVisitor(semanticsResult.getSymbolTable());
        var code = generator.visit(semanticsResult.getRootNode());

        return new JasminResult(semanticsResult, code, Collections.emptyList());
    }

    @Override
    public JmmSemanticsResult optimize(JmmSemanticsResult semanticsResult) {
        JmmNode root = semanticsResult.getRootNode();

        //IINC
        for(JmmNode bOp : root.getDescendants("BinaryExpression")){
            System.out.println(bOp);

            if(bOp.get("operation").equals("+")){
                JmmNode intNode = bOp.getChild(1);
                JmmNode varNode = bOp.getChild(0);
                if(intNode.getKind().equals("IntegerLiteral") || varNode.getKind().equals("VariableReferenceExpression")){
                    String var = varNode.get("variable");
                    if(intNode.get("value").equals("1")){
                        bOp.removeChild(intNode);
                        bOp.put("iinc", var);
                    }
                }
            }
        }
        return AstToJasmin.super.optimize(semanticsResult);
    }
}