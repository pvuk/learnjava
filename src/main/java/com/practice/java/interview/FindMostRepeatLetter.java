package com.practice.java.interview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Capgemini May 2025
 * @author P.V. UdayKiran
 * @version 1
 * @since created on Tue 27-May-2025 09:03
 */
public class FindMostRepeatLetter {
	public static void main(String[] args) {
		String input = "Welcome to Java world!";
		List<String> list = Arrays.asList(input.split(""));
//		Map<String, Long> mapCount = list.stream().collect(Collectors.toMap(letter -> letter, Collectors.counting()));//wrong answer
		Map<String, Long> mapCount = list.stream().collect(Collectors.groupingBy(letter -> letter, Collectors.counting()));//Correct
		System.out.println(mapCount);
	}
}
