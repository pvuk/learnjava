package com.java21.features;

/**
 * Code Ref:
 * . Java 21 enhances switch with pattern matching, allowing type checking, destructuring, and conditions in a single construct.</br>
	. It supports records, sealed classes, guards (when), and ensures exhaustive and safer code.</br>
	. Eliminates casting and simplifies complex conditional logic.</br>

 * @author Venkata.Pulipati
 * @since Monday 11-May-2026 12:17:33
 */
public class SwitchPatternInJava21 {
	public static void main(String[] args) {
		System.out.println(format(1));
		System.out.println(format("Hello"));
		
		//Guarded Pattern (when condition)
		String checkNumber = checkNumber(1);
		System.out.println("Input value is: "+ checkNumber);
		
		String checkNumber2 = checkNumber(-2);
		System.out.println("Input value is: "+ checkNumber2);
		
		//Record Pattern (Java 21 powerful feature)s
		String describe = describe(new Person("UdayKiran", 37));
		System.out.println(describe);
		
		//Sealed Class + Switch (Best Combination 🔥)
		double area = area(new Circle(3.0));
		System.out.println("Circle Area: "+ area);
		
		//Nested Pattern Matching
		String city = getCity(new Employee("Venkata Uday Kiran Pulipati", new Address("Hyderabad")));
		System.out.println("Employee: "+ city);
		
		
		
		//Combining Multiple Labels
//		String check = check(1);
//		System.out.println("Combining Multiple Labels: "+ check);
		
		//Dominance Rule (IMPORTANT 🧠 Interview)
		//Wrong order → compile-time error
		// ❌ Compile error
//		switch (obj) {
//		    case Object o -> "Any object";
//		    case String s -> "String"; // unreachable
//		}
		//✅ Correct:
//		switch (obj) {
//		    case String s -> "String";
//		    case Object o -> "Any object";
//		}
		
		
	}
	
	/**
	 * ✅ Key points</br>

	. No casting required
	. Variable (i, s) is auto-unboxed
	. Cleaner than instanceof

	 * @author Venkata.Pulipati
	 * @since Monday 11-May-2026 12:18:37
	 * @param obj
	 * @return
	 */
	static String format(Object obj) {
	    return switch (obj) {
	        case Integer i -> "Integer value: " + i;
	        case String s -> "String value: " + s;
	        case Double d -> "Double value: " + d;
	        case null -> "Value is null";
	        default -> "Unknown type";
	    };
	}
	
	/**
	 * Guarded Pattern (when condition)</br>
	 * Add extra condition using <b>when</b>
	 * 
	 * @author Venkata.Pulipati
	 * @since Monday 11-May-2026 12:19:13
	 * @param num
	 * @return
	 */
	static String checkNumber(Integer num) {
	    return switch (num) {
	        case Integer i when i > 0 -> "Positive";
	        case Integer i when i < 0 -> "Negative";
	        case Integer i -> "Zero";
	        case null -> "Null value";
	    };
	}
	
	record Person(String name, int age) {}
	
	/**
	 * Record Pattern (Java 21 powerful feature)</br>
	 * 
	 * ✅ Automatically extracts fields
		✅ No getters needed explicitly

	 * @author Venkata.Pulipati
	 * @since Monday 11-May-2026 12:21:40
	 * @param p
	 * @return
	 */
	static String describe(Person p) {
	    return switch (p) {
	        case Person(String name, int age) when age >= 18 ->
	                name + " is Adult";
	        case Person(String name, int age) ->
	                name + " is Minor";
	        case null -> "Null person";
	    };
	}
	
	sealed interface Shape permits Circle, Rectangle {}

	record Circle(double radius) implements Shape {}
	record Rectangle(double length, double width) implements Shape {}
	/**
	 * Sealed Class + Switch (Best Combination 🔥)</br>
		Compile-time safe switch</br>
		✅ No default needed</br>
		✅ Compiler ensures all cases are covered (exhaustiveness check)</br>

	 * @author Venkata.Pulipati
	 * @since Monday 11-May-2026 12:26:46
	 * @param shape
	 * @return
	 */
	static double area(Shape shape) {
	    return switch (shape) {
	        case Circle c -> Math.PI * c.radius() * c.radius();
	        case Rectangle r -> r.length() * r.width();
	    };
	}
	
	record Address(String city) {}
	record Employee(String name, Address address) {}
	/**
	 * Nested Pattern Matching</br>
		Complex object matching
		
	 * @author Venkata.Pulipati
	 * @since Monday 11-May-2026 13:07:00
	 * @param emp
	 * @return
	 */
	static String getCity(Employee emp) {
	    return switch (emp) {
	        case Employee(String name, Address(String city)) ->
	                name + " lives in " + city;
	        case null -> "Null employee";
	    };
	}
	
	/**
	 * Combining Multiple Labels
	 * 
	 * @author Venkata.Pulipati
	 * @since Monday 11-May-2026 13:14:03
	 * @param obj
	 * @return
	 */
	static String check(Object obj) {
	    return switch (obj) {
//	        case Integer i, Long l -> "Numeric";
	    	case Number n -> "Numeric";//Use common parent type. ✔ Covers Integer, Long, Double, etc.
//	    	case 1, 2, 3 -> "Numbers";//Java allows multiple case labels only for constants, but does not allow multiple pattern variables in a single case because it creates ambiguity in variable binding.
	        case String s -> "String";
	        default -> "Other";
	    };
	}
	
	/**
	 * Null Handling in Switch</br>
	 *  Java 21 allows explicit null case

	 * @author Venkata.Pulipati
	 * @since Monday 11-May-2026 13:15:37
	 * @param o
	 * @return
	 */
	static String test(Object o) {
	    return switch (o) {
	        case null -> "Null case handled";
	        case String s -> "String: " + s;
	        default -> "Other";
	    };
	}
	
}
