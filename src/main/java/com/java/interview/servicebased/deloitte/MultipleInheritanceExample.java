package com.java.interview.servicebased.deloitte;

public class MultipleInheritanceExample {
	public static void main(String[] args) {
		BaseTwo b = new DerivedTwoChild();
		b.show();
	}
}

class BaseTwo {
	void show() {
		System.out.println("BaseTwo::show() called");
	}
}

class DerivedTwo extends BaseTwo {
	@Override
	public void show() {
		System.out.println("DerivedTwo::show() called");
	}
}

class DerivedTwoChild extends DerivedTwo {
	@Override
	public void show() {
		System.out.println("DerivedTwoChild::show() called");
	}
}