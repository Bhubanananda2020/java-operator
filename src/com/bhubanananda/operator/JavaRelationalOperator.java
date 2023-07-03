package com.bhubanananda.operator;

/**
 * The Class JavaRelationalOperator.
 * 
 *  @ author Bhubanananda
 */
public class JavaRelationalOperator {
	// operators are '<', '>', '<=', '>=', 'instanceof','==', '!='

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		// Initializing variables
		int var1 = 10, var2 = 20;
		JavaRelationalOperator s = new JavaRelationalOperator();

		System.out.println("var2 < var1: " + (var2 < var1)); // false
		System.out.println("var2 > var1: " + (var2 > var1)); // true
		System.out.println("var2 <= var1: " + (var2 <= var1));// false
		System.out.println("var2 >= var1: " + (var2 >= var1));// true
		System.out.println(s instanceof JavaRelationalOperator);// true
		System.out.println("var2 == var1: " + (var2 == var1));// false
		System.out.println("var2 != var1: " + (var2 != var1));// true

	}
}
