package com.bhubanananda.operator;

/**
 * The Class JavaArithmeticOperator.
 * 
 * @ author Bhubanananda
 */
public class JavaArithmeticOperator {
	// operators are '+','-','*','/'

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {

		int a = 10;
		int b = 5;
		System.out.println("a + b: " + a + b);// 10 + 5 = 15
		System.out.println(a - b);// 10 - 5 = 5
		System.out.println("a * b: " + a * b);// 10 * 5 = 50
		System.out.println("a / b: " + a / b);// 10 / 5 = 2
		System.out.println("a % b: " + a % b);// 10 % 5 = 0

		System.out.println(10 * 10 / 5 + 3 - 1 * 4 / 2); // (((10*(10/5))+3)-(1*(4/2)))
	}
}
