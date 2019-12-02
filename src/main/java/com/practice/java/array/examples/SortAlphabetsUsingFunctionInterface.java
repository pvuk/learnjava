package com.practice.java.array.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortAlphabetsUsingFunctionInterface {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>() {
			{
				add("B");
				add("C");
				add("S");
				add("A");
			}
		};

		System.out.println("Alphabets: " + list);

		/**
		 * Ex: 1
		 */
		Comparator<String> comparator = (String o1, String o2) -> {
			return o1.compareTo(o2);
		};

		Collections.sort(list, comparator);
		System.out.println("Sorted Alphabets: " + list);

		/**
		 * Ex: 2
		 */
		SortWords ascSortWords = (String o1, String o2) -> {
			return o1.compareTo(o2);
		};

		SortWords descSortWords = (String o1, String o2) -> {
			return o2.compareTo(o1);
		};

		Collections.sort(list, ascSortWords);
		System.out.println("Ascending order: " + list);

		Collections.sort(list, descSortWords);
		System.out.println("Descending order: " + list);

		/**
		 * Ex: 3
		 * 
		 * SortAlphabets is FunctionalInterface, body is implemented using lambda
		 * expression.
		 */
		SortAlphabets sortAlphatets = (List<String> alphabets, SortOrder direction) -> {
			if (direction != null) {
				if (direction.equals(SortOrder.ASC)) {
					alphabets.sort(ascSortWords);
				} else if (direction.equals(SortOrder.DESC)) {
					alphabets.sort(descSortWords);
				}
			} else {
				alphabets.sort(ascSortWords);
			}
			return alphabets;
		};

		System.out.println("========= Based on Order Sorting =========");
		sortAlphatets.sort(list, SortOrder.DESC);// FunctionInterface sort method calling
		System.out.println("DESC order: " + list);

		sortAlphatets.sort(list, SortOrder.ASC);
		System.out.println("ASC order: " + list);// FunctionInterface sort method calling

	}
}
