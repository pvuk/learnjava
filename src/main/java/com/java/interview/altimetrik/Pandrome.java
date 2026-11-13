package com.java.interview.altimetrik;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Here are 5 test cases for the Palindrome Checker (ignore spaces, punctuation and case):

	#	Input	Cleaned	Output
	1	madam	madam	true
	2	race car	racecar	true
	3	race a car	raceacar	false
	4	A man, a plan, a canal: Panama	amanaplanacanalpanama	true
	5	Hello, World!	helloworld	false
	
	Code Ref: Interview:
	Your current code won’t handle these correctly:
	
	sc.next() reads only the first word, so race a car becomes race. Use sc.nextLine().
	It never strips spaces or punctuation, and it never ignores case.

 * @author PULIPATI VENKATA UDAYKIRAN
 * @since Friday 13-November-2026 12:53:11
 */
public class Pandrome {
	public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
			String input = sc.nextLine();//sc.next() reads only up to the first space. Use sc.nextLine() to get the whole line.
			System.out.println(checkPalindrome(input));
			
			StringBuilder sb = new StringBuilder(Arrays.asList(input.split("")).stream().reduce("", (a, b) -> b + a));
			System.out.println(sb.toString().equals(input));
		}
    }
	
    public static boolean checkPalindrome(String input) {
        String cleaned = input.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        return new StringBuilder(cleaned).reverse().toString().equals(cleaned);
    }
    
    /**
     * 1. Two-pointer (no extra memory, best for interviews)
     * 
     * @author PULIPATI VENKATA UDAYKIRAN
     * @since Friday 13-November-2026 12:57:05
     * @param input
     * @return
     */
    public static boolean checkPalindrome_TwoPointer(String input) {
        int left = 0, right = input.length() - 1;
        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(input.charAt(left))) left++;
            while (left < right && !Character.isLetterOrDigit(input.charAt(right))) right--;
            if (Character.toLowerCase(input.charAt(left)) != Character.toLowerCase(input.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    /**
     * 2. Java 8 Streams
     * 
     * @author PULIPATI VENKATA UDAYKIRAN
     * @since Friday 13-November-2026 13:01:58
     * @param input
     * @return
     */
    public static boolean checkPalindrome_streams(String input) {
        String cleaned = input.chars()
                .filter(Character::isLetterOrDigit)
                .map(Character::toLowerCase)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
        return IntStream.range(0, cleaned.length() / 2)
                .allMatch(i -> cleaned.charAt(i) == cleaned.charAt(cleaned.length() - 1 - i));
    }
    
    /**
     * 3. Recursion
     * 
     * @author PULIPATI VENKATA UDAYKIRAN
     * @since Friday 13-November-2026 13:02:09
     * @param input
     * @return
     */
    public static boolean checkPalindrome_recursion(String input) {
        String cleaned = input.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        return isPal(cleaned, 0, cleaned.length() - 1);
    }

    private static boolean isPal(String s, int left, int right) {
        if (left >= right) return true;
        if (s.charAt(left) != s.charAt(right)) return false;
        return isPal(s, left + 1, right - 1);
    }
    
    /**
     * 4. Character array with a for loop
     * 
     * @author PULIPATI VENKATA UDAYKIRAN
     * @since Friday 13-November-2026 13:02:18
     * @param input
     * @return
     */
    public static boolean checkPalindrome_characterArrayWithAForLoop(String input) {
        char[] chars = input.replaceAll("[^A-Za-z0-9]", "").toLowerCase().toCharArray();
        for (int i = 0; i < chars.length / 2; i++) {
            if (chars[i] != chars[chars.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
    
    /**
     * 5. IntStream.range with noneMatch
     * 
     * @author PULIPATI VENKATA UDAYKIRAN
     * @since Friday 13-November-2026 13:03:57
     * @param input
     * @return
     */
    public static boolean checkPalindrome_IntStreamRange(String input) {
        String s = input.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        int n = s.length();
        return IntStream.range(0, n / 2)
                .noneMatch(i -> s.charAt(i) != s.charAt(n - 1 - i));
    }
    
    /**
     * 6. Filter, then Collectors.joining
     * 
     * @author PULIPATI VENKATA UDAYKIRAN
     * @since Friday 13-November-2026 13:06:37
     * @param input
     * @return
     */
    public static boolean checkPalindrome_CollectorsJoining(String input) {
        String cleaned = input.chars()
                .filter(Character::isLetterOrDigit)
                .mapToObj(c -> String.valueOf((char) Character.toLowerCase(c)))
                .collect(Collectors.joining());
        return cleaned.equals(new StringBuilder(cleaned).reverse().toString());
    }
    
    /**
     * 7. Reverse by streaming the characters backwards
     * 
     * @author PULIPATI VENKATA UDAYKIRAN
     * @since Friday 13-November-2026 13:07:38
     * @param input
     * @return
     */
    public static boolean checkPalindrome_ReverseByStreamingTheCharactersBackwards(String input) {
        String s = input.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        String reversed = IntStream.range(0, s.length())
                .mapToObj(i -> String.valueOf(s.charAt(s.length() - 1 - i)))
                .collect(Collectors.joining());
        return s.equals(reversed);
    }
    
    /**
     * 8. Compare the first half with the reversed second half
     * 
     * @author PULIPATI VENKATA UDAYKIRAN
     * @since Friday 13-November-2026 13:09:06
     * @param input
     * @return
     */
    public static boolean checkPalindrome_CompareFirstHalfWithReversedSecondHalf(String input) {
        String s = input.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        int half = s.length() / 2;
        String first = s.substring(0, half);
        String second = new StringBuilder(s.substring(s.length() - half)).reverse().toString();
        return first.equals(second);
    }
    
    /**
     * 9. Reverse the string with reduce
     * 
     * @author PULIPATI VENKATA UDAYKIRAN
     * @since Friday 13-November-2026 13:12:16
     * @param input
     * @return
     */
    public static boolean checkPalindrome_ReverseStringWithReduce(String input) {
        String s = input.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        String reversed = Arrays.stream(s.split(""))
                .reduce("", (a, b) -> b + a);
        return s.equals(reversed);
        //or
//      String reduce = Arrays.asList(s.split("")).stream().reduce("", (a, b) -> b + a);
//      return s.equals(reverse);
    }
    
    /**
     * 10. Reduce the character comparisons to one boolean
     * 
     * @author PULIPATI VENKATA UDAYKIRAN
     * @since Friday 13-November-2026 13:16:48
     * @param input
     * @return
     */
    public static boolean checkPalindrome_ReduceCharacterComparisonsToOneBoolean(String input) {
        String s = input.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        int n = s.length();
        return IntStream.range(0, n / 2)
                .mapToObj(i -> s.charAt(i) == s.charAt(n - 1 - i))
                .reduce(true, (a, b) -> a && b);
    }
}
