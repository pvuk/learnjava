package com.practice.java.number.examples;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * 
 * @author P V UdayKiran
 *
 * @version 1, changes on: Sat 14-Dec-2019 19:15
 * @version: %I%
 */
public class RandomNumberFromTill {
	
	public static void main(String[] args) {
		System.out.println("Printing Random Numbers From xxxx To xxxx");
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Please enter 4 digit From number(Warning! number should be 4 characters length): ");
			int from = sc.nextInt();
			System.out.println("Please enter 4 digit Till number(Warning! number should be 4 characters length): ");
			int till = sc.nextInt();
			
			if(String.valueOf(from).length() < 4) {
				System.err.println("Please enter 'From' number 4 characters length!");
			} else if(String.valueOf(till).length() < 4) {
				System.err.println("Please enter 'Till' number 4 characters length!");
			} else if(from >= 0 && till >= 0) {
				IntStream intStream = IntStream.range(from, till);
				
				/*
				 * Code Ref: Interview Q&A 
				 * 🔍 What is .boxed()?
				The .boxed() method is used to convert a primitive stream (like IntStream, LongStream, or DoubleStream) into a stream of their corresponding wrapper classes (Stream<Integer>, Stream<Long>, or Stream<Double>).
				
				In your case:
				
				IntStream is a stream of primitive int values.
				.boxed() converts it into a Stream<Integer> — the wrapper class for int.
				
				Some more info...</br>
				✅ Why is this needed?
				Primitive streams (IntStream, LongStream, etc.) are optimized for performance and memory, but they don't work with generic collections like List<Integer> directly. So if you want to collect the values into a List<Integer>, you need to box them first.
				
				⚙️ How does it work internally?
				Under the hood, .boxed() uses autoboxing — it wraps each primitive int into an Integer object:

				int -> Integer

				This is done using Integer.valueOf(int) for each element in the stream.
				 */
				List<Integer> collect = intStream
						.boxed()
						.collect(Collectors.toList());
				
				System.out.println(collect);
				
				System.out.println("Every 10 numbers printing in new line");
				
				/*
				 * Code Ref: Intervie Q&A
				 * If we re use intStream again below error will catch
				 * 
				 * java.lang.IllegalStateException: stream has already been operated upon or closed
				 */
//				String collectWithNewLine = intStream.boxed().collect();
				
				String collectWithNewLine = IntStream.range(from, till).boxed().collect(Collectors.collectingAndThen(Collectors.toList(), list -> {
					StringBuilder sb = new StringBuilder();//StringBuilder is mutable and fast in performance wise.
					for(int i = 0; i < list.size(); i++) {
						sb.append(list.get(i)).append(" ");
						if((i + 1) % 10 == 0) {
							sb.append("\n");
						}
					}
					return sb.toString();
				}));
				System.out.println(collectWithNewLine);
				
			} else if(from < 0 || till < 0) {
				System.err.println("Please enter valid positive integers!");
			}
		} finally {
			sc.close();
		}
	}
}
