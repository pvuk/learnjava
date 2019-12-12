package com.practice.java.interview.servicebased.deloitte;

/**
 * Q1. What will be the output of the following code?
 * Ops: A. Compilation error
 * 		B. Derived::show() called
 * 		C. Base::show() called
 * 		D. Derivedsec::show() called
 * Ans: A
 * 
 * @author Priyanka
 *
 * Date: Fri 08-Nov-2019 22:15
 */
public class MultipleInheritanceWithFinalBaseMethodExample {
	public static void main(String[] args) {
//		BaseOne b = new DerivedOne();
//		b.show();
	}
}

//class BaseOne {
//	final void show() {
//		System.out.println("BaseOne::show() called");
//	}
//}
//
//class DerivedOne extends BaseOne{
//	public void show() {
//		System.out.println("DerivedOne::show() called");
//	}
//}
//
//class DerivedOneChild extends DerivedOne{
//	public void show() {
//		System.out.println("DerivedOneChild::show() called");
//	}
//}