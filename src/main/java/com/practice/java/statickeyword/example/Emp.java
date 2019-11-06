package com.practice.java.statickeyword.example;

/**
 * 
 * @author venkataudaykiranp
 *
 *<br>
 *<h1>Ref:</h1><a href="https://www.geeksforgeeks.org/static-non-static-blank-final-variables-java/">Static and non static blank final variables in Java</a>
 *
 *<br>
 *<b>Description:</b>
 *<b>Static and non static blank final variables in Java</b>
 *<p>A variable provides us with named storage that our programs can manipulate. There are two types of data variables in a class:</p>
 *<p><b>Instance variables :</b> Instance variables are declared in a class, but outside a method, constructor or any block. When a space is allocated for an object in the heap, a slot for each instance variable value is created. Instance variables are created when an object is created with the use of the keyword ‘new’ and destroyed when the object is destroyed. They are property of an object so they can be accessed using object only.</p>
 *<p><b>Static variables :</b> Class variables also known as static variables are declared with the static keyword in a class, but outside a method, constructor or a block. <b>There would only be one copy of each class variable per class, regardless of how many objects are created from it.</b> They are property of a class not of an object so they can be used directly using class name as well as using object.</p>
 *
 */
// Java code to illustrate use of instance and static variables 
public class Emp {
	String name;
	int salary;
	static String company;

	public void printDetails() {
		System.out.println("Name: " + name);
		System.out.println("Company: " + company);
		System.out.println("Salary: " + salary);
	}

	public static void main(String s[]) {
		Emp.company = "GeeksForGeeks";
		Emp g = new Emp();
		g.name = "Shubham";
		g.salary = 100000;

		Emp sp = new Emp();
		sp.name = "Chirag";
		sp.salary = 200000;

		g.printDetails();
		sp.printDetails();

		g.company = "Google";
		g.salary = 200000;
		System.out.println("\nAfter change\n");
		g.printDetails();
		sp.printDetails();
	}
}