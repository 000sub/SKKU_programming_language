/*

Calculate The Input String
And Return the result

*/

public class Evaluate extends AstWalker<Double>{

	@Override
	Double Call(AdditionNode node) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	Double Call(SubtractionNode node) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	Double Call(MultiplicationNode node) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	Double Call(DivisionNode node) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	Double Call(FunctionNode node) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	Double Call(NegateNode node) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	Double Call(NumberNode node) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	Double Call(DeclarationNode node) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	Double Call(VariableNode node) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	Double evaluate(AdditionNode node) {
		// TODO Auto-generated method stub
		return evaluate(node.left) + evaluate(node.right);
	}

	@Override
	Double evaluate(SubtractionNode node) {
		// TODO Auto-generated method stub
		return evaluate(node.left) - evaluate(node.right);
	}

	@Override
	Double evaluate(MultiplicationNode node) {
		// TODO Auto-generated method stub
		return evaluate(node.left) * evaluate(node.right);
	}

	@Override
	Double evaluate(DivisionNode node) {
		// TODO Auto-generated method stub
		return evaluate(node.left) / evaluate(node.right);
	}

	@Override
	Double evaluate(FunctionNode node) {
		// TODO Auto-generated method stub
		return 0.0;
	}

	@Override
	Double evaluate(NegateNode node) {
		// TODO Auto-generated method stub
		return -evaluate(node.InnerNode);
	}

	@Override
	Double evaluate(NumberNode node) {
		// TODO Auto-generated method stub
		return node.value;
	}

	@Override
	Double evaluate(DeclarationNode node) {
		// TODO Auto-generated method stub
		return 0.0;
	}

	@Override
	Double evaluate(VariableNode node) {
		// TODO Auto-generated method stub
		return 0.0;
	}

}