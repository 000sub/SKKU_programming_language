import java.util.ArrayList;
import java.util.List;

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
}

class SubtractionNode extends InfixExprNode{
	public AstNodes left;
	public AstNodes right;
	
	public SubtractionNode(AstNodes left, AstNodes right) {
		this.left = left;
		this.right = right;
	}
}

class MultiplicationNode extends InfixExprNode{
	public AstNodes left;
	public AstNodes right;
	
	public MultiplicationNode(AstNodes left, AstNodes right) {
		this.left = left;
		this.right = right;
	}
}

class DivisionNode extends InfixExprNode{
	public AstNodes left;
	public AstNodes right;
	
	public DivisionNode(AstNodes left, AstNodes right) {
		this.left = left;
		this.right = right;
	}
}

class NegateNode extends AstNodes{
    public AstNodes InnerNode;

	public NegateNode(AstNodes innerNode) {
		this.InnerNode = innerNode;
	}
    
    
}

class FunctionNode extends AstNodes{
	public String funcname;
	public List<Double> args;

	public FunctionNode(String funcname) {
		this.funcname = funcname;
		this.args = new ArrayList<>();
	}
	
	
}

class NumberNode extends AstNodes{
    public double value;

    public NumberNode(double value) {
        this.value = value;
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



