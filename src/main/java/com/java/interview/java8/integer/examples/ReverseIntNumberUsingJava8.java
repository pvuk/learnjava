package com.java.interview.java8.integer.examples;

import java.util.ArrayDeque;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 
 * @author venkataudaykiranp
 * @Date Wed 18-Dec-2019 13:59
 */
public class ReverseIntNumberUsingJava8 {
	public static void main(String[] args) {
		Stream.of("2", "4", "8", "9").collect(Collectors.toCollection(ArrayDeque::new)).descendingIterator().forEachRemaining(System.out::print);
	}
}
