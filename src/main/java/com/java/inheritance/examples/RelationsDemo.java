package com.java.inheritance.examples;

/**
 * 
 * @author venkataudaykiranp
 * 
 *         <p>
 *         RelationsDemo class is making object of Maruti class and initialized
 *         it. Though Maruti class does not have setColor(), setMaxSpeed() and
 *         carInfo() methods still we can use it due to IS-A relationship of
 *         Maruti class with Car class.
 *         </p>
 *         
 *         <h1>Comparing Composition and Inheritance</h1>

<ul>
	<li>
	It is easier to change the class implementing composition than inheritance. The change of a superclass impacts the inheritance hierarchy to subclasses.
	</li>
	<li>
	You can't add to a subclass a method with the same signature but a different return type as a method inherited from a superclass. Composition, on the other hand, allows you to change the interface of a front-end class without affecting back-end classes.
	</li>
	<li>
	Composition is dynamic binding (run-time binding) while Inheritance is static binding (compile time binding)
	</li>
	<li>
	It is easier to add new subclasses (inheritance) than it is to add new front-end classes (composition) because inheritance comes with polymorphism. If you have a bit of code that relies only on a superclass interface, that code can work with a new subclass without change. This is not true of composition unless you use composition with interfaces. Used together, composition and interfaces make a very powerful design tool.
	</li>
	<li>
	With both composition and inheritance, changing the implementation (not the interface) of any class is easy. The ripple effect of implementation changes remains inside the same class.
	</li>
	<ul>
		<li>
			<b>Don't use inheritance just to get code reuse</b> If all you really want is to reuse code and there is no is-a relationship in sight, use composition.
		</li>
		<li>
			<b>Don't use inheritance just to get at polymorphism</b> If all you really want is a polymorphism, but there is no natural is-a relationship, use composition with interfaces.
Summary
		</li>
	</ul>
</ul>

IS-A relationship based on Inheritance, which can be of two types Class Inheritance or Interface Inheritance.
Has-a relationship is composition relationship which is a productive way of code reuse.
 *
 */
public class RelationsDemo {
	public static void main(String[] args) {		
		Maruti myMaruti = new Maruti();
		myMaruti.setColor("RED");
		myMaruti.setMaxSpeed(180);
		myMaruti.carInfo();
		myMaruti.MarutiStartDemo();
	}
}