package com.practice.java.array.examples;

import java.util.ArrayList;
import java.util.Arrays;
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
		FunInt_SortAlphabets sortAlphatets = (List<String> alphabets, SortOrder direction) -> {
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

		System.out.println("\n========= Based on Order Sorting =========");
		sortAlphatets.sort(list, SortOrder.DESC);// FunctionInterface sort method calling
		System.out.println("DESC order: " + list);

		sortAlphatets.sort(list, SortOrder.ASC);
		System.out.println("ASC order: " + list);// FunctionInterface sort method calling


		/**
		 * 1. TT
		 * 	Interview Question: Sort "Debit Card Pay", "Debit Card Credit Pay"
		 * 	Ans: Debit Card Credit Pay, Debit Card Pay 
		 */
		String[] sArray = {"Cash Pay",
				"Auto Pay",
				"Debit Card Pay",
				"Debit Card Credit Pay",
				"Credit Card Pay",
				"Credit Card Credit Pay",
				"Re Pay",
				"Feature Pay",
				"Reward Points Pay",
				"Over Pay",
				"Late Pay",
				"Minimum Pay",
				"Maximum Pay",
				"Netbanking Pay",
				"Reward Points Pay",
				"Wallet Pay"};
		String[] duplicateSArray = Arrays.stream(sArray).toArray(String[]::new);//duplicating String[] with new String[] using Java8
		
		Collections.sort(Arrays.asList(duplicateSArray));// here sorting sArray without return. Check the reason why it is sorting!!
		System.out.println("Convert String array to list and sort using Collections.sort, convert string array to string using Arrays.toString: \n"+ Arrays.toString(duplicateSArray));
		System.out.print("\nIterate String array using Java8: ");
		Arrays.stream(duplicateSArray).sorted().forEach(System.out::println);
		
		Arrays.sort(duplicateSArray);//Sorting String[]
		String[] sortDuplicateSArray = Arrays.stream(duplicateSArray).toArray(String[]::new);
		System.out.println("\nSring[] sort using Arrays.sort and convert String[] to String[] new, Converting String[] to Arrays.toString: \n"+ Arrays.toString(sortDuplicateSArray));
	}
}
