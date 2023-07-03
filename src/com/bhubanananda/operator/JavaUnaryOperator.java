package com.bhubanananda.operator;

/**
 * The Class JavaUnaryOperator.
 * 
 * @ author Bhubanananda
 */
public class JavaUnaryOperator {
//Operators are 'expr++' , 'expr--' , '++expr' , '--expr' , '~' , '!'

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String args[]) {
		int x = 100;

		System.out.println(x++);// first print x value 100 then increment(101)
		System.out.println(++x);// first increment x value then print 102
		System.out.println(x--);// first print x value 102 then decrement(101)
		System.out.println(--x);// first decrement x value then print 100

		int y = 100;
		int z = 100;
		System.out.println(y++ + ++y);// 100+102=202
		System.out.println(z++ + z++);// 100+101=201
		System.out.println(z); // 202

		int a = 10;
		int b = -10;
		boolean c = true;
		boolean d = false;

		System.out.println(~a);// -11 (minus of total positive value which starts from 0)
		System.out.println(~b);// 9 (positive of total minus, positive starts from 0)
		System.out.println(!c);// false (opposite of boolean value)
		System.out.println(!d);// true

	}
}
