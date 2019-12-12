package com.practice.java.inheritance.examples;

public class ChildClassOne extends BaseClass {
	@Override
	public void printValue(int num) {
		System.out.println("Print in ChildClassOne: " + num);
//		super.printValue(num);
	}
}
