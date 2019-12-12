package com.java.compare.array;

import java.util.Scanner;

/**
 * <p>
 * Armstrong Number in Java: A positive number is called armstrong number if it
 * is equal to the sum of cubes of its digits for example 0, 1, 153, 370, 371,
 * 407 etc.
 * </p>
 * 
 * <p>
 * <h1>Example:</h1> 
 * 153 = (1*1*1)+(5*5*5)+(3*3*3) 
 * where: 
 * (1*1*1)=1 
 * (5*5*5)=125
 * (3*3*3)=27 
 * So: 1+125+27=153
 * </p>
 * 
 * @author Priyanka
 *
 *         Date: Sat 09-Nov-2019 08:08
 */
public class ArmstrongNumber {
	public static void main(String[] args) {
		System.out.print("Please enter number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int n = 0, temp = num, result = 0;
		while (num > 0) {
			n = num % 10;
			result = result + (n * n * n);
			num = num / 10;
		}
		if (temp == result) {
			System.out.println("Given number is armstrong");
		} else {
			System.out.println("Given number is not armstrong");
		}
		sc.close();
	}
}
