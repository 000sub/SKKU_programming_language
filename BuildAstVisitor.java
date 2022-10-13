/*

Build Ast using the method in ExprBaseVisitor.java 
you should override the methods.

*/
import AstNodes;

public class BuildAstVisitor extends ExprBaseVisitor<AstNodes> {

	@Override
	public AstNodes visitDecl(ExprParser.DeclContext ctx) {
		// TODO Auto-generated method stub
		return super.visitDecl(ctx);
	}

	@Override
	public AstNodes visitFunc(ExprParser.FuncContext ctx) {
		// TODO Auto-generated method stub
		return super.visitFunc(ctx);
	}

	@Override
	public AstNodes visitFuncExpr(ExprParser.FuncExprContext ctx) {
		// TODO Auto-generated method stub
		return super.visitFuncExpr(ctx);
	}

	@Override
	public AstNodes visitInfixExpr(ExprParser.InfixExprContext ctx) {
		// TODO Auto-generated method stub
		return super.visitInfixExpr(ctx);
	}

	@Override
	public AstNodes visitNum(ExprParser.NumContext ctx) {
		String numText = ctx.getChild(0).getText();
		double num = Double.parseDouble(numText);
		return new Numbernode(num);
	}

	@Override
	public AstNodes visitNumberExpr(ExprParser.NumberExprContext ctx) {
		// TODO Auto-generated method stub
		return super.visitNumberExpr(ctx);
	}

	@Override
	public AstNodes visitParam(ExprParser.ParamContext ctx) {
		// TODO Auto-generated method stub
		return super.visitParam(ctx);
	}

	@Override
	public AstNodes visitParensExpr(ExprParser.ParensExprContext ctx) {
		// TODO Auto-generated method stub
		return super.visitParensExpr(ctx);
	}

	@Override
	public AstNodes visitProg(ExprParser.ProgContext ctx) {
		// TODO Auto-generated method stub
		return super.visitProg(ctx);
	}

	@Override
	public AstNodes visitUnaryExpr(ExprParser.UnaryExprContext ctx) {
		// TODO Auto-generated method stub
		return super.visitUnaryExpr(ctx);
	}

	@Override
	public AstNodes visitVariableExpr(ExprParser.VariableExprContext ctx) {
		// TODO Auto-generated method stub
		return super.visitVariableExpr(ctx);
	}

}
