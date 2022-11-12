import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.tree.ParseTree;

import java.util.List;

/*

Build Ast using the method in ExprBaseVisitor.java 
you should override the methods.

*/




public class BuildAstVisitor extends ExprBaseVisitor<AstNodes> {
	
	static Map<String, Double> map = new HashMap<String, Double>();

	@Override
	public AstNodes visitDecl(ExprParser.DeclContext ctx) {
		String id = ctx.ID().getText();
		double value = Double.parseDouble(ctx.num().getText());
		map.put(id,  value);
		
		return new DeclarationNode(id, value);
	}


	@Override
	public AstNodes visitFuncExpr(ExprParser.FuncExprContext ctx) {
		//FunctionNode functionNode = new FunctionNode();
		String fid = ctx.getChild(0).getChild(0).getText();
		FunctionNode functionNode = new FunctionNode(fid);
		int idx = 0;
		int argnum = ctx.getChild(0).getChild(2).getChildCount();
		while (idx<=argnum) {
			String temp = ctx.getChild(0).getChild(2).getChild(idx).getText();
			functionNode.args.add(Double.parseDouble(temp));
			idx+=2;
		}
		return functionNode;
	}

	@Override
	public AstNodes visitInfixExpr(ExprParser.InfixExprContext ctx) {
//		System.out.println("visitInfixExpr calling\n");
		InfixExprNode node = null;
		
		if (ctx.op.getType() == ExprParser.ADD) {
			node = new AdditionNode(visit(ctx.left), visit(ctx.right));
		}
		else if (ctx.op.getType() == ExprParser.SUB) {
			node = new SubtractionNode(visit(ctx.left), visit(ctx.right));
		}
		else if (ctx.op.getType() == ExprParser.MUL) {
			node = new MultiplicationNode(visit(ctx.left), visit(ctx.right));
		}
		else if (ctx.op.getType() == ExprParser.DIV) {
			node = new DivisionNode(visit(ctx.left), visit(ctx.right));
		}
		
		return node;
		
	}

	@Override
	public AstNodes visitNumberExpr(ExprParser.NumberExprContext ctx) {
//		System.out.println("visitNumberExpr calling\n");
		String numText = ctx.getChild(0).getText();
		double num = Double.parseDouble(numText);
		return new NumberNode(num);
	}


	@Override
	public AstNodes visitParensExpr(ExprParser.ParensExprContext ctx) {
		return visit(ctx.expr());
	}



	@Override
	public AstNodes visitUnaryExpr(ExprParser.UnaryExprContext ctx) {
		if (ctx.op.getType() == ExprParser.ADD) {
			return visit(ctx.expr());
		}
		else {
			return new NegateNode(visit(ctx.expr()));
		}
		
	}

	@Override
	public AstNodes visitVariableExpr(ExprParser.VariableExprContext ctx) {
		String id = ctx.getChild(0).getText();

		if (map.get(id) == null) {
			throw new IllegalStateException("Variable Access Failed:"+id);
		}
		return new VariableNode(id);
	}
}



