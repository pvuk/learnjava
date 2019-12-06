package com.java.inheritance.examples;

public interface InterfaceOne {

	void methodOne();

	default void log(String str) {
		System.out.println("InterfaceOne Logging:: " + str);
	}
}
