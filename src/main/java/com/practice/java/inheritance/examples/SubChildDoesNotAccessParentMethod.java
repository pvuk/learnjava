package com.practice.java.inheritance.examples;

class One 
{ 
    public void print_geek() 
    { 
        System.out.println("Geeks."); 
    } 
} 
  
class Two extends One
{ 
    public void print_for() 
    { 
        System.out.println("for"); 
    } 
} 
  
class Three extends Two 
{ 
    public void print_geek() 
    { 
        System.out.println("Geeks"); 
    } 
} 

/**
 * <p><a href="https://www.geeksforgeeks.org/inheritance-in-java/">Multilevel Inheritance : </a>In Multilevel Inheritance, a derived class will be inheriting a base class and as well as the derived class also act as the base class to other class. In below image, the class A serves as a base class for the derived class B, which in turn serves as a base class for the derived class C. In Java, a class cannot directly access the grandparent’s members.
 * @author P V UdayKiran
 *
 * @Date: Sat 07-Dec-2019 08:51
 * @version: %I%
 */
// Drived class 
public class SubChildDoesNotAccessParentMethod 
{ 
    public static void main(String[] args) 
    { 
        Three g = new Three(); 
        g.print_geek(); 
        g.print_for(); 
        g.print_geek();//** Sub child class doesn't access Parent class(One) method print_geek
    } 
} 