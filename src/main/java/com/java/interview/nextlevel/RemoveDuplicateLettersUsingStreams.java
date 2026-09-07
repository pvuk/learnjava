package com.java.interview.nextlevel;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.stream.Collectors;

/**
 * @author P.V. UdayKiran
 * @version 1
 * @since created on Thu 19-Jun-2025 12:24
 * 
 */
public class RemoveDuplicateLettersUsingStreams {
	public static void main(String[] args) {
		String str = "removeduplicates";
		Arrays.asList(str.split("")).stream().collect(Collectors.toMap(k->k, v->v, (old, key) -> old, LinkedHashMap::new))
		.forEach((k, v) -> System.out.println("Letter: "+ k)); 
	}
}
