package com.java.operator.example;

import lombok.extern.slf4j.Slf4j;

/**
 * 
 * <p>
 * <a href="https://www.programiz.com/java-programming/bitwise-operators">Java
 * Bitwise and Bit Shift Operators</a>
 * <p>
 * Java provides 4 bitwise and 3 bit shift operators to perform bit operations.
 * You will learn about them in detail in this article.
 * </p>
 * 
 * <p>
 * Bitwise and bit shift operators are used on integral types
 * (<code>byte</code>, <code>short</code>, <code>int</code> and
 * <code>long</code>) to perform bit-level operations.
 * </p>
 * 
 * <p>
 * These operators are not commonly used. You will learn about a few use cases
 * of bitwise operators in <i>Java enum type</i> chapter. This article will only
 * focus on how these operators work.
 * </p>
 * 
 * <p>
 * There are 7 operators to perform bit-level operations in Java ( 4 bitwise and
 * 3 bit shift).
 * </p>
 * 
 * <table border="1" cellpadding="1" cellspacing="1">
 * <caption>Java Bitwise and Bit Shift Operators</caption> <thead>
 * <tr>
 * <th>Operator</th>
 * <th>Description</th>
 * </tr>
 * </thead> <tbody>
 * <tr>
 * <td><code>|</code></td>
 * <td><a href="#or">Bitwise OR</a></td>
 * </tr>
 * <tr>
 * <td><code>&amp;</code></td>
 * <td><a href="#and">Bitwise AND</a></td>
 * </tr>
 * <tr>
 * <td><code>~</code></td>
 * <td><a href="#complement">Bitwise Complement</a></td>
 * </tr>
 * <tr>
 * <td><code>^</code></td>
 * <td><a href="#xor">Bitwise XOR</a></td>
 * </tr>
 * <tr>
 * <td><code>&lt;&lt;</code></td>
 * <td><a href="#left-shift">Left Shift</a></td>
 * </tr>
 * <tr>
 * <td><code>&gt;&gt;</code></td>
 * <td><a href="#right-shift">Right Shift</a></td>
 * </tr>
 * <tr>
 * <td><code>&gt;&gt;&gt;</code></td>
 * <td><a href="#unsigned-right-shift">Unsigned Right Shift</a></td>
 * </tr>
 * </tbody>
 * </table>
 * </p>
 * <br>
 * <h1>==========================================================</h1>
 * <p>
 * <a href="https://www.geeksforgeeks.org/bitwise-operators-in-java/">Bitwise operators in Java</a>
 * 
 * <h1>Bitwise operators in Java</h1>
 * <p>
 * Bitwise operators are used to perform manipulation of individual bits of a
 * number. They can be used with any of the integral types (char, short, int,
 * etc). They are used when performing update and query operations of Binary
 * indexed tree.
 * </p>
 * </p>
 */
@Slf4j
public class Operators { 
    public static void main(String[] args) 
    { 
        //Initial values 
        int a = 5; 
        int b = 7; 
  
        /*
         * Bitwise AND
			Bitwise AND is a binary operator (operates on two operands). It's denoted by &.
			
			The & operator compares corresponding bits of two operands. If both bits are 1, it gives 1. If either of the bits is not 1, it gives 0. For example,
			
			12 = 00001100 (In Binary)
			25 = 00011001 (In Binary)
			
			Bit Operation of 12 and 25
			  00001100
			& 00011001
			  ________
			  00001000  = 8 (In decimal)
         */
        // bitwise and 
        // 0101 & 0111=0101 = 5 
        System.out.println("a&b = " + (a & b)); 
  
        /*
         * Bitwise OR (|) –
			This operator is binary operator, denoted by ‘|’. It returns bit by bit OR of input values, i.e, if either of the bits is 1, it gives 1, else it gives 0.
			For example,
			a = 5 = 0101 (In Binary)
			b = 7 = 0111 (In Binary)
			
			Bitwise OR Operation of 5 and 7
			  0101
			| 0111
			 ________
			  0111  = 7 (In decimal) 
         */
        System.out.println("a|b = " + (a | b)); 
  
        /*
         * Bitwise XOR is a binary operator (operates on two operands). It's denoted by ^.

			The ^ operator compares corresponding bits of two operands. If corresponding bits are different, it gives 1. If corresponding bits are same, it gives 0. For example,
			
			12 = 00001100 (In Binary)
			25 = 00011001 (In Binary)
			
			Bitwise XOR Operation of 12 and 25
			  00001100
			| 00011001
			  ________
			  00010101  = 21 (In decimal)
         */
        // bitwise xor 
        // 0101 ^ 0111=0010 = 2 
        System.out.println("a^b = " + (a ^ b)); 
  
        /*
         * Bitwise Complement
			Bitwise complement is an unary operator (works on only one operand). It is denoted by ~.
			
			The ~ operator inverts the bit pattern. It makes every 0 to 1, and every 1 to 0.
			
			35 = 00100011 (In Binary)
			
			Bitwise complement Operation of 35
			~ 00100011 
			  ________
			  11011100  = 220 (In decimal)
         */
        // bitwise and 
        // ~0101=1010 
        // will give 2's complement of 1010 = -6 
        System.out.println("~a = " + ~a); 
  
        // can also be combined with 
        // assignment operator to provide shorthand 
        // assignment 
        // a=a&b 
        a &= b; 
        System.out.println("a= " + a); 
        
        /*
         * Signed Right Shift
			The right shift operator >> shifts a bit pattern to the right by certain number of specified bits.
			
			212 (In binary: 11010100)
			
			212 >> 1 evaluates to 106 (In binary: 01101010)
			212 >> 0 evaluates to 212 (In binary: 11010100)
			212 >> 8 evaluates to 0 (In binary: 00000000)
			If the number is a 2's complement signed number, the sign bit is shifted into the high-order positions.
         */
        int number = 212;
    	System.out.println("Signed Right Shift number: "+ number);
    	log.info("number >> 1: {}", number >> 1);
    	log.info("number >> 0: {}", number >> 0);
    	log.info("number >> 8: {}", number >> 8);
//    	log.info("number >> 2", number >> 2);
    	
    	/*
		 * Shifts the bits of the number to the right and fills 0 on voids left as a
		 * result. The leftmost bit depends on the sign of initial number. Similar
		 * effect as of dividing the number with some power of two.
		 */
    	
    	// right shift operator 
        // 0000 0101 >> 2 =0000 0001(1) 
        // similar to 5/(2^2) 
        System.out.println("b>>2 = " + (b >> 2));
        
    	/*
    	 * Signed Left Shift
			The left shift operator << shifts a bit pattern to the left by certain number of specified bits, and zero bits are shifted into the low-order positions.
			
			212 (In binary: 11010100)
			
			212 << 1 evaluates to 424 (In binary: 110101000)
			212 << 0 evaluates to 212 (In binary: 11010100)
			212 << 4 evaluates to 3392 (In binary: 110101000000)
    	 */
    	System.out.println("Signed Left Shift number: "+ number);
    	log.info("number << 1: {}", number << 1);
    	log.info("number << 0: {}", number << 0);
    	log.info("number << 4: {}", number << 4);
    	
    	/*
		 * Shifts the bits of the number to the left and fills 0 on voids left as a
		 * result. Similar effect as of multiplying the number with some power of two.
		 */
        // left shift operator 
        // 0000 0101<<2 =0001 0100(20) 
        // similar to 5*(2^2) 
        System.out.println("a<<2 = " + (a << 2)); 
    } 
}