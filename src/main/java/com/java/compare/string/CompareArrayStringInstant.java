package com.java.compare.string;

public class CompareArrayStringInstant {
	
	public static void main(String[] args) {
		String gl = "001, 003, 005, 099";
		String cs = "226";
		System.out.println("Index of "+ cs +": "+ gl.indexOf(cs) +" in data: "+ gl);
		if (gl.contains(cs)){
			System.out.println("Content Equal");
		} else {
			System.err.println("Content Not Equal");
		}
	}
}
