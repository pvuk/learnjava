package com.practice.java.inheritance.examples;

import com.java.inheritance.examples.InterfaceTwo;

public interface InterfaceOne extends InterfaceTwo{

	void methodOne();

	default void log(String str) {
		System.out.println("InterfaceOne Logging:: " + str);
	}
}
