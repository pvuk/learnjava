package com.java.interview.productbased.accenture;

/**
 * 
 * @author P V UdayKiran
 *
 * @version 1, changes on Thu 14-Nov-2019 21:34
 */
public class DivisionOfNumbers {
	public static void main(String[] args) {
		int num = 100;
		int[] arrDivisibleBy = { 2, 5, 7 };
		for (int i = 1; i <= num; i++) {
			String numDivisible = "";
			for (int j = 0; j < arrDivisibleBy.length; j++) {
				String divBy = String.valueOf(arrDivisibleBy[j]);
				if (i % arrDivisibleBy[j] == 0) {
					numDivisible = numDivisible.equals("") ? divBy : numDivisible + ", " + divBy;
				}
			}
			if (numDivisible != "")
				System.out.println(i + "-" + numDivisible);
		}
	}
}
