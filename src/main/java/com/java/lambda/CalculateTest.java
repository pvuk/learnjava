package com.java.lambda;

/**
 * @author Venkata.Pulipati
 * @since Wednesday 01-October-2025 12:34:55
 */
public class CalculateTest {
	public static void main(String[] args) {
		Calculate calculate = (a, b) -> a + b;
		double calculateSum = calculate.calculate(10,15);
		Printable printSum = (sumOfTwoNumbers) -> System.out.println("Sum: "+ sumOfTwoNumbers);
		printSum.print(calculateSum);
		
//		Printable printable = (result) -> System.out.println("Result: "+ result);
		Printable printable = result -> System.out.println("Result: "+ result);//You can exclude parenthesis, if it is only one
		printable.print(calculate.calculate(10,15));
		
		//Java give this ability to make method implementations into objects like any other that can passed into methods as parameters
		
	}
}
