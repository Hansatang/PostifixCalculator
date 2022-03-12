
import Stack.LinkedStack;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;

import static org.junit.jupiter.api.Assertions.*;

public class LinkedStackTest {

    private LinkedStack<Token> list;
    @BeforeEach
    void setUp()
    {
        list=new LinkedStack<Token>();
    }

    @Test
    void isEmpty()
    {
        assertTrue(list.isEmpty());
        list.push(new Operand(2));
        assertFalse(list.isEmpty());
    }
    @Test
    void push()
    {
        assertTrue(list.isEmpty());
        list.push(new Operand(2));
        assertFalse(list.isEmpty());
    }

    @Test
    void pop()
    {
        list.push(new Operand(2));
        assertFalse(list.isEmpty());
        list.pop();
        assertTrue(list.isEmpty());
    }

    @Test
    void popException() throws EmptyStackException {
        Assertions.assertThrows(EmptyStackException.class, ()-> list.pop());
    }

}
