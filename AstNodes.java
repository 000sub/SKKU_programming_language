/*

define Ast Nodes

*/

public class AstNodes{
	
}

class InfixExprNode extends AstNodes {
    public AstNodes LeftNode;
    public AstNodes RightNode;

}

class AdditionNode extends InfixExprNode{}

class SubtractionNode extends InfixExprNode{}

class MultiplicationNode extends InfixExprNode{}

class DivisionNode extends InfixExprNode{}

class NegateNode extends AstNodes{

}

class FunctionNode extends AstNodes{}

class NumberNode extends AstNodes{
    public double Value;
}