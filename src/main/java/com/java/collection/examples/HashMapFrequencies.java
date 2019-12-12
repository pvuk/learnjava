package com.java.collection.examples;

/* Java program to print frequencies of all elements using  
   HashMap */
import java.util.*;

/**
 * 
 * <b><a href="https://www.geeksforgeeks.org/hashmap-treemap-java/">Key Points</a></b>
 * <ul>
 * <li>HashMap does not maintain any order neither based on key nor on basis of
 * value, If we want the keys to be maintained in a sorted order, we need to use
 * TreeMap.</li>
 * <li>Complexity: get/put/containsKey() operations are O(1) in average case but
 * we can’t guarantee that since it all depends on how much time does it take to
 * compute the hash.</li>
 * </ul>
 * 
 * <b>Application:</b> 
 * HashMap is basically an implementation of hashing. So
 * wherever we need hashing with key value pairs, we can use HashMap. For
 * example, in Web Applications username is stored as a key and user data is
 * stored as a value in the HashMap, for faster retrieval of user data
 * corresponding to a username.
 * 
 * @author venkataudaykiranp
 *
 */
public class HashMapFrequencies {
	// This function prints frequencies of all elements
	static void printFreq(int arr[]) {
		// Creates an empty HashMap
		HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();

		// Traverse through the given array
		for (int i = 0; i < arr.length; i++) {
			Integer c = hmap.get(arr[i]);

			// If this is first occurrence of element
			if (hmap.get(arr[i]) == null)
				hmap.put(arr[i], 1);

			// If elements already exists in hash map
			else
				hmap.put(arr[i], ++c);
		}

		// Print result
		for (Map.Entry m : hmap.entrySet())
			System.out.println("Frequency of " + m.getKey() + " is " + m.getValue());
	}

	// Driver method to test above method
	public static void main(String[] args) {
		int arr[] = { 10, 34, 5, 10, 3, 5, 10 };
		printFreq(arr);
	}
}