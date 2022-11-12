import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;


public class program {

    public static void main(String[] args) throws IOException {
                
        // Get Lexer
        ExprLexer lexer = new ExprLexer(CharStreams.fromStream(System.in));
        
        // Get a list of matched tokens
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        // Pass tokens to parser
        ExprParser parser = new ExprParser(tokens);
        
		//write your code here
        
        List<Double> evalList = new ArrayList<>();
        ExprParser.ProgContext tree = parser.prog();
        
        int idx=0;

        while (true) {
        	try {
                BuildAstVisitor visitor = new BuildAstVisitor();
                AstNodes ast = visitor.visit(tree.children.get(idx));
                AstCall astPrinter = new AstCall();
                astPrinter.Call(ast);
                Double rst = new Evaluate().evaluate(ast);
                evalList.add(rst);
                idx++;
            }
        	catch (NullPointerException E) {
        		idx++;
        		continue;
        	}
 
        	catch (IndexOutOfBoundsException E){
        		break;
        	}
        }
        
        for (Double eval : evalList) {
        	System.out.println(String.format("%s", eval));
        }
        
        
     
    }
}