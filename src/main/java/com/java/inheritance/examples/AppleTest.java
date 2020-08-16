package com.java.inheritance.examples;

/**
* <p>
 * <h1>Java Object Creation of Inherited Class</h1>
In inheritance, subclass acquires super class properties. An important point to note is, when subclass object is created, a separate object of super class object will not be created. Only a subclass object object is created that has super class variables.
<br>
This situation is different from a normal assumption that a constructor call means an object of the class is created, so we can’t blindly say that whenever a class constructor is executed, object of that class is created or not.
 *<br> 
 * <br>
 * <code>
 * <b>Output:</b>

	super class constructor <br>
	super class object hashcode :366712642<br>
	Apple<br>
	sub class constructor <br>
	sub class object hashcode :366712642<br>
	366712642   366712642<br>
	Apple  Apple<br>
	</code>
	<br>
	As we can see that both super class(Fruit) object hashcode and subclass(Apple) object hashcode are same, so only one object is created. This object is of class Apple(subclass) as when we try to print name of class which object is created, it is printing Apple which is subclass.
 *</p>
 * 
 * @author venkataudaykiranp
 *
 * @version 1, changes on Fri 06-Dec-2019 11:23
 * <p>version annotation added. if any changes it automatically updated the version. review it.</p>
 * @version: %I%
 */
public class AppleTest {
	
	public static void main(String[] args) 
    { 
        Apple myApple = new Apple(); 
    } 
}
