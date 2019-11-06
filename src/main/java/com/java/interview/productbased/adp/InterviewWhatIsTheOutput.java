package com.java.interview.productbased.adp;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class InterviewWhatIsTheOutput {
	public static void main(String[] args) {
		A a = new A();
		A b = new B();
		A c = new C();
		log.info("Output: {}, {}, {}", a.i, b.i, c.i);
		//Why output is 5, 5,5
	}
}

@Slf4j
class A{
	public int i = 5;
	public void printMethod(){
		log.info("Calling Printmethod in A");
	}
}

@Slf4j
class B extends A{
	public int i = 10;
	public void printMethod(){
		log.info("Calling Printmethod in B");
	}
}

@Slf4j
class C extends B {
	public int i = 15;
	public void printMethod(){
		log.info("Calling Printmethod in C");
	}
}
