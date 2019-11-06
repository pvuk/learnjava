package com.practice.java.inheritance.interfaces.examples;

public interface Bike {
	
	abstract long speed();
	
	default long gear(long gear) {
		return 2;
	}
}
