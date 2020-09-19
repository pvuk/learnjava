package com.java.lambda.integer;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * 
 * @author P V UdayKiran
 *
 * @version 2 changes on Sun 19-Sep-2020 15:48</br>
 * 	1 changes on Sun 29-Mar-2020 12:14
 *
 */
public class SumOfIntgersUsingLambda {
	public static void main(String[] args) {
		int a = 458, b = 765;
		System.out.println(IntStream.of(a, b).sum());

		System.out.println("Sum of Two integers: "+ Arrays.asList(a, b).stream().collect(Collectors.summingInt(Integer::valueOf)));
		
		int[] arr = {1, 2, 3, 4, 5};
		System.out.println("Using Arrays.streams : "+ Arrays.stream(arr).sum());
		System.out.println("Using Arrays xx reduce : "+ Arrays.stream(arr).reduce(0, Integer::sum));
	}
}
