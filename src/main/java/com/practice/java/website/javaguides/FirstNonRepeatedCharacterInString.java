package com.practice.java.website.javaguides;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Use of LinkedHashMap: The LinkedHashMap is ideal for this problem as it maintains the order of insertion, ensuring that the first unique character is identified correctly.
 * 
 */
public class FirstNonRepeatedCharacterInString {
	public static void main(String[] args) {
		//Example 1
		String example1 = "swiss";//output: w
		Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
		Arrays.asList(example1.split("")).forEach(val -> linkedHashMap.put(val, linkedHashMap.getOrDefault(val, 0) + 1));
//		linkedHashMap.forEach((k, v) -> {
//			if(v == 1) {
//				System.out.println("First non repeated character: "+ k +" from: "+ example1);
//				return;//Code Ref: it won't break the loop use enhanced for loop
//			}
//		});
		
		/**
		 * Code Ref:
		 * You're wondering how linkedHashMap.entrySet() is used in two different ways:

			Assigned to a Set<Entry<String, Integer>>
			Used directly in a for-each loop with Map.Entry<String, Integer>

			This is a shortcut: instead of assigning the entry set to a variable, you're directly iterating over it.
			linkedHashMap.entrySet() returns a Set<Map.Entry<K, V>>, which is iterable.
			So map in the loop is each individual Map.Entry<String, Integer>.
			✅ Both are valid and equivalent in functionality.

		 */
////		Set<Entry<String,Integer>> entrySet = linkedHashMap.entrySet();
//		for(Map.Entry<String, Integer> map : linkedHashMap.entrySet()) {
//			if(map.getValue() == 1) {
//				System.out.println("First non repeated character: "+ map.getValue() +" from: "+ example1);
//				return;//this will skip below lines to execute
//			}
//		}
		String example1Output = linkedHashMap.entrySet().stream().filter(set -> set.getValue() == 1).map(Map.Entry::getKey).findFirst().orElse(null);
		System.out.println("Example1Output: First non repeated character: "+ example1Output +" from: "+ example1);
		
		//Example 2
		String example2 = "programming";

		Character result = example2.chars()
		    .mapToObj(c -> (char) c)
		    .collect(Collectors.groupingBy(
		        c -> c,
		        LinkedHashMap::new,
		        Collectors.counting()
		    ))
		    .entrySet()
		    .stream()
		    .filter(e -> e.getValue() == 1)
		    .map(Map.Entry::getKey)
		    .findFirst()
		    .orElse(null);
		System.out.println("Example 2: First non repeated character: "+ result +" from: "+ example2);
		
		String example3 = "aabbcc";//Output: No non-repeated character found.

		Character resultExample3 = example3.toLowerCase().chars()
		    .mapToObj(c -> (char) c)
		    .collect(Collectors.toMap(
		        c -> c,
		        c -> 1,
		        Integer::sum,
		        LinkedHashMap::new
		    ))
		    .entrySet()
		    .stream()
		    .filter(e -> e.getValue() == 1)
		    .map(Map.Entry::getKey)
		    .findFirst()
		    .orElse(null);
		System.out.println("Example 3: First non repeated character: "+ resultExample3 +" from: "+ example3);
	}
}
