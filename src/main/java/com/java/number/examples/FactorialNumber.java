package com.java.number.examples;

import java.util.Scanner;

/**
 * 
 * @author P V UdayKiran
 *
 * @Date Mon 18-Nov-2019 18:58
 */
public class FactorialNumber {

	public static void main(String[] args) {
		System.out.println("Please enter number: ");
		Scanner scanner = new Scanner(System.in);
		try {
			int factorialOf = scanner.nextInt();
			System.out.println("Factorial of " + factorialOf + ": " + getFactorial(factorialOf, factorialOf - 1));
		} finally {
			scanner.close();
		}
	}

	private static int getFactorial(int factorialOf, int i) {
		//Using second variable
		if (i == 1)
			return factorialOf;
		factorialOf *= i;
		return getFactorial(factorialOf, i - 1);

		// or
		/**
		 * below code causes StackOverflowError error: Exception in thread "main"
		 * java.lang.StackOverflowError at
		 * com.java.number.examples.FactorialNumber.getFactorial(FactorialNumber.java:31)
		 */
//		return i > 1 ? (factorialOf * getFactorial(factorialOf - 1, i)): 1;

		/*
		 * // or Using single variable 
		 * // System.out.println("outside: "+ factorialOf);
		 * if (factorialOf > 1) { int factorial = (factorialOf *
		 * getFactorial(factorialOf - 1, 0)); // System.out.println("inside: "+
		 * factorialOf); return factorial; } return 1;
		 */
	}
}
