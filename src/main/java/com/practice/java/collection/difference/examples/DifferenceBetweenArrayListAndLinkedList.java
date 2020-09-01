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
			arrlistobj.remove(1); // Remove value at index 2 
			System.out.println("ArrayList object output :" + arrlistobj); 

			// Checking if an element is present. 
			if (arrlistobj.contains("2. Code.GeeksforGeeks.org")) 
				System.out.println("Found"); 
			else
				System.out.println("Not found"); 


			LinkedList llobj = new LinkedList(); 
			llobj.add("0. Practice.GeeksforGeeks.org"); 
			llobj.add("1. Quiz.GeeksforGeeks.org"); 
			llobj.add("2. Code.GeeksforGeeks.org"); 
			llobj.remove("1. Quiz.GeeksforGeeks.org"); 
			System.out.println("LinkedList object output :" + llobj); 

			// Checking if an element is present. 
			if (llobj.contains("2. Code.GeeksforGeeks.org")) 
				System.out.println("Found"); 
			else
				System.out.println("Not found"); 
		} 

}
