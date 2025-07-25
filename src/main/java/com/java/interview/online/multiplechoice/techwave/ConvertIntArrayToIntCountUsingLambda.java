package com.java.interview.online.multiplechoice.techwave;

import java.util.stream.IntStream;

/**
 * <p>
 * Write a function:

	int solution(int[] A)
	
	that, given a integer array A consisting of N integers, returns an integer that is count of 1's in integer array A.
	
	Preferance to the Java 8 features (Lambda expressions, streams and filters) over plain java program.
	
	Input Format
	You will be given an integer array of size N.
	
	Output Format
	You need to return the count of 1's.
<p>

 * @author P V UdayKiran
 *
 * @version 1, changes on Mon 06-Apr-2020 16:38
 *
 */
public class ConvertIntArrayToIntCountUsingLambda {
	public static void main(String[] args) {
		int[] ar = {0, 1, 0, 0, 1, 1, 1, 1, 0};
		long count = IntStream.of(ar).filter(x -> x == 1).count();
		System.out.println(count);
	}
}
