package cz.cvut.fel.ts1.cv1;

public class FactorialCalculator {
    public long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial for negative numbers is not defined. ");
        }
        if (n < 2) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
