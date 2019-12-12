package com.practice.java.inheritance.examples;

public class ChildClassTwo extends BaseClass {
	@Override
	public void printValue(int num) {
		System.out.println("Print in ChildClassTwo: " + num);
//		super.printValue(num);
	}
	
	@Override
	public void accesBaseClassMethod() {
		super.accesBaseClassMethod();
	}
}
