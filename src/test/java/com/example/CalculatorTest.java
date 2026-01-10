package com.example;
import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void testMultiplyPositive() {
        // Test with two positive numbers
        int result = Calculator.multiply(4, 5);
        assertEquals(20, result);
    }
    @Test
    public void testMultiplyWithZero() {
        // Test multiplication by zero
        int result = Calculator.multiply(10, 0);
        assertEquals(0, result);
    }
    @Test
    public void testMultiplyNegative() {
        // Test with one negative number
        int result = Calculator.multiply(-3, 6);
        assertEquals(-18, result);
    }
    @Test
    public void testMultiplyBothNegative(){
        // Test with two negative numbers
        int result = Calculator.multiply(-4, -5);
        assertEquals(20, result);
    }
    @Test
    public void testMultiplyIdentity() {
        // Test multiplication by one
        int result = Calculator.multiply(7, 1);
        assertEquals(7, result);
    }
}
