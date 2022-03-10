import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperatorTest {
    Operator operator;

    @BeforeEach
    void setUp() {
        operator = new Operator(Operation.Plus);
    }

    @Test
    @DisplayName("Testing Getter")
    void testGet() {
        assertEquals(Operation.Plus, operator.getOperation(),
                "Getter should work");
    }


}