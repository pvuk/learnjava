package com.java.inheritance.examples;

/**
 * 
 * @author venkataudaykiranp
 * 
 *         <a href=
 *         "https://www.w3resource.com/java-tutorial/inheritance-composition-relationship.php">Inheritance (IS-A) vs. Composition (HAS-A) Relationship</a>
 * 
 *         <h1>HAS-A Relationship:</h1>
 *         <p>
 *         Composition(HAS-A) simply mean the use of instance variables that are
 *         references to other objects. For example Maruti has Engine, or House
 *         has Bathroom.
 * 
 *         Let’s understand these concepts with an example of Car class.
 *         </p>
 * 
 *         <p>
 *         As shown above, Car class has a couple of instance variable and few
 *         methods. Maruti is a specific type of Car which extends Car class
 *         means Maruti IS-A Car.
 *         </p>
 *
 */
public class Maruti extends Car{
	//Maruti extends Car and thus inherits all methods from Car (except final and static)
	//Maruti can also define all its specific functionality
	public void MarutiStartDemo(){
		Engine MarutiEngine = new Engine();
		MarutiEngine.start();
		}
	}