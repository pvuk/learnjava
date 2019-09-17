package com.java.interview.productbased.ibm;

public class ExceptionCatchExample {
	public static void main(String[] args) {
		try {
			int x = 5 / 0;
		} catch (Exception ex) {
			System.out.print("Exception ");
		} 
//		catch(ArithmeticException ex) {
//			System.err.println("ArithmeticException");
//		}
		System.out.println("output");
		//Ans: Compilation error
	}
}
