package com.calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class addTest {

	@Test
	public void Addtest() {
		int a = 45;
		int b = 45;
		int result = Calculator.add(a, b);
		assertEquals(90, result);
	}

}
