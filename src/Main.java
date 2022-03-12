import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Client client = new Client();
        ArrayList<Token> list = new ArrayList<>();
        Operand op1 = new Operand(4);
        Operand op2 = new Operand(7);
        Operator or1 = new Operator(Operation.Multiply);
        Operand op3 = new Operand(20);
        Operator or2 = new Operator(Operation.Minus);
        list.add(op1);
        list.add(op2);
        list.add(or1);
        list.add(op3);
        list.add(or2);
        System.out.println(client.evaluateExpression(list));
    }
}
