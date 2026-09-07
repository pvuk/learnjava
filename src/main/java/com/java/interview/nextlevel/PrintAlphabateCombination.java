package com.java.interview.nextlevel;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * 
 * Write a program to print "ABC", "BCD", "CDE", "DEF", ....., "WXY", "XYZ"
 * 
 * @author Priyanka
 * @author P V UdayKiran
 *
 */
public class PrintAlphabateCombination {
	public static void main(String[] args) {
		exampleOne();
		exampleUsingJava8Streams();
		exampleWithoutRecursion();
		generateAlphabetCombinations(5); // change n here
	}

	private static void exampleUsingJava8Streams() {

		// ASCII: A = 65, Z = 90
        String result = IntStream.rangeClosed('A', 'X')   // X ensures XYZ is last
                .mapToObj(start ->
                        IntStream.range(0, 3)
                                .mapToObj(i -> String.valueOf((char) (start + i)))
                                .collect(Collectors.joining())
                )
                .collect(Collectors.joining(", "));

        System.out.println("Java8 Streams: "+ result);

	}

	private static void exampleOne() {
		StringBuilder sb = new StringBuilder();
		// char 65 = "A", char 90 = "Z"
		for (int i = 64; i < 90; i++) {
			// char 87 = X, i increment upto 3 i.e 90 = Z
			if (i < 88) {
				i = recursiveAppendAlphabetCombination(i, 1, sb);// using recursive method
				// char 88 = X, avoid comma append
				if (i < 87) {
					sb.append(", ");
				}
			}
		}
		System.out.println("Using Recursion: "+ sb.toString());
	}

	private static void exampleWithoutRecursion() {
        StringBuilder sb = new StringBuilder();

        // ASCII: A = 65, Z = 90
        for (int i = 'A'; i <= 'X'; i++) {
            for (int j = 0; j < 3; j++) {
                sb.append((char) (i + j));
            }
            if (i < 'X') {
                sb.append(", ");
            }
        }

        System.out.println("Without Recursion: "+ sb.toString());
    }


	private static void generateAlphabetCombinations(int n) {

        String result = IntStream
                .rangeClosed('A', 'Z' - n + 1)
                .mapToObj(start ->
                        IntStream.range(0, n)
                                .mapToObj(i -> String.valueOf((char) (start + i)))
                                .collect(Collectors.joining())
                )
                .collect(Collectors.joining(", "));

        System.out.println("Dynamic Size '"+ n +"': "+ result);
    }

	private static int recursiveAppendAlphabetCombination(int i, int combinationCount, StringBuilder sb) {
		if (combinationCount > 3) {
			return i;
		}
		sb.append((char) (i + combinationCount));
		return recursiveAppendAlphabetCombination(i, combinationCount + 1, sb);
	}
}
