package com.java.inheritance.examples;

/**
 * <p>
 * A Java program to demonstrate that both super class and subclass constructors refer to same object.</br>
 * <b>Fruit:</b> super class
 * </p>
 * 
 * @author P V UdayKiran
 *
 * @Date Fri 06-Dec-2019 11:23
 * @version: %I%
 */
class Fruit {
	public Fruit() {
		System.out.println("Super class constructor");
		System.out.println("Super class object hashcode: "+ this.hashCode());
		System.out.println("Super class name: "+ this.getClass().getName());
	}
}