package com.java.twitter.googleindia;

import java.util.Arrays;

public class ArraysFill {
	public static void main(String[] args) {
		int[] values = new int[10];
		Arrays.fill(values, 4);
		for(int val : values) {
			System.out.print(val);
			System.out.print("");
		}
	}
}
