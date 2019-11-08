package com.practice.java.inheritance.interfaces.examples;

public interface Car {
	
	abstract long speed();
	
	default long gear(long gear) {
		return 1;
	}
}
