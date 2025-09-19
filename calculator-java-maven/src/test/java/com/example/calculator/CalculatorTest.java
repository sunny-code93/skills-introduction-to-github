package com.example.calculator;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    private final Calculator calculator = new Calculator();

    @Test
    public void testAdd() {
        Assert.assertEquals(5, calculator.add(2, 3));
    }

    @Test
    public void testSubtract() {
        Assert.assertEquals(1, calculator.subtract(3, 2));
    }

    @Test
    public void testMultiply() {
        Assert.assertEquals(6, calculator.multiply(2, 3));
    }

    @Test
    public void testDivide() {
        Assert.assertEquals(2.0, calculator.divide(6, 3), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero() {
        calculator.divide(5, 0);
    }
}
