package com.calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class subTest {

	@Test
	public void SubTest() {
		int a = 234;
		int b = 100;
		int result = Calculator.subtract(a, b);
		assertEquals(134, result);
	}

}
