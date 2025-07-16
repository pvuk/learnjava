package com.java.interview.nextlevel;

import java.util.stream.Stream;

/**
 * @author P.V. UdayKiran
 * @version 1
 * @since created on Wed 18-Jun-2025 18:19
 * 
 */
public class FindLongestWordUsingStreams {
	public static void main(String[] args) {
		String word = "Finding longest word in a sentence";
		String longestWord = Stream.of(word.split(" ")).reduce("" , (word1, word2) -> word1.length() > word2.length() ? word1 : word2);
		System.out.println("Longest Word: "+ longestWord);
	}
}
