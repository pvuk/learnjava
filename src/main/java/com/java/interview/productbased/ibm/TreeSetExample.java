package com.java.interview.productbased.ibm;

import java.util.TreeSet;

public class TreeSetExample {
	
	public static void main(String[] args) {
		TreeSet tSet = new TreeSet();
		tSet.add("Geeks");
		tSet.add("for Geeks");
		tSet.add("Geeks");
		tSet.add("GeeksforGeeks");
		System.out.println(tSet);//Output: Geeks, GeeksforGeeks, for Geeks
	}
}
