package com.java.interview.productbased.adp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * <p>
 * F2F: ADP
 * </p>
 * <p>
 * Q. Write a program to print series of numbers like 1, 2, 3<sup>2</sup>,
 * 4<sup>2</sup>, 5, 6, 7<sup>2</sup>, 8<sup>2</sup>, .... based on user input
 * </p>
 * 
 * @author venkataudaykiranp
 *
 */
public class SeriesOfNumbers {

	public static void main(String[] args) {
		System.out.print("Please enter Number: ");
		Scanner sc = new Scanner(System.in);
		try {
			int num = sc.nextInt(), count = 0, series = 0;
			List<Integer> list = new ArrayList<Integer>();
			for (int i = 1; i <= num; i++) {
				if (count > 1) {
//					series = (int) Math.pow(i,2);
					series = i * i;
					if (count == 3) {
						count = -1;
					}
					list.add(series);
				} else {
					list.add(i);
				}
				count++;
			}
			System.out.println(list.toString().replace("[", "").replace("]", ""));
		} finally {
			sc.close();
		}
	}
}
