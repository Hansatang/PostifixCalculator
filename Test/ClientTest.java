import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class ClientTest {

    Client client;
    ArrayList<Token> list;
    Operand op1;
    Operand op2;
    Operator or1;
    Operand op3;
    Operator or2;

    @BeforeEach
    void setUp() {
        client = new Client();
        list = new ArrayList<>();
        op1 = new Operand(4);
        op2 = new Operand(7);
        or1 = new Operator(Operation.Multiply);
        op3 = new Operand(20);
        or2 = new Operator(Operation.Minus);
        list.add(op1);
        list.add(op2);
        list.add(or1);
        list.add(op3);
        list.add(or2);
    }

    @Test
    void evaluateExpression() {
        Assertions.assertEquals(8,client.evaluateExpression(list),"Valid Solution");
    }
}