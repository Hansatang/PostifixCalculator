import Stack.Node;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NodeTest {

    private Node<Token> node;
    private Node<Token> next;

    @BeforeEach
    void setUp() {
        node = new Node<Token>();
        next = new Node<Token>();

    }

    @Test
    void setData() {
        node.setData(new Operand(3));
        assertEquals(((Operand) node.getData()).getValue(), 3);
        node.setData(new Operand(2));
        assertEquals(((Operand) node.getData()).getValue(), 2);
    }

    @Test
    void getData() {
        node.setData(new Operand(3));
        assertEquals(((Operand) node.getData()).getValue(), 3);
    }

    @Test
    void setNext() {
        node.setData(new Operand(3));
        next.setData(new Operand(1));
        assertEquals(((Operand) node.getData()).getValue(), 3);
        node.setNext(next);
        assertEquals(node.getNext(), next);
    }

    @Test
    void getNext() {
        node.setData(new Operand(3));
        next.setData(new Operand(1));
        assertEquals(((Operand) node.getData()).getValue(), 3);
        node.setNext(next);
        assertEquals(node.getNext(), next);
    }


}
