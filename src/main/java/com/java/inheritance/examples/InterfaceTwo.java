package com.java.inheritance.examples;

public interface InterfaceTwo {

	void methodTwo();

	default void log(String str) {
		System.out.println("InterfaceTwo Logging:: " + str);
	}
}
