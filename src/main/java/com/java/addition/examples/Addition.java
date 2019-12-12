package com.java.addition.examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 
 * we'll show various ways of calculating the sum of integers, using the
 * <a href="https://www.baeldung.com/java-stream-sum">Stream API</a>
 * 
 * @author venkataudaykiranp
 *
 */
public class Addition {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 4, 6, 8, 10, 24, 86);

		// Using Stream.collect()
		Integer sumOfIntegers = list.stream().collect(Collectors.summingInt(Integer::intValue));
		System.out.println(sumOfIntegers);

		// Using IntStream.sum()
		int sum = list.stream().mapToInt(Integer::intValue).sum();
		System.out.println("Stream mapToInt sum: " + sum);

		List<String> stringIntegers = Arrays.asList("1", "4", "6", "8", "10", "24", "86");
		int sumOfStringIntegers = stringIntegers.stream().mapToInt(Integer::valueOf).sum();
		System.out.println("Stream Convert Strings to Integer sum: " + sumOfStringIntegers);

		Integer reduceSum = list.stream().map(x -> x).reduce(0, Integer::sum);
		System.out.println("Reduce Sum: " + reduceSum);

		String string = "Item1 10 Item2 25 Item3 30 Item4 45";

		Integer sumOfOnlyIntgersFromSringSentence = Arrays.stream(string.split(" ")).filter((s) -> s.matches("\\d+"))
				.mapToInt(Integer::valueOf).sum();
		System.out.println("Sum Of Only Intgers From Sring Sentence: " + sumOfOnlyIntgersFromSringSentence);
	}
}
