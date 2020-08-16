package com.java8.site.beginnersbook.methodreference.examples;

@FunctionalInterface 
interface MyInterface2{  
    Hello display(String say);  
}  
class Hello{  
    public Hello(String say){  
        System.out.print(say);  
    }  
}  
/**
 * <a href="https://beginnersbook.com/2017/10/method-references-in-java-8/>4. Method reference to a constructor</a>
 * 
 * @author P V UdayKiran
 *
 * @version 1, changes on Thu 07-May-2020 14:53
 *
 */
public class MethodReferenceToConstructorExample {  
    public static void main(String[] args) { 
    	//Method reference to a constructor
        MyInterface2 ref = Hello::new;  
        ref.display("Hello World!");  
    }  
}