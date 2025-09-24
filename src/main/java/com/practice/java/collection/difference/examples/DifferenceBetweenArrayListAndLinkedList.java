package com.practice.java.collection.difference.examples;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * update package from com.practice.java.collection.difference.examples to com.java.collection.difference.examples once task is done.
 * 
 * @author udaykiran pulipati
 * @version 1, changes on 04-Nov-2019 21:52
 */
public class DifferenceBetweenArrayListAndLinkedList {
	 
		public static void main(String[] args) 
		{ 
			ArrayList<String> arrlistobj = new ArrayList<String>(); 
			arrlistobj.add("0. Practice.GeeksforGeeks.org"); 
			arrlistobj.add("1. Quiz.GeeksforGeeks.org"); 
			arrlistobj.add("2. Code.GeeksforGeeks.org"); 
			arrlistobj.remove(2); // Remove value at index 2 
			System.out.println("ArrayList object output :" + arrlistobj); 

			// Checking if an element is present. 
			if (arrlistobj.contains("2. Code.GeeksforGeeks.org")) 
				System.out.println("Found"); 
			else
				System.out.println("Not found"); 

			/**
			 * Each element in LinkedList is called Node, each element in your list has a pointer a reference to the next Node,
			 * so the LinkedList class starts with just a pointer to the first element in the list and after that each Node element in the list just has a reference a pointer sort to the next Node.
			 *  
			 */
			LinkedList<String> llStrings = new LinkedList<>();//diamond operator <> introduced in Java 7 
			llStrings.add("0. Practice.GeeksforGeeks.org"); 
			llStrings.add("1. Quiz.GeeksforGeeks.org"); 
			llStrings.add("2. Code.GeeksforGeeks.org"); 
			llStrings.remove("2. Code.GeeksforGeeks.org"); 
			System.out.println("LinkedList object output :" + llStrings); 
			
			// Checking if an element is present. 
			if (llStrings.contains("2. Code.GeeksforGeeks.org")) 
				System.out.println("Found"); 
			else
				System.out.println("Not found"); 
		} 

}
