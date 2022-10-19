
/*

print the Ast that we build in BuildAstVisitor.java

*/


public class AstCall extends AstWalker<Void> {
	
	private int depth = 0;
	private boolean fromNegate = false;
	
	private void printTab(int cnt) {
		for (int i=0;i<cnt;i++) {
			System.out.print("\t");
		}
	}

	
	@Override
	Void Call(AdditionNode node) {
		printTab(depth);
		System.out.println("ADD");
		depth++;
		Call(node.left);
		Call(node.right);
		depth--;
		return null;
	}

	@Override
	Void Call(SubtractionNode node) {
		printTab(depth);
		System.out.println("SUB");
		depth++;
		Call(node.left);
		Call(node.right);
		depth--;
		return null;
	}

	@Override
	Void Call(MultiplicationNode node) {
		printTab(depth);
		System.out.println("MUL");
		depth++;
		Call(node.left);
		Call(node.right);
		depth--;
		return null;
	}

	@Override
	Void Call(DivisionNode node) {
		printTab(depth);
		System.out.println("DIV");
		depth++;
		Call(node.left);
		Call(node.right);
		depth--;
		return null;
	}

	@Override
	Void Call(FunctionNode node) {
		printTab(depth);
		System.out.println(node.funcname);
		depth++;
		for (Double val: node.args) {
			printTab(depth);
			System.out.println(String.format("%s", val));
		}
		depth--;
		return null;
	}

	@Override
	Void Call(NegateNode node) {
		fromNegate = true;
		Call(node.InnerNode);
		return null;
	}

	@Override
	Void Call(NumberNode node) {
		printTab(depth);
		if (fromNegate) {
			System.out.println(String.format("%s", -node.value));
			fromNegate = false;
		}
		else {
			System.out.println(String.format("%s", node.value));
		}
		
		return null;
	}

	@Override
	Void Call(DeclarationNode node) {
		printTab(depth);
		System.out.println("ASSIGN");
		depth++;
		printTab(depth);
		System.out.println(node.id);
		printTab(depth);
		System.out.println(node.value);
		depth--;
		return null;
	}

	@Override
	Void Call(VariableNode node) {
		printTab(depth);
		System.out.println(node.id);
		return null;
	}

	@Override
	Void evaluate(AdditionNode node) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	Void evaluate(SubtractionNode node) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	Void evaluate(MultiplicationNode node) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	Void evaluate(DivisionNode node) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	Void evaluate(FunctionNode node) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	Void evaluate(NegateNode node) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	Void evaluate(NumberNode node) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	Void evaluate(DeclarationNode node) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	Void evaluate(VariableNode node) {
		// TODO Auto-generated method stub
		return null;
	}

    
    
}
