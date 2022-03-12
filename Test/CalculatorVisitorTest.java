
import Exception.MalformedExpressionException;
import org.junit.jupiter.api.Assertions;
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
    void getResult() throws MalformedExpressionException {
        assertThrows(MalformedExpressionException.class , () -> calculatorVisitor.getResult());
        calculatorVisitor.visit(new Operand(5));
        calculatorVisitor.visit(new Operand(2));
        calculatorVisitor.visit(new Operator(Operation.Plus));
        assertEquals(7,calculatorVisitor.getResult());
    }

    @Test
    void visit() throws MalformedExpressionException {
        calculatorVisitor.visit(new Operand(5));
        calculatorVisitor.visit(new Operand(2));
        calculatorVisitor.visit(new Operator(Operation.Plus));
        assertEquals(7,calculatorVisitor.getResult());

    }

    @Test
    void getResultException() {
        calculatorVisitor.visit(new Operand(5));
        calculatorVisitor.visit(new Operand(2));
        calculatorVisitor.visit(new Operator(Operation.Plus));
        calculatorVisitor.visit(new Operator(Operation.Plus));
        Assertions.assertThrows(MalformedExpressionException.class, ()-> calculatorVisitor.getResult());
    }

}