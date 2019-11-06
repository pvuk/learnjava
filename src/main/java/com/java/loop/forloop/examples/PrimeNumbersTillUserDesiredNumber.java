package com.java.loop.forloop.examples;

import java.util.Scanner;

/**
 * <h1><a href="https://www.guru99.com/prime-number-program-java.html">Program Logic:</a></h1>
 * <ul>
 * <li>The main method contains a loop to check prime numbers one by one.</li>
 * <li>The main method calls the method CheckPrime to determine whether a number
 * is prime</li>
 * <li>We need to divide an input number, say 17 from values 2 to 17 and check
 * the remainder. If the remainder is 0 number is not prime.</li>
 * <li>No number is divisible by more than half of itself. So, we need to loop
 * through just numberToCheck/2. If the input is 17, half is 8.5, and the loop
 * will iterate through values 2 to 8</li>
 * <li>If numberToCheck is entirely divisible by another number, we return
 * false, and loop is broken.</li>
 * <li>If numberToCheckis prime, we return true.</li>
 * <li>In the main method, check isPrime is TRUE and add to primeNumbersFound
 * String</li>
 * </ul>
 * 
 * @author venkataudaykiranp
 *
 */
public class PrimeNumbersTillUserDesiredNumber {
	public static void main(String[] args) {
		Scanner scanner = null;
		try {
			System.out.println("You can enter 100 number or more, then Prime numbers will print till 100.");
			System.out.print("Please enter Number: ");
			scanner = new Scanner(System.in);
			int num = scanner.nextInt();
			for (int i = 1; i <= num; i++) {
				// prime number check
				boolean isPrime = isPrime(i);
				if (isPrime) {
					System.out.print(i + " ");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

	private static boolean isPrime(int numToCheck) {
		int remainder;
		for (int j = 2; j <= numToCheck / 2; j++) {
			remainder = numToCheck % j;
			// if remainder is 0 than numToCheck is not prime and break loop. Else continue
			// loop
			if (remainder == 0) {
				return false;
			}
		}
		return true;
	}
}
