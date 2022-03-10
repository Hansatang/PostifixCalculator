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
        tokenStack.push(operand);
    }

    private void performOperation(Operator operator) {
        Operand t1 = (Operand) tokenStack.pop();
        Operand t2 = (Operand) tokenStack.pop();
        int res = 0;
        switch (operator.getOperation()) {
            case Plus:
                res = t2.getValue() + t1.getValue();
                break;
            case Minus:
                res = t2.getValue() - t1.getValue();
                break;
            case Multiply:
                res = t2.getValue() * t1.getValue();
                break;
            case Divide:
                res = t2.getValue() / t1.getValue();
                break;
        }

        tokenStack.push(new Operand(res));
    }
}
