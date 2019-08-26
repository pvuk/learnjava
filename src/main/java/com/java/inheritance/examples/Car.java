package com.java.inheritance.examples;

/**
 * 
 * @author venkataudaykiranp
 * 
 *         <a href=
 *         "https://www.w3resource.com/java-tutorial/inheritance-composition-relationship.php">Inheritance (IS-A) vs. Composition (HAS-A) Relationship</a>
 *         <h1>Description</h1>
 *         <p>
 *         One of the advantages of an Object-Oriented programming language is
 *         code reuse. There are two ways we can do code reuse either by the
 *         implementation of inheritance (IS-A relationship), or object
 *         composition (HAS-A relationship). Although the compiler and Java
 *         virtual machine (JVM) will do a lot of work for you when you use
 *         inheritance, you can also get at the functionality of inheritance
 *         when you use composition.
 *         </p>
 * 
 *         <h1>IS-A Relationship:</h1>
 * 
 *         <p>In object-oriented programming, the concept of IS-A is a totally
 *         based on Inheritance, which can be of two types Class Inheritance or
 *         Interface Inheritance. It is just like saying "A is a B type of
 *         thing". For example, Apple is a Fruit, Car is a Vehicle etc.
 *         Inheritance is uni-directional. For example, House is a Building. But
 *         Building is not a House.</p>
 *
 */
public class Car {
	// Methods implementation and class/Instance members
	private String color;
	private int maxSpeed; 
	public void carInfo(){
		System.out.println("Car Color= "+color + " Max Speed= " + maxSpeed);
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
}