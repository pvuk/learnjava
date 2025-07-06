package com.java.interview.nextlevel;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * @author P.V. UdayKiran
 * @version 1
 * @since created on Wed 18-Jun-2025 18:48
 * 
 */
public class SortWordsUsingStreams {
	public static void main(String[] args) {
		String sort = "Sorting words using Java streams";
		Arrays.stream(sort.split(" ")).sorted().forEach(word -> System.out.print(word +" "));
		
		System.out.println("\nSort using Camparator: ");
		Arrays.asList(sort.split(" ")).stream().sorted((a, b) -> a.compareTo(b)).forEach(System.out::println);
//		System.out.println("Sort using Collections: "+ sort);
		
		System.out.print("\nPrinting Ascii to characters: 65 to 90(AtoZ): ");
		IntStream.range(65, 91)// 91 because upper bound is exclusive
		.forEach(i -> System.out.print(i +" -> "+ (char) i +", "));//65 to 90(AtoZ)
		
		System.out.print("\nPrinting Ascii to characters: 97 to 122(atoz): ");
		IntStream.range(97, 123)// 123 because upper bound is exclusive
		.forEach(i -> System.out.print(i +" -> "+ (char) i +", "));//97 to 122(atoz)
	}
}
