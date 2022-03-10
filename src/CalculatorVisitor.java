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
        Operand opr1 = (Operand) tokenStack.pop();
        Operand opr2 = (Operand) tokenStack.pop();

        switch (operator.getOperation()) {
            case Plus:
                tokenStack.push(new Operand(opr2.getValue() + opr1.getValue()));
                break;
            case Minus:
                tokenStack.push(new Operand(opr2.getValue() - opr1.getValue()));
                break;
            case Divide:
                tokenStack.push(new Operand(opr2.getValue() / opr1.getValue()));
                break;
            case Multiply:
                tokenStack.push(new Operand(opr2.getValue() * opr1.getValue()));
                break;
        }
    }
}
