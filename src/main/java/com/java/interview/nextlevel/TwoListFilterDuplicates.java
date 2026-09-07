package com.java.interview.nextlevel;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author P.V. UdayKiran
 * @version 1
 * @since created on Tue 17-Jun-2025 21:32
 * 
 */
public class TwoListFilterDuplicates {
	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(1, 2, 3, 3, 5, 7, 8, 9, 9);
		List<Integer> list2 = Arrays.asList(4, 5, 5, 9);
		List<Integer> combineTwoList = Stream.concat(list1.stream(), list2.stream()).collect(Collectors.toList());//preserving duplicates and order
		System.out.println("combination of two list: "+ combineTwoList);
		
		//Example 2
		List<Integer> filterDuplicates = Stream.concat(list1.stream(), list2.stream()).distinct().sorted().collect(Collectors.toList());
		System.out.println("Filter duplicates: "+ filterDuplicates);
	}
}
