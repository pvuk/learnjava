package com.java.collections.convert.examples;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Converting list of string values into Map
 * 
 * <pre> pre tag java doc</pre>
 * <a href="http://www.fileformat.info/info/unicode/char/3c/index.htm">&lt;pre&gt;<a/>
 * <a href="https://www.wikitechy.com/step-by-step-html-tutorials/preformattedtext-pre-tag-in-html">tag</a>
 * 
 * @author Priyanka
 *
 */
public class ListStringToMap {
	public static void main(String[] args) {
		List<String> listString = new ArrayList<String>();
		listString.add("ABC");
		listString.add("CDE");
		listString.add("BCD");
		listString.add("DEF");
		listString.add("ABC");
		listString.add("FGH");
		listString.add("EFG");
		System.out.println("List Data: ");
		listString.forEach(s -> System.out.println(s));

		listToMap(listString);

		sortMapString(listString);

		filterValues(listString);
	}

	/**
	 * <pre>
	 * If you want to filter null values use filter method.
	 * </pre>
	 * 
	 * <pre>
	 * If you want to get the count of duplicate values, you can just use Collectors.groupingBy and Collectors.counting
	 * </pre>
	 * 
	 * @param listString
	 */
	private static void filterValues(List<String> listString) {
		System.out.println("\nFilter Values: ");
		listString.add(null);
		Map<String, Long> mapFilter = listString.stream().filter(s -> s != null)
				.collect(Collectors.groupingBy(k -> k, Collectors.counting()));
		mapFilter.forEach((k, v) -> System.out.println("Key: " + k + ", Value: " + v));
	}

	/**
	 * Map doesn't allow duplicate keys., The map faces a duplicate key.. by using
	 * merging function(third parameter) keep the existing key without updating each
	 * time.
	 * 
	 * @param listString
	 */
	private static void listToMap(List<String> listString) {
		System.out.println("\nConvert List to Map: ");

		Map<String, String> mapString = listString.stream()
				.collect(Collectors.toMap(Function.identity(), s -> s, (oldKey, newKey) -> oldKey));
		mapString.forEach((k, v) -> System.out.println("Key: " + k + ", Value: " + v));
	}

	/**
	 * In order to preserve the order of the list items inside the Map , you can
	 * pass another parameter to Collectors.toMap() which decides what type of map
	 * to use. <b>LinkedHashMap is well known in preserving the order of its
	 * entries.</b>
	 * 
	 * @param listString
	 */
	private static void sortMapString(List<String> listString) {
		System.out.println("\nSorting Map using LinkedHashMap: ");
		// Function.identity() Returns a function that always returns its input
		// argument.
		Map<String, String> mapSortString = listString.stream()
				.collect(Collectors.toMap(Function.identity(), v -> v, (oldKey, newKey) -> oldKey, LinkedHashMap::new));
		mapSortString.forEach((k, v) -> System.out.println("Key: " + k + ", Value: " + v));

	}
}
