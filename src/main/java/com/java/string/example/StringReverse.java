package com.java.string.example;

public class StringReverse {
	public static void main(String[] args) {
		String str = "Reverse", reverse = "";
		for (int i = str.length() - 1; i > -1; i--) {
			/*
			 * It depends on the context of what you're trying to achieve.
			- str.charAt(i): This method is ideal if you're working with individual characters in a string without needing to break it into an array. 
			It's efficient because it directly accesses the character at the specified index without extra memory allocation.
			 */
			reverse += str.charAt(i);//efficient coding, consumes less memory
		}
		System.out.println(reverse);

		System.out.println("Using Split");
		String[] split = str.split("");
		reverse = "";//empty
		for(int i = split.length -1; i > -1; i--) {
			/*
			 * - str.split("")[i]: This approach splits the string into an array of characters first, then retrieves the character at index i. 
			 * While this works, it's less efficient because it creates an unnecessary array in memory.
			 */
			reverse += split[i];//less efficient xxx
		}
		System.out.print(reverse);
		
//		Conclusion:
//		For simple character extraction, charAt(i) is the better choice since it avoids the overhead of creating an array. 
		//However, if you're performing additional operations where having an array is useful (such as filtering or mapping), split("") might be more convenient.

		System.out.println("Using recursion / without using predefined methods");
		printReverse(str, str.length() - 1);

		System.out.println("\nWith Single Parameter: Using recursion / without using predefined methods");
		System.out.println(printReverse(str));
		
		// Reverse string using recursion
        String reversedStr = reverseString(str);

        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reversedStr);

		
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
	
	public static String reverseString(String str) {
        if (str.isEmpty()) {
            return str;
        }
        /*
         * 1st time gets from 1 index "everse" when called str.substring(1)
         * 2nd time gets from 1 index "verse" because in recursion it is already return new value
         * String substring(int beginIndex) > substring(beginIndex, length())
         */
        return reverseString(str.substring(1)) + str.charAt(0);
    }
}
