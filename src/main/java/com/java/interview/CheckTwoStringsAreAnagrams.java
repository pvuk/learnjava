package com.java.interview;

import java.util.Arrays;

/**
 * @author PULIPATI VENKATA UDAYKIRAN
 * @since Thursday 24-September-2026 14:26:08
 */
public class CheckTwoStringsAreAnagrams {
	public static void main(String[] args) {
		//Check if two Strings are Anagrams
		String a = "nat", b = "tan";
		System.out.println("Two Strings a -> "+ a +", b -> "+ b +"  are Anagram: true / false: "+ isAnagram(a, b));
	}
	public static boolean isAnagram(String a, String b) {
	    char[] x = a.toCharArray(), y = b.toCharArray();
	    Arrays.sort(x); Arrays.sort(y);
	    return Arrays.equals(x, y);
	}
}
