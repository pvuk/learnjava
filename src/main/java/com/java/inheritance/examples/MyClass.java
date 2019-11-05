package com.java.inheritance.examples;

public class MyClass implements Interface1, Interface2 {

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void log(String str) {
		// TODO Auto-generated method stub
		Interface1.super.log(str);
	}
	
	public static void main(String[] args) {
		MyClass myClass = new MyClass();
		myClass.log("MyClass");
		
		System.out.println(myClass.equals(new Test()));
	}
}
