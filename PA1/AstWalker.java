
public abstract class AstWalker<T> {
	abstract T Call(AdditionNode node);
	abstract T Call(SubtractionNode node);
	abstract T Call(MultiplicationNode node);
	abstract T Call(DivisionNode node);
	abstract T Call(FunctionNode node);
	abstract T Call(NegateNode node);
	abstract T Call(NumberNode node);
	abstract T Call(DeclarationNode node);
	abstract T Call(VariableNode node);
	
	abstract T evaluate(AdditionNode node);
	abstract T evaluate(SubtractionNode node);
	abstract T evaluate(MultiplicationNode node);
	abstract T evaluate(DivisionNode node);
	abstract T evaluate(FunctionNode node);
	abstract T evaluate(NegateNode node);
	abstract T evaluate(NumberNode node);
	abstract T evaluate(DeclarationNode node);
	abstract T evaluate(VariableNode node);
	
	public T Call(AstNodes node) {
		
		if (node instanceof AdditionNode) {
			return Call((AdditionNode)node);
		}
		else if (node instanceof SubtractionNode) {
			return Call((SubtractionNode)node);
		}
		else if (node instanceof MultiplicationNode) {
			return Call((MultiplicationNode)node);
		}
		else if (node instanceof DivisionNode) {
			return Call((DivisionNode)node);
		}
		else if (node instanceof FunctionNode) {
			return Call((FunctionNode)node);
		}
		else if (node instanceof NegateNode) {
			return Call((NegateNode)node);
		}
		else if (node instanceof NumberNode) {
			return Call((NumberNode)node);
		}
		else if (node instanceof DeclarationNode) {
			return Call((DeclarationNode)node);
		}
		else if (node instanceof VariableNode) {
			return Call((VariableNode)node);
		}
		else {
			throw new IllegalStateException("Call Failed:"+node.getClass());
		}
	}
	
	public T evaluate(AstNodes node) {
		
//		System.out.println(node.getClass().getSimpleName());
		if (node.getClass().getSimpleName() == "AdditionNode") {
			return evaluate((AdditionNode)node);
		}
		else if (node.getClass().getSimpleName() == "SubtractionNode") {
			return evaluate((SubtractionNode)node);
		}
		else if (node.getClass().getSimpleName() == "MultiplicationNode") {
			return evaluate((MultiplicationNode)node);
		}
		else if (node.getClass().getSimpleName() == "DivisionNode") {
			return evaluate((DivisionNode)node);
		}
		else if (node.getClass().getSimpleName() == "FunctionNode") {
			return evaluate((FunctionNode)node);
		}
		else if (node.getClass().getSimpleName() == "NegateNode") {
			return evaluate((NegateNode)node);
		}
		else if (node.getClass().getSimpleName() == "NumberNode") {
			return evaluate((NumberNode)node);
		}
		else if (node.getClass().getSimpleName() == "DeclarationNode") {
			return evaluate((DeclarationNode)node);
		}
		else if (node.getClass().getSimpleName() == "VariableNode") {
			return evaluate((VariableNode)node);
		}
		else {
			throw new IllegalStateException("Evaluate Failed:"+node.getClass());
		}
	}
}
