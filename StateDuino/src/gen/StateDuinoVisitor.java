// Generated from C:/Users/danie/Desktop/3. semester/ProjectKrea/StateDuino/src/StateDuino.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link StateDuinoParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface StateDuinoVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link StateDuinoParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(StateDuinoParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateDuinoParser#stateMachine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStateMachine(StateDuinoParser.StateMachineContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateDuinoParser#state}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitState(StateDuinoParser.StateContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateDuinoParser#stateBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStateBody(StateDuinoParser.StateBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateDuinoParser#onEntry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnEntry(StateDuinoParser.OnEntryContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateDuinoParser#onRepeat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnRepeat(StateDuinoParser.OnRepeatContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateDuinoParser#onExit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnExit(StateDuinoParser.OnExitContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateDuinoParser#transitions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransitions(StateDuinoParser.TransitionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateDuinoParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(StateDuinoParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateDuinoParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(StateDuinoParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateDuinoParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(StateDuinoParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateDuinoParser#switchStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchStatement(StateDuinoParser.SwitchStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateDuinoParser#caseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseStatement(StateDuinoParser.CaseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateDuinoParser#defaultCaseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultCaseStatement(StateDuinoParser.DefaultCaseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateDuinoParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(StateDuinoParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateDuinoParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(StateDuinoParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateDuinoParser#functionNames}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionNames(StateDuinoParser.FunctionNamesContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateDuinoParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(StateDuinoParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateDuinoParser#voltage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoltage(StateDuinoParser.VoltageContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateDuinoParser#unary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary(StateDuinoParser.UnaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateDuinoParser#binary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary(StateDuinoParser.BinaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateDuinoParser#arithmetic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmetic(StateDuinoParser.ArithmeticContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateDuinoParser#logical}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical(StateDuinoParser.LogicalContext ctx);
	/**
	 * Visit a parse tree produced by {@link StateDuinoParser#typeSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSpecifier(StateDuinoParser.TypeSpecifierContext ctx);
}