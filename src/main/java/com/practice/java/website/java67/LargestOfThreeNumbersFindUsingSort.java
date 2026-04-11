package com.practice.java.website.java67;

/**
 * @author Venkata.Pulipati
 * @since Tuesday 23-September-2025 12:51:55
 */
public class LargestOfThreeNumbersFindUsingSort {
	public static void main(String[] args) {
		Integer[] numbers = {1, 5, 7, 20, 9, 50, 100};
		//Bubble Sort in descending order
		System.out.println("Bubblesort in descending order: ");
		//Time complexity: O(n²) in worst case
		for(int i = 0; i < numbers.length; i++) {
			for(int j = 0; j < numbers.length - i - 1; j++) {
				if(numbers[j] < numbers[j+1]) {
					int temp = numbers[j];
					numbers[j] = numbers[j+1];
					numbers[j+1] = temp;
				}
			}
		}
		System.out.println("Large Three Numbers: ");
		int k = 0;
		while(k < 3) {
			System.out.print(numbers[k] +(k < 2? ", " : ""));
			k++;
		}
		
		//order of (n)
		//insertion, selection sort
		
	}
}
