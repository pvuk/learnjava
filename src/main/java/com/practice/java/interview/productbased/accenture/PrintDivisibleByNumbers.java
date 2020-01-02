package com.practice.java.interview.productbased.accenture;

import java.util.Scanner;

public class PrintDivisibleByNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Please enter number divisible upto: ");
			sc.nextLine();
			
		} finally {
			sc.close();
		}
	}
}
