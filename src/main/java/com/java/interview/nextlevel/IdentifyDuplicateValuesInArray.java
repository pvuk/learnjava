package com.java.interview.nextlevel;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IdentifyDuplicateValuesInArray {

	public static void main(String[] args) {
		int[] array = {1,2,3,1,4,5,1,6,7,8,7,9};

		int indexFilterValue = 0, indexDuplicateValue = 0;
		int[] duplicateValues = new int[indexDuplicateValue];
		int[] filterValues = new int[array.length];
		for(int i = 0; i < array.length; i++) {
			boolean duplicateNotFound = true;
			for(int j = 0; j < filterValues.length; j++) {
				if(array[i] == filterValues[j]) {
					//duplicate value exist
					duplicateNotFound = false;
					
					duplicateValues = Arrays.copyOf(duplicateValues, duplicateValues.length + 1);//dynamically increasing array size
					duplicateValues[indexDuplicateValue] = array[i];
					indexDuplicateValue++;
					break;
				}
			}
			if(duplicateNotFound) {
				//insert new value
				filterValues[indexFilterValue] = array[i];
				indexFilterValue++;
			}
		}
		System.out.println("Duplicate Values: ");
		for(int i : duplicateValues) {
			System.out.println(i);
		}
		
		findDuplicatesUsingHashSet(array);
		findDuplicatesUsingHashMap(array);
		findDuplicatesUsingStreams(array);
		findDuplicatesUsingCollectors(array);
	}

	private static void findDuplicatesUsingCollectors(int[] array) {

		Map<Integer, Long> countMap =
                Arrays.stream(array)
                        .boxed()
                        .collect(Collectors.groupingBy(
                                n -> n, Collectors.counting()));

        countMap.forEach((key, value) -> {
            if (value > 1) {
                System.out.println("Duplicate: " + key);
            }
        });

	}

	private static void findDuplicatesUsingStreams(int[] array) {

		Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates =
                IntStream.of(array)
                        .filter(n -> !seen.add(n))
                        .boxed()
                        .collect(java.util.stream.Collectors.toSet());

        System.out.println("Duplicates: " + duplicates);

	}

	private static void findDuplicatesUsingHashMap(int[] array) {

		Map<Integer, Integer> countMap = new HashMap<>();

        for (int value : array) {
            countMap.put(value, countMap.getOrDefault(value, 0) + 1);
        }

        System.out.print("Duplicates: ");
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.print(entry.getKey() + " ");
            }
        }

	}

	/**
	 * ✅ Time Complexity: O(n)
     * ✅ Space Complexity: O(n)
	 *
	 * @author Venkata.Pulipati
	 * @since Thursday 16-April-2026 14:25:29
	 */
	public static void findDuplicatesUsingHashSet(int[] array) {

//        int[] array = {1,2,3,1,4,5,1,6,7,8,7,9};

        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int value : array) {
            if (!seen.add(value)) {
                duplicates.add(value);
            }
        }

        System.out.println("Duplicates: " + duplicates);
    }

}
