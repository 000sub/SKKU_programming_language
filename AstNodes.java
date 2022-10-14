/*

define Ast Nodes

*/

abstract class AstNodes{
	
}

abstract class InfixExprNode extends AstNodes {
    public AstNodes left;
    public AstNodes right;

}

class AdditionNode extends InfixExprNode{
	public AstNodes left;
	public AstNodes right;
	
	public AdditionNode(AstNodes left, AstNodes right) {
		this.left = left;
		this.right = right;
	}

	@Override
	public String toString() {
		return left.toString() + " + " + right.toString();
	}
}

class SubtractionNode extends InfixExprNode{
	public AstNodes left;
	public AstNodes right;
	
	public SubtractionNode(AstNodes left, AstNodes right) {
		this.left = left;
		this.right = right;
	}

	@Override
	public String toString() {
		return left.toString() + " - " + right.toString();
	}
}

class MultiplicationNode extends InfixExprNode{
	public AstNodes left;
	public AstNodes right;
	
	public MultiplicationNode(AstNodes left, AstNodes right) {
		this.left = left;
		this.right = right;
	}

	@Override
	public String toString() {
		return left.toString() + " * " + right.toString();
	}
	
	
	
	
}

class DivisionNode extends InfixExprNode{
	public AstNodes left;
	public AstNodes right;
	
	public DivisionNode(AstNodes left, AstNodes right) {
		this.left = left;
		this.right = right;
	}

	@Override
	public String toString() {
		return left.toString() + " / " + right.toString();
	}
}

class NegateNode extends AstNodes{
    public AstNodes InnerNode;

	public NegateNode(AstNodes innerNode) {
		this.InnerNode = innerNode;
	}
    
    
}

class FunctionNode extends AstNodes{
	
}

class NumberNode extends AstNodes{
    public double value;

    public NumberNode(double value) {
        this.value = value;
    }

	@Override
	public String toString() {
		String val = String.format("%.2f", value);
		return val;
	}
    
    
}

class VariableNode extends AstNodes{
	public String id;
	
	public VariableNode(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return id;
	}
	
	
}

class DeclarationNode extends AstNodes {
	public String id;
	public double value;
	
	public DeclarationNode(String id, double value) {
		this.id = id;
		this.value = value;
	}
}



