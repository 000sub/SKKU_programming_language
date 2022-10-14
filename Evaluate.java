/*

Calculate The Input String
And Return the result

*/

class Evaluate extends AstVisitor<Double>{

	@Override
	public Double Visit(AdditionNode node) {
		return Visit(node.left) + Visit(node.right);
	}

	@Override
	public Double Visit(SubtractionNode node) {
		return Visit(node.left) - Visit(node.right);
	}

	@Override
	public Double Visit(MultiplicationNode node) {
		return Visit(node.left) * Visit(node.right);
	}

	@Override
	public Double Visit(DivisionNode node) {
		return Visit(node.left) / Visit(node.right);
	}

//	@Override
//	public Double Visit(FunctionNode node) {
//		return node.Function(Visit(node.Argument));
//	}

	@Override
	public Double Visit(NumberNode node) {
		return node.value;
	}

	@Override
	public Double Visit(DeclarationNode node) {
		return 0.00;
	}

	@Override
	public Double Visit(VariableNode node) {
		return 0.00;
	}

	@Override
	public Double Visit(NegateNode node) {
		return -Visit(node.InnerNode);
	}

	@Override
	public Double Visit(FunctionNode node) {
		// TODO Auto-generated method stub
		return 0.00; //need to delete
	}

    
}