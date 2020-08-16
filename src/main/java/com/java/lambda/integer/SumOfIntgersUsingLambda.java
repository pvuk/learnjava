package com.java.lambda.integer;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * 
 * @author P V UdayKiran
 *
 * @Date Sun 29-Mar-2020 12:14
 *
 */
public class SumOfIntgersUsingLambda {
	public static void main(String[] args) {
		int a = 458, b = 765;
		System.out.println(IntStream.of(a, b).sum());

		System.out.println("Sum of Two integers: "+ Arrays.asList(a, b).stream().collect(Collectors.summingInt(Integer::valueOf)));
	}
}
