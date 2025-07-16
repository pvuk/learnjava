package com.java.interview.nextlevel;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author P.V. UdayKiran
 * @version 1
 * @since created on Wed 18-Jun-2025 09:22
 * 
 */
public class ReverseStringUsingStreams {
	public static void main(String[] args) {
		String str = "String";
		char[] charArray = str.toCharArray();
		int length = charArray.length;
		IntStream.range(0, length).mapToObj(i -> charArray[(length - 1) - i]).forEach(System.out::print);
		
		System.out.print("\n//Example 2: ");
		IntStream.range(0, length)
		.map(i -> length - 1 - i)
		.mapToObj(i -> str.charAt(i)).forEach(System.out::print);
		
		String reverseString = str.chars()// Convert to IntStream of character codes
				.mapToObj(c -> String.valueOf((char) c))// Map to Stream of Characters
				.reduce("", (reversed, character) -> {// Reduce by prepending each character
					return character + reversed;//S"", tS, rtS, irtS, nirtS, gnirtS
				});
		System.out.println("\nReverse: "+ reverseString);
		
		String reduceStream = Stream.of(str.split("")).reduce("", (reversed, character) -> character + reversed);
		System.out.println("\nStream Reverse: "+ reduceStream);
		
		String words = "Reverse words Using Java";
		String reverseWords = Stream.of(words.split(" ")).reduce("", (reversed, character) -> character +" "+ reversed);
		System.out.println("\nStream Reverse Words: "+ reverseWords);
	}
}
