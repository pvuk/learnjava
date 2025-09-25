package com.java17.features;

/**
 * <b>Preview Feature</b></br>
 * Pattern Matching for switch (Preview)</br>
 * Concise Code: Pattern matching for switch statements allows for more concise and readable code, reducing boilerplate and improving maintainability.</br>
Flexibility: This feature provides more flexibility in handling different types and patterns in switch statements.</br>

 * @author Venkata.Pulipati
 * @since Tuesday 19-August-2025 17:00:32
 */
public class PatternMatchingSwitchExample {
	public static void main(String[] args) {
		//Java 17 Preview Feature
		Object obj = "Java 17";
		String result = switch(obj) {
		case Integer i -> "Integer: "+ i;
		case String s -> "String: "+ s;
			default -> "Unknown Type";
		};
		System.out.println(result);
	}
}
