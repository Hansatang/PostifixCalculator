import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Client client = new Client();
        ArrayList<Token> list = new ArrayList<>();
        Operand op1 = new Operand(9);
        Operand op2 = new Operand(5);
        Operator or1 = new Operator(Operation.Plus);
        client.evaluateExpression(list);
    }
}
