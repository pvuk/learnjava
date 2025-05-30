package com.java.lambda.functionalInterface;

/**
 * @author P. V. UdayKiran
 * @version 1, created on Thu 27-Aug-2020 13:39
 */


public class TestFunctionalInterface {
	public static void main(String[] args) {
		FunInt fi = new FunInt() {
			@Override
			public void m1() {
				System.out.println("m1-anonymous");
			}
		};
		
		fi.m1();
	}
}

interface FunInt {
	public abstract void m1();
}
