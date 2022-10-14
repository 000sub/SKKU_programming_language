import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.tree.ParseTree;

import java.util.List;

/*

Build Ast using the method in ExprBaseVisitor.java 
you should override the methods.

*/




public class BuildAstVisitor extends ExprBaseVisitor<AstNodes> {
	
	Map<String, Double> map = new HashMap<String, Double>();
	private List<String> semanticErrors;

	@Override
	public AstNodes visitDecl(ExprParser.DeclContext ctx) {
		String id = ctx.ID().getText();
		double value = Double.parseDouble(ctx.num().getText());
		map.put(id,  value);
		
		return new DeclarationNode(id, value);
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
	public AstNodes visitNum(ExprParser.NumContext ctx) {
//		System.out.println("visitNUM calling\n");
		String numText = ctx.getChild(0).getText();
		double num = Double.parseDouble(numText);
		return new NumberNode(num);
	}

	@Override
	public AstNodes visitNumberExpr(ExprParser.NumberExprContext ctx) {
//		System.out.println("visitNumberExpr calling\n");
		String numText = ctx.getChild(0).getText();
		double num = Double.parseDouble(numText);
		return new NumberNode(num);
	}

	@Override
	public AstNodes visitParam(ExprParser.ParamContext ctx) {
		// TODO Auto-generated method stub
		return super.visitParam(ctx);
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
			semanticErrors.add("Error: variable doesn't exist");
		}
		return new VariableNode(id);
	}
}



