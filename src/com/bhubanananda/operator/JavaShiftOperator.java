package com.bhubanananda.operator;

/**
 * The Class JavaShiftOperator.
 * 
 * @ author Bhubanananda
 */
public class JavaShiftOperator {
// operators are   '<<','>>'

	/**
	 * Left shift operator.
	 */
	void leftShiftOperator() {
		System.out.println(10 << 2);// 10*2^2=10*4=40
		System.out.println(10 << 3);// 10*2^3=10*8=80
		System.out.println(20 << 2);// 20*2^2=20*4=80
		System.out.println(15 << 4);// 15*2^4=15*16=240
	}

	/**
	 * Right shift operator.
	 */
	void rightShiftOperator() {
		System.out.println(10 >> 2);// 10/2^2=10/4=2
		System.out.println(20 >> 2);// 20/2^2=20/4=5
		System.out.println(20 >> 3);// 20/2^3=20/8=2
	}

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		JavaShiftOperator javaShiftOperator = new JavaShiftOperator();

		System.out.println("======= printing leftShiftOperator =======");
		javaShiftOperator.leftShiftOperator();

		System.out.println("======= printing leftShiftOperator =======");
		javaShiftOperator.rightShiftOperator();
	}
}
