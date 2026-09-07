package com.java.interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

/**
 * Leaders in the Array

An Element is said to a leader if it is greater than all of its right side elements.

Special case: Right most element is always a leader
 
Example:
 
Input

int a[] = {40, 20, 45, 25, 0, 1}
 
Output leaders[] = {45, 25, 1}

 * @author PULIPATI VENKATA UDAYKIRAN
 * @since Monday 03-August-2026 15:50:16
 */
public class MaximumRightMostElement_Altimetrik {
	public static void main(String[] args) {
		int[] a = {40, 20, 45, 25, 0, 1};
        
        List<Integer> leaders = findLeaders(a);
        
        System.out.println("Leaders: " + leaders);
        
        //Example 2
        System.out.println("Leaders using Streams: " + findLeadersUsingStreams(a));
	}
	
	/**
	 * 🔹 Algorithm
		1. Start from the rightmost element (it’s always a leader).
		
		2. Keep track of the maximum element seen so far.
		
		3. Traverse the array from right to left:
		
			. If the current element is greater than the maximum seen so far, it’s a leader.
			
			. Update the maximum when a new leader is found.
		
		4. Store leaders in reverse order (since we traverse from right to left), then reverse them at the end.</br>
		
		🔹 Key Points</br>
		Time Complexity: 𝑂(𝑛)		 (single traversal from right to left).
		
		Space Complexity: 𝑂(1)		 extra space (excluding output list).
		
		Works efficiently even for large arrays.

	 * @author PULIPATI VENKATA UDAYKIRAN
	 * @since Monday 03-August-2026 15:57:48
	 * @param arr
	 * @return
	 */
	public static List<Integer> findLeaders(int[] arr) {
        List<Integer> leaders = new ArrayList<>();
        int n = arr.length;
        
        // Rightmost element is always a leader
        int maxFromRight = arr[n - 1];
        leaders.add(maxFromRight);
        
        // Traverse from second last to first
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > maxFromRight) {
                leaders.add(arr[i]);
                maxFromRight = arr[i];
            }
        }
        
        // Reverse to maintain original order
        Collections.reverse(leaders);
        return leaders;
    }
	
	public static List<Integer> findLeadersUsingStreams(int[] arr) {
        int n = arr.length;
        List<Integer> leaders = new ArrayList<>();
        
        // Use AtomicInteger as a mutable holder
        AtomicInteger maxFromRight = new AtomicInteger(arr[n - 1]);
        leaders.add(maxFromRight.get());
        
        // Traverse from right to left using IntStream
        IntStream.range(0, n - 1)
                 .map(i -> n - 2 - i) // reverse index
                 .forEach(i -> {
                     if (arr[i] > maxFromRight.get()) {
                         leaders.add(arr[i]);
                         maxFromRight.set(arr[i]);
                     }
                 });
        
        Collections.reverse(leaders);
        return leaders;
    }
}
