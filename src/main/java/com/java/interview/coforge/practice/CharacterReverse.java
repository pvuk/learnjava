package com.java.interview.coforge.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Venkata.Pulipati
 * @since Tuesday 02-September-2025 15:37:09
 */
public class CharacterReverse {

	public static void main(String[] args) {
		String str = "This is a test. Java 21";
		List<String> list = Arrays.asList(str.split(""));
		Map<String,Long> collect = list.stream().collect(Collectors.groupingBy(ch -> ch, Collectors.counting()));
		collect.entrySet().stream().sorted(Map.Entry.<String, Long>comparingByValue().reversed())
//		.limit(3)
		.forEach(System.out::println);
		
	}
}
