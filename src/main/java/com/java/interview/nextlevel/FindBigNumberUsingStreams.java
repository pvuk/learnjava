package com.java.interview.nextlevel;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

/**
 * * Code Ref:
 * 1️⃣ What a Comparator actually returns</br>
	A Comparator<T> does NOT return a sorted value.
	It returns an int whose sign (negative / zero / positive) is interpreted by the sorting algorithm.
	Comparator contract (very important)
	For compare(a, b):</br>

	| Return Value | Meaning |</br>
	|-------------|---------|</br>
	| Negative (< 0) | `a` comes before `b` |</br>
	| Zero (0) | `a` and `b` are equal |</br>
	| Positive (> 0) | `a` comes after `b` |</br>

	<b>✅ Only the sign matters, not the exact number.</b></br>
	
	
	2️⃣ Why a - b means ascending order</br>
	When you write: (a, b) -> a - b</br>
	You are asking Java to compute:</br>
	<i>result = a - b</i></br>
	
	Let’s test with real values</br>
	<b>Case 1: a < b </b></br>
	a = 3, b = 5</br>
	a - b = -2   (negative)</br>
	✅ Result is negative → a comes before b → ascending ✅</br>
	
	<b>Case 2: a == b</b></br>
	a = 5, b = 5</br>
	a - b = 0</br>
	✅ Equal → order doesn’t change</br>
	
	<b>Case 3: a > b</b></br>
	a = 8, b = 3</br>
	a - b = 5   (positive)</br>
	✅ Positive → a comes after b → descending ✅</br>
	
	✅ Conclusion</br>
	a - b  ⇒ ascending order (small → big)</br>
	
	⚠️ Important: Java is NOT “subtracting internally” for sorting — YOU are doing the subtraction, and Java only checks the sign of the result.</br>

 * @author P.V. UdayKiran
 * @version 1
 * @since created on Wed 18-Jun-2025 18:36
 * 
 */
public class FindBigNumberUsingStreams {
	public static void main(String[] args) {
		int[] numbers = {10, 30, 20, 90, 50};
		int bigNumber = IntStream.of(numbers).reduce(Integer.MIN_VALUE, Integer::max);
		System.out.println("Big Number: "+ bigNumber);
		
		System.out.print("Max number using sorting: ");
		Arrays.stream(numbers).sorted().max().ifPresent(System.out::println);
		
		/*
		 * Summary intuition
			
			| Expression | Effect |
			|-----------|--------|
			| `a - b` | Natural / Ascending order |
			| `b - a` | Reverse / Descending order |
		 * 
		 * Why a - b is dangerous ⚠️ (Overflow issue)
		 * Problem example

			a = Integer.MIN_VALUE    // -2147483648
			b = 10
			
			a - b = OVERFLOW 😱
			This can break sorting logic.
			
			✅ Recommended safe methods (use these)
			Best (clean & safe)
			Integer.compare(a, b);      // ascending
			Integer.compare(b, a);      // descending
			
			Or built-in
			Comparator.naturalOrder();   // ascending
			Comparator.reverseOrder();   // descending

		 * 
		 */
		System.out.println("Average of top 2 values: ");
		OptionalDouble average = Arrays.stream(numbers).boxed()
//				.sorted((a, b) -> b - a)//Note: Using subtraction in comparators can cause integer overflow.
				.sorted((a, b) -> Integer.compare(b, a))//Better & Safer Alternative (Recommended)
//				.sorted(Comparator.reverseOrder())
				.limit(2).mapToInt(Integer::intValue).average();
		System.out.println(average.getAsDouble());
	}
}
