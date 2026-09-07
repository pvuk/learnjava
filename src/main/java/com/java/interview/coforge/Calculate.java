package com.java.interview.coforge;

public class Calculate implements CustomFunctionalInterfaceCalculate {
	public static void main(String[] args) {
		CustomFunctionalInterfaceCalculate multiply = (a, b) -> a * b;
		System.out.println("Mulplication using Functional Interface: "+ multiply.calculate(10, 39));
		
		CustomFunctionalInterfaceCalculate add = (a, b) -> a + b;
		System.out.println("Addition using Functional Interface: "+ add.calculate(59, 39));
		
		CustomFunctionalInterfaceCalculate subtract = (a, b) -> a - b;
		System.out.println("Subtraction using Functional Interface: "+ subtract.calculate(69, 39));
		
//		FunctionalCalculate sqrt = () -> Sysytem.out.println("");//Functional interface allows default method, but it can't call
//		System.out.println("Subtraction using Functional Interface: "+ sqrt.defaultMethod_sqrt());
		
		//Default methods are accessed through object references, not directly within lambda expressions.
		CustomFunctionalInterfaceCalculate cal = new Calculate();
		System.out.println(cal.defaultMethod());
		System.out.println(cal.calculate(5, 1));
	}

	@Override
	public int calculate(int a, int b) {
		return a + b;
	}
}
