package com.practice.java.website.geeksforgeeks;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Venkata.Pulipati
 * @since Friday 26-September-2025 09:40:53
 */
public class CountDigitsFromAlphaNumeric {
	public static void main(String[] args) {
		String findDigits = "Hello Java 21 released on 19-09-2023, Java SE 21.0.8.0.2 release date 25-06-2025";
		Long collect = Stream.of(findDigits.split("")).filter(isDigit -> isDigit.matches("\\d")).collect(Collectors.counting());
		System.out.println("Total digits: "+ collect);
	}
}
