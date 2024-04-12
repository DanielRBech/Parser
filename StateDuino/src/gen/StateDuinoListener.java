// Generated from C:/Users/danie/Desktop/3. semester/ProjectKrea/StateDuino/src/StateDuino.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link StateDuinoParser}.
 */
public interface StateDuinoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link StateDuinoParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(StateDuinoParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateDuinoParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(StateDuinoParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateDuinoParser#stateMachine}.
	 * @param ctx the parse tree
	 */
	void enterStateMachine(StateDuinoParser.StateMachineContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateDuinoParser#stateMachine}.
	 * @param ctx the parse tree
	 */
	void exitStateMachine(StateDuinoParser.StateMachineContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateDuinoParser#state}.
	 * @param ctx the parse tree
	 */
	void enterState(StateDuinoParser.StateContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateDuinoParser#state}.
	 * @param ctx the parse tree
	 */
	void exitState(StateDuinoParser.StateContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateDuinoParser#stateBody}.
	 * @param ctx the parse tree
	 */
	void enterStateBody(StateDuinoParser.StateBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateDuinoParser#stateBody}.
	 * @param ctx the parse tree
	 */
	void exitStateBody(StateDuinoParser.StateBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateDuinoParser#onEntry}.
	 * @param ctx the parse tree
	 */
	void enterOnEntry(StateDuinoParser.OnEntryContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateDuinoParser#onEntry}.
	 * @param ctx the parse tree
	 */
	void exitOnEntry(StateDuinoParser.OnEntryContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateDuinoParser#onRepeat}.
	 * @param ctx the parse tree
	 */
	void enterOnRepeat(StateDuinoParser.OnRepeatContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateDuinoParser#onRepeat}.
	 * @param ctx the parse tree
	 */
	void exitOnRepeat(StateDuinoParser.OnRepeatContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateDuinoParser#onExit}.
	 * @param ctx the parse tree
	 */
	void enterOnExit(StateDuinoParser.OnExitContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateDuinoParser#onExit}.
	 * @param ctx the parse tree
	 */
	void exitOnExit(StateDuinoParser.OnExitContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateDuinoParser#transitions}.
	 * @param ctx the parse tree
	 */
	void enterTransitions(StateDuinoParser.TransitionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateDuinoParser#transitions}.
	 * @param ctx the parse tree
	 */
	void exitTransitions(StateDuinoParser.TransitionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateDuinoParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(StateDuinoParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateDuinoParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(StateDuinoParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateDuinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(StateDuinoParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateDuinoParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(StateDuinoParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateDuinoParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(StateDuinoParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateDuinoParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(StateDuinoParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateDuinoParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStatement(StateDuinoParser.SwitchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateDuinoParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStatement(StateDuinoParser.SwitchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateDuinoParser#caseStatement}.
	 * @param ctx the parse tree
	 */
	void enterCaseStatement(StateDuinoParser.CaseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateDuinoParser#caseStatement}.
	 * @param ctx the parse tree
	 */
	void exitCaseStatement(StateDuinoParser.CaseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateDuinoParser#defaultCaseStatement}.
	 * @param ctx the parse tree
	 */
	void enterDefaultCaseStatement(StateDuinoParser.DefaultCaseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateDuinoParser#defaultCaseStatement}.
	 * @param ctx the parse tree
	 */
	void exitDefaultCaseStatement(StateDuinoParser.DefaultCaseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateDuinoParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(StateDuinoParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateDuinoParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(StateDuinoParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateDuinoParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(StateDuinoParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateDuinoParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(StateDuinoParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateDuinoParser#functionNames}.
	 * @param ctx the parse tree
	 */
	void enterFunctionNames(StateDuinoParser.FunctionNamesContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateDuinoParser#functionNames}.
	 * @param ctx the parse tree
	 */
	void exitFunctionNames(StateDuinoParser.FunctionNamesContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateDuinoParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(StateDuinoParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateDuinoParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(StateDuinoParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateDuinoParser#voltage}.
	 * @param ctx the parse tree
	 */
	void enterVoltage(StateDuinoParser.VoltageContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateDuinoParser#voltage}.
	 * @param ctx the parse tree
	 */
	void exitVoltage(StateDuinoParser.VoltageContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateDuinoParser#unary}.
	 * @param ctx the parse tree
	 */
	void enterUnary(StateDuinoParser.UnaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateDuinoParser#unary}.
	 * @param ctx the parse tree
	 */
	void exitUnary(StateDuinoParser.UnaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateDuinoParser#binary}.
	 * @param ctx the parse tree
	 */
	void enterBinary(StateDuinoParser.BinaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateDuinoParser#binary}.
	 * @param ctx the parse tree
	 */
	void exitBinary(StateDuinoParser.BinaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateDuinoParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void enterArithmetic(StateDuinoParser.ArithmeticContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateDuinoParser#arithmetic}.
	 * @param ctx the parse tree
	 */
	void exitArithmetic(StateDuinoParser.ArithmeticContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateDuinoParser#logical}.
	 * @param ctx the parse tree
	 */
	void enterLogical(StateDuinoParser.LogicalContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateDuinoParser#logical}.
	 * @param ctx the parse tree
	 */
	void exitLogical(StateDuinoParser.LogicalContext ctx);
	/**
	 * Enter a parse tree produced by {@link StateDuinoParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeSpecifier(StateDuinoParser.TypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link StateDuinoParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeSpecifier(StateDuinoParser.TypeSpecifierContext ctx);
}