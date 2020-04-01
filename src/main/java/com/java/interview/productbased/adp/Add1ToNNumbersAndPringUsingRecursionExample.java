package com.java.interview.productbased.adp;

import java.util.Scanner;

/**
 * F2F at ADP -> Write a program to print 1...n numbers sum using recursion.
 * 
 * @author Priyanka
 *
 * @Date Wed 06-Nov-2019 22:52
 */
public class Add1ToNNumbersAndPringUsingRecursionExample {
	public static void main(String[] args) {
		System.out.print("Please enter Number: ");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt(), sum = 0;

		System.out.println("Sum of 0 to " + num + ": " + getCountOfNumbers(num, sum));

		scanner.close();
	}

	private static int getCountOfNumbers(int num, int sum) {
		if (num > 0) {
//			sum = sum + num;
//			num = num - 1;
//			return getCountOfNumbers(num, sum);// or
			return getCountOfNumbers(num - 1, sum = sum + num);
		}
		return sum;
	}
}
