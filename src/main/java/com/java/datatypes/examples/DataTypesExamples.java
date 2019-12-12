package com.java.datatypes.examples;

/**
 * 
 * @author venkataudaykiranp
 *
 *	Ref: <a href="https://www.tutorialspoint.com/java/java_basic_datatypes.htm">Java Literals</a>
 */
public class DataTypesExamples {
	static long hexWords = 1234_5678_9012_3456L;

	public static void main(String[] args) {
		System.out.println(hexWords);
		int i = 5_2;
		System.out.println(i);
		short s = 0x0a;
		System.out.println(s);
		System.out.println("test");
		int ia = 0x0a;
		System.out.println(ia);
		System.out.println("======");

		/*
		 * byte, int, long, and short can be expressed in decimal(base 10), hexadecimal(base 16) or octal(base 8) number systems as well.

		Prefix 0 is used to indicate octal, and prefix 0x indicates hexadecimal when using these number systems for literals. For example 
		 */
		int decimal = 100;
		int octal = 0010;
		int hexa = 0x64;
		System.out.println(decimal);
		System.out.println(octal);
		System.out.println(hexa);
		
		System.out.println("======");
		
		byte a = 68;
		char c = 'A';
		System.out.println(a);
		System.out.println(c);
		
		System.out.println("======");
		
		/*
		 * String and char types of literals can contain any Unicode characters. For example 
		 */
		char au = '\u0001';
		String as = "\u0001";
		System.out.println(au);
		System.out.println(as);
	}
}
