package com.practice.java.lambda.count;

import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.apache.commons.collections4.Bag;
import org.apache.commons.collections4.bag.HashBag;

/**
 * <p> Count occurrence of each element in an array </p>
 * @author P V UdayKiran
 *
 * @Date Mon 06-Apr-2020 17:03
 *
 */
public class CountNumberOfPossibleOccurrenceOfNumberInArrayUsingLambda {
	public static void main(String[] args) {
		int[] array = { 1, 0, 1, 2, 0, 1, 4, 8, 6, 5, 4, 1 };
		// Convert int array to List Integer
		List<Integer> list = IntStream.of(array).boxed().collect(Collectors.toList());
//		Set<Integer> mySet = new HashSet<Integer>(list);
//		for (Integer i : mySet) {
//			// find the frequency of occurrence of integer in an array
//			System.out.println(i + " " + Collections.frequency(list, i));
//		}
		
		/**
		 * or
		 * 
		 * Returns the number of elements in the specified collection equal to the specified object.
		 */
		System.out.println(":::: Using IntStream ::::");
		IntStream.of(array).boxed().collect(Collectors.toSet())
			.forEach(x -> {System.out.println(x +"=>"+ Collections.frequency(list, x));});
		//or
//		IntStream.of(array).boxed().collect(Collectors.toSet()).forEach(x -> {System.out.println(x +"=>"+ Collections.frequency(IntStream.of(array).boxed().collect(Collectors.toList()), x));});
		
		/**
		 * What's the meaning () ?
		 */
		System.out.println(":::: Using Supplier function ::::");
		//Reusing a stream, by wrap the stream expression in a supplier and call supplierStream.get()
		Supplier<Stream<Integer>> supplierStream = () -> IntStream.of(array).boxed();
		supplierStream.get().collect(Collectors.toSet()).forEach(x -> {System.out.println(x +"~"+Collections.frequency(supplierStream.get().collect(Collectors.toList()), x));});
		
		System.out.println(":::: Using Apache commons collections4 Bag Interface ::::");
		Bag<Integer> bag = new HashBag<>(list);
		bag.uniqueSet().forEach(x->{
			System.out.println(x +"'s ->"+ bag.getCount(x));
		});
		
//		MultiSet<Integer> multiSet = new HashMultiSet<>(list);
//		multiSet.uniqueSet().forEach(x->{
//			System.out.println(x +"'s ->"+ multiSet.getCount(x));
//		});
	}
}
