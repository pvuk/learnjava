package com.java.loop.pattern;

/**
 * @author Venkata.Pulipati
 * @since Friday 03-October-2025 08:33:54
 */
public class SquarePattern {
	public static void main(String[] args) {
		int pattern = 5;//5x5
		for(int i = 0; i < pattern; i++) {
			System.out.print("*");//top line
		}
		System.out.println("");
		
		int k = 0;
		while(k != pattern) {
			for(int j = 0; j < pattern; j++) {
				if(j == 0 || j == pattern-1) {
					System.out.print("*");//left, right lines
				} else {
					System.out.print(" ");
				}
			}
			k++;
			System.out.println("");
		}
		
		for(int l = 0; l < pattern; l++) {
			System.out.print("*");//bottom line
		}
	}
}
