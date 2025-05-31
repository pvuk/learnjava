package com.java.interview.coforge;

@FunctionalInterface
public interface FunctionalCalculate {
	
	//abstract method (Single Abstract Method: SAM)
	int calculate(int a, int b);
	
	//Default methods are accessed through object references, not directly within lambda expressions.
	public default String defaultMethod() {
		return "Default Method";
	}
}
