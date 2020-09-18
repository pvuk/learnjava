package com.java.practice.interview.dbs;

import java.util.stream.Stream;

/**
 * @author P.V. UdayKiran
 * @version 1, created on Fri 18-Sep-2020 19:47
 */
public class ChainingStreamOperations {
	public static void main(String[] args) {
		Stream.of("a1", "b1", "b2", "c1", "d1").map(s -> s.toUpperCase()).filter(s -> s.startsWith("C")) .forEach(s -> System.out.println("forEach: " + s));
		Stream.of("a1", "b1", "b2", "c1", "d1").map(s -> s.toUpperCase()).filter(s -> s.startsWith("c")) .forEach(s -> System.out.println("forEach: " + s));
//		Stream.of("a1", "b1", "b2", "c1", "d1").filter(s -> s.startsWith("c")) .map(s -> .toUpperCase()) .forEach(s -> System.out.println("forEach: " + s));
//		Stream.of("a1", "b1", "b2", "c1", "d1").filter(s -> s.startsWith("C")) .map(s -> .toUpperCase()) .forEach(s -> System.out.println("forEach: " + s));
	}
}
