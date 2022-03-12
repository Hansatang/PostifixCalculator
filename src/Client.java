import Exception.MalformedExpressionException;
import java.util.ArrayList;

public class Client {
    public int evaluateExpression(ArrayList<Token> tokenList)  {
        CalculatorVisitor calculatorVisitor = new CalculatorVisitor();
        for (Token tok : tokenList
        ) {
            tok.accept(calculatorVisitor);
        }
        try {
            return calculatorVisitor.getResult();
        } catch (MalformedExpressionException e) {
            e.printStackTrace();
        }
        return 0;
    }
}
