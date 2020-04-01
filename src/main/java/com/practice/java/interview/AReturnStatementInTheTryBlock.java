package com.practice.java.interview;

/**
 * <p>What happens if you have a return statement in the try block ?</br>
 * > If you have return statement in try block, still finally block executes.</p>
 * 
 * @author P V UdayKiran
 *
 * @Date Tue 31-Mar-2020 19:00
 *
 */
public class AReturnStatementInTheTryBlock {
	public static void main(String[] args) {
		System.out.println(print());
	}

	private static String print() {
		try {
			System.out.println("Executing try block");
			return "Return from try block";
		} finally {
			System.out.println("Executing finally block");
		}

	}
}
