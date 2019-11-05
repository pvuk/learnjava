package com.practice.java.inheritance.interfaces.examples;

public interface BasicCar extends Car {
	
	@Override
	default long speed() {
		
		return 100;
	}
}
