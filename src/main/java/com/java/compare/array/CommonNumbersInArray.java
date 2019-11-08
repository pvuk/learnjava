package com.java.compare.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CommonNumbersInArray {
	public static void main(String[] args) {
		int[] a = { 1, 4, 6, 8, 5, 9 };
		int[] b = { 11, 14, 6, 2, 5, 10 };
		System.out.println("....Print common values in both array....");
		usingLambda(a, b);
		usingForLoop(a, b);
	}

	private static void usingForLoop(int[] a, int[] b) {
		System.out.println("Using forloop: ");
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					list.add(a[i]);
				}
			}
		}
		System.out.println(list.stream().map(String::valueOf).collect(Collectors.joining(",")));
	}

	private static void usingLambda(int[] a, int[] b) {
		System.out.println("Using Lambda: ");
//		List<int[]> list = Arrays.asList(a);
		List<Integer> list2 = Arrays.stream(b).boxed().collect(Collectors.toList());
		List<Integer> commonNumbers = Arrays.stream(a).boxed().filter(list2::contains).collect(Collectors.toList());
		System.out.println(commonNumbers);
	}
}
