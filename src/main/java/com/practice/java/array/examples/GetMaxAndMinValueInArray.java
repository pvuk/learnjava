package com.practice.java.array.examples;

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
		System.out.println("Max value: "+ getMax(array));
		System.out.println("Min value: "+ getMin(array));
	}

	private static int getMin(int[] array) {
		int minValue = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] < minValue) {
				minValue = array[i];
			}
		}
		return minValue;
	}

	private static int getMax(int[] array) {
		int maxValue = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > maxValue) {
				maxValue = array[i];
			}
		}
		return maxValue;
	}
}
