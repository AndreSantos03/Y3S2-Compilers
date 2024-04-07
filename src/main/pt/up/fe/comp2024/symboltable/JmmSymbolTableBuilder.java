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
import java.util.Optional;





public class JmmSymbolTableBuilder {


    public static JmmSymbolTable build(JmmNode root) {

        var classDecl = root.getJmmChild(0);
        var imports = buildImports(root);


        classDecl = root.getChild(imports.size());
        String className = classDecl.get("className");


        Optional<String> optionalSuperClassName = classDecl.getOptional("superClassName");
        String superClassName = optionalSuperClassName.orElse("");


        List<String> methods = new ArrayList<>();
        Map<String, Type> returnTypes = new HashMap<>();
        Map<String, List<Symbol>> params = new HashMap<>();
        Map<String, List<Symbol>> locals = new HashMap<>();
        List<Symbol> fields = new ArrayList<>();


        if(classDecl.getNumChildren() != 0){    
            methods = buildMethods(classDecl);
    
    
            returnTypes = buildReturnTypes(classDecl);
    
            params = buildParams(classDecl);
    
            locals = buildLocals(classDecl);
    

            fields = buildFields(classDecl);


        }

        return new JmmSymbolTable(className,superClassName, methods, returnTypes, params, locals,fields, imports);
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
            if (method.getKind().equals("MethDeclaration")|| method.getKind().equals("MainMethodDecl")) {
                String methodName = method.get("methodName");
                if(method.getChild(0).getChildren().size() == 0){
                    Type returnType = new Type(method.getChild(0).get("typeName"), false);
                    map.put(methodName, returnType);
                }
                else{
                    Type returnType = new Type(method.getChild(0).getChild(0).get("typeName"), true);
                    map.put(methodName, returnType);
                }
            }
        });
    
        return map;
    }
    

    private static Map<String, List<Symbol>> buildParams(JmmNode classDecl) {
        Map<String, List<Symbol>> map = new HashMap<>();
    
        classDecl.getChildren().forEach(method -> {
            if (method.getKind().equals("MethDeclaration") || method.getKind().equals("MainMethodDecl")) {
                String methodName = method.get("methodName");
                List<Symbol> parameters = new ArrayList<>();
                method.getChildren("ArgumentDecl").forEach(argumentNode -> {
                    String paramName = argumentNode.get("argName");
                    Type type;
                    if(argumentNode.getChild(0).getChildren().size() == 0){
                        String paramType = argumentNode.getChild(0).get("typeName");
                        type = new Type(paramType, false);
                    }
                    else{
                        String paramType = argumentNode.getChild(0).getChild(0).get("typeName");
                        type = new Type(paramType, true);
                    }
                    
                    Symbol symbol = new Symbol(type, paramName);
                    parameters.add(symbol);
                });
    
                map.put(methodName, parameters);
            }
        });
    
        return map;
    }
    
    

    private static Map<String, List<Symbol>> buildLocals(JmmNode classDecl) {
        Map<String, List<Symbol>> map = new HashMap<>();

        classDecl.getChildren().forEach(methodNode -> {
            if(methodNode.getKind().equals("MethDeclaration") || methodNode.getKind().equals("MainMethodDecl")){
                String methodName = methodNode.get("methodName");
                List<Symbol> locals = getLocalsList(methodNode);
                map.put(methodName, locals);
            }
        

        });
    
        return map;
    }

    private static List<String> buildMethods(JmmNode classDecl) {
        List<String> methodNames = new ArrayList<>();

        classDecl.getChildren().forEach(methodNode -> {
            if(methodNode.getKind().equals("MethDeclaration")){
                String methodName = methodNode.get("methodName");
                methodNames.add(methodName);
            }
            else if(methodNode.getKind().equals("MainMethDeclaration")){
                methodNames.add("main");
            }

        });
        return methodNames;
    }
    

    private static List<Symbol> getLocalsList(JmmNode methodDecl) {
        List<Symbol> locals = new ArrayList<>();

        methodDecl.getChildren("FieldDeclaration").forEach(fieldDec -> {
            String varName = fieldDec.get("fieldName");
            Type type;
            if(fieldDec.getChild(0).getChildren().size() == 0){
                String typeName = fieldDec.getChild(0).get("typeName");
                type = new Type(typeName,false);  
            }
            else{
                String typeName = fieldDec.getChild(0).getChild(0).get("typeName");
                type = new Type(typeName,true);  
            }
            Symbol symbol = new Symbol(type, varName);
            locals.add(symbol);

        });
    
        return locals;
    }
    private static List<Symbol> buildFields(JmmNode classDecl) {
        List<Symbol> fields = new ArrayList<>();

        classDecl.getChildren().forEach(child -> {
            if (child.getKind().equals("FieldDeclaration")) {
                String fieldName = child.get("fieldName");



                if(child.getChild(0).getChildren().size() == 0){
                    String typeName = (child.getChild(0).get("typeName"));

                    Type type = new Type(typeName, false);
                    Symbol symbol = new Symbol(type, fieldName);
                    fields.add(symbol);
                }
                else{
                    Type type = new Type(child.getChild(0).getChild(0).get("typeName"), true);
                    Symbol symbol = new Symbol(type, fieldName);
                    fields.add(symbol);
                }

            }
        });

        return fields;
    }

}
