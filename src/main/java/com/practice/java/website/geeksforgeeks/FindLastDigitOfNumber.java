package com.practice.java.website.geeksforgeeks;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author venkata.pulipati
 * @since Thursday 25-September-2025 10:07:33
 */
public class FindLastDigitOfNumber {
	public static void main(String[] args) {
		Integer[] arr = {1234, 2345, 3456, 4567, 5678};
		List<String> collect = Stream.of(arr).map(number -> {
			return number +"-"+ number.toString().charAt(number.toString().length()-1);
		}).collect(Collectors.toList());
		System.out.println("Finding Last Digit Of Number: "+ collect);
	}
}
