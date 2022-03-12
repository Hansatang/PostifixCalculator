import Exception.EmptyListExpression;
import Stack.LinkedList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class LinkedListTest {
    private LinkedList<Token> linkedList;

    @BeforeEach
    void setUp() {
        linkedList = new LinkedList<Token>();

    }

    @Test
    void isEmpty() {
        assertTrue(linkedList.isEmpty());
        linkedList.addToFront(new Operand(2));
        assertFalse(linkedList.isEmpty());
    }


    @Test
    void size(){
        assertEquals(0,linkedList.size());
        linkedList.addToFront(new Operand(2));
        assertEquals(1,linkedList.size());
    }

    @Test
    void addToFront(){
        assertTrue(linkedList.isEmpty());
        linkedList.addToFront(new Operand(2));
        assertFalse(linkedList.isEmpty());
    }

    @Test
    void removeFirst() throws EmptyListExpression {
        linkedList.addToFront(new Operand(2));
        assertFalse(linkedList.isEmpty());
        linkedList.removeFirst();
        assertTrue(linkedList.isEmpty());
        Assertions.assertThrows(EmptyListExpression.class, ()->{linkedList.removeFirst();});
    }

    @Test
    void removeFirstException() throws EmptyListExpression{
        Assertions.assertThrows(EmptyListExpression.class, ()-> linkedList.removeFirst());
    }

}
