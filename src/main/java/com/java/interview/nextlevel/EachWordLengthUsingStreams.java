package com.java.interview.nextlevel;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.stream.Collectors;

/**
 * @author P.V. UdayKiran
 * @version 1
 * @since created on Wed 18-Jun-2025 17:54
 * 
 */
public class EachWordLengthUsingStreams {
	public static void main(String[] args) {
		String str = "each word length finding using java streams, duplicate word also handled";
		Arrays.stream(str.split(" "))
		.collect(Collectors.toMap(k -> k, v -> v.length(), (duplicateKey, duplicateNewKey) -> duplicateKey, LinkedHashMap::new))
		.forEach((k, v) -> System.out.println("word: "+ k +", length: "+ v));
	}
}
