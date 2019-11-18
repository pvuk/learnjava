package com.java.number.examples;

import java.util.Scanner;

/**
 * 
 * @author P V UdayKiran
 *
 * @Date: Mon 18-Nov-2019 18:58
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
		if (i == 1)
			return factorialOf;
		factorialOf *= i;
		return getFactorial(factorialOf, i - 1);
	}
}
