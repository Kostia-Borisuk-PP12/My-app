package com.gmail.kostia2121555;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
    private final Calculator calculator = new Calculator();

    @Test
    public void testAdd() {
        assertEquals(5.0, calculator.add(2, 3), 0.001);
    }

    @Test
    public void testSubtract() {
        assertEquals(1.0, calculator.subtract(4, 3), 0.001);
    }

    @Test
    public void testMultiply() {
        assertEquals(6.0, calculator.multiply(2, 3), 0.001);
    }

    @Test
    public void testDivide() {
        assertEquals(2.0, calculator.divide(6, 3), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero() {
        calculator.divide(1, 0);
    }
}
