import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperandTest {

    Operand operand;

    @BeforeEach
    void setUp() {
        operand = new Operand(15);
    }

    @Test
    @DisplayName("Testing Getter")
    void getValue() {
        assertEquals(15, operand.getValue(),
                "Getter should work");
    }


    @Test
    void accept() {
    }
}