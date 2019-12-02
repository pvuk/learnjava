package com.java8.stream;

import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 
 * @author venkataudaykiranp
 *
 */
public class StreamExample {
	public static void main(String[] args) {

		// String[] arr = new String[]{"a", "b", "c"};
		// Stream<String> stream = Arrays.stream(arr);
		Stream<String> stream = Stream.of("a", "b", "c");
		List<String> list = stream.collect(Collectors.toList());
		streamIterating(list);

	}

	/**
	 * <a href="https://www.baeldung.com/java-8-streams-introduction">Iterating</a>
	 * 
	 * Stream API helps to substitute for, for-each and while loops. It allows
	 * concentrating on operation's logic, but not on the iteration over the
	 * sequence of elements
	 */
	private static void streamIterating(List<String> list) {
		// Iterating using Java7
		System.out.println(iteratingUsingJava7(list));
		// This code can be changed just with one line of Java 8 code:

		boolean isExist = list.stream().anyMatch(element -> element.contains("a"));
		System.out.println(isExist);

		Stream<Object> buildStream = Stream.builder().add(1).add(2).add(4).add(8).add(2).add(14).add(24).build();

		long countUsingPredicateFilter = buildStream.filter(Predicate.isEqual(2)).count();
		System.out.println("CountUsingPredicateFilter: " + countUsingPredicateFilter);

		/*
		 * 1. Below code throws Exception in thread "main"
		 * java.lang.IllegalStateException: stream has already been operated upon or
		 * closed
		 * 
		 * 2. A Stream should be operated on (invoking an intermediate or terminal
		 * stream operation) only once. A Stream implementation may throw
		 * IllegalStateException if it detects that the Stream is being reused.
		 * 
		 * 3. Whenever a terminal operation is called on a Stream object, the instance
		 * gets consumed and closed.
		 * 
		 * Therefore, we're only allowed to perform a single operation that consumes a
		 * Stream, otherwise, we'll get an exception that states that the Stream has
		 * already been operated upon or closed.
		 */
		try {
			long countUsingIntegerFilterLambdaExpression = buildStream.filter(i -> i.equals(2)).count();
			System.out.println("CountUsingIntegerFilterLambdaExpression: " + countUsingIntegerFilterLambdaExpression);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// The Solution
		/*
		 * 1. We've defined the streamSupplier object with the type Stream<String>,
		 * which is exactly the same type which the #get() method returns. The Supplier
		 * is based on a lambda expression that takes no input and returns a new Stream.
		 * 
		 * Invoking the functional method get() on the Supplier returns a freshly
		 * created Stream object, on which we can safely perform another Stream
		 * operation.
		 */
		Supplier<Stream<Integer>> supplierStream = () -> Stream.of(1, 2, 4, 8, 2, 14, 24);

		long countSupplier = supplierStream.get().filter(i -> i.equals(2)).count();
		System.out.println("CountSupplier: " + countSupplier);

		boolean anyMatch = supplierStream.get().anyMatch(Predicate.isEqual(2));
		System.out.println("anyMatch: " + anyMatch);
	}

	private static boolean iteratingUsingJava7(List<String> list) {
		for (String string : list) {
			if (string.contains("a")) {
				return true;
			}
		}
		return false;
	}
}
