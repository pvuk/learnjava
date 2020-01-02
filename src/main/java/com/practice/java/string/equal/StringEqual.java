package com.practice.java.string.equal;

public class StringEqual {
	public static void main(String[] args) {
		String a = "ABC";
		String b = new String("ABC");
		String c = new String("ABC");
		System.out.println("a equal b: "+ a.equals(b));
		System.out.println("a == b: "+ a == b);
		System.out.println("a == b: "+ (a.hashCode() == b.hashCode()));
		System.out.println("b == c: "+ b == c);
		System.out.println("b == c: "+ (b.hashCode() == c.hashCode()));
	}
}
