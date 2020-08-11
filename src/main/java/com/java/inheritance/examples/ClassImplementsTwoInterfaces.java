package com.java.inheritance.examples;

import com.practice.java.inheritance.examples.InterfaceOne;

public class ClassImplementsTwoInterfaces implements InterfaceOne, InterfaceTwo {

	@Override
	public void methodTwo() {
		System.out.println("ClassImplementsTwoInterfaces, messeage from methodTwo");
	}

	@Override
	public void methodOne() {
		System.out.println("ClassImplementsTwoInterfaces, messeage from methodOne");
	}

	@Override
	public void log(String str) {
//		System.out.println("ClassImplementsTwoInterfaces Logging:: " + str);
		InterfaceOne.super.log(str);
	}
	
	public static void main(String[] args) {
		ClassImplementsTwoInterfaces myClass = new ClassImplementsTwoInterfaces();
		myClass.log("MyClass");
		
		InterfaceOne iOne = new ClassImplementsTwoInterfaces();
		iOne.methodOne();
		iOne.log("Assign ClassImplementsTwoInterfaces to InterfaceOne Logging::");

		InterfaceTwo iTwo = new ClassImplementsTwoInterfaces();
		iTwo.methodTwo();
		iTwo.log("Assign ClassImplementsTwoInterfaces to InterfaceTwo Logging::");
		//why this log access InterfaceOne log method instead of InterfaceTwo log method ?
		
	}
}
