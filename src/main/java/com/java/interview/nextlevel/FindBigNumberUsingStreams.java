package com.java.interview.nextlevel;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

/**
 * @author P.V. UdayKiran
 * @version 1
 * @since created on Wed 18-Jun-2025 18:36
 * 
 */
public class FindBigNumberUsingStreams {
	public static void main(String[] args) {
		int[] numbers = {10, 30, 20, 90, 50};
		int bigNumber = IntStream.of(numbers).reduce(Integer.MIN_VALUE, Integer::max);
		System.out.println("Big Number: "+ bigNumber);
		
		System.out.print("Max number using sorting: ");
		Arrays.stream(numbers).sorted().max().ifPresent(System.out::println);
		
		System.out.println("Average of top 2 values: ");
		OptionalDouble average = Arrays.stream(numbers).boxed().sorted((a, b) -> b - a).limit(2).mapToInt(Integer::intValue).average();
		System.out.println(average.getAsDouble());
	}
}
