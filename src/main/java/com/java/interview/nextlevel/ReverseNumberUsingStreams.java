package com.java.interview.nextlevel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author P.V. UdayKiran
 * @version 1
 * @since created on Wed 18-Jun-2025 08:43
 * 
 */
public class ReverseNumberUsingStreams {
	public static void main(String[] args) {
		int number = 2345;
		List<Integer> collect = IntStream.of(number)
		.boxed()//In Java 8, the term "boxed" primarily refers to the process of converting primitive type values into their corresponding wrapper class objects. 
				//This is particularly relevant in the context of the Stream API introduced in Java 8.
		.collect(Collectors.collectingAndThen(Collectors.toList(), num -> {
			Collections.reverse(num);
			return num;
		}));
		collect.forEach(val -> System.out.println(val));
		
//		IntStream limit = IntStream.iterate(2345 - 1, i -> i - 1).limit(2345 - 2345);
//		limit.forEach(val -> System.out.println(val));
		
		Arrays.asList(String.valueOf(number).split("")).stream().sorted(Collections.reverseOrder()).forEach(System.out::print); 
	}
}
