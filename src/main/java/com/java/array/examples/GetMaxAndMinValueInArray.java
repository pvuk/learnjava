package com.java.array.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * update package from com.practice.java.array.examples to
 * com.java.array.examples once task is done.
 * 
 * @author udaykiran pulipati
 * @Date 04-Nov-2019 21:50
 */
public class GetMaxAndMinValueInArray {

	public static void main(String[] args) {
		int[] array = { 10, 25, 4, 25, 46, 84, 42 };
		System.out.println("Array: " + Arrays.toString(array));
		usingForLoop(array);

		List<Long> allIds = new ArrayList<Long>() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			{
				add(1L);
				add(10L);
				add(15L);
				add(11L);
				add(21L);
				add(51L);
			}
		};
		System.out.println("List Of Long Numbers: " + allIds);
		System.out.println("Using Lambda Expression");
		System.out.println("Max Num: " + allIds.stream().max((Long l1, Long l2) -> l1.compareTo(l2)).get());
		System.out.println("Min Num: " + allIds.stream().min((Long l1, Long l2) -> l1.compareTo(l2)).get());

		List<Integer> numbers = new ArrayList<Integer>() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			{
				add(1);
				add(5);
				add(8);
				add(2);
				add(10);
				add(6);
			}
		};
		Integer max = numbers.stream().max((Integer i1, Integer i2) -> i1.compareTo(i2)).get();
		Integer min = numbers.stream().min((Integer i1, Integer i2) -> i1.compareTo(i2)).get();
		System.out.println("List Of Integer Numbers: " + numbers);
		System.out.println("Min value: " + min + ", Max value: " + max);
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
		System.out.println("Without using Java predefined methods");
		System.out.println("Min value: " + minValue + ", Max value: " + maxValue);
	}
}
