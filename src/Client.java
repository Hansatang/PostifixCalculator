import java.util.ArrayList;

public class Client {


    public int evaluateExpression(ArrayList<Token> tokenList) {
        CalculatorVisitor calculatorVisitor = new CalculatorVisitor();
        for (Token tok : tokenList
        ) {
            tok.accept(calculatorVisitor);
        }
        return calculatorVisitor.getResult();
    }
}
