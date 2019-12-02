package com.java.array.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * update package from com.practice.java.array.examples to
 * com.java.array.examples once task is done.
 * 
 * @author udaykiran pulipati
 * @date 04-Nov-2019 21:50
 */
public class GetMaxAndMinValueInArray {

	public static void main(String[] args) {
		int[] array = { 10, 25, 4, 25, 46, 84, 42 };
		System.out.println("Array: " + Arrays.toString(array));
		usingForLoop(array);

		List<Long> allIds = new ArrayList<Long>() {
			{
				add(1L);
				add(10L);
				add(15L);
				add(11L);
				add(21L);
				add(51L);
			}
		};
		System.out.println("List Numbers: "+ allIds);
		System.out.println("Max Num: "+ allIds.stream().max((Long l1, Long l2) -> l1.compareTo(l2)).get());
		System.out.println("Min Num: "+ allIds.stream().min((Long l1, Long l2) -> l1.compareTo(l2)).get());
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

		System.out.println("Min value: " + minValue + ", Max value: " + maxValue);
	}
}
