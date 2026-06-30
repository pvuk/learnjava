package com.java.interview.integer.examples;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * <p>
 * 1. Move all zero's to end of array without changing the order of non-zero values.
 * Ex: Convert [1, 0, 2, 4, 6, 0, 0, 4, 8, 4, 0, 6, 7, 0, 11, 2, 0, 55, 1, 64, 0, 1, 0, 3, 8, 62, 10, 5, 0, 6, 0, 9, 22]
 * to 
 * [1, 2, 4, 6, 4, 8, 4, 6, 7, 11, 2, 55, 1, 64, 1, 3, 8, 62, 10, 5, 6, 9, 22, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
 * side.
 * </p>
 * 
 * @author venkataudaykiranp
 * @version 1, changes on Tue 10-Dec-2019 13:22
 */
public class MoveAllZeroToEndOfArray {
	public static void main(String[] args) {
		int[] arr = { 1, 0, 2, 4, 6, 0, 0, 4, 8, 4, 0, 6, 7, 0, 11, 2, 0, 55, 1, 64, 0, 1, 0, 3, 8, 62, 10, 5, 0, 6, 0, 9, 22 };
		System.out.println("Array: \n" + Arrays.toString(arr) +"\n");
		
//		Code Ref: 👉 In Java, arrays are passed by reference (value of reference), so when the first method modifies arr, the second method gets the already modified (sorted/changed) array.
//		usingMultipleLoops(arr);// modifies arr
//		usingSingleLoop(arr);// receives already modified arr ❗
		
//		Code Ref: ✅ Quick Interview One‑liner
//		Arrays are mutable and passed by reference in Java, so modifications in one method affect the original array. To avoid this, pass a clone of the array.
//		🔹 Fix Option : Pass a Copy (Best Practice ✅)
//		✔ This ensures each method gets a fresh copy
//		✔ Original array remains unchanged
		usingMultipleLoops(arr.clone());
		usingSingleLoop(arr.clone());//Time Complexity O(n)
		
		usingStreams(arr.clone());//Time Complexity using Streams concat O(n)
	}

	private static void usingStreams(int[] arr) {
		//Code Ref: Interview: 👉 The rule of thumb: never reuse a stream. If you need the data multiple times, collect it into a collection/array first.
//		IntStream nonZeros = Arrays.stream(arr).filter(x -> x != 0);
		int[] result = IntStream.concat(Arrays.stream(arr).filter(x -> x != 0), // non-zeros first
				Arrays.stream(arr).filter(x -> x == 0) // zeros later
				).toArray();
		System.out.println("Move Zero to end of Array using Streams: "+ Arrays.toString(result));
		
		//Example 2
		long zeroCount = Arrays.stream(arr).filter(x -> x != 0).count();//Count zeros
		
		//Fix: The error you’re seeing (IllegalStateException: stream has already been operated upon or closed) happens because Java streams can only be consumed once. In your code, you’re trying to reuse the same IntStream nonZeros twice — once in result and again in result2. 
		//		After the first .toArray() call, that stream is closed and cannot be reused.
//		int[] result2 = IntStream.concat(nonZeros, IntStream.generate(() -> 0).limit(zeroCount)).toArray();
		
		int[] result2 = IntStream.concat(Arrays.stream(arr).filter(x -> x != 0), IntStream.generate(() -> 0).limit(zeroCount)).toArray();
		System.out.println("Move Zero to end of Array using IntStream generate: "+ Arrays.toString(result2));
	}

	/**
	 * | Variable | Purpose                                      |</br>
		|----------|----------------------------------------------|</br>
		| i        | Traverses the array                          |</br>
		| count    | Tracks where next non-zero should be placed  |</br>
		| temp     | Used for swapping                            |</br>
		
		✅ Step-by-Step Traversal</br>
		| i | arr[i] | Action        | count | Array State                               |</br>
		|---|--------|---------------|--------|-------------------------------------------|</br>
		| 0 | 1      | swap(0,0)     | 1      | [1, 0, 2, 4, 6, 0, 0, 4, 8, 4]            |</br>
		| 1 | 0      | skip          | 1      | unchanged                                 |</br>
		| 2 | 2      | swap(2,1)     | 2      | [1, 2, 0, 4, 6, 0, 0, 4, 8, 4]            |</br>
		| 3 | 4      | swap(3,2)     | 3      | [1, 2, 4, 0, 6, 0, 0, 4, 8, 4]            |</br>
		| 4 | 6      | swap(4,3)     | 4      | [1, 2, 4, 6, 0, 0, 0, 4, 8, 4]            |</br>
		| 5 | 0      | skip          | 4      | unchanged                                 |</br>
		| 6 | 0      | skip          | 4      | unchanged                                 |</br>
		| 7 | 4      | swap(7,4)     | 5      | [1, 2, 4, 6, 4, 0, 0, 0, 8, 4]            |</br>
		| 8 | 8      | swap(8,5)     | 6      | [1, 2, 4, 6, 4, 8, 0, 0, 0, 4]            |</br>
		| 9 | 4      | swap(9,6)     | 7      | [1, 2, 4, 6, 4, 8, 4, 0, 0, 0]            |</br>

	 * @author Venkata.Pulipati
	 * @since Monday 11-May-2026 11:30:49
	 * @param arr
	 */
	private static void usingSingleLoop(int[] arr) {
		
		int[] arr2 = arr.clone();
		
		int temp, count = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] != 0) {
				temp = arr[count];
				arr[count] = arr[i];
				arr[i] = temp;
				count += 1;//Tracks where next non-zero should be placed
			}
		}
		System.out.println("usingSingleLoop - After moved all zero's to end of Array: \n" + Arrays.toString(arr) +"\n");
		
		//Example 2
		int index = 0; // Position to place non-zero elements

        // Move non-zeros forward
        for (int num : arr2) {
            if (num != 0) {
            	arr2[index++] = num;
            }
        }

        // Fill remaining with zeros
        while (index < arr2.length) {
        	arr2[index++] = 0;
        }

        System.out.println(Arrays.toString(arr2));
	}

	private static void usingMultipleLoops(int[] arr) {
		for (int i = arr.length - 1; i > -1; i--) {
			for (int j = i; j > -1; j--) {
				//swap two numbers if find zero
				if (arr[j] == 0) {
					int temp;
					//loop for passing zero to last index
					int l = 0;
					for (int k = i - j; k > 0; k--) {
						// before interchanging numbers check array index position.
						if (k > 0) {
							temp = arr[j + l];
							arr[j + l] = arr[j + l + 1];
							arr[j + l + 1] = temp;
						}
						l++;
					}
				}
			}
		}
		System.out.println("usingMultipleLoops - After moved all zero's to end of Array: \n" + Arrays.toString(arr) +"\n");
	}
}
