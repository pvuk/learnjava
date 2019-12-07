package com.java.convert.array;

import java.util.Arrays;

/**
 * 
 * @author venkataudaykiranp
 * @Date Tue 03-Dec-2019 17:19
 */
public class ConvertIntToIntArray {
	public static void main(String[] args) {
		int number = 2489;
		int[] arr = new int[String.valueOf(number).length()];
		String[] splitNumber = String.valueOf(number).split("");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.valueOf(splitNumber[i]);
		}
		System.out.println("int: " + number + " to int array: " + Arrays.toString(arr));
		
		/**
		 * 1. c represent ASCII value
		 * 2. We have to substract the ASCII code value of char '0'(48) from ASCII code of actual char.
		 * 3. Ex: 2 char whose decimal value is 50 and 0 whose decimal value is 48. we get 50-48=2.
		 */
		int[] array = Integer.toString(number).chars().map(c -> c - '0').toArray();
//		System.out.println((char)2-0);
		System.out.println("int: " + number + " to int array using Java8: " + Arrays.toString(array));
		
	}
}
