package com.java.polymorphism.runtime.examples;

/**
 * 
 * @author venkataudaykiranp
 * 
 * <a href="https://www.w3schools.in/java-tutorial/polymorphism/">Rules of method overriding in Java</a>
 * 
 * <p>
 * 
 * <b>Argument list:</b> The argument list at the time of overriding method need to be same as that of the method of the parent class. The data types of the arguments along with their sequence must have to be preserved as it is in the overriding method.
 * <br>
 * <b>Access Modifier:</b> The Access Modifier present in the overriding method (method of subclass) cannot be more restrictive than that of an overridden method of the parent class.
 * <br>
 * The private, static and final methods can't be overridden as they are local to the class.  
 * <br>
 * Any method which is overriding can throw any unchecked exceptions, in spite of whether the overridden method usually method of parent class might throw an exception or not.    
 * </p>  
 *  
 *
 */
public class MethodOverridingDevice {
	
	protected long totalStandByTime(long standByTime) throws ArithmeticException{
		return standByTime;
	}
}
