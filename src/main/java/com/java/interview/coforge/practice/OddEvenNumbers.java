package com.java.interview.coforge.practice;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author Venkata.Pulipati
 * @since Wednesday 20-August-2025 11:35:27
 */
public class OddEvenNumbers {
	public static void main(String[] args) {
		int number = 100;
		/**
		 * get list of numbers, 
		 * startExclusive we are passing as 1 and endExclusive parameter we are passing as number
		 */
		List<Integer> list = IntStream.range(1, number).boxed().toList();
		
		//Example 1:
		Map<Boolean, List<Integer>> collect = list.stream()
				.collect(Collectors.partitioningBy(i -> i % 2 == 0));//Both Even and Odd numbers exist in Map. Key True Even, False Odd Numbers.
		
		collect.forEach((isEven, numbers) -> {
			if(isEven) {
				/**
				 * Code Ref:
				 * The issue in your code is that you're using peek() inside a parallelStream() without a terminal operation like forEach(), collect(), etc. The peek() method is an intermediate operation and won’t execute unless followed by a terminal operation.
				 * 
				 * 🔍 Explanation:
				 * peek() is mainly used for debugging and should not be relied on for performing actions like printing.
				 * forEach() is a terminal operation that triggers the stream pipeline and executes the action.
				 */
//				numbers.parallelStream().peek(eNum -> System.out.print("Even Numbers: "+ eNum));
				System.out.println();//new line
				System.out.println("Even Numbers: ");
				numbers.forEach(eNum -> System.out.print(eNum +", "));
			} else {
//				numbers.parallelStream().peek(eNum -> System.out.print("Odd Numbers: "+ eNum));
				System.out.println("Odd Numbers: ");
				numbers.forEach(eNum -> System.out.print(eNum +", "));
			}
		});
		
		//Example 2:
		System.out.println();//new line
		Map<Boolean, String> collectMap = list.stream().collect(Collectors.partitioningBy(i -> i % 2 == 0,
				Collectors.mapping(String::valueOf, Collectors.joining(", "))));//Joining with comma separated values
		collectMap.forEach((isEven, numbersStr) -> {
			String label = isEven ? "Even Numbers: " : "Odd Numbers";//Both Even and Odd numbers exist in Map. Key True Even, False Odd Numbers.
			System.out.println(label + numbersStr);
		});
	}
}
