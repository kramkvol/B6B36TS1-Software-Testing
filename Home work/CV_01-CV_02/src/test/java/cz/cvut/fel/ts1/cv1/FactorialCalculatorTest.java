package cz.cvut.fel.ts1.cv1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class FactorialCalculatorTest {

    @Test
    void factorial_factorialTest_6() {
        FactorialCalculator factorialCalculator = new FactorialCalculator();
        int number = 3;
        long expectedResult = 6;

        long result = factorialCalculator.factorial(number);

        Assertions.assertEquals(expectedResult, result);
    }

    @ParameterizedTest(name = "{0} factorial should be equal to {1}")
    @CsvSource({"1, 1", "3, 6"})
    void factorial_factorialTest_1_and_6(int a, int b) {

        FactorialCalculator factorialCalculator = new FactorialCalculator();

        long result = factorialCalculator.factorial(a);

        Assertions.assertEquals( b, result);
    }
}
