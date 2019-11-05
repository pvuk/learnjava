package com.practice.java.inheritance.examples;

class A {
	public static int a;
	
	static {
		a = 20;
	}

	public void setA(int a) {
		A.a = a;
	}
}

class B extends A {
	public int a = 10;
}

public class InheritanceDataAccess {
	public static void main(String args[]) {
		A p = new B();
		p.setA(100);// why static value is changed from 20 to 100 even though one static variable per class.
		System.out.println("p.a = " + p.a);
	}
}
