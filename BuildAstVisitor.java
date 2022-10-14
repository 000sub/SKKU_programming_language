import java.util.HashMap;
import java.util.Map;
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
		System.out.println("visitInfixExpr calling\n");
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
		System.out.println("visitNUM calling\n");
		String numText = ctx.getChild(0).getText();
		double num = Double.parseDouble(numText);
		return new NumberNode(num);
	}

	@Override
	public AstNodes visitNumberExpr(ExprParser.NumberExprContext ctx) {
		System.out.println("visitNumberExpr calling\n");
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

abstract class AstVisitor<T>
{
	public abstract T Visit(AdditionNode node);
	public abstract T Visit(SubtractionNode node);
	public abstract T Visit(MultiplicationNode node);
	public abstract T Visit(DivisionNode node);
	public abstract T Visit(FunctionNode node);
	public abstract T Visit(NegateNode node);
	public abstract T Visit(NumberNode node);
	public abstract T Visit(DeclarationNode node);
	public abstract T Visit(VariableNode node);
	
	public T Visit(AstNodes node) {
		if (node instanceof AdditionNode) {
			return Visit((AdditionNode)node);
		}
		else if (node instanceof SubtractionNode) {
			return Visit((SubtractionNode)node);
		}
		else if (node instanceof MultiplicationNode) {
			return Visit((MultiplicationNode)node);
		}
		else if (node instanceof DivisionNode) {
			return Visit((DivisionNode)node);
		}
		else if (node instanceof FunctionNode) {
			return Visit((FunctionNode)node);
		}
		else if (node instanceof NegateNode) {
			return Visit((NegateNode)node);
		}
		else if (node instanceof NumberNode) {
			return Visit((NumberNode)node);
		}
		else if (node instanceof DeclarationNode) {
			return Visit((DeclarationNode)node);
		}
		else if (node instanceof VariableNode) {
			return Visit((VariableNode)node);
		}
		
		System.out.println("Visit calling\n");
		return Visit(node);
	}
}

