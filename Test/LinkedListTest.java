import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LinkedListTest<T> {

    LinkedList<T> list;

    @BeforeEach
    void setUp() {
        list = new LinkedList<>();
    }

    @Test
    void isEmpty() {
        assertTrue(list.isEmpty());
        
    }

}
