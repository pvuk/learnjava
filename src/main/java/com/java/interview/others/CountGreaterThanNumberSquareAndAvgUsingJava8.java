package com.java.interview.others;

import java.util.stream.IntStream;

/**
 * @author P.V. UdayKiran
 * @version 1, created on Tue 29-Sep-2020 07:30
 */
public class CountGreaterThanNumberSquareAndAvgUsingJava8 {
	public static void main(String[] args) {
		int[] arr = new int[] { 20, 60, 70, 10 };
		/*
		 * Returns:an OptionalDouble containing the average element of this stream.
		 * average works as [sum of all numbers / length of arr]
		 */
		System.out.println(IntStream.of(arr).filter(i -> i > 50).map(n -> n * n).average().getAsDouble());
	}
}
