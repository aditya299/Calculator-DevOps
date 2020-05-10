package com.calculator;

public class Calculator{
	public static void main(String[] args) {
		System.out.println("1066 + 7 = " + add(1066, 7));
		System.out.println("5667 - 234 = " + subtract(5667, 234));
		System.out.println("12 * 134 = " + multiply(12, 134));
		System.out.println("789 / 12 = " + divide(789, 12));
	}
	
	public static int add(int a, int b) {
		return a + b;
	}
	
	public static int subtract(int a, int b) {
		return a - b;
	}
	public static int multiply(int a, int b) {
		return a * b;
	}
	public static double divide(int a, int b) {
		double result;
		if (b == 0) {
				throw new IllegalArgumentException("Divisor cannot divide by 0");
		} else {
			result = Double.valueOf(a) / Double.valueOf(b);
		}
		return result;
	}
	
}
