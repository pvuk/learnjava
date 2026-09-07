package com.java.interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * MPHASIS </br>
 * Your input is an unsorted array of strings. Each string contains a variable name and a numeric transaction cost, separated by a colon.
Example input array:
["auth:120", "payment:450", "auth:80", "inventory:300", "payment:50"] Merge and sort by name.

 * @author PULIPATI VENKATA UDAYKIRAN
 * @since Friday 10-July-2026 14:13:10
 */
public class MPhasis_SortJsonArrayValue {
	public static void main(String[] args) {
		String[] data = {"auth:120", "payment:450", "auth:80", "inventory:300", "payment:50"};
		List<String> asList = Arrays.asList(data);
		asList.sort(Comparator.comparingInt(s -> Integer.parseInt(s.split(":")[1])));
		System.out.println(asList);
	}
}
