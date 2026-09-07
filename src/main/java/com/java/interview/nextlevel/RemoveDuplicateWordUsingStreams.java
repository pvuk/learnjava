package com.java.interview.nextlevel;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author P.V. UdayKiran
 * @version 1
 * @since created on Wed 18-Jun-2025 09:24
 * 
 */
public class RemoveDuplicateWordUsingStreams {
	public static void main(String[] args) {
		String str = "Hello this is a statement in Java. Hello World";

		String collect = Arrays.asList(str.split(" ")).stream().distinct().collect(Collectors.joining(" "));
		System.out.println("Distinct words: "+ collect);

		System.out.println("\n//Example 2");
		String statementWithoutDuplicateWords = Arrays.asList(str.split(" ")).stream()
				.collect(Collectors.toCollection(LinkedHashSet::new))//remove duplicates
				.stream()
				.collect(Collectors.joining(" "));
		System.out.println("Statement Without Duplicate Words: "+ statementWithoutDuplicateWords);
		
		System.out.println("Filter Duplicate words: ");
		Set<String> setFilter = new HashSet<String>();
		Arrays.stream(str.split(" "))
		.filter(setFilter::add)// add returns false if the word is already present
		.forEach(word -> System.out.print(word +" "));
	}
}
