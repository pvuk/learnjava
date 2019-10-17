package com.java.exception;

import java.util.Scanner;

/**
 * 
 * @author venkataudaykiranp
 *
 */
public class CustomArithmeticException {
	public static void main(String[] args) {
		Scanner inAge = new Scanner(System.in);
		Scanner inWeight = new Scanner(System.in);
		
		System.out.print("Please enter Student Age: ");
		int age = inAge.nextInt();
		
		System.out.print("Please enter Student Weight: ");
		int weight = inWeight.nextInt();
		/*
		 * unchecked exception throw in below method no need to handle try catch / maintain throws
		 */
		checkEligibility(age, weight);

		inAge.close();
		inWeight.close();
	}

	/*
	 * In this program we are checking the Student age if the student age<12 and
	 * weight <40 then our program should return that the student is not eligible
	 * for registration.
	 */
	private static void checkEligibility(int age, int weight) {
		if (age < 12 && weight < 40) {
			//we are throw an unchecked exception
			throw new ArithmeticException("Student is not eligible for registration");
		} else {
			System.out.println("Student Entry is Valid!!");
		}
	}
}
