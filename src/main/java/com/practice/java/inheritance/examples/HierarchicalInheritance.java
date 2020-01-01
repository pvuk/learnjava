package com.practice.java.inheritance.examples;

class AA 
{ 
    public void print_geek() 
    { 
        System.out.println("Geeks"); 
    } 
} 
  
class BB extends AA 
{ 
    public void print_for() 
    { 
        System.out.println("for"); 
    } 
} 
  
class CC extends AA 
{ 
	public void print_geek() 
    { 
        System.out.println("Geeks."); 
    } 
} 
  
// Drived class 
public class HierarchicalInheritance 
{ 
    public static void main(String[] args) 
    { 
        CC g = new CC(); 
        g.print_geek(); 
        BB t = new BB(); 
        t.print_for(); 
        AA a = new CC();
        a.print_geek(); 
    } 
} 