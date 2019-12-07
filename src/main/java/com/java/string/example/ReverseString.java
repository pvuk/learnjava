package com.java.string.example;

public class ReverseString {
	public static void main(String[] args) {
		String str = "Reverse", reverse = "";
		for (int i = str.length() - 1; i > -1; i--) {
			reverse += str.charAt(i);
		}
		System.out.println(reverse);

		System.out.println("Using recursion / without using predefined methods");
		printReverse(str, str.length() - 1);

		System.out.println("\nWith Single Parameter: Using recursion / without using predefined methods");
		System.out.println(printReverse(str));
	}

	static void printReverse(String s, int pos) {
		if (pos > -1) {
			System.out.print(s.charAt(pos));
			printReverse(s, pos - 1);
		}
	}

	private static String printReverse(String str) {
		if (str.length() == 0) {
			return "";
		}
		return str.charAt(str.length() - 1) + printReverse(str.substring(0, str.length() - 1));
	}
}
