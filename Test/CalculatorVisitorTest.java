import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorVisitorTest {
    LinkedStack<Token> tokenStack;
    Operand operand;

    @BeforeEach
    void setUp() {
        tokenStack = new LinkedStack<>();
        Operand operand = new Operand(11);
    }

    @Test
    private void pushOperand() {
        assertTrue(tokenStack.isEmpty());
        tokenStack.push(operand);
        assertFalse(tokenStack.isEmpty());
    }

}