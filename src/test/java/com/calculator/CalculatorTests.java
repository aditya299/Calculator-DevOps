package com.calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTests {

	@Test
	public void Addtest() {
		int a = 45;
		int b = 5;
		int result = Calculator.add(a, b);
		assertEquals(90, result);
	}

}
