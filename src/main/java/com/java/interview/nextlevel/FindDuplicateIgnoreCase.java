package com.java.interview.nextlevel;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.stream.Collectors;

public class FindDuplicateIgnoreCase {
	public static void main(String[] args) {
		String[] frequencies = {"Daily Weekly", "Every 15 Days", "MONTHLY", "monthly"};
		Arrays.asList(frequencies).stream().collect(Collectors.toMap(String::toLowerCase, word -> word,
				(existing, replacement) -> existing, LinkedHashMap::new))
		.values()
		.forEach(System.out::println);
		
//		List.of(frequencies).stream().flatMap(strArray -> Arrays.stream(strArray.toLowerCase().split("\\s+"))).distinct().forEach(System.out::println);
		
//		System.out.print("\nExample 2: \n");
//		Arrays.stream(frequencies)
//		.flatMap(strArray -> Arrays.stream(strArray.toLowerCase().split("\\s+")))
//		.distinct()
//		.collect(Collectors.toCollection(LinkedHashSet::new)).forEach(System.out::println);

//		System.out.print("\nExample 3: \n");
//		List<String> wordList = Arrays.asList(frequencies);
//		Arrays.asList(frequencies).stream()
//		.filter(str -> {
//			return Collections.frequency(wordList, str.toUpperCase()) == 0;
//		}).collect(Collectors.toList()).forEach(System.out::println);
	}
}
