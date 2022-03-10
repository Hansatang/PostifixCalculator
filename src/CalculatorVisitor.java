public class CalculatorVisitor implements Visitor, Calculator {

    private LinkedStack<Token> tokenStack = new LinkedStack<>();

    @Override
    public int getResult() {
        Operand result = (Operand) tokenStack.pop();
        return result.getValue();
    }

    @Override
    public void visit(Operand operand) {
        pushOperand(operand);
    }

    @Override
    public void visit(Operator operator) {
        performOperation(operator);

    }

    private void pushOperand(Operand operand) {
    }

    private void performOperation(Operator operator) {


    }
}
