package com.java.interview.nextlevel;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author P.V. UdayKiran
 * @version 1
 * @since created on Thu 19-Jun-2025 10:36
 * 
 */
public class FindCountOfLettersInStatementUsingStreams {
	public static void main(String[] args) {
		String letters = "Hello, Count of letters in statement";
		Arrays.asList(letters.split("")).stream()
		.collect(Collectors.groupingBy(i -> i, Collectors.counting())).forEach((k, v) -> System.out.println("Letter: "+ k +", Count: "+ v));
		
		System.out.println("Sort, Count of letters: ");
		Arrays.asList(letters.split("")).stream()
		.collect(Collectors.groupingBy(i -> i, Collectors.counting()))
		.entrySet().stream().sorted(Map.Entry.comparingByKey())
		.forEach(entry -> System.out.println("Letter: "+ entry.getKey() +" -> "+ entry.getValue()));
	}
}
