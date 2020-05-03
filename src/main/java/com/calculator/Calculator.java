package com.calculator;

/**
 * Hello world!
 *
 */
//public class App 
//{
//    public static void main( String[] args )
//    {
//        System.out.println( "Hello World!" );
//    }
//}


//package com.calculator;

public class Calculator{
	public static void main(String[] args) {
		System.out.println("1066 + 7 = " + add(1066, 7));
		System.out.println("5667 - 234 = " + subtract(5667, 234));
	}
	
	public static int add(int a, int b) {
		return a + b;
	}
	
	public static int subtract(int a, int b) {
		return a - b;
	}
}