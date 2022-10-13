/*

define Ast Nodes

*/

public class AstNodes{
	public static class InfixExprNode extends AstNodes {
        public AstNodes left;
        public AstNodes right;
    
    }
    
    public static class AdditionNode extends InfixExprNode{}
    
    public static class SubtractionNode extends InfixExprNode{}
    
    public static class MultiplicationNode extends InfixExprNode{}
    
    public static class DivisionNode extends InfixExprNode{}
    
    public static class NegateNode extends AstNodes{
        public AstNodes InnerNode;
    }
    
    public static class FunctionNode extends AstNodes{}
    
    public static class NumberNode extends AstNodes{
        public double Value;

        public NumberNode(double value) {
            this.Value = value;
        }
    }
}

