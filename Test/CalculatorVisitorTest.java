import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorVisitorTest {

    private CalculatorVisitor calculatorVisitor;

    @BeforeEach
    void setUp() {
        calculatorVisitor = new CalculatorVisitor();
    }

    @Test
    void getResult(){
        assertThrows(NullPointerException.class , () ->{
            calculatorVisitor.getResult();
        });
        calculatorVisitor.visit(new Operand(5));
        calculatorVisitor.visit(new Operand(2));
        calculatorVisitor.visit(new Operator(Operation.Plus));
        assertEquals(7,calculatorVisitor.getResult());
    }

    @Test
    void visit(){
        calculatorVisitor.visit(new Operand(5));
        calculatorVisitor.visit(new Operand(2));
        calculatorVisitor.visit(new Operator(Operation.Plus));
        assertEquals(7,calculatorVisitor.getResult());

    }

}