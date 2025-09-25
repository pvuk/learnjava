package com.practice.java8.website.beginnersbook.methodreference.examples;

import java.util.function.BiFunction;  
class Multiplication{  
   public static int multiply(int a, int b){  
	return a*b;  
   }  
}  

/**
 * <a href="https://beginnersbook.com/2017/10/method-references-in-java-8/>2. Method reference to a static method of a class</a>
 * 
 * @author P V UdayKiran
 *
 * @version 1, changes on Thu 07-May-2020 14:48
 *
 */
public class MethodReferenceToStaticMethodExample {  
   public static void main(String[] args) {  
	BiFunction<Integer, Integer, Integer> product = Multiplication::multiply;  
	int pr = product.apply(11, 5);  
	System.out.println("Product of given number is: "+pr);  
   }  
}