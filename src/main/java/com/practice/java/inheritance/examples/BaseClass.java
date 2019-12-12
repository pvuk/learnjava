package com.practice.java.inheritance.examples;

public class BaseClass {
	public void printValue(int num) {
		System.out.println("Print in BaseClass: " + num);
	}
	
	public void accesBaseClassMethod() {
		System.out.println("accesBaseClassMethod");
	}
	
	public static void main(String[] args) {
		ChildClassOne ccOne = new ChildClassOne();
		ccOne.printValue(1);
		
		ChildClassTwo ccTwo = new ChildClassTwo();
		ccTwo.printValue(2);
		
		ChildClassThree ccThree = new ChildClassThree();
		ccThree.printValue(3);
		
		BaseClass bClass = new BaseClass();
		bClass.printValue(4);
		
		BaseClass baseClass = new ChildClassOne();
		baseClass.printValue(5);
		
		baseClass = new ChildClassTwo();
		baseClass.printValue(6);
		
		baseClass = new ChildClassThree();
		baseClass.printValue(7);
		
		/**
		 * Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
			Type mismatch: cannot convert from BaseClass to ChildClassOne
		 */
//		ChildClassOne childClassOne = new BaseClass();
	}
}
