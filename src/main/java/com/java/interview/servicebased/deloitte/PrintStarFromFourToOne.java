package com.java.interview.servicebased.deloitte;

/**
 * 
 * @author P V UdayKiran
 *
 * @Date: Thu 05-Dec-2019 20:42
 */
public class PrintStarFromFourToOne {
	public static void main(String[] args) {
		for(int i = 4; i > 0; i--) {
			for(int j = i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
