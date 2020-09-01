package com.java.interview.productbased.navionics;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 
 * @author venkataudaykiranp
 * @version 1, changes on Tue 03-Dec-2019 08:57
 */
public class SecondHighestNumberFromIntArray {
	public static void main(String[] args) {
		int[] arr = { 100, 14, 26, 94, 15, 16, 25, 94, 56, 41, 58, 94, 66, 86, 84, 9 };
		System.out.println("Array: "+ Arrays.toString(arr) +", size: "+ arr.length);
		
		usingJava8ArrayStreamFindingSecondLargestNumber(arr);
		
		usingSwappingFindSecondLargestNumber(arr);
		
		print2largest(arr, arr.length);
	}
	
	private static void usingJava8ArrayStreamFindingSecondLargestNumber(int[] arr) {
		List<Integer> list = Arrays.stream(arr).sorted().boxed().collect(Collectors.toList());
//		List<Integer> list = IntStream.of(arr).boxed().collect(Collectors.toList());
		System.out.println("Second Highest Number from int[] Using Java8 Arrays Stream: " + list.get(list.size() - 2));
	}

	private static void usingSwappingFindSecondLargestNumber(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				/**
				 * 1. Exception handling ArrayIndexOutOfBoundsException
				 * 2. if(j < arr.length-1) to check last before index position arr[j+1]
				 * 3. if array size = 16, index start from 0 to 15
				 */
				if(j < arr.length-1) {
					int temp;
					//Swaping numbers
					if (arr[j] > arr[j + 1]) {
						temp = arr[j+1];
						arr[j+1] = arr[j];
						arr[j] = temp;
						
					}
				}
			}
		}
		System.out.println("Second Highest Number from int[] Using Inner forloop: "+ arr[arr.length - 2]);
	}

	/** 
	 * 1. Method to print the second largestelements
	 * 2. <a href="https://www.geeksforgeeks.org/find-second-largest-element-array/#tablist1-tab2">Find Second largest element in an array</a>
	 *
	 */
    public static void print2largest(int arr[],  
                                     int arr_size) 
    { 
        int i, first, second; 
       
        /* There should be atleast two elements */
        if (arr_size < 2) 
        { 
            System.out.print(" Invalid Input "); 
            return; 
        } 
       
        first = second = Integer.MIN_VALUE; 
        for (i = 0; i < arr_size ; i++) 
        { 
            /* If current element is smaller than  
            first then update both first and second */
            if (arr[i] > first) 
            { 
                second = first; 
                first = arr[i]; 
            } 
       
            /* If arr[i] is in between first and  
               second then update second  */
            else if (arr[i] > second && arr[i] != first) 
                second = arr[i]; 
        } 
          
        if (second == Integer.MIN_VALUE) 
             System.out.print("There is no second largest"+ 
                                 " element\n"); 
        else
             System.out.print("The second largest element"+ 
                                      " is "+ second); 
    }
}
