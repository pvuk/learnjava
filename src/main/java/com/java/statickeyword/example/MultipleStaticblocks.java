package com.java.statickeyword.example;

/**
 * 
 * @author venkataudaykiranp
 * 
 *         Lets see how multiple static blocks work in Java. They execute in the
 *         given order which means the first static block executes before second
 *         static block. That’s the reason, values initialized by first block
 *         are overwritten by second block.
 *         
 *	Ref: <a href="https://beginnersbook.com/2013/04/java-static-class-block-methods-variables/">Multiple Static blocks</a>
 *
 */
class MultipleStaticblocks {
	static int num;
	static String mystr;
	// First Static block
	static {
		System.out.println("Static Block 1");
		num = 68;
		mystr = "Block1";
	}
	// Second static block
	static {
		System.out.println("Static Block 2");
		num = 98;
		mystr = "Block2";
	}

	public static void main(String args[]) {
		System.out.println("Value of num: " + num);
		System.out.println("Value of mystr: " + mystr);
	}
}