package com.java.exception.throwskeyword;

/**
 * 
 * 
 * @author venkataudaykiranp
 *
 */
public class CustomExceptionUsingThrows {
	public static void main(String[] args) {
		CustomExceptionUsingThrows customException = new CustomExceptionUsingThrows();
		try {
			customException.checkProduct(90);
		} catch (InvalidProductException e) {
			System.out.println("Caught exception in parent method.");
			e.printStackTrace();
		}
	}

	/**
	 * <pre>In this <a href="https://beginnersbook.com/2013/04/user-defined-exception-in-java">example</a>
	 * we are throwing an exception from a method. In this case we should use throws
	 * clause in the method signature otherwise you will get compilation error
	 * saying that “unhandled exception in method”. To understand how throws clause
	 * works, refer this guide: <a href="https://beginnersbook.com/2013/04/java-throws/">throws keyword in java.</a>
	 * </pre>
	 * @param weight
	 * @throws InvalidProductException
	 */
	void checkProduct(int weight) throws InvalidProductException {
		if (weight < 100) {
			throw new InvalidProductException("Invalid Product. Product weight under " + weight + " gms");
		}
	}
}
