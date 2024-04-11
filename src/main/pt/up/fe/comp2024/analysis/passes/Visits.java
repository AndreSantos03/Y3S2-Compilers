package pt.up.fe.comp2024.analysis.passes;

import pt.up.fe.comp.jmm.analysis.table.SymbolTable;
import pt.up.fe.comp.jmm.analysis.table.Symbol;
import pt.up.fe.comp.jmm.analysis.table.Type;
import java.util.Arrays;
import java.util.List;

import org.stringtemplate.v4.compiler.CodeGenerator.region_return;

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


    private final List<String> conditionalOperators = Arrays.asList("&&","||");
    private final List<String> arithmeticOperators = Arrays.asList("+", "-", "*", "/","<",">","==","!=");

    @Override
    public void buildVisitor() {
        addVisit("MethodDeclaration", this::visitMethodDecl);
        addVisit("Assignment",this::assignment);
        addVisit("VariableReferenceExpression", this::visitVarRefExpr);
        addVisit("FunctionCallExpression",this::visitFunctionCall);
        addVisit("ClassInstantiationExpression",this::visitClassCall);
        // addVisit("ThisReferenceExpression",this::visitThisCall);
        addVisit("ArrayInitializationExpression",this::visitArrayInitialization);
        addVisit("BinaryExpression",this::visitBinaryExpression);
        addVisit("IfStatement",this::conditionCheck);
        addVisit("WhileStatement",this::conditionCheck);
        addVisit("ArrayAccessExpression",this::visitArrayAccess);
        addVisit("ReturnDeclaration",this::visitReturnDecl);
        addVisit("Vararg",this::visitVararg);
    }

    private Void visitMethodDecl(JmmNode method, SymbolTable table) {
        currentMethod = method;
        if(currentMethod.hasAttribute("methodName")){
            currentMethodString = method.get("methodName");
        }
        else{
            currentMethodString = "main";
        }
        return null;
    }

    private Void assignment(JmmNode assignmentExpression, SymbolTable table){
        currentType = getVariableType(assignmentExpression, table);
        currentAssignmentNode = assignmentExpression;

        JmmNode childNode = assignmentExpression.getChild(0);

        //Checks for binaryOps
        if(childNode.getKind().equals("BinaryExpression")){
            //checks for +, * , ... and sees if its an int
            if(arithmeticOperators.contains(childNode.get("operation")) && !currentType.getName().equals("int")){
                addReport(Report.newError(
                    Stage.SEMANTIC,
                    NodeUtils.getLine(assignmentExpression),
                    NodeUtils.getColumn(assignmentExpression),
                    "Types of assignment don't match!",
                    null)
                );
            }

            //checks for &&, ||, ... and sees if its an int
            if(conditionalOperators.contains(childNode.get("operation")) && !currentType.getName().equals("boolean")){
                //checks to see if its a 1 or 0
                if(childNode.hasAttribute("value")){
                    if(childNode.get("value").equals("0") || childNode.get("value").equals("1")){
                        return null;
                    }
                }
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
            if(table.getImports().contains(variableType.getName())){
                return null;
            }


            //thge original is imported class and the new extends import
            //super niche case, only here because of the tests :)
            if(table.getImports().contains(currentType.getName()) && table.getClassName().equals(variableType.getName()) && table.getImports().contains(table.getSuper())){
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

    private Void visitFunctionCall(JmmNode functionCallExpr, SymbolTable table){

        //checks to see if it's a an object function being called
        if(!functionCallExpr.getChild(0).getKind().equals("Parameter")){
            JmmNode base = functionCallExpr.getChild(0);

            //ignore the rest of the checks if it references the this object
            if(!base.getKind().equals("ThisReferenceExpression")){

                //checks to see if it's an import, if it is we assume it works
                if(base.hasAttribute("variable")){
                    if(table.getImports().contains(base.get("variable"))){
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
    
                //checks if the call is from an imported class, assumes everything is well
                if(table.getImports().contains(baseObjectType.getName())){
                    return null;
                }
    
                //chceks to see if its an extension of a imported class
                if(baseObjectType.getName().equals(table.getClassName()) && table.getImports().contains(table.getSuper())){
                    return null;
                }
            }
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
        List<Symbol> argumentsMethod = table.getParameters(calledMethodName);


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

        //checks for normal ones;
        int counter = 0;
        for(JmmNode parameter: functionCallExpr.getChildren("Parameter").get(0).getChildren()){
            Type type = getVariableType(parameter, table);
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
    
    private Void visitClassCall(JmmNode classExpr, SymbolTable table){

        String classname = classExpr.get("classname");

        //checks for current class and then superclass and then imported
        if(!table.getClassName().equals(classname)){

            if(!table.getSuper().equals(classname)){
                if(!table.getImports().contains(classname)){
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

/*     private Void visitThisCall(JmmNode thisExpr, SymbolTable table){

        //Checks for this reference in the class name and extends
        if(!table.getClassName().equals(currentType.getName())){
            //Check for superclass
            if(!table.getSuper().equals(currentType.getName())){
                addReport(Report.newError(
                    Stage.SEMANTIC,
                    NodeUtils.getLine(thisExpr),
                    NodeUtils.getColumn(thisExpr),
                    "Mismatch between the current or extended class and the variable type!",
                    null)
                );
            }
        }
        return null;
    } */

    private Void visitArrayInitialization(JmmNode arrayExpr, SymbolTable table){
        //checks to see if its being put into an actual array
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

        Type leftType= getVariableType(leftOperator,table);
        Type rightType= getVariableType(rightOperator,table);
        
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
            return null;//not needed, just saves a few iterations of the
        }


        //ARITHMETIC OPERATIONS
        if (arithmeticOperators.contains(binaryOp.get("operation"))) {
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
        }
        return null;
    }

    //Check for bool conditionals after While and If
    private Void conditionCheck(JmmNode loopExpr, SymbolTable table){
        JmmNode conditionalExpr = loopExpr.getChild(0);
        if(getVariableType(conditionalExpr, table).getName().equals("boolean")){
            return null;
        }
        if(!conditionalOperators.contains(conditionalExpr.get("operation"))){
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

            if(!getVariableType(childNode, table).equals(typeMethod)){
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
        return null;
    }

    //gets the type of the node in a trickle up effect
    private Type getVariableType(JmmNode var,SymbolTable table){
        

        if(var.getKind().equals("BooleanLiteral")){
            return new Type("boolean",false);
        }
        else if(var.getKind().equals("IntegerLiteral")){
            return new Type("int",false);
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
