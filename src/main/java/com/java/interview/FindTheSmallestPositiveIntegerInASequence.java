package com.java.interview;

import java.util.OptionalInt;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * <p>
 * 	Find the smallest positive integer that does not occur in a given sequence
	</br>
	<b>output:</b> For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
 * </p>
 *
 * @author P V UdayKiran
 *
 * @version 1, changes on Sun 26-Apr-2020 17:31
 * @version 2, changes on Fri 25-Jul-2025 22:36
 * 
 */
public class FindTheSmallestPositiveIntegerInASequence {
	public static void main(String[] args) {
		int[] integerSequence = {1, 3, 6, 4, 1, 2};
		// Convert array to a Set of positive integers
		Set<Integer> set = IntStream.of(integerSequence).filter(i -> i > 0)
				.boxed()
				.collect(Collectors.toSet());
		// Find the smallest missing positive integer using IntStream
		OptionalInt first = IntStream.iterate(1, i -> i + 1)//Code Ref: Uses IntStream.iterate() to generate an infinite stream of positive integers.
				.filter(i -> !set.contains(i))//Finds the first integer not in the set.
				.findFirst();
		System.out.println("Smallest missing positive integer: "+ first);//Output: 5
	}
}
