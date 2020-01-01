package com.practice.java.number.examples;

import java.util.Scanner;

/**
 * 
 * @author P V UdayKiran
 *
 * @Date: Sat 14-Dec-2019 19:15
 * @version: %I%
 */
public class RandomNumberFromTill {
	
	public static void main(String[] args) {
		System.out.println("Printing Random Numbers From xxxx To xxxx");
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Please enter From number(Warning! number should be 4 characters length): ");
			int from = sc.nextInt();
			System.out.println("Please enter Till number(Warning! number should be 4 characters length): ");
			int till = sc.nextInt();
			
			if(String.valueOf(from).length() < 4) {
				System.err.println("Please enter 'From' number 4 characters length!");
			} else if(String.valueOf(till).length() < 4) {
				System.err.println("Please enter 'Till' number 4 characters length!");
			} else if(from >= 0 && till >= 0) {
				
			} else if(from < 0 || till < 0) {
				System.err.println("Please enter valid positive integers!");
			}
		} finally {
			sc.close();
		}
	}
}
