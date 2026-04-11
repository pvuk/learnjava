package com.java.interview.nextlevel;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfaceExamples {
	public static void main(String[] args) {
		int a = 5, b = 6;
		String s = "Hello", t = "Java";
		//A function is a type of functional interface in Java that receives only a single argument and returns a value after the required processing.
		Function<Integer, Integer> functionMultiply = (x) -> x * x;
		System.out.println("Function: Muliply: "+ functionMultiply.apply(a));
		
		//Bi-Function: The Bi-Function is substantially related to a Function. Besides, it takes two arguments, whereas Function accepts one argument. 
		BiFunction<Integer, Integer, Integer> functionAdd = (x, y) -> x + y;
		Integer apply = functionAdd.apply(a, b);
		System.out.println("BiFunction: Sum of values: "+ apply);
		
		//Consumer: It accepts a single input argument and returns no result.
		BiConsumer<String, String> biConsumer = (s1, s2) -> System.out.println("Consumer: Join two Strings: "+ s1 +" "+ s2);
		biConsumer.accept(s, t);
		
		Predicate<Integer> predicateCondition = (x) -> x > 1;
		System.out.println("Predicate: Given value: "+ a +" above 1 : "+ predicateCondition.test(a));
		
		/*
		 * The Supplier functional interface is also a type of functional interface that does not take any input or argument and yet returns a single output.

			The different extensions of the Supplier functional interface hold many other suppliers functions like BooleanSupplier, DoubleSupplier, LongSupplier, and IntSupplier. The return type of all these further specializations is their corresponding primitives only. 
		 */
		Supplier<ArrayList<String>> supplierCreateList = () -> new ArrayList<String>();
		List<String> list = supplierCreateList.get();
		System.out.println("Supplier: New list is created using supplier");
	}
}
