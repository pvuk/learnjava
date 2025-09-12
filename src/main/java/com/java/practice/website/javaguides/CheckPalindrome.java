package com.java.practice.website.javaguides;
/**
 * Palindrome Check: A recursive method checks if the string is a palindrome by comparing the first and last characters, then moving inward. 
 * If all characters match, the string is a palindrome.
 * 
 * Are palindromes (read the same forward and backward).
 * 
 * 
 * | Feature     | reduce()                                         | collect()                                         |
|------------|--------------------------------------------------|--------------------------------------------------|
| Purpose     | Combines elements into a single result           | Accumulates elements into a mutable container    |
| Return Type | Single value (e.g., int, String, custom object)  | Usually a collection (e.g., List, Map, Set)      |
| Use Case    | Summing, finding max/min, merging objects        | Grouping, partitioning, mapping, collecting      |
| Mutability  | Immutable (usually)                              | Mutable (can use mutable containers)             |

 */
public class CheckPalindrome {
	public static void main(String[] args) {
		String example1 = "level";
		/**
		 * Code Ref:
		 * Example with int:
			int charValue = 65;
			String result = String.valueOf((char) charValue); // "A"
			
			🔹 Why cast to char?
			charValue holds a numeric representation of a character (e.g., ASCII or Unicode).
			Casting it to char converts it to the actual character.
			String.valueOf(char) then converts that character to a String.
		 */
		String reduceExample = example1.chars().mapToObj(charValue -> String.valueOf((char) charValue))//Converting unicode value to character
			.reduce("", (addOfValuesHereCome, nextValueHereCome) -> nextValueHereCome + addOfValuesHereCome);//l + "" > e + l"" > v + el" > e + vel" > l + evel"
		System.out.println("Example 1: Given string: "+ example1 +", reversing string: "+ reduceExample +". If both are same it is palindrome: "+ example1.equals(reduceExample));
		System.out.println("");
		
		String example2 = "hello";
		boolean isPalindrome = isPalindrome(example2);
		System.out.println("Example 2: Given string: "+ example2 +" > is "+ (isPalindrome ? "Palindrome" : "not a Palindrome"));
		System.out.println("");
		
		example2 = "racecar";
		isPalindrome = isPalindrome(example2);
		System.out.println("Example 2: Given string: "+ example2 +" > is "+ (isPalindrome ? "Palindrome" : "not a Palindrome"));
		System.out.println("");

		example2 = "otto";//even count word
		isPalindrome = isPalindrome(example2);
		System.out.println("Example 2: Given string: "+ example2 +" > is "+ (isPalindrome ? "Palindrome" : "not a Palindrome"));
		System.out.println("");
	}

	private static boolean isPalindrome(String string) {
		int length = string.length();
		for(int i = 0; i < length / 2; i++) {
			//checks both sides of string, if not equal then it is not a palindrome
			System.out.println(string.charAt(i) +"=="+ string.charAt(length - i - 1) +", Half Length: "+ length / 2 +", Count: "+ i);
			if(string.charAt(i) != string.charAt(length - i - 1)) {
				return false;
			}
		}
		return true;
	}
}
