package com.java.interview.productbased.navionics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 
 * @author venkataudaykiranp
 * @Date Tue 03-Dec-2019 08:57
 */
public class SecondHighestNumberFromIntArray {
	public static void main(String[] args) {
		int[] arr = { 100, 14, 26, 94, 15, 16, 25, 94, 56, 41, 58, 94, 66, 86, 84, 9 };

		List<Integer> list = Arrays.stream(arr).sorted().boxed().collect(Collectors.toList());
//		List<Integer> list = IntStream.of(arr).boxed().collect(Collectors.toList());
		System.out.println("Second Highest Number from int[] Using Java8 Arrays Stream: " + list.get(list.size() - 2));

		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				/**
				 * 1. Exception handling ArrayIndexOutOfBoundsException
				 * 2. if(j < arr.length-1) to check last before index position arr[j+1]
				 * 
				 */
				if(j < arr.length-1) {
					int temp;
					//Swaping numbers
					if (arr[j] > arr[j + 1]) {
						temp = arr[j+1];
						arr[j+1] = arr[j];
						arr[j] = temp;
						
					}
				}
			}
		}
		System.out.println("Second Highest Number from int[] Using Inner forloop: "+ arr[arr.length - 2]);
	}
}
