package com.java.interview;

/**
 * <a href="https://www.geeksforgeeks.org/java-program-to-check-whether-a-string-is-a-palindrome/">Java implementation of the approach</a>
 * 
 * @author venkataudaykiranp
 * @version 1, changes on Fri 24-Jan-2020 11:28
 */
public class CheckStringPalindrome {

	// Function that returns true if
	// str is a palindrome
	static boolean isPalindrome(String str) {

		// Pointers pointing to the beginning
		// and the end of the string
		int i = 0, j = str.length() - 1;

		// While there are characters toc compare
		while (i < j) {

			// If there is a mismatch
			if (str.charAt(i) != str.charAt(j))
				return false;

			// Increment first pointer and
			// decrement the other
			i++;
			j--;
		}

		// Given string is a palindrome
		return true;
	}

	// Driver code
	public static void main(String[] args) {
		String str = "geeks";// abba

		if (isPalindrome(str))
			System.out.print("Yes");
		else
			System.out.print("No");
	}

	/**
	 * Java program to illustrate checking of a string if its palindrome or not using reverse function
	 * @param s
	 */
	public static void checkPalindrome(String s) {
		// reverse the given String
		String reverse = new StringBuffer(s).reverse().toString();

		// check whether the string is palindrome or not
		if (s.equals(reverse))
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}