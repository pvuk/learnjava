package com.java.interview.nextlevel;

import java.util.Arrays;
import java.util.stream.Stream;

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
	}

}
