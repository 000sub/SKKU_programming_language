// Generated from Expr.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExprParser}.
 */
public interface ExprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExprParser#compileUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompileUnit(ExprParser.CompileUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#compileUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompileUnit(ExprParser.CompileUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(ExprParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(ExprParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varExpr}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVarExpr(ExprParser.VarExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varExpr}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVarExpr(ExprParser.VarExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code infixExpr}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInfixExpr(ExprParser.InfixExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code infixExpr}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInfixExpr(ExprParser.InfixExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryExpr}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpr(ExprParser.UnaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryExpr}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpr(ExprParser.UnaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcExpr}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFuncExpr(ExprParser.FuncExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcExpr}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFuncExpr(ExprParser.FuncExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberExpr}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNumberExpr(ExprParser.NumberExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberExpr}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNumberExpr(ExprParser.NumberExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parensExpr}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParensExpr(ExprParser.ParensExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parensExpr}
	 * labeled alternative in {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParensExpr(ExprParser.ParensExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#num}.
	 * @param ctx the parse tree
	 */
	void enterNum(ExprParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#num}.
	 * @param ctx the parse tree
	 */
	void exitNum(ExprParser.NumContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(ExprParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(ExprParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(ExprParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(ExprParser.FuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(ExprParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(ExprParser.ParamContext ctx);
}