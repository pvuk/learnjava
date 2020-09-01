package com.java8.site.beginnersbook.methodreference.examples;

/**
 * <a href="https://beginnersbook.com/2017/10/method-references-in-java-8/>1. Method reference to an instance method of an object</a>
 * 
 * @author P V UdayKiran
 *
 * @version 1, changes on Thu 07-May-2020 14:43
 *
 */
public class MethodRererenceToInstanceMethodOfObjectExample {  
    public void myMethod(){  
    	System.out.println("Instance Method");  
    }  
    public static void main(String[] args) {  
	MethodRererenceToInstanceMethodOfObjectExample obj = new MethodRererenceToInstanceMethodOfObjectExample();   
	// Method reference using the object of the class
	MyInterface1 ref = obj::myMethod;  
	// Calling the method of functional interface  
	ref.display();  
    }  
}

@FunctionalInterface 
interface MyInterface1{  
    void display();  
}  