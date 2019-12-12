package com.java.compare.array;

import java.util.Scanner;

/**
 * <p>
 * The Fibonacci series is a series where the next term is the sum of pervious
 * two terms. The first two terms of the Fibonacci sequence is 0 followed by 1.
 * </br>
 * <code>The Fibonacci sequence: 0, 1, 1, 2, 3, 5, 8, 13, 21, ...</code>
 * </p>
 * 
 * @author Priyanka
 *
 *         Date: Sat 09-Nov-2019 08:21
 */
public class FibonacciSeries {
	public static void main(String[] args) {
		System.out.print("Please enter number: ");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int r = 0, n1 = 0, n2 = 1;
		System.out.println("Please enter Number: " + num);

		for (int i = 1; i <= num; i++) {
			System.out.println(r);
			r = n1 + n2;
			n1 = n2;
			n2 = r;
		}

		scanner.close();
	}
}
