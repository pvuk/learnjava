package com.java8.stream;

import java.util.Arrays;
import java.util.Arrays;
import java.util.List;

/**
 * ### 🔥 Difference: map() vs flatMap()</br>

	| Feature      | map()              | flatMap()                  |
	|-------------|-------------------|----------------------------|
	| Output       | One-to-one        | One-to-many                |
	| Structure    | Maintains structure | Flattens structure        |
	| Use case     | Transform values  | Flatten nested collections |
	| Return type  | T → R             | T → Stream<R>              |</br>
	
	🧠 Interview version (2–3 lines)</br>
	✅ map()</br>
	
	Transforms each element into another element (1:1 mapping)</br>
	
	✅ flatMap()</br>
	
	Transforms each element into multiple elements and flattens the result</br>
	
	

 * @author Venkata.Pulipati
 * @since Monday 11-May-2026 13:34:10
 */
public class StreamEssensials {
	public static void main(String[] args) {
		map();
		filter();
		flatMap();
		sorted();
		distinct();
		
		//map and flatMap understand clearly
		usingMap();
		usingFlatMap();
	}
	
	private static void usingFlatMap() {
		List<String> names = List.of("Uday", "Kiran");

		List<String> chars = names.stream()
		        .flatMap(n -> Arrays.stream(n.split("")))
		        .toList();

		System.out.println(chars);
		// [U, d, a, y, K, i, r, a, n] ✅ flattened
	}

	private static void usingMap() {
		List<String> names = List.of("Uday", "Kiran");

		List<String[]> chars = names.stream()
		        .map(n -> n.split(""))
		        .toList();

		System.out.println(chars); 
		// [[U, d, a, y], [K, i, r, a, n]]  -> Nested ✅
	}

	private static void distinct() {
		List<Integer> nums = List.of(1, 2, 2, 3, 3, 4);

		List<Integer> unique = nums.stream()
		        .distinct()//Remove duplicates
		        .toList();

		System.out.println(unique); // [1, 2, 3, 4]
	}

	private static void sorted() {
		List<Integer> nums = List.of(5, 2, 8, 1);

		List<Integer> sorted = nums.stream()
		        .sorted()//Sort elements
//		        .sorted((a, b) -> b - a) //✅ Custom sorting: descending
		        .toList();

		System.out.println(sorted); // [1, 2, 5, 8]
	}

	/**
	 * ✅ Removes nesting (List<List> → List)
	 * 
	 * @author Venkata.Pulipati
	 * @since Monday 11-May-2026 13:36:53
	 */
	private static void flatMap() {
		List<List<Integer>> list = List.of(
		        List.of(1, 2),
		        List.of(3, 4)
		);

		List<Integer> flat = list.stream()
		        .flatMap(l -> l.stream())//👉 Converts one element → multiple elements → flattens
		        .toList();

		System.out.println(flat); // [1, 2, 3, 4]
	}

	private static void filter() {
		List<Integer> nums = List.of(1, 2, 3, 4, 5);

		List<Integer> even = nums.stream()
		        .filter(n -> n % 2 == 0)//👉 Keeps only matching elements
		        .toList();

		System.out.println(even); // [2, 4]
	}

	private static void map() {
		List<Integer> nums = List.of(1, 2, 3, 4);

		List<Integer> squares = nums.stream()
		        .map(n -> n * n)//map() – Transform each element
		        .toList();

		System.out.println(squares); // [1, 4, 9, 16]
	}
}
