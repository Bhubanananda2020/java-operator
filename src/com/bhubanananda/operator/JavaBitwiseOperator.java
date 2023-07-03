package com.bhubanananda.operator;

/**
 * The Class JavaBitwiseOperator.
 * 
 * @ author Bhubanananda
 */
public class JavaBitwiseOperator {
	// operators are '&','^','|'

	/**
	 * Or operator example.
	 */
	void orOperatorExample() {
		int a = 10;
		int b = 5;
		int c = 20;

		System.out.println(a > b || a < c);// true || true = true
		System.out.println(a > b | a < c);// true | true = true
		// || vs |
		System.out.println(a > b || a++ < c);// true || true = true
		System.out.println(a);// 10 because second condition is not checked
		System.out.println(a > b | a++ < c);// true | true = true
		System.out.println(a);// 11 because second condition is checked

	}

	/**
	 * And operator example.
	 */
	void andOperatorExample() {
		int a = 10;
		int b = 15;
		int c = 20;
		System.out.println(a < b && a < c);// true && true = false
		System.out.println(a < b & a < c);// true & true = false
		System.out.println(a < 2 && a++ < c);// true && true = true
		System.out.println(a);// 10 because second condition is not checked
		System.out.println(a < b & a++ < c);// false && true = false
		System.out.println(a);// 11 because second condition is checked

	}

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		System.out.println("------and------");
		new JavaBitwiseOperator().andOperatorExample();

		System.out.println("------or------");
		new JavaBitwiseOperator().orOperatorExample();
	}
}
