package com.java.generics.examples;
/**
 * 
 * @author VenkataUdayKiranP
 * 
 * Using Generic Function
 *
 */
public class GenericFunctionExample {

	static <T> void display(T element) {
		System.out.println(element.getClass().getName() + " = " + element);
	}

	public static void main(String[] args) {
		display(16);
		display("formula");
		display(7.0);
	}
}