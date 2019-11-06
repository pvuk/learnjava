package com.practice.java.polymorphism.examples;

public class MethodOverloadingExample {
	public static void main(String[] args) {
		Integer sum = getSumOfTwoNumbers(10, 20);
		System.out.println(sum);
//		Long sumL = getSumOfTwoNumbers(10, 20);
//		System.out.println(sumL);
	}

	private static int getSumOfTwoNumbers(int i, int j) {
		return i + j;
	}
}
