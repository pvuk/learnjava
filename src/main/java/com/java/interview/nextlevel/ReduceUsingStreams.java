package com.java.interview.nextlevel;
/**
 * @author P.V. UdayKiran
 * @version 1
 * @since created on Wed 18-Jun-2025 09:54
 * 
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ReduceUsingStreams {
	
	public static void main(String[] args) {
		/*
		 * The Stream.reduce() method in Java is used to perform a reduction operation on the elements of a stream. 
		 * It combines the stream elements into a single result by repeatedly applying a binary operation (such as addition, multiplication, or concatenation).
		 */
		int numbers = 12345;
		int reduce = String.valueOf(numbers).chars()
				.map(Character::getNumericValue)
				.reduce(0, Integer::sum);
		System.out.println("Sum: "+ reduce);
		
		Integer[] intArray = {1,2,3,4,5};
		List<Integer> list = Arrays.asList(intArray);
		int val = list.stream().reduce(0, (a, b) -> a + b);//adding
		System.out.println("Adding: "+ val);
		
		/*
		 * Note: Whenever a terminal operation is called on a Stream object, the instance gets consumed and closed. 
		 * Therefore, we're only allowed to perform a single operation that consumes a Stream, otherwise, we'll get an exception that states that the Stream has already been operated upon or closed.
		 */
//		Integer multiply = stream.reduce(1, (a, b) -> a * b);
		Integer multiply = Stream.of(intArray).reduce(1, (a, b) -> a * b);//Using reduce() with Initial Value
																		//This example shows how to use reduce() with an initial value to compute the product of the elements.
		System.out.println("Multiply: "+ multiply);
		
		/*
		 * Using an Identity, BiFunction, and BinaryOperator
			<U> U reduce(U identity, BiFunction<U, ? super T, U> accumulator, BinaryOperator<U> combiner)
			Parameters:
			identity: The identity value for the reduction (initial value).
			accumulator: A function that combines two values.
			combiner: A function that combines two partial results.</br>
			
			more info..
			This is the most complex version, used for parallel streams or when the type of the accumulated result is different from the type of the stream elements.
			identity: The initial value for the reduction.
			accumulator: A function that combines the accumulated result with the next element from the stream.
			combiner: A function used to combine the results of multiple partial reductions when processing a parallel stream.
			Example: Calculating the sum of lengths of strings in a list.
		 */
		List<String> words = Arrays.asList("hello", "world", "java");
        Integer totalLength = words.stream().reduce(0,
            (partialSum, word) -> partialSum + word.length(),
            (sum1, sum2) -> sum1 + sum2);
        System.out.println("Total length: " + totalLength);
	}
}
