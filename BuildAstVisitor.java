/*

Build Ast using the method in ExprBaseVisitor.java 
you should override the methods.

*/


public class BuildAstVisitor extends ExprBaseVisitor<AstNodes> {

    @Override public AstNodes visitCompileUnit(ExprParser.CompileUnitContext ctx) { 
        return visit(ctx.expr()); 
    }
	
    
	@Override public AstNodes visitProg(ExprParser.ProgContext ctx) { 
        return visitChildren(ctx); 
    }

	@Override public AstNodes visitVarExpr(ExprParser.VarExprContext ctx) { 
        return visitChildren(ctx); 
    }
	    
	@Override public AstNodes visitInfixExpr(ExprParser.InfixExprContext ctx) { 
        return visitChildren(ctx); 
    }
    
	@Override public AstNodes visitUnaryExpr(ExprParser.UnaryExprContext ctx) { return visitChildren(ctx); }
	
    
	@Override public AstNodes visitFuncExpr(ExprParser.FuncExprContext ctx) { return visitChildren(ctx); }
	
    
	@Override public AstNodes visitNumberExpr(ExprParser.NumberExprContext ctx) { return visitChildren(ctx); }
	
    
	@Override public AstNodes visitParensExpr(ExprParser.ParensExprContext ctx) { return visitChildren(ctx); }
	
    
	@Override public AstNodes visitNum(ExprParser.NumContext ctx) { return visitChildren(ctx); }
	
    
	@Override public AstNodes visitVar(ExprParser.VarContext ctx) { return visitChildren(ctx); }
	
    
	@Override public AstNodes visitFunc(ExprParser.FuncContext ctx) { return visitChildren(ctx); }
	
    
	@Override public AstNodes visitParam(ExprParser.ParamContext ctx) { return visitChildren(ctx); }
}
