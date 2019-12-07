package com.java.inheritance.examples;

public class ClassImplementsTwoInterfaces implements InterfaceOne, InterfaceTwo {

	@Override
	public void methodTwo() {
		System.out.println("ClassImplementsTwoInterfaces methodTwo");
	}

	@Override
	public void methodOne() {
		System.out.println("ClassImplementsTwoInterfaces methodOne");
	}

	@Override
	public void log(String str) {
		InterfaceOne.super.log(str);
	}
	
	public static void main(String[] args) {
		ClassImplementsTwoInterfaces myClass = new ClassImplementsTwoInterfaces();
		myClass.log("MyClass");
		
		InterfaceOne iOne = new ClassImplementsTwoInterfaces();
		iOne.methodOne();
		iOne.log("From ClassImplementsTwoInterfaces InterfaceOne Logging::");

		InterfaceTwo iTwo = new ClassImplementsTwoInterfaces();
		iTwo.methodTwo();
		iTwo.log("From ClassImplementsTwoInterfaces InterfaceTwo Logging::");//why this log access InterfaceOne log method instead of InterfaceTwo log method
	}
}
