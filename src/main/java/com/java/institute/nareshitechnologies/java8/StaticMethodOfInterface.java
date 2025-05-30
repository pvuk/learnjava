package com.java.institute.nareshitechnologies.java8;

/**
 * @author Priyanka
 * @version 1, created on Sat 29-Aug-2020 16:16
 */
public class StaticMethodOfInterface implements StaticInterface {

	public void m2() {

	}

	public static void main(String[] args) {
		StaticMethodOfInterface smoi = new StaticMethodOfInterface();
//		smoi.m1(); //interface static methods purely belongs to interface only, they can be accessed by using below case not through class implementation instance.
		StaticInterface.m1();
	}

}

interface StaticInterface {
	public abstract void m2();

	static void m1() {
		System.out.println("SI - m1");
	}
}