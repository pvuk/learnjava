package com.practice.java.encapsulation.examples;

public class EncapsulationExample {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) {
		EncapsulationExample eExample = new EncapsulationExample();
		eExample.name = "Hello";
	}
}
