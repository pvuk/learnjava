package com.java8.site.beginnersbook.methodreference.examples;
import java.util.Arrays;
/**
 * <a href="https://beginnersbook.com/2017/10/method-references-in-java-8/>3. Method reference to an instance method of an arbitrary object of a particular type</a>
 * 
 * @author P V UdayKiran
 *
 * @Date Thu 07-May-2020 14:53
 *
 */
public class MethodReferenceToClassInstanceMethodExample {  

   public static void main(String[] args) {  
	String[] stringArray = { "Steve", "Rick", "Aditya", "Negan", "Lucy", "Sansa", "Jon"};
	/* Method reference to an instance method of an arbitrary 
	 * object of a particular type
	 */
	Arrays.sort(stringArray, String::compareToIgnoreCase);
	for(String str: stringArray){
		System.out.println(str);
	}
   }  
}