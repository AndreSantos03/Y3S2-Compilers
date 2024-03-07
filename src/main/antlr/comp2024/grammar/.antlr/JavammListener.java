// Generated from c:/Users/NASA/Desktop/comp2024-10e/src/main/antlr/comp2024/grammar/Javamm.g4 by ANTLR 4.13.1

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
	 * Enter a parse tree produced by the {@code ClassStatement}
	 * labeled alternative in {@link JavammParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassStatement(JavammParser.ClassStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ClassStatement}
	 * labeled alternative in {@link JavammParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassStatement(JavammParser.ClassStatementContext ctx);
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
	 * Enter a parse tree produced by the {@code DoubleTypeLabel}
	 * labeled alternative in {@link JavammParser#type}.
	 * @param ctx the parse tree
	 */
	void enterDoubleTypeLabel(JavammParser.DoubleTypeLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DoubleTypeLabel}
	 * labeled alternative in {@link JavammParser#type}.
	 * @param ctx the parse tree
	 */
	void exitDoubleTypeLabel(JavammParser.DoubleTypeLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringTypeLabel}
	 * labeled alternative in {@link JavammParser#type}.
	 * @param ctx the parse tree
	 */
	void enterStringTypeLabel(JavammParser.StringTypeLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringTypeLabel}
	 * labeled alternative in {@link JavammParser#type}.
	 * @param ctx the parse tree
	 */
	void exitStringTypeLabel(JavammParser.StringTypeLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VarArgsTypeLabel}
	 * labeled alternative in {@link JavammParser#type}.
	 * @param ctx the parse tree
	 */
	void enterVarArgsTypeLabel(JavammParser.VarArgsTypeLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarArgsTypeLabel}
	 * labeled alternative in {@link JavammParser#type}.
	 * @param ctx the parse tree
	 */
	void exitVarArgsTypeLabel(JavammParser.VarArgsTypeLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FloatTypeLabel}
	 * labeled alternative in {@link JavammParser#type}.
	 * @param ctx the parse tree
	 */
	void enterFloatTypeLabel(JavammParser.FloatTypeLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FloatTypeLabel}
	 * labeled alternative in {@link JavammParser#type}.
	 * @param ctx the parse tree
	 */
	void exitFloatTypeLabel(JavammParser.FloatTypeLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BooleanTypeLabel}
	 * labeled alternative in {@link JavammParser#type}.
	 * @param ctx the parse tree
	 */
	void enterBooleanTypeLabel(JavammParser.BooleanTypeLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BooleanTypeLabel}
	 * labeled alternative in {@link JavammParser#type}.
	 * @param ctx the parse tree
	 */
	void exitBooleanTypeLabel(JavammParser.BooleanTypeLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntTypeLabel}
	 * labeled alternative in {@link JavammParser#type}.
	 * @param ctx the parse tree
	 */
	void enterIntTypeLabel(JavammParser.IntTypeLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntTypeLabel}
	 * labeled alternative in {@link JavammParser#type}.
	 * @param ctx the parse tree
	 */
	void exitIntTypeLabel(JavammParser.IntTypeLabelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CustomTypeLabel}
	 * labeled alternative in {@link JavammParser#type}.
	 * @param ctx the parse tree
	 */
	void enterCustomTypeLabel(JavammParser.CustomTypeLabelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CustomTypeLabel}
	 * labeled alternative in {@link JavammParser#type}.
	 * @param ctx the parse tree
	 */
	void exitCustomTypeLabel(JavammParser.CustomTypeLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavammParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(JavammParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavammParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(JavammParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NormalMethodDeclaration}
	 * labeled alternative in {@link JavammParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterNormalMethodDeclaration(JavammParser.NormalMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NormalMethodDeclaration}
	 * labeled alternative in {@link JavammParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitNormalMethodDeclaration(JavammParser.NormalMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MainMethodDeclaration}
	 * labeled alternative in {@link JavammParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMainMethodDeclaration(JavammParser.MainMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MainMethodDeclaration}
	 * labeled alternative in {@link JavammParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMainMethodDeclaration(JavammParser.MainMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParameterDefinition}
	 * labeled alternative in {@link JavammParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameterDefinition(JavammParser.ParameterDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParameterDefinition}
	 * labeled alternative in {@link JavammParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameterDefinition(JavammParser.ParameterDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavammParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(JavammParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavammParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(JavammParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link JavammParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(JavammParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JavammParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(JavammParser.StatementContext ctx);
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
	 * Enter a parse tree produced by the {@code binaryOp}
	 * labeled alternative in {@link JavammParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBinaryOp(JavammParser.BinaryOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binaryOp}
	 * labeled alternative in {@link JavammParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBinaryOp(JavammParser.BinaryOpContext ctx);
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
	 * Enter a parse tree produced by the {@code VariableExpression}
	 * labeled alternative in {@link JavammParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterVariableExpression(JavammParser.VariableExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableExpression}
	 * labeled alternative in {@link JavammParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitVariableExpression(JavammParser.VariableExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FalseLiteral}
	 * labeled alternative in {@link JavammParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFalseLiteral(JavammParser.FalseLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FalseLiteral}
	 * labeled alternative in {@link JavammParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFalseLiteral(JavammParser.FalseLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parenthesis}
	 * labeled alternative in {@link JavammParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesis(JavammParser.ParenthesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parenthesis}
	 * labeled alternative in {@link JavammParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesis(JavammParser.ParenthesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayAccess}
	 * labeled alternative in {@link JavammParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterArrayAccess(JavammParser.ArrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayAccess}
	 * labeled alternative in {@link JavammParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitArrayAccess(JavammParser.ArrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TrueLiteral}
	 * labeled alternative in {@link JavammParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTrueLiteral(JavammParser.TrueLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TrueLiteral}
	 * labeled alternative in {@link JavammParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTrueLiteral(JavammParser.TrueLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ClassInstantiation}
	 * labeled alternative in {@link JavammParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterClassInstantiation(JavammParser.ClassInstantiationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ClassInstantiation}
	 * labeled alternative in {@link JavammParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitClassInstantiation(JavammParser.ClassInstantiationContext ctx);
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
	 * Enter a parse tree produced by the {@code FunctionCall}
	 * labeled alternative in {@link JavammParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(JavammParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionCall}
	 * labeled alternative in {@link JavammParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(JavammParser.FunctionCallContext ctx);
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