// Generated from ./ProLang.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ProLangParser}.
 */
public interface ProLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ProLangParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ProLangParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProLangParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ProLangParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(ProLangParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProLangParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(ProLangParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProLangParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(ProLangParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProLangParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(ProLangParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProLangParser#printFunction}.
	 * @param ctx the parse tree
	 */
	void enterPrintFunction(ProLangParser.PrintFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProLangParser#printFunction}.
	 * @param ctx the parse tree
	 */
	void exitPrintFunction(ProLangParser.PrintFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProLangParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(ProLangParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProLangParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(ProLangParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProLangParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(ProLangParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProLangParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(ProLangParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProLangParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStatement(ProLangParser.SwitchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProLangParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStatement(ProLangParser.SwitchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProLangParser#caseBlock}.
	 * @param ctx the parse tree
	 */
	void enterCaseBlock(ProLangParser.CaseBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProLangParser#caseBlock}.
	 * @param ctx the parse tree
	 */
	void exitCaseBlock(ProLangParser.CaseBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProLangParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(ProLangParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProLangParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(ProLangParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProLangParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(ProLangParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProLangParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(ProLangParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProLangParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(ProLangParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProLangParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(ProLangParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProLangParser#forCondition}.
	 * @param ctx the parse tree
	 */
	void enterForCondition(ProLangParser.ForConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProLangParser#forCondition}.
	 * @param ctx the parse tree
	 */
	void exitForCondition(ProLangParser.ForConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProLangParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void enterForUpdate(ProLangParser.ForUpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProLangParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void exitForUpdate(ProLangParser.ForUpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProLangParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(ProLangParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProLangParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(ProLangParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code textExpression}
	 * labeled alternative in {@link ProLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTextExpression(ProLangParser.TextExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code textExpression}
	 * labeled alternative in {@link ProLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTextExpression(ProLangParser.TextExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binaryOp}
	 * labeled alternative in {@link ProLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBinaryOp(ProLangParser.BinaryOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binaryOp}
	 * labeled alternative in {@link ProLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBinaryOp(ProLangParser.BinaryOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idExpression}
	 * labeled alternative in {@link ProLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIdExpression(ProLangParser.IdExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idExpression}
	 * labeled alternative in {@link ProLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIdExpression(ProLangParser.IdExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberExpression}
	 * labeled alternative in {@link ProLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNumberExpression(ProLangParser.NumberExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberExpression}
	 * labeled alternative in {@link ProLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNumberExpression(ProLangParser.NumberExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryOp}
	 * labeled alternative in {@link ProLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOp(ProLangParser.UnaryOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryOp}
	 * labeled alternative in {@link ProLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOp(ProLangParser.UnaryOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenExpression}
	 * labeled alternative in {@link ProLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParenExpression(ProLangParser.ParenExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenExpression}
	 * labeled alternative in {@link ProLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParenExpression(ProLangParser.ParenExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanExpression}
	 * labeled alternative in {@link ProLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBooleanExpression(ProLangParser.BooleanExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanExpression}
	 * labeled alternative in {@link ProLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBooleanExpression(ProLangParser.BooleanExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ProLangParser#boolean}.
	 * @param ctx the parse tree
	 */
	void enterBoolean(ProLangParser.BooleanContext ctx);
	/**
	 * Exit a parse tree produced by {@link ProLangParser#boolean}.
	 * @param ctx the parse tree
	 */
	void exitBoolean(ProLangParser.BooleanContext ctx);
}