package com.practice.java.array.compare;

/**
 * 
 * @author P V UdayKiran
 *
 * @version 1, changes on Mon 25-Nov-2019 20:47
 */
public class CompareArrayAndFilterDuplicateValues {

	public static void main(String[] args) {
		int[] a = { 1, 4, 6, 8, 10, 14 };
		int[] b = { 4, 14, 24, 51, 68, 72 };

		int[] filterValues = new int[a.length + b.length];// initialization of filterValues array size
		int[] duplicateValues = new int[a.length + b.length];
		boolean containDuplicateValues = false, filterDuplicateValue = true;

		System.out.println("Array a : " + printArrayValues(a));
		System.out.println("Array b : " + printArrayValues(b));

		int indexFilterArray = 0, indexDuplicateArray = 0;

		//--------------------- Filter Duplicate Values ----------------------//
		// a size 5, if i = 0; i < 5 or i = 1; i <=5 condition should be applied
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					duplicateValues[indexDuplicateArray] = b[j];// learn how to increase array size dynamically
					indexDuplicateArray++;
					containDuplicateValues = true;
					break;
				}
			}
			filterValues[indexFilterArray] = a[i];
			indexFilterArray++;
		}
		
		//--------------------- Join Two Arrays without Duplicate Values ----------------------//
		if (containDuplicateValues) {
			for(int k = 0; k < b.length; k++) {
				filterDuplicateValue = true;
				for(int l = 0; l < duplicateValues.length; l++) {
					if(b[k] == duplicateValues[l]) {
						filterDuplicateValue = false;
					}
				}
				if(filterDuplicateValue) {
					filterValues[indexFilterArray] = b[k];
					indexFilterArray++;
				}
			}
		}
		
		System.out.println("Filter Values: " + printArrayValues(filterValues));
		System.out.println("Duplicate Values: " + printArrayValues(duplicateValues));
	}

	/**
	 * 
	 * @param arrayValues
	 * @return stringValuesWithCommaSeparated
	 */
	private static String printArrayValues(int[] arrayValues) {
		String stringValuesWithCommaSeparated = "";
		int index = arrayValues.length, i = 0;
		while(i < index) {
			stringValuesWithCommaSeparated += i == 0 ? ""+ arrayValues[i] : ", "+ arrayValues[i];// find difference between += and =+
			i++;
		}
		//try recursive loop
//		return "" + arrayValues[1 + arrayValues.length - arrayValues.length] +","+ printArrayValues(arrayValues);
		return stringValuesWithCommaSeparated;
	}
}
