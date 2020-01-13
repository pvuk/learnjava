package com.java.inheritance.examples;
/**
 * <p><b>Apple: </b>sub class</p>
 * @author P V UdayKiran
 *
 * @Date Fri 06-Dec-2019 12:11
 * @version: %I%
 */
class Apple extends Fruit {
	public Apple() {
		System.out.println("Subclass constructor invoked");
		System.out.println("Sub class object hashcode :" + this.hashCode());
		System.out.println("print Apple hashCode and Fruit hashCode: "+ this.hashCode() + "   " + super.hashCode());

		System.out.println("get Apple class name, Fruit class name and printing: "+ this.getClass().getName() + "  " + super.getClass().getName());
	}
}