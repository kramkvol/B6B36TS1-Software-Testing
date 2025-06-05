package cz.cvut.fel.ts1.cv2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    public void testAddition() {
        Assertions.assertEquals(5, calculator.add(2, 3));
    }

    @Test
    public void testSubtraction() {
        Assertions.assertEquals(2, calculator.subtract(5, 3));
    }

    @Test
    public void testMultiplication() {
        Assertions.assertEquals(15, calculator.multiply(3, 5));
    }

    @Test
    public void testDivision() {
        Assertions.assertEquals(4, calculator.divide(20, 5));
    }

    @Test
    public void testDivisionByZero() {
        Assertions.assertThrows(ArithmeticException.class, () -> {
            calculator.divide(10, 0);
        });
    }
}

