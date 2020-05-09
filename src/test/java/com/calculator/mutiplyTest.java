package com.calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class mutiplyTest {

	@Test
	public void multiplyTest() {
		int a = 1234;
		int b = 100;
		int result = Calculator.multiply(a, b);
		assertEquals(123400, result);
	}

}
