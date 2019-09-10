package com.java.statickeyword.example;

/**
 * 
 * @author venkataudaykiranp
 * 
 *         Static keyword can be used with class, variable, method and block.
 *         Static members belong to the class instead of a specific instance,
 *         this means if you make a member static, you can access it without
 *         object. Let’s take an example to understand this:
 * 
 *         Here we have a static method myMethod(), we can call this method
 *         without any object because when we make a member static it becomes
 *         class level. If we remove the static keyword and make it non-static
 *         then we must need to create an object of the class in order to call
 *         it.
 * 
 *         		Static members are common for all the instances(objects) of the class
 *         		but non-static members are separate for each instance of class.
 *         
 *	Ref: <a href="https://beginnersbook.com/2013/04/java-static-class-block-methods-variables/">Java – Static Class, Block, Methods and Variables</a>
 *
 */
class SimpleStaticExample {
	// This is a static method
	static void myMethod() {
		System.out.println("myMethod");
	}

	public static void main(String[] args) {
		/*
		 * You can see that we are calling this method without creating any object.
		 */
		myMethod();
	}
}