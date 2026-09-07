package com.java.interview.nextlevel;
/**
 * @author P.V. UdayKiran
 * @version 1
 * @since created on Wed 25-Jun-2025 10:21
 * 
 */
public class SortWordsUsingLoop {
	public static void main(String[] args) {
//		String str = "a, b, b, a, a";
//		String[] split = str.split(", ");
		
		String[] names = {"Ram", "Venkata", "Maruthi", "Siva"};//Creating string array. Each string should be comma separated
		int length = names.length;
		for(int i = 0; i < length; i++) {
			for(int j = i + 1; j < length; j++) {
				//compare one string with another string
				/*
				 * This means:
				- If the result is greater than 0, then names[i] comes after names[j] in dictionary order.
				- For example, "zebra".compareTo("apple") returns a positive number because "zebra" comes after "apple".
				That condition is often used for sorting in ascending order. 
				If you want to swap elements so that the smaller one comes first, you'd do it when compareTo() is greater than 0.

				 */
				if(names[i].compareTo(names[j]) > 0) {
					//swap
					String temp = names[i];
					names[i] = names[j];
					names[j] = temp;
				}
			}
		}
		
		//print output array
		for(String name : names) {
			System.out.println(name);
		}
	}
}
