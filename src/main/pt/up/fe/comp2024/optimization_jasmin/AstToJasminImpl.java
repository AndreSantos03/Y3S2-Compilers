package pt.up.fe.comp2024.optimization_jasmin;

import pt.up.fe.comp.jmm.analysis.JmmSemanticsResult;
import pt.up.fe.comp.jmm.analysis.table.Symbol;
import pt.up.fe.comp.jmm.analysis.table.SymbolTable;
import pt.up.fe.comp.jmm.ast2jasmin.AstToJasmin;
import pt.up.fe.comp.jmm.jasmin.JasminResult;
import pt.up.fe.comp2024.CompilerConfig;
import pt.up.fe.comp.jmm.ast.JmmNode;

import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

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

        //this optimization doesn't need -o
        //IINC
        for(JmmNode bOp : root.getDescendants("BinaryExpression")){

            if(bOp.get("operation").equals("+")){
                JmmNode assignNode = bOp.getParent();
                JmmNode intNode = bOp.getChild(1);
                JmmNode varNode = bOp.getChild(0);
                if(intNode.getKind().equals("IntegerLiteral") && varNode.getKind().equals("VariableReferenceExpression") 
                && assignNode.getKind().equals("Assignment")
                ){
                    String var = varNode.get("variable");
                    if(intNode.get("value").equals("1")){
                        bOp.removeChild(intNode);
                        bOp.removeChild(varNode);
                        bOp.put("iinc", var);
                        assignNode.put("iinc","true");
                    }
                }
            }
        }
        if(CompilerConfig.getOptimize(semanticsResult.getConfig())){
            //Constant Prop
            boolean wasUpdated = true;
            while(wasUpdated == true){
                wasUpdated = false;
                //loop through locals
                for(JmmNode methodNode : root.getDescendants("MethodDeclaration")){

                    String methodString;
                    if(methodNode.hasAttribute("methodName")){
                        methodString = methodNode.get("methodName");
                    }
                    else{
                        methodString = "main";
                    }
                    Map<String, JmmNode> propagationValues = new HashMap<>();
                    for(var assignNode : methodNode.getDescendants("Assignment")){
                        String varName = assignNode.get("variable");

                        for(JmmNode descendantAssign : assignNode.getDescendants()){
                            //we're not propagating values with iinc to pass the tests
                            if(!assignNode.hasAttribute("iinc")){
                                //see if it's a simple value that can be propagated
                                if(descendantAssign.getKind().equals("IntegerLiteral") || descendantAssign.getKind().equals("BooleanLiteral")){
                                    propagationValues.put(varName, descendantAssign);
                                }
                            }
                            else{
                                //if it has an iinc we remove it from the list
                                propagationValues.remove(varName);
                            }
                        }
                    }
                    //do the propagation
                    for (JmmNode node : root.getDescendants()) {
                        //remove the local creation
                        if(node.getKind().equals("FieldDeclaration")){
                            if(propagationValues.keySet().contains(node.get("variable"))){
                                node.detach();
                            }
                        }

                        //remove the node assignment
                        if(node.getKind().equals("Assignment")){

                            if(propagationValues.keySet().contains(node.get("variable"))){
                                node.detach();
                            }
                        }

                        //replace the variable ref with the value
                        if(node.getKind().equals("VariableReferenceExpression")){
                            String varName = node.get("variable");
                            if(propagationValues.keySet().contains(varName)){

                                node.replace(propagationValues.get(varName));
                            }
                        }
                    }
                }
            }
        }
        return AstToJasmin.super.optimize(semanticsResult);
    }
}