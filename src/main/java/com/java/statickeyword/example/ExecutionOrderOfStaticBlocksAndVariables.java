package com.java.statickeyword.example;

/**
 * 
 * @author venkataudaykiranp
 *
 *<br>
 *<b>Ref: </b><a href="https://www.geeksforgeeks.org/static-keyword-java/">Static variables</a>
 *<h1>Static variables</h1>

<p>
	When a variable is declared as static, then a single copy of variable is created and shared among all objects at class level. Static variables are, essentially, global variables. All instances of the class share the same static variable.
	
	<h1>Important points for static variables :-</h1>
	
	<ul>
		<li>We can create static variables at class-level only. <a href="https://www.geeksforgeeks.org/g-fact-47/">See here</a></li>
		<li><b>static block and static variables are executed in order they are present in a program.</b></li>
	</ul>
	Below is the java program to demonstrate that static block and static variables are executed in order they are present in a program.
</p>
 */

// java program to demonstrate execution 
// of static blocks and variables 
class ExecutionOrderOfStaticBlocksAndVariables 
{ 
    // static block 
    static { 
        System.out.println("Inside static block"); 
    } 
      
    // static method 
    static int m1() { 
        System.out.println("from m1"); 
        return 20; 
    }
    
 // static variable 
    static int a = m1();
      
    // static method(main !!) 
    public static void main(String[] args) 
    { 
       System.out.println("Value of a : "+a);
       System.out.println("from main"); 
    } 
  
  
}