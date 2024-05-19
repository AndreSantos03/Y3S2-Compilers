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


        classDecl = root.getChildren("ClassDecl").get(0);
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
        
        root.getChildren("ImportDeclaration").forEach(child -> {
            String importValue = child.get("value");      
            
            String importString = importValue.substring(1, importValue.length()-1);
            importString = String.join(".", importString.split(", "));


            
            imports.add(importString);
        });
        return imports;
    }


    private static Map<String, Type> buildReturnTypes(JmmNode classDecl) {
        Map<String, Type> map = new HashMap<>();
        classDecl.getChildren("MethodDeclaration").forEach(method -> {
            if (method.hasAttribute("methodName")) {
                String methodName = method.get("methodName");
                String typeString = method.getChild(0).get("typeName");
                boolean isArray = typeString.endsWith("[]");
                //remove [] for array
                typeString = typeString.replace("[]", "");
                Type returnType = new Type(typeString, isArray);
                map.put(methodName, returnType);
            }
            //main method
            else{
                String methodName = "main";
                Type returnType = new Type("void", false);
                map.put(methodName, returnType);
            }
        });
        return map;
    }
    

    private static Map<String, List<Symbol>> buildParams(JmmNode classDecl) {
        Map<String, List<Symbol>> map = new HashMap<>();
        classDecl.getChildren("MethodDeclaration").forEach(method -> {
            //main can't have parameters so we don't consider it 
            if (method.hasAttribute("methodName")) {
                String methodName = method.get("methodName");
                List<Symbol> parameters = new ArrayList<>();
                method.getChildren("ArgumentDecl").forEach(argumentNode -> {
                    String paramName = argumentNode.get("argName");
                    JmmNode typeNode = argumentNode.getChild(0);
                    String typeString = typeNode.get("typeName");
                    boolean isArray = typeString.endsWith("[]");
                    //remove [] for array
                    typeString = typeString.replace("[]", "");
                    Type paramType = new Type(typeString, isArray);
                    Symbol symbol = new Symbol(paramType, paramName);
                    parameters.add(symbol);
                });
    
                map.put(methodName, parameters);
            }
        });    
        return map;
    }
    
    

    private static Map<String, List<Symbol>> buildLocals(JmmNode classDecl) {
        Map<String, List<Symbol>> map = new HashMap<>();
        classDecl.getChildren("MethodDeclaration").forEach(methodNode -> {
            String methodName;
            //non main
            if(methodNode.hasAttribute("methodName")){
                methodName = methodNode.get("methodName");
            }
            //main
            else{
                methodName = "main";
            }
            List<Symbol> locals = getLocalsList(methodNode);
            map.put(methodName, locals);
        

        });
    
        return map;
    }

    private static List<String> buildMethods(JmmNode classDecl) {
        List<String> methodNames = new ArrayList<>();

        classDecl.getChildren("MethodDeclaration").forEach(methodNode -> {
            //non main
            if(methodNode.hasAttribute("methodName")){
                String methodName = methodNode.get("methodName");
                methodNames.add(methodName);
            }
            else{
                //main method
                methodNames.add("main");
            }
        });
        return methodNames;
    }
    

    private static List<Symbol> getLocalsList(JmmNode methodDecl) {
        List<Symbol> locals = new ArrayList<>();

        methodDecl.getChildren("FieldDeclaration").forEach(fieldDec -> {
            String varName = fieldDec.get("variable");

            String typeString = fieldDec.getChild(0).get("typeName");
            boolean isArray = typeString.endsWith("[]");
            //remove [] for array
            typeString = typeString.replace("[]", "");
            Type localType = new Type(typeString, isArray);
            Symbol symbol = new Symbol(localType, varName);
            locals.add(symbol);

        });
    
        return locals;
    }
    private static List<Symbol> buildFields(JmmNode classDecl) {
        List<Symbol> fields = new ArrayList<>();

        classDecl.getChildren().forEach(child -> {
            if (child.getKind().equals("FieldDeclaration")) {
                String fieldName = child.get("variable");


                String typeString = child.getChild(0).get("typeName");
                boolean isArray = typeString.endsWith("[]");
                //remove [] for array
                typeString = typeString.replace("[]", "");
                Type fieldType = new Type(typeString, isArray);
                Symbol symbol = new Symbol(fieldType, fieldName);
                fields.add(symbol);

            }
        });

        return fields;
    }

}
