package com.practice.java.collection.difference.examples;

import java.io.IOException;

class ThrowExample { 
  void myMethod(int num)throws IOException, ClassNotFoundException{ 
     if(num==1)
        throw new IOException("IOException Occurred");
//     else
//        throw new ClassNotFoundException("ClassNotFoundException");
  } 
  
  void method1() {
//		throw new CustomeException();
	}
  
  void method2() {
	  throw new CustomRuntimeException();
  }
  
  void method3() {
//	  throw new CustomThrowable();
  }
} 

/**
 * update package from com.practice.java.collection.difference.examples to com.java.collection.difference.examples once task is done.
 * 
 * @author udaykiran pulipati
 * @Date 04-Nov-2019 21:52
 */
public class Example1{ 
  public static void main(String args[]){ 
   try{ 
     ThrowExample obj=new ThrowExample(); 
     obj.myMethod(1); 
   }catch(Exception ex){
     System.out.println(ex);
    } 
  }
}