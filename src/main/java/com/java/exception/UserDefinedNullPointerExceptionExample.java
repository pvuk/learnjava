package com.java.exception;

/**
 * Explanation: You can see that while throwing custom exception I gave a string
 * in parenthesis ( throw new UserDefinedNullPointerException("\"null\" string access exception.");). That’s
 * why we have a parameterized constructor (with a String parameter) in my
 * custom exception class.
 * 
 * @author venkataudaykiranp
 *
 */
public class UserDefinedNullPointerExceptionExample {

	public static void main(String[] args) {
		try {
			System.out.println("try block");
			String value = "null";
			if (value.equals("null"))
				// I'm throwing the custom exception using throw
				throw new UserDefinedNullPointerException("\"null\" string access exception.");
		} catch (UserDefinedNullPointerException udnpe) {
			System.out.println("Catch block");
			System.err.println(udnpe);
		}
	}
}
