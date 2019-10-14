package com.java.compare.string;

public class CompareArrayStringInstant {
	
	public static void main(String[] args) {
		String gl = "001, 003, 005, 099";
		String cs = "226";
		String cs2 = "099";
		System.out.println("Index of "+ cs +": "+ gl.indexOf(cs) +" in data: "+ gl);
		System.out.println("Index of "+ cs2 +": "+ gl.indexOf(cs2) +" in data: "+ gl);
	}
}
