package com.java.interview;

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
		System.out.println(sb.toString());
	}

	private static int recursiveAppendAlphabetCombination(int i, int combinationCount, StringBuilder sb) {
		if (combinationCount > 3) {
			return i;
		}
		sb.append((char) (i + combinationCount));
		return recursiveAppendAlphabetCombination(i, combinationCount + 1, sb);
	}
}
