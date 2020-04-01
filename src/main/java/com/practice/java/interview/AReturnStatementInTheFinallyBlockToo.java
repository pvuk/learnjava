package com.practice.java.interview;

/**
 * <p>What happens if you have a return statement in the finally block too ?</br>
 * > It overrides whatever is returned by try block.</p>
 * 
 * @author P V UdayKiran
 *
 * @Date Tue 31-Mar-2020 19:00
 *
 */
public class AReturnStatementInTheFinallyBlockToo {
	public static void main(String[] args) {
		System.out.println(print());
	}

	private static String print() {
		try {
			System.out.println("Executing try block");
			return "Return from try block";
		} finally {
			System.out.println("Executing finally block");
			return "Return from finally block";
		}
	}
}
