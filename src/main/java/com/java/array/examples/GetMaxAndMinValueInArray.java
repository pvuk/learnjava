package com.java.array.examples;

import java.util.Arrays;

/**
 * update package from com.practice.java.array.examples to com.java.array.examples once task is done.
 * @author udaykiran pulipati
 * @date 04-Nov-2019 21:50
 */
public class GetMaxAndMinValueInArray {
	
	public static void main(String[] args) {
		int[] array = {10,25,4,25,46,84,42};
		System.out.println("Array: "+ Arrays.toString(array));
		usingForLoop(array);
	}

	private static void usingForLoop(int[] array) {
		int minValue = array[0], maxValue = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] < minValue) {
				minValue = array[i];
			}
			if (array[i] > maxValue) {
				maxValue = array[i];
			}
		}
		
		System.out.println("Min value: "+ minValue +", Max value: "+ maxValue);
	}
}
