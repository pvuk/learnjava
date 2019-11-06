package com.java.numeric.literals.examples;

/**
 * 
 * @author venkataudaykiranp
 * 
 * <p>
 * 	<a href="https://www.geeksforgeeks.org/using-underscore-numeric-literals-java/">From 1.7v onwards we can use ‘_’ under score symbols between digits of numeric literals.</a> You can place underscores only between digits; you <strong>cannot place</strong> underscores in the following places:</p>
<ul>
<li>In positions where a string of digits is expected</li>
<li>We can use under score symbols only between the digits if we are using else we  will get compile time error. </li>
</ul>
 * 
 * <p>The main advantage of this approach is readability of the code will be improved. 
 *At the time of compilation these under score symbols will be removed automatically. 
 *We can use more than one under score symbols also between the digits too. For example, following is a valid numeric literal
 *</br><code>int x4 = 5_______2;        // OK (decimal literal)</code>
 *</p>
 * 
 * <h2>
 * 	<span id="tips-for-underscores-in-numeric-literals">
 * 		<a href="https://www.journaldev.com/607/underscores-in-numeric-literals-java-7-feature">Tips for Underscores in Numeric Literals</a>
 * 	</span>
 * </h2>
	<ul>
	<li>Underscores can be placed only between digits.</li>
	<li>You can&#8217;t put underscores next to decimal places, L/F suffix or radix prefix. So 3._14, 110_L, 0x_123 are invalid and will cause compilation error.</li>
	<li>Multiple underscores are allowed between digits, so 12___3 is a valid number.</li>
	<li>You can&#8217;t put underscores at the end of literal. So 123_ is invalid and cause compile time error.</li>
	<li>When you place underscore in the front of a numeric literal, it&#8217;s treated as an identifier and not a numeric literal. So don&#8217;t confuse with it.
	<pre><code>
	int _10=0;
	int x = _10;
	</code></pre>
	</li>
	<li>You can&#8217;t use underscores where you are expecting a String with digits. For example <code>Integer.parseInt("12_3");</code> will throw <code>java.lang.NumberFormatException</code>.</li>
	</ul>
 *
 */
public class UnderScore_works 
{ 
    public static void main(String args[])  
    { 
        int _ = 10; //'_' underscore identifier works only in Java8
        System.out.println(_); 
        
        //https://www.javatpoint.com/java-numeric-literals-with-underscore
        //You cannot use underscore at the beginning or end of a number.
        //int a = _10; // Error, this is an identifier, not a numeric literal  
        //int a = 10_; // Error, cannot put underscores at the end of a number  
        //You cannot use underscore adjacent to a decimal point in a floating point literal.
        //float a = 10._0; // Error, cannot put underscores adjacent to a decimal point  
        //float a = 10_.0; // Error, cannot put underscores adjacent to a decimal point  
        //You cannot use underscore prior to an F or L suffix
        //long a = 10_100_00_L; // Error, cannot put underscores prior to an L suffix  
        //float a = 10_100_00_F; // Error, cannot put underscores prior to an F suffix  
        
        // Underscore in integral literal  
        int a = 10_00000;  
        System.out.println("a = "+a);  
        // Underscore in floating literal  
        float b = 10.5_000f;  
        System.out.println("b = "+b);  
        // Underscore in binary literal  
        int c = 0B10_10;  
        System.out.println("c = "+c);  
        // Underscore in hexadecimal literal  
        int d = 0x1_1;  
        System.out.println("d = "+d);  
        // Underscore in octal literal  
        int e = 01_1;  
        System.out.println("e = "+e);  
        
        //https://www.journaldev.com/607/underscores-in-numeric-literals-java-7-feature
        long ccNumber = 1234_5678_9012_3456L;
		long ssn = 999_99_9999L;
		float pi = 	3.14_15F;
		long hexadecimalBytes = 0xFF_EC_DE_5E;
		long hexadecimalWords = 0xCAFE_BABE;
		long maxOfLong = 0x7fff_ffff_ffff_ffffL;
		byte byteInBinary = 0b0010_0101;
		long longInBinary = 0b11010010_01101001_10010100_10010010;
		int add = 12_3 + 3_2_1;
		System.out.println("ccNumber="+ccNumber);
		System.out.println("ssn="+ssn);
		System.out.println("pi="+pi);
		System.out.println("hexadecimalBytes="+hexadecimalBytes);
		System.out.println("hexadecimalWords="+hexadecimalWords);
		System.out.println("maxOfLong="+maxOfLong);
		System.out.println("byteInBinary="+byteInBinary);
		System.out.println("longInBinary="+longInBinary);
		System.out.println("add="+add);
		
		int x4 = 5_______2;        // OK. Allows more than one underscore(decimal literal)
		System.out.println(x4);
          
    }          
} 