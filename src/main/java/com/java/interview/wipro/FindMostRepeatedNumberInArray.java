package com.java.interview.wipro;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author P.V. UdayKiran
 * @version 1
 * @since created on Fri 16-May-2025 21:41
 */
public class FindMostRepeatedNumberInArray {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 1, 3, 5, 6, 2, 1, 3, 7, 9, 10, 15, 10, 10, 18, 10};//Initializing array object with {} only
		Map<Object, Long> values = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(i->i, Collectors.counting()));
		Object max2 = values.entrySet().stream().max((o1, o2) -> o1.getValue().compareTo(o2.getValue())).get().getKey();
				
		System.out.println("Most Repeated Number: "+ max2);
	}
}
