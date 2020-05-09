package com.calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class divideTest {


    @Test
    public void DivideTest() {
        int a = 456;
        int b = 40;
        double result = Calculator.divide(a, b);
        assertEquals(11.4, result, 0.00005);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void divideByZeroTest() {
        int a = 345;
        int b = 0;
        Calculator.divide(a, b);
    }

}
