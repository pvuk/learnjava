package com.java.interview.integer.examples;

import java.util.Arrays;

/**
 * <p>
 * 1. Move all zero's to end of array without changing the order of non-zero values.
 * Ex: Convert [1, 0, 2, 4, 6, 0, 0, 4, 8, 4, 0, 6, 7, 0, 11, 2, 0, 55, 1, 64, 0, 1, 0, 3, 8, 62, 10, 5, 0, 6, 0, 9, 22]
 * to 
 * [1, 2, 4, 6, 4, 8, 4, 6, 7, 11, 2, 55, 1, 64, 1, 3, 8, 62, 10, 5, 6, 9, 22, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
 * side.
 * </p>
 * 
 * @author venkataudaykiranp
 * @version 1, changes on Tue 10-Dec-2019 13:22
 */
public class MoveAllZeroToEndOfArray {
	public static void main(String[] args) {
		int[] arr = { 1, 0, 2, 4, 6, 0, 0, 4, 8, 4, 0, 6, 7, 0, 11, 2, 0, 55, 1, 64, 0, 1, 0, 3, 8, 62, 10, 5, 0, 6, 0, 9, 22 };
		System.out.println("Array: \n" + Arrays.toString(arr) +"\n");
		usingMultipleLoops(arr);
		usingSingleLoop(arr);
	}

	private static void usingSingleLoop(int[] arr) {
		
		int temp, count = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != 0) {
				temp = arr[count];
				arr[count] = arr[i];
				arr[i] = temp;
				count += 1;
			}
		}
		System.out.println("usingSingleLoop - After moved all zero's to end of Array: \n" + Arrays.toString(arr) +"\n");
	}

	private static void usingMultipleLoops(int[] arr) {
		for (int i = arr.length - 1; i > -1; i--) {
			for (int j = i; j > -1; j--) {
				//swap two numbers if find zero
				if (arr[j] == 0) {
					int temp;
					//loop for passing zero to last index
					int l = 0;
					for (int k = i - j; k > 0; k--) {
						// before interchanging numbers check array index position.
						if (k > 0) {
							temp = arr[j + l];
							arr[j + l] = arr[j + l + 1];
							arr[j + l + 1] = temp;
						}
						l++;
					}
				}
			}
		}
		System.out.println("usingMultipleLoops - After moved all zero's to end of Array: \n" + Arrays.toString(arr) +"\n");
	}
}
