package com.practice.java.abstractclass.examples;

public abstract class HeavyVehicle extends Vehicle {

	@Override
	long speed(long speed) {
		
		return speed;
	}

	@Override
	long cc(long cc) {
		
		return cc;
	}
	
	@Override
	long modelYear() {
		
		return 2018;
	}
	
	@Override
	String modelNumber() {
		return "Oct05";
	}

	abstract String color();

}
