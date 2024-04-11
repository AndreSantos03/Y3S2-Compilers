// Generated from c:/Users/NASA/Desktop/comp2024-10e/src/main/antlr/comp2024/Javamm.g4 by ANTLR 4.13.1

    package pt.up.fe.comp2024;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JavammParser}.
 */
public interface JavammListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JavammParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(JavammParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavammParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(JavammParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ImportStatement}
	 * labeled alternative in {@link JavammParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportStatement(JavammParser.ImportStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ImportStatement}
	 * labeled alternative in {@link JavammParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportStatement(JavammParser.ImportStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ClassDecl}
	 * labeled alternative in {@link JavammParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDecl(JavammParser.ClassDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ClassDecl}
	 * labeled alternative in {@link JavammParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDecl(JavammParser.ClassDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Array}
	 * labeled alternative in {@link JavammParser#type}.
	 * @param ctx the parse tree
	 */
	void enterArray(JavammParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Array}
	 * labeled alternative in {@link JavammParser#type}.
	 * @param ctx the parse tree
	 */
	void exitArray(JavammParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolean}
	 * labeled alternative in {@link JavammParser#type}.
	 * @param ctx the parse tree
	 */
	void enterBoolean(JavammParser.BooleanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolean}
	 * labeled alternative in {@link JavammParser#type}.
	 * @param ctx the parse tree
	 */
	void exitBoolean(JavammParser.BooleanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code string}
	 * labeled alternative in {@link JavammParser#type}.
	 * @param ctx the parse tree
	 */
	void enterString(JavammParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code string}
	 * labeled alternative in {@link JavammParser#type}.
	 * @param ctx the parse tree
	 */
	void exitString(JavammParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vararg}
	 * labeled alternative in {@link JavammParser#type}.
	 * @param ctx the parse tree
	 */
	void enterVararg(JavammParser.VarargContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vararg}
	 * labeled alternative in {@link JavammParser#type}.
	 * @param ctx the parse tree
	 */
	void exitVararg(JavammParser.VarargContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link JavammParser#type}.
	 * @param ctx the parse tree
	 */
	void enterId(JavammParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link JavammParser#type}.
	 * @param ctx the parse tree
	 */
	void exitId(JavammParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Int}
	 * labeled alternative in {@link JavammParser#type}.
	 * @param ctx the parse tree
	 */
	void enterInt(JavammParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Int}
	 * labeled alternative in {@link JavammParser#type}.
	 * @param ctx the parse tree
	 */
	void exitInt(JavammParser.IntContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavammParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(JavammParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavammParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(JavammParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavammParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(JavammParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavammParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(JavammParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavammParser#returnDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterReturnDeclaration(JavammParser.ReturnDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavammParser#returnDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitReturnDeclaration(JavammParser.ReturnDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code argumentDecl}
	 * labeled alternative in {@link JavammParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgumentDecl(JavammParser.ArgumentDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code argumentDecl}
	 * labeled alternative in {@link JavammParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgumentDecl(JavammParser.ArgumentDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SimpleExpression}
	 * labeled alternative in {@link JavammParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSimpleExpression(JavammParser.SimpleExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SimpleExpression}
	 * labeled alternative in {@link JavammParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSimpleExpression(JavammParser.SimpleExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Block}
	 * labeled alternative in {@link JavammParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterBlock(JavammParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Block}
	 * labeled alternative in {@link JavammParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitBlock(JavammParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IfStatement}
	 * labeled alternative in {@link JavammParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(JavammParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IfStatement}
	 * labeled alternative in {@link JavammParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(JavammParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WhileStatement}
	 * labeled alternative in {@link JavammParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(JavammParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WhileStatement}
	 * labeled alternative in {@link JavammParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(JavammParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Assignment}
	 * labeled alternative in {@link JavammParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(JavammParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Assignment}
	 * labeled alternative in {@link JavammParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(JavammParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignmentArray}
	 * labeled alternative in {@link JavammParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentArray(JavammParser.AssignmentArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignmentArray}
	 * labeled alternative in {@link JavammParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentArray(JavammParser.AssignmentArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavammParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(JavammParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavammParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(JavammParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ThisReferenceExpression}
	 * labeled alternative in {@link JavammParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterThisReferenceExpression(JavammParser.ThisReferenceExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ThisReferenceExpression}
	 * labeled alternative in {@link JavammParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitThisReferenceExpression(JavammParser.ThisReferenceExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayInitializationExpression}
	 * labeled alternative in {@link JavammParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializationExpression(JavammParser.ArrayInitializationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayInitializationExpression}
	 * labeled alternative in {@link JavammParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializationExpression(JavammParser.ArrayInitializationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenthesisExpression}
	 * labeled alternative in {@link JavammParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesisExpression(JavammParser.ParenthesisExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenthesisExpression}
	 * labeled alternative in {@link JavammParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesisExpression(JavammParser.ParenthesisExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BooleanLiteral}
	 * labeled alternative in {@link JavammParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(JavammParser.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BooleanLiteral}
	 * labeled alternative in {@link JavammParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(JavammParser.BooleanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionCallExpression}
	 * labeled alternative in {@link JavammParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallExpression(JavammParser.FunctionCallExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionCallExpression}
	 * labeled alternative in {@link JavammParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallExpression(JavammParser.FunctionCallExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BinaryExpression}
	 * labeled alternative in {@link JavammParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBinaryExpression(JavammParser.BinaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BinaryExpression}
	 * labeled alternative in {@link JavammParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBinaryExpression(JavammParser.BinaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableReferenceExpression}
	 * labeled alternative in {@link JavammParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterVariableReferenceExpression(JavammParser.VariableReferenceExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableReferenceExpression}
	 * labeled alternative in {@link JavammParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitVariableReferenceExpression(JavammParser.VariableReferenceExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayLengthExpression}
	 * labeled alternative in {@link JavammParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterArrayLengthExpression(JavammParser.ArrayLengthExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayLengthExpression}
	 * labeled alternative in {@link JavammParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitArrayLengthExpression(JavammParser.ArrayLengthExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NewIntArrayExpression}
	 * labeled alternative in {@link JavammParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNewIntArrayExpression(JavammParser.NewIntArrayExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NewIntArrayExpression}
	 * labeled alternative in {@link JavammParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNewIntArrayExpression(JavammParser.NewIntArrayExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ClassInstantiationExpression}
	 * labeled alternative in {@link JavammParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterClassInstantiationExpression(JavammParser.ClassInstantiationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ClassInstantiationExpression}
	 * labeled alternative in {@link JavammParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitClassInstantiationExpression(JavammParser.ClassInstantiationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NegationExpression}
	 * labeled alternative in {@link JavammParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNegationExpression(JavammParser.NegationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NegationExpression}
	 * labeled alternative in {@link JavammParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNegationExpression(JavammParser.NegationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayAccessExpression}
	 * labeled alternative in {@link JavammParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccessExpression(JavammParser.ArrayAccessExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayAccessExpression}
	 * labeled alternative in {@link JavammParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccessExpression(JavammParser.ArrayAccessExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntegerLiteral}
	 * labeled alternative in {@link JavammParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(JavammParser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntegerLiteral}
	 * labeled alternative in {@link JavammParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(JavammParser.IntegerLiteralContext ctx);
}