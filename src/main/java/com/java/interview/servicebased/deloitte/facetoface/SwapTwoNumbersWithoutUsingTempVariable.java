package com.java.interview.servicebased.deloitte.facetoface;

import java.util.Arrays;

/**
 * Others Question
 * 
 * @author P V UdayKiran
 *
 * @Date Sun 08-Dec-2019 11:34
 * @version: %I%
 */
public class SwapTwoNumbersWithoutUsingTempVariable {
	public static void main(String[] args) {
//		usingIntArray();// x
		usingInt();
		usingSingleIntArray();
		usingMultiplicationAndDivision();
	}

	private static void usingMultiplicationAndDivision() {
		System.out.println("--usingMultiplicationAndDivision--");
		int x = 4, y = 5;
		System.out.println("Swapping: x = " + x + ", y = " + y);
		x = x * y;
		y = x / y;
		x = x / y;
		System.out.println("After Swapping: x = " + x + ", y = " + y);
	}

	private static void usingSingleIntArray() {
		System.out.println("--usingSingleIntArray--");
		int[] swap = { 5, 6 };
		System.out.println("Swapping: " + Arrays.toString(swap));
		swap[0] = swap[0] + swap[1];
		swap[1] = swap[0] - swap[1];
		swap[0] = swap[0] - swap[1];
//		System.out.println("After Swapping: " + Arrays.toString(swap));
		
		// or
//		numbers = { 4, 5 };//Error. Array constants can only be used in initializers. For int value this error is not come.
//		System.out.println("After Swapping: " + ((numbers[0] + numbers[0 + 1]) - numbers[0]) +", "+ ((numbers[0] + numbers[0 + 1]) - numbers[1]));// Swapping is done, but array is not update!.
		
		// or
		int iMax = swap.length - 1;
		if (iMax == -1) {
			System.out.println("After Swapping: []");
		} else {
			StringBuilder builder = new StringBuilder();
			builder.append("[");
			for (int i = 0;; i++) {
				builder.append(swap[i]);
				if (i == iMax) {
					builder.append("]");
					break;
				}
				builder.append(", ");
			}
			System.out.println("After Swapping: " + builder.toString());
		}
	}

	private static void usingInt() {
		System.out.println("--usingInt--");
		int x = 4, y = 5;
		System.out.println("Swapping: x = " + x + ", y = " + y);
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("After Swapping: x = " + x + ", y = " + y);
//		x System.out.println("After Swapping: x = " + (x + y - x) + ", y = " + (x + y - y));// Swapping is done, but x, y is not update!.
	}

}
