public class CalculatorVisitor implements Visitor,Calculator {

    private LinkedStack<Token> tokenStack ;

    @Override
    public int getResult() {
        return 0;
    }

    @Override
    public void visit(Operand operand) {

    }

    @Override
    public void visit(Operator operator) {

    }
}
