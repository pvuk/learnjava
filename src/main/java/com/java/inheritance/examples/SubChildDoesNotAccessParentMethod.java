package com.java.inheritance.examples;

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