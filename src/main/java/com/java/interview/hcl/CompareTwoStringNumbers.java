package com.java.interview.hcl;

/**
 * 
 * @author P.V. UdayKiran
 * @version 1
 * @since created on Sun 01-Jun-2025 12:19
 */
public class CompareTwoStringNumbers {
	public static void main(String[] args) {
		String input1 = "12345";
//		String input1 = "54323";
		String input2 = "54353";
		
		//without using predefined methods, implement custom logic
		
		if(input1.length() > input2.length()) {
			System.out.println(input1 +" is bigger one");
		} else if(input1.length() < input2.length()) {
			System.out.println(input2 +" is bigger one");
		} else {
			for(int i = 0; i < input1.length(); i++) {
				if(input1.charAt(i) > input2.charAt(i)) {
					System.out.println(input1 +" is bigger");
					return;
				} else if(input1.charAt(i) < input2.charAt(i)) {
					System.out.println(input2 +" is bigger");
					return;
				} 
			}
			System.out.println("Both numbers are equal");
		}
	}
}
