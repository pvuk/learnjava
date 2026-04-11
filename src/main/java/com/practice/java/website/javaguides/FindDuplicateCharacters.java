package com.practice.java.website.javaguides;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FindDuplicateCharacters {
	public static void main(String[] args) {
		String example1 = "FindDuplicateCharacters";
		
		LinkedHashMap<String,Long> linkedHashMap = Arrays.asList(example1.split("")).stream()
		.collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()));
		
		linkedHashMap.forEach((k, v) -> {
			if(v > 1) {
				System.out.println("Char: "+ k +", no.Of times repeated: "+ v);
			}
		});
		
		String collect = linkedHashMap.entrySet()
				.stream().filter(entry -> entry.getValue() > 1)
				.map(Map.Entry::getKey)
				.collect(Collectors.joining(","));
		System.out.println("Example 2: Duplicate Characters: "+ collect);
	}
}
