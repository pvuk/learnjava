package com.java.loop.forloop.examples;

import java.util.Scanner;

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
					System.out.print(i +" ");
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
			//if remainder is 0 than numToCheck is not prime and break loop. Else continue loop
			if (remainder == 0) {
				return false;
			}
		}
		return true;
	}
}
