package com.practice.java.interview;

/**
 * 
 * @author P V UdayKiran
 *
 * @version 1, changes on Sat 01-Feb-2020 12:53
 *
 */
public class Print3XArray {
	public static void main(String[] args) {
		int[][] arr = { 
				{ 1, 2, 3 }, 
				{ 4, 5 }, 
				{ 6, 7, 8, 9 } 
				};
		for (int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
}
