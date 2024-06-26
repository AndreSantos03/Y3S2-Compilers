package pt.up.fe.comp2024.analysis.passes;

import pt.up.fe.comp.jmm.analysis.table.SymbolTable;
import pt.up.fe.comp.jmm.analysis.table.Symbol;
import pt.up.fe.comp.jmm.analysis.table.Type;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

import org.antlr.v4.parse.ANTLRParser.range_return;
import org.specs.comp.ollir.Field;
import org.stringtemplate.v4.compiler.CodeGenerator.primary_return;
import org.stringtemplate.v4.compiler.CodeGenerator.region_return;

import java_cup.runtime.symbol;
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
public class Visits extends AnalysisVisitor {

    private String currentMethodString;
    private JmmNode currentMethod;
    private JmmNode currentAssignmentNode;
    private Type currentType;


    private Set<String>  importObjects;


    private final List<String> conditionalOperators = Arrays.asList("&&","||");
    private final List<String> comparisonOperators = Arrays.asList("<",">","==","!=");
    private final List<String> arithmeticOperators = Arrays.asList("+", "-", "*", "/");

    @Override
    public void buildVisitor() {
        addVisit("Program",this::visitProgram);
        addVisit("MethodDeclaration", this::visitMethodDecl);
        addVisit("Assignment",this::assignment);
        addVisit("AssignmentArray",this::assignmentArray);
        addVisit("VariableReferenceExpression", this::visitVarRefExpr);
        addVisit("FunctionCallExpression",this::visitFunctionCall);
        addVisit("ClassInstantiationExpression",this::visitClassCall);
        addVisit("ThisReferenceExpression",this::visitThisCall);
        addVisit("ArrayInitializationExpression",this::visitArrayInitialization);
        addVisit("BinaryExpression",this::visitBinaryExpression);
        addVisit("IfStatement",this::conditionCheck);
        addVisit("WhileStatement",this::conditionCheck);
        addVisit("ArrayAccessExpression",this::visitArrayAccess);
        addVisit("ReturnDeclaration",this::visitReturnDecl);
        addVisit("Vararg",this::visitVararg);
    }
    private Void visitProgram(JmmNode program, SymbolTable table) {
        importObjects = new HashSet<>();

        //check for duplicate fields
        Set<String> uniqueFields = new HashSet<>();
        for (Symbol field : table.getFields()) {
            if (!uniqueFields.add(field.getName())) {
                addReport(Report.newError(
                    Stage.SEMANTIC,
                    NodeUtils.getLine(program),
                    NodeUtils.getColumn(program),
                    "Can't have duplicate fields!",
                    null)
                );  
            }
        }        
        
        //check for duplicate imports
        Set<String> uniqueImports = new HashSet<>();
        for (JmmNode importExpr: program.getChildren("ImportDeclaration")) {
            if (!uniqueImports.add(importExpr.get("value"))) {
                addReport(Report.newError(
                    Stage.SEMANTIC,
                    NodeUtils.getLine(program),
                    NodeUtils.getColumn(program),
                    "Can't have duplicate imports!",
                    null)
                );  
            }
        }        
        
        //check for duplicate methods
        Set<String> uniqueMethods = new HashSet<>();
        for (String methodString: table.getMethods()) {
            //check for duplicate parameters
            Set<Symbol> uniqueParams = new HashSet<>();
            for(Symbol params: table.getParameters(methodString)){
                if (!uniqueParams.add(params)) {
                    addReport(Report.newError(
                        Stage.SEMANTIC,
                        NodeUtils.getLine(program),
                        NodeUtils.getColumn(program),
                        "Can't have duplicate parameters!",
                        null)
                    );  
                }
            }

            if (!uniqueMethods.add(methodString)) {
                addReport(Report.newError(
                    Stage.SEMANTIC,
                    NodeUtils.getLine(program),
                    NodeUtils.getColumn(program),
                    "Can't have duplicate methods!",
                    null)
                );  
            }
        }      

        //create object import set
        for(String imp : table.getImports()){
            String[] parts = imp.split("\\.");

            String lastElement = parts[parts.length - 1];
            importObjects.add(lastElement);
        }

        return null;
    }

    private Void visitMethodDecl(JmmNode method, SymbolTable table) {
    
        currentMethod = method;
        if(currentMethod.hasAttribute("methodName")){
            currentMethodString = method.get("methodName");
        }
        else{
            currentMethodString = "main";
        }
        
        //check for duplicated locals
        Set<String> uniqueLocals = new HashSet<>();
        for (JmmNode fieldExpr: method.getChildren("FieldDeclaration")) {
            if (!uniqueLocals.add(fieldExpr.get("variable"))) {
                addReport(Report.newError(
                    Stage.SEMANTIC,
                    NodeUtils.getLine(fieldExpr),
                    NodeUtils.getColumn(fieldExpr),
                    "Can't have duplicate locals!",
                    null)
                );  
            }
        }     
        
        //check if it has a return
        //the check for type is done in the return visit
        if(!table.getReturnType(currentMethodString).getName().equals("void")){
            if(method.getChildren("ReturnDeclaration").size() == 0){
                addReport(Report.newError(
                    Stage.SEMANTIC,
                    NodeUtils.getLine(method),
                    NodeUtils.getColumn(method),
                    "Non void functions must have a return!",
                    null)
                );  
            }
        }

        return null;
    }

    private Void assignment(JmmNode assignmentExpression, SymbolTable table){
        currentType = getVariableType(assignmentExpression, table);
        currentAssignmentNode = assignmentExpression;

        JmmNode childNode = assignmentExpression.getChild(0);


        String assignedName = assignmentExpression.get("variable");
        //CHECK IF ASSIGNED VALUE IS DEFINED
        boolean isDefined = false;

        // Var is a field and method is not static
        if (table.getFields().stream()
                .anyMatch(param -> param.getName().equals(assignedName)) && !currentMethod.hasAttribute("isStatic")) {
                    isDefined = true;
        }

        // Var is a parameter
        if (table.getParameters(currentMethodString).stream()
                .anyMatch(param -> param.getName().equals(assignedName)) && !isDefined) {

            isDefined = true;
        }    
           

        // check for locals
        if (!isDefined) {

            //check to see if its undefined
            for(JmmNode child : currentMethod.getChildren()){
                //we are checking the child nodes until we reach the one where our current node is the children
                if(child.getKind().equals("FieldDeclaration")){
                    if(child.get("variable").equals(assignedName)){
                        //found variable, leave the loop
                        break;
                    }
                }
                //we reach our current node
                if(child == assignmentExpression){
                    addReport(Report.newError(
                        Stage.SEMANTIC,
                        NodeUtils.getLine(assignmentExpression),
                        NodeUtils.getColumn(assignmentExpression),
                        "Variable is undefined",
                        null)
                    );
                }
            }
        }
    

        //Checks for binaryOps
        if(childNode.getKind().equals("BinaryExpression")){
            //checks for +, * , ... and returns error if it isnt an int
            if(arithmeticOperators.contains(childNode.get("operation")) && !currentType.getName().equals("int")){
                addReport(Report.newError(
                    Stage.SEMANTIC,
                    NodeUtils.getLine(assignmentExpression),
                    NodeUtils.getColumn(assignmentExpression),
                    "Types of assignment don't match!",
                    null)
                );
                return null;
            }

            //checks for &&, ||, ... and sees if isnt a boolean
            if(conditionalOperators.contains(childNode.get("operation")) && !currentType.getName().equals("boolean")){
                //checks to see if its a 1 or 0,
                if(childNode.hasAttribute("value")){
                    if(childNode.get("value").equals("0") || childNode.get("value").equals("1")){
                        return null;
                    }
                }
                //if it isnt a 1 or 0 we return error
                addReport(Report.newError(
                    Stage.SEMANTIC,
                    NodeUtils.getLine(assignmentExpression),
                    NodeUtils.getColumn(assignmentExpression),
                    "Types of assignment don't match!",
                    null)
                );
            }

            return null;
        }


    

        //VARIABLES: checks for type and sees if it matches
        if(childNode.getKind().equals("VariableReferenceExpression") || childNode.getKind().equals("BooleanLiteral") || childNode.getKind().equals("IntegerLiteral")){
            Type variableType =getVariableType(childNode, table);

            //imports and extends assume everything works
            if(importObjects.contains(variableType.getName())){
                return null;
            }


            //thge original is imported class and the new extends import
            //super niche case, only here because of the tests :)
            if(importObjects.contains(currentType.getName()) && table.getClassName().equals(variableType.getName()) && importObjects.contains(table.getSuper())){
                return null;
            }

            //checks to see if 0 or 1 is assigned to boolean
            if(currentType.getName().equals("boolean")){
                if(childNode.hasAttribute("value")){
                    if(childNode.get("value").equals("0") || childNode.get("value").equals("1")){
                        return null;
                    }
                }
            }

            if(!variableType.equals(currentType)){
                addReport(Report.newError(
                    Stage.SEMANTIC,
                    NodeUtils.getLine(assignmentExpression),
                    NodeUtils.getColumn(assignmentExpression),
                    "Types of assignment don't match!",
                    null)
                );
            }
        }

        return null;
    }

    private Void assignmentArray(JmmNode assignmentArrayExpr, SymbolTable table){
        String arrayName = assignmentArrayExpr.get("variable");
        Type arrayType = getVariableType(arrayName,table);

        //check to see if variable is defined
        if(arrayType == null){
            addReport(Report.newError(
                Stage.SEMANTIC,
                NodeUtils.getLine(assignmentArrayExpr),
                NodeUtils.getColumn(assignmentArrayExpr),
                "Assigning to an undefined array!",
                null)
            );
        }


        return  null;
    }

    

    //given to us by teachers
    private Void visitVarRefExpr(JmmNode varRefExpr, SymbolTable table) {



        SpecsCheck.checkNotNull(currentMethodString, () -> "Expected current method to be set");

        // Check if exists a parameter or variable declaration with the same name as the variable reference
        var varRefName = varRefExpr.get("variable");


        //ignores if it's called from a function, it just means its whatever the function is calling
        if(varRefExpr.getParent().getKind().equals("FunctionCallExpression")){
            return null;
        }

        // Var is a field, return
        if (table.getFields().stream()
                .anyMatch(param -> param.getName().equals(varRefName))) {
            return null;
        }

        // Var is a parameter, return
        if (table.getParameters(currentMethodString).stream()
                .anyMatch(param -> param.getName().equals(varRefName))) {

            return null;
        }    
           

        // Var is a declared variable, return
        if (table.getLocalVariables(currentMethodString).stream()
                .anyMatch(varDecl -> varDecl.getName().equals(varRefName))) {

            //check to see its defined before where its being used
            for(JmmNode childNode : currentMethod.getDescendants()){

                if(childNode.getKind().equals("FieldDeclaration")){
                    if(childNode.get("variable").equals(varRefName)){
                        return null;
                    }
                }
                //we reach the use of the var without it being defined
                if(childNode == varRefExpr){

                    addReport(Report.newError(
                        Stage.SEMANTIC,
                        NodeUtils.getLine(varRefExpr),
                        NodeUtils.getColumn(varRefExpr),
                        "Variable is undefined",
                        null)
                    );
                }
            }
            return null;

        }

        // Create error report
        var message = String.format("Variable '%s' does not exist.", varRefName);
        addReport(Report.newError(
                Stage.SEMANTIC,
                NodeUtils.getLine(varRefExpr),
                NodeUtils.getColumn(varRefExpr),
                message,
                null)
        );

        return null;
    }
    private Void visitThisCall(JmmNode thisExpr, SymbolTable table) {
        if(currentMethod.hasAttribute("isStatic")){
            addReport(Report.newError(
                Stage.SEMANTIC,
                NodeUtils.getLine(thisExpr),
                NodeUtils.getColumn(thisExpr),
                "Can't use this in a static method!",
                null)
        );
        }
        return null;
    }


    private Void visitFunctionCall(JmmNode functionCallExpr, SymbolTable table){
        String calledMethodName = functionCallExpr.get("value");
        System.err.println(functionCallExpr);

        //checks if the call is from an imported class, assumes everything is well
        if(importObjects.contains(calledMethodName)){
            return null;
        }


        if(functionCallExpr.getNumChildren() != 0){
            //checks to see if it's a an object function being called
            if(!functionCallExpr.getChild(0).getKind().equals("Parameter")){
                JmmNode base = functionCallExpr.getChild(0);


                //ignore the rest of the checks if it references the this object
                if(!base.getKind().equals("ThisReferenceExpression")){

                    //checks to see if it's an import, if it is we assume it works
                    if(base.hasAttribute("variable")){
                        if(importObjects.contains(base.get("variable"))){
                            return null;
                        }
                    }

        

                    Type baseObjectType = getVariableType(base, table);



                    //checks to see if the caller is defined
                    if(baseObjectType == null){
                        addReport(Report.newError(
                            Stage.SEMANTIC,
                            NodeUtils.getLine(functionCallExpr),
                            NodeUtils.getColumn(functionCallExpr),
                            "Calling a method from an undefined object",
                            null)
                        );
                        return null;
                    }

                    //checks if it's an imported class, if it is we assume it works
                    if(importObjects.contains( baseObjectType.getName())){
                        return null;
                    }
        
                    //chceks to see if its an extension of a imported class
                    if(baseObjectType.getName().equals(table.getClassName()) && importObjects.contains(table.getSuper())){
                        return null;
                    }
                }
            }
        }




        //if the called method is an import we assume it works
        if(importObjects.contains(calledMethodName)){
            return null;
        }


        // we can assume its in the super class and we assume it works
        if(!table.getSuper().equals("")){
            return null;
        }


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
        List<Symbol> argumentsMethod = table.getParameters(calledMethodName);

        if(!argumentsMethod.isEmpty()){
            //checks for varargs
            if(argumentsMethod.get(0).getType().getName().equals("int..."))
            {

                for(JmmNode parameter: functionCallExpr.getChild(0).getChildren()){
                    Type type = getVariableType(parameter, table);
                    if(!type.getName().equals("int")){
                        addReport(Report.newError(
                            Stage.SEMANTIC,
                            NodeUtils.getLine(functionCallExpr),
                            NodeUtils.getColumn(functionCallExpr),
                            "Vararg functions only take int as parameter!",
                            null)
                        );
                        return null;
                    }
                }
                return null;
            }
        }

        if(!functionCallExpr.getChildren("Parameter").isEmpty()){
            //checks for normal ones;
            int counter = 0;
            for(JmmNode parameter: functionCallExpr.getChildren("Parameter").get(0).getChildren()){
                System.out.println(parameter);
                Type type = getVariableType(parameter, table);
                System.out.println(type); 
                if(argumentsMethod.get(counter).getType().getName().equals("int...")){
                    return null;
                }
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
        }

        return null;
    }
    
    private Void visitClassCall(JmmNode classExpr, SymbolTable table){

        String classname = classExpr.get("classname");

        //checks for current class and then superclass and then imported
        if(!table.getClassName().equals(classname)){

            if(!table.getSuper().equals(classname)){
                if(!importObjects.contains(classname)){
                    addReport(Report.newError(
                        Stage.SEMANTIC,
                        NodeUtils.getLine(classExpr),
                        NodeUtils.getColumn(classExpr),
                        "Calls for an undefined class!",
                        null)
                    );
                }
            }
        }

        return null;
    }



    private Void visitArrayInitialization(JmmNode arrayExpr, SymbolTable table){


        if(arrayExpr.getParent().getKind().equals("Assignment")){
            //checks to see if its being put into an actual array, we only check this on assignments
            if(!currentType.isArray() && !currentType.getName().equals("int...")){
                addReport(Report.newError(
                    Stage.SEMANTIC,
                    NodeUtils.getLine(arrayExpr),
                    NodeUtils.getColumn(arrayExpr),
                    "Can't put array values into a simple int!",
                    null)
                );
                return null;
            }
        }


        //Checks if all the instances being put into the array are int
        for (JmmNode child : arrayExpr.getChildren()) {
            if(! getVariableType(child, table).getName().equals("int")){
                addReport(Report.newError(
                    Stage.SEMANTIC,
                    NodeUtils.getLine(arrayExpr),
                    NodeUtils.getColumn(arrayExpr),
                    "Can't initialize array with a non int value!",
                    null)
                );
            }
        }

        return null;
    }

    private Void visitBinaryExpression(JmmNode binaryOp, SymbolTable table){

        JmmNode leftOperator = binaryOp.getChild(0); 
        JmmNode rightOperator = binaryOp.getChild(1);

        Type leftType = null;
        Type rightType = null;

        boolean leftImport = false;
        boolean rightImport = false;

        if(leftOperator.getKind().equals("FunctionCallExpression")){
            String functionName = leftOperator.get("value");
            if(table.getMethods().contains(functionName)){
                leftType = table.getReturnType(functionName);
            }
            else{ // its import assume it works{
                leftImport = true;
            }
        }
        else{
            leftType = getVariableType(leftOperator,table);
        }

        if(rightOperator.getKind().equals("FunctionCallExpression")){
            String functionName = rightOperator.get("value");
            if(table.getMethods().contains(functionName)){
                rightType = table.getReturnType(functionName);
            }
            else{ // its import assume it works{
                rightImport = true;
            }
        }
        else{
            rightType = getVariableType(rightOperator,table);
        }


        //we just make types work if they're imports
        if(leftImport){
            leftType = rightType;
        }
        if(rightImport){
            rightType = leftType;
        }


        
        //ARRAY OPERATIONS
        if (rightType != null && leftType != null && (rightType.isArray() || leftType.isArray())) {
            addReport(Report.newError(
                Stage.SEMANTIC,
                NodeUtils.getLine(binaryOp),
                NodeUtils.getColumn(binaryOp),
                "Cannot perform operation with array type",
                null)
            );
        }

        //ARITHMETIC OPERATIONS AND COMPARISON
        //they must be between 2 ints, if not then errror
        if (arithmeticOperators.contains(binaryOp.get("operation")) || comparisonOperators.contains(binaryOp.get("operation"))) {

            if (!leftType.getName().equals("int") || !rightType.getName().equals("int")) {

                String errorMessage;
                if (!leftType.getName().equals("int")) {
                    errorMessage = "Left operand '%s' must be int";
                } else {
                    errorMessage = "Right operand '%s' must be int";
                }
                addReport(Report.newError(
                    Stage.SEMANTIC,
                    NodeUtils.getLine(binaryOp),
                    NodeUtils.getColumn(binaryOp),
                    errorMessage,
                    null)
                );
            }
            return null;
        }

        //CONDITIONAL OPERATIONS
        if (conditionalOperators.contains(binaryOp.get("operation"))) {
            if (!leftType.getName().equals("boolean") || !rightType.getName().equals("boolean")) {

                String errorMessage;
                if (!leftType.getName().equals("boolean")) {
                    errorMessage = "Left operator must be boolean";
                } else {
                    errorMessage ="Right operator must be boolean";
                }
                addReport(Report.newError(
                    Stage.SEMANTIC,
                    NodeUtils.getLine(binaryOp),
                    NodeUtils.getColumn(binaryOp),
                    errorMessage,
                    null)
                );
            }
            return null;
        }



        return null;
    }

    //Check for bool conditionals after While and If
    private Void conditionCheck(JmmNode loopExpr, SymbolTable table){

        JmmNode conditionalExpr = loopExpr.getChild(0);

        //its a boolean literal
        if(conditionalExpr.getKind().equals("BooleanLiteral")){
            return null;
        }

        //its 1 or 0
        if(conditionalExpr.getKind().equals("IntegerLiteral")){
            String value = conditionalExpr.get("value");
            if(value == "1" || value == "0"){
                return null;
            }
        }

        //its a variable in the condition
        if( conditionalExpr.getKind().equals("VariableReferenceExpression")){
            //the variable isn't a boolean
            if(!getVariableType(conditionalExpr, table).getName().equals("boolean")){
                addReport(Report.newError(
                    Stage.SEMANTIC,
                    NodeUtils.getLine(loopExpr),
                    NodeUtils.getColumn(loopExpr),
                    "Condition variable must be boolean!",
                    null)
                );
            }
            return null;
        }


        String operator = conditionalExpr.get("operation");
        if(!conditionalOperators.contains(operator) && !comparisonOperators.contains(operator)){
            addReport(Report.newError(
                Stage.SEMANTIC,
                NodeUtils.getLine(loopExpr),
                NodeUtils.getColumn(loopExpr),
                "Must have a boolean as a conditional!",
                null)
            );
            return null;
        }
        return null;
    }

    private Void visitArrayAccess(JmmNode arrayAccessExpression, SymbolTable table){
        JmmNode accessedArray = arrayAccessExpression.getChild(0);
        Type variableType = getVariableType(accessedArray,table);
        if(!variableType.isArray() && !variableType.getName().equals("int...")){
            addReport(Report.newError(
                Stage.SEMANTIC,
                NodeUtils.getLine(arrayAccessExpression),
                NodeUtils.getColumn(arrayAccessExpression),
                "You have to access an array!",
                null)
            );
        }

        JmmNode indexExpression = arrayAccessExpression.getChild(1);
        Type indexType = getVariableType(indexExpression, table);

        if(!indexType.getName().equals("int")){
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

    private Void visitReturnDecl(JmmNode returnExpr,SymbolTable table){
        Type typeMethod= table.getReturnType(currentMethodString);


        if(typeMethod.getName().equals("void")){
            addReport(Report.newError(
                Stage.SEMANTIC,
                NodeUtils.getLine(returnExpr),
                NodeUtils.getColumn(returnExpr),
                "Void functions can't return!",
                null)
            );
        }
        JmmNode childNode = returnExpr.getChild(0);



        //Literals
        if(childNode.getKind().equals("IntegerLiteral")){
            if( !typeMethod.getName().equals("int")){
                addReport(Report.newError(
                    Stage.SEMANTIC,
                    NodeUtils.getLine(returnExpr),
                    NodeUtils.getColumn(returnExpr),
                    "Return type of method doesn't match!",
                    null)
                );
            }

            return null;
        }
        if(childNode.getKind().equals("BooleanLiteral")){
            if( !typeMethod.getName().equals("boolean")){
                addReport(Report.newError(
                    Stage.SEMANTIC,
                    NodeUtils.getLine(returnExpr),
                    NodeUtils.getColumn(returnExpr),
                    "Return type of method doesn't match!",
                    null)
                );
            }

            return null;
        }


        //variable
        if(childNode.getKind().equals("VariableReferenceExpression")){
            Type variableType = getVariableType(childNode, table);
            if(variableType == null){
                return null;
            }

            if(!variableType.equals(typeMethod)){
                addReport(Report.newError(
                    Stage.SEMANTIC,
                    NodeUtils.getLine(returnExpr),
                    NodeUtils.getColumn(returnExpr),
                    "Return type of method doesn't match!",
                    null)
                );
            }
            return null;
        }

        if(childNode.getKind().equals("BinaryExpression")){
            //checks for +, * , ... and sees if its an int
            if(!arithmeticOperators.contains(childNode.get("operation")) && typeMethod.getName().equals("int")){
                addReport(Report.newError(
                    Stage.SEMANTIC,
                    NodeUtils.getLine(returnExpr),
                    NodeUtils.getColumn(returnExpr),
                    "Return type of method doesn't match!",
                    null)
                );
            }
            //checks for &&, ||, ... and sees if its an int
            if(!conditionalOperators.contains(childNode.get("operation")) && typeMethod.getName().equals("boolean")){
                addReport(Report.newError(
                    Stage.SEMANTIC,
                    NodeUtils.getLine(returnExpr),
                    NodeUtils.getColumn(returnExpr),
                    "Return type of method doesn't match!",
                    null)
                );
            }
            return null;
        }

        // array
        if(childNode.getKind().equals("ArrayAccessExpression")){
            //check to see if it's an int access is already done somewhere else
            return null;
        }


        //methodcall
        String calledMethodName = childNode.get("value");
        if(table.getMethods().contains(calledMethodName)){
            if(!table.getReturnType(calledMethodName).equals(typeMethod)){
                addReport(Report.newError(
                    Stage.SEMANTIC,
                    NodeUtils.getLine(returnExpr),
                    NodeUtils.getColumn(returnExpr),
                    "Return type of method doesn't match!",
                    null)
                );
            }
        }
        //we'll  just assume if imported works, there's another visit to see if the function call doesn't exist


        return null;
    }


    private Void visitVararg(JmmNode varargExpr, SymbolTable table){
        JmmNode parentNode = varargExpr.getParent();




        //checks to see if it's argument
        if(parentNode.getKind().equals("ArgumentDecl")){
            //checks to see if vararg is the first argument on a method call
            List<Symbol> parameters = table.getParameters(currentMethodString);
            int parametersSize = parameters.size();
            if(!parameters.get(parametersSize - 1).getName().equals(parentNode.get("argName"))){
                addReport(Report.newError(
                    Stage.SEMANTIC,
                    NodeUtils.getLine(varargExpr),
                    NodeUtils.getColumn(varargExpr),
                    "Varargs must be the last method!",
                    null)
                );
            }
        }
        else{
            addReport(Report.newError(
                Stage.SEMANTIC,
                NodeUtils.getLine(varargExpr),
                NodeUtils.getColumn(varargExpr),
                "Varargs must be used only as arguments for function!",
                null)
            );
        }
        return null;
    }

    //gets the type of the node in a trickle up effect
    private Type getVariableType(JmmNode var,SymbolTable table){
        if(var.getKind().equals("ParenthesisExpression")){
            var = var.getChild(0);
        }
        //function
        if(var.getKind().equals("FunctionCallExpression")){
            String calledFunction = var.get("value");
            return table.getReturnType(calledFunction);
        }
        //Array access, we assume its int because we're only dealing with int arrays
        else if(var.getKind().equals("ArrayAccessExpression")){
            return new Type("int",false);
        }
        else if(var.getKind().equals("ArrayInitializationExpression")){
            return new Type("int",true);
        }
        //ArrayLength, also an int
        else if(var.getKind().equals("ArrayLengthExpression")){
            return new Type("int",false);
        }
        else if(var.getKind().equals("BooleanLiteral")){
            return new Type("boolean",false);
        }
        else if(var.getKind().equals("IntegerLiteral")){
            return new Type("int",false);
        }

        if(var.getKind().equals("BinaryExpression")){
            if(arithmeticOperators.contains(var.get("operation"))){
                return new Type("int",false);
            }
            else{
                return new Type("boolean",false);
            }
        }        
        
        if(var.getKind().equals("NegationExpression")){
            return new Type("boolean",false);
        }      
        



        String varName = var.get("variable");
        

        //Checks in the local fields
        for(Symbol symbol : table.getLocalVariables(currentMethodString)){
            if(symbol.getName().equals(varName))
            {
                return symbol.getType();
            }
        }

        //Checks in the methods arguments
        for(Symbol symbol : table.getParameters(currentMethodString)){
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

    //Same thing but with String
    private Type getVariableType(String varName,SymbolTable table){

        //Checks in the local fields
        for(Symbol symbol : table.getLocalVariables(currentMethodString)){
            if(symbol.getName().equals(varName))
            {
                return symbol.getType();
            }
        }

        //Checks in the methods arguments
        for(Symbol symbol : table.getParameters(currentMethodString)){
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
