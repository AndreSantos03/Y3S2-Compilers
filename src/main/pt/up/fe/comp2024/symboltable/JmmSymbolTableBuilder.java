package pt.up.fe.comp2024.symboltable;

import pt.up.fe.comp.jmm.analysis.table.Symbol;
import pt.up.fe.comp.jmm.analysis.table.Type;
import pt.up.fe.comp.jmm.ast.JmmNode;
import pt.up.fe.comp2024.ast.Kind;
import pt.up.fe.comp2024.ast.TypeUtils;
import pt.up.fe.specs.util.SpecsCheck;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static pt.up.fe.comp2024.ast.Kind.METHOD_DECL;



public class JmmSymbolTableBuilder {


    public static JmmSymbolTable build(JmmNode root) {

        var classDecl = root.getJmmChild(0);
        var imports = buildImports(root);

        System.out.println("Imports name: " + imports);

        classDecl = root.getChild(imports.size());
        String className = classDecl.get("className");

        List<String> methods = null;
        Map<String, Type> returnTypes = null;
        Map<String, List<Symbol>> params = null;
        Map<String, List<Symbol>> locals = null;

        System.out.println("Class name: " + className);
        if(classDecl.getNumChildren() != 0){
            System.out.println("daa");
    
            methods = buildMethods(classDecl);
    
            System.out.println("Methods: " + methods);
    
            returnTypes = buildReturnTypes(classDecl);
            System.out.println("Return types: " + returnTypes);
    
            params = buildParams(classDecl);
            System.out.println("Parameters: " + params);
    
            locals = buildLocals(classDecl);
    
            System.out.println("Locals: " + locals);
        }

        return new JmmSymbolTable(className, methods, returnTypes, params, locals, imports);
    }

    private static Set<String> buildImports(JmmNode root) {
        Set<String> imports = new HashSet<>();
        
        root.getChildren("ImportStatement").forEach(child -> {
            if ("ImportStatement".equals(child.getKind())) {
                String importValue = child.get("value");
                imports.add(importValue);
            }
        });
        
        return imports;
    }



    private static Map<String, Type> buildReturnTypes(JmmNode classDecl) {
        Map<String, Type> map = new HashMap<>();
    
        classDecl.getChildren().forEach(method -> {
            if (method.getKind().equals("METHOD_DECL")) {
                String methodName = method.get("methodName");
                Type returnType = new Type(method.get("returnType"), false);
                map.put(methodName, returnType);
            }
        });
    
        return map;
    }
    

    private static Map<String, List<Symbol>> buildParams(JmmNode classDecl) {
        Map<String, List<Symbol>> map = new HashMap<>();
    
        classDecl.getChildren().forEach(method -> {
            if (method.getKind().equals("METHOD_DECL")) {
                String methodName = method.get("methodName");
                List<Symbol> parameters = new ArrayList<>();
    
                method.getChildren().forEach(parameter -> {
                    if (parameter.getKind().equals("PARAM")) {
                        String paramName = parameter.get("paramName");
                        String paramType = parameter.get("parameterType");
                        Type type = new Type(paramType, false);
                        Symbol symbol = new Symbol(type, paramName);
                        parameters.add(symbol);
                    }
                });
    
                map.put(methodName, parameters);
            }
        });
    
        return map;
    }
    
    

    private static Map<String, List<Symbol>> buildLocals(JmmNode classDecl) {
        Map<String, List<Symbol>> map = new HashMap<>();
    
        classDecl.getChildren(Kind.METHOD_DECL).forEach(method -> {
            String methodName = method.get("methodName");
            List<Symbol> locals = getLocalsList(method);
            map.put(methodName, locals);
        });
    
        return map;
    }

    private static List<String> buildMethods(JmmNode classDecl) {
        List<String> methodNames = new ArrayList<>();

        classDecl.getChildren().forEach(methodNode -> {
            if(methodNode.getKind().equals("METHOD_DECL")){
                String methodName = methodNode.get("methodName");
                methodNames.add(methodName);
            }

        });
        return methodNames;
    }
    

    private static List<Symbol> getLocalsList(JmmNode methodDecl) {
        List<Symbol> locals = new ArrayList<>();
    
        methodDecl.getChildren().forEach(varDecl -> {
            if (varDecl.getKind().equals("VAR_REF_EXPR")) {
                String varName = varDecl.get("value");
                String varType = varDecl.get("type");
                Type type = new Type(varType, false);
                Symbol symbol = new Symbol(type, varName);
                locals.add(symbol);
            }
        });
    
        return locals;
    }
    

}
