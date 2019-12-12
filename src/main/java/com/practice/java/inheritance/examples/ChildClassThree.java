package com.practice.java.inheritance.examples;

public class ChildClassThree extends ChildClassTwo {
	
	public void printValue(int num) {
		System.out.println("Print in ChildClassThree: " + num);
	};
	
	public ChildClassThree() {
		accesBaseClassMethod();
	}
}
