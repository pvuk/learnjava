package com.java.interview.coforge;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

public class FindLengthOfStringUsingStreams {
	public static void main(String[] args) {
		//Problem Statement 2
        List<String> items = List.of("apple", "banana", "cherry");
		//apple: 5
		//banana: 6
		//cherry: 6
		items.stream().collect(Collectors.toMap(word -> word, len -> len.length(), 
				(existing, replacement) -> existing,// merge function in case of duplicates
				LinkedHashMap::new))// supplier to maintain insertion order
		.forEach((k, v) -> System.out.println("word: " + k + ": Length: " + v));
	}
}
