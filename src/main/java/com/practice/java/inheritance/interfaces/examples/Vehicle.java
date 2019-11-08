package com.practice.java.inheritance.interfaces.examples;

public class Vehicle implements Car, Bike {

	@Override
	public long speed() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long gear(long gear) {
		// TODO Auto-generated method stub
		return Bike.super.gear(gear);
	}

}
