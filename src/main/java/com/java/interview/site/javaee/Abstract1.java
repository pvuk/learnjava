package com.java.interview.site.javaee;

/**
 * 
 * @author venkataudaykiranp
 * 
 * What will be the result is we compile and run Concrete1?
 * 
 * Select 1 option:
 * A. Class Abstract1 will not compile as abstract classes cannot have main method
 * 
 * B. Classes will compile, but will fail at runtime as Concrete1 does not have a main method
 *
 * C. Class will compile, run and print "I am an abstract class"
 *
 * D. Class will compile, run and print nothing
 * 
 * Ans: C
 * 
 * Ref: <a href="https://javajee.com/javaquizzes?field_quiz_category_tid=285&field_question_type_tid%5B%5D=280&sort_by=created&sort_order=ASC">Multiple Choice Question</a>
 */

abstract class Abstract1 {

  public static void main(String[] args) {

   System.out.println("I am an abstrsct class");
  }
}

abstract class Concrete1 extends Abstract1{
}