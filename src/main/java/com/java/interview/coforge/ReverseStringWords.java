package com.java.interview.coforge;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseStringWords {
	public static void main(String[] args) {
		String str = "Hello My Name is Test";
		List<String> asList = Arrays.asList(str.split(" "));
		Collections.reverse(asList);
		System.out.println("Reverse using Collections: "+ asList);
		
		exampleUsingLoop(str);
		
		exampleUsingStreams(str);
		
	}

	private static void exampleUsingStreams(String str) {
		String reverse = Arrays.asList(str.split(" ")).stream().reduce((a, b) -> b +" "+ a).get();
		System.out.println("\nReverse Sentence Using Streams: "+ reverse);
	}

	private static void exampleUsingLoop(String str) {
		String[] words = str.split(" ");
		System.out.println("Reverse Using Loop: ");
		for(int i = words.length - 1 ; i >= 0; i--) {
			System.out.print(" "+ words[i]);
		}
	}
}
