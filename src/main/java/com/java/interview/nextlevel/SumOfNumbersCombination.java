package com.java.interview.nextlevel;

import java.util.List;
import java.util.function.IntFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Starting 1 to 100 sum of every 4 digits and print.
 * 
 * @author Venkata.Pulipati
 * @since Monday 13-April-2026 11:35:44
 */
public class SumOfNumbersCombination {
	public static void main(String[] args) {
		
		int start = 1, end = 100, startCount = 1, countTill = 4, sum = 0;
		int from = 0;
		for(int i = start; i <= end; i++) {
			
			sum += i;
			
			if(startCount == countTill) {
				System.out.println("Sum of "+ from +" to "+ i +" = "+ sum);
				from = 0;
				sum = 0;
				startCount = 1;
			} else {
				startCount++;
				
				if(startCount == 2)
					from = i;//takes first time iteration value
			}
		}
		
//		List<Stream<Integer>> collect = IntStream.rangeClosed(1, 100)
//		.mapToObj(intFunction -> IntStream.range(1, 4)
//				.mapToObj( i -> {
//					int intSum = Integer.sum(0, i);
////					System.out.println(intSum);
//					return intSum;
//				}))
//				.collect(Collectors.toList());
////		collect.forEach(list -> System.out.println(list.findFirst().get()));
	}
}
