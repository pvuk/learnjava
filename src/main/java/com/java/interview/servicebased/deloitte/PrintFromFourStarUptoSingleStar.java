package com.java.interview.servicebased.deloitte;

/**
 * 
 * @author venkataudaykiranp
 * 
 * <p>     
 * write a program to print below pattern </br>
 *         **** </br> 
 *         *** </br>
 *         ** </br>
 *         * </br>
 * </p>
 *
 */
public class PrintFromFourStarUptoSingleStar {
	public static void main(String[] args) {
		int n = 4;
		usingForLoopWithInnerForLoop(n);
		usingForLoopWithInnerWhileLoop(n);
		usingWhileLoopWithInnerForLoop(n);
		usingDoWhileLoopWithInnerForLoop(n);
		usingDoWhileLoopWithInnerWhileLoop(n);
	}

	/**
	 * best practice
	 * @param n
	 */
	private static void usingForLoopWithInnerForLoop(int n) {
		System.out.println("usingForLoopWithInnerForLoop");
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	private static void usingForLoopWithInnerWhileLoop(int n) {
		System.out.println("usingForLoopWithInnerWhileLoop");
		for (int i = 0, j = 0; i < n; i++) {
			while (i < n) {
				if (j < n) {
					System.out.print("*");
					j++;
				} else {
					break;
				}
			}
			j = i + 1;
			System.out.println("");
		}
	}
	
	/**
	 * best practice
	 * @param n
	 */
	private static void usingWhileLoopWithInnerForLoop(int n) {
		System.out.println("usingWhileLoopWithInnerForLoop");
		int i = 0, j = 0;
		while (i < n) {
			for (j = i; j < n; j++) {
				System.out.print("*");
			}
			System.out.println("");
			i++;
		}
	}
	
	private static void usingDoWhileLoopWithInnerForLoop(int n) {
		System.out.println("usingDoWhileLoopWithInnerForLoop");
		int i = 0, j = 0;
		do {
			for (j = i; j < n; j++) {
				System.out.print("*");
			}
			System.out.println("");
			i++;
		} while (i < n);
	}
	
	private static void usingDoWhileLoopWithInnerWhileLoop(int n) {
		System.out.println("usingDoWhileLoopWithInnerWhileLoop");
		int i = 0, j = 0;
		do {
			while(j < n) {
				System.out.print("*");
				j++;
			}
			j = i + 1;
			System.out.println("");
			i++;
		} while (i < n);
	}
}
