package com.java.finalkeyword.example;

/**
 * 
 * @author venkataudaykiranp
 *
 *<br>
 *<b>Ref: </b><a href="https://www.geeksforgeeks.org/final-keyword-java/">final keyword in java</a>
 *<p>
 *	a final variable cannot be reassign, doing it will throw compile-time error.
 *</p>

 *<p>Output</p>
 *<code>
	Compiler Error: cannot assign a value to final variable CAPACITY
 *</code>
 *
 */
// Java program to demonstrate re-assigning 
// final variable will throw compile-time error 
  
class FinalVariableCannotReAssign  
{ 
    static final int CAPACITY = 4; 
      
    public static void main(String args[]) 
    { 
        // re-assigning final variable 
        // will throw compile-time error 
//        CAPACITY = 5; 
    } 
}