package com.java.lambda.count;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * <p> Count occurrence of each element in an array </p>
 * @author P V UdayKiran
 *
 * @Date Mon 06-Apr-2020 17:03
 *
 */
public class CountNumberOfPossibleOccurrenceOfNumberInArrayUsingLambda {
	public static void main(String[] args) {
		int[] array = { 1, 0, 1, 2, 0, 1, 4, 8, 6, 5, 4, 1 };
		// Convert int array to List Integer
		List<Integer> asList = IntStream.of(array).boxed().collect(Collectors.toList());
		Set<Integer> mySet = new HashSet<Integer>(asList);
		for (Integer s : mySet) {
			// find the frequency of occurrence of integer in an array
			System.out.println(s + " " + Collections.frequency(asList, s));

		}
	}
}
