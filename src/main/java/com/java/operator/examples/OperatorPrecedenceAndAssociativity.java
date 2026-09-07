package com.java.operator.examples;

/**
 * In Java, operator precedence and associativity determine how expressions are evaluated when multiple operators are involved. Here's a breakdown with examples to help you understand how Java handles this:</br>

	🔹 Operator Precedence</br>
	Operator precedence defines the order in which operators are evaluated in an expression.</br>
	
	High to Low Precedence (Selected Operators)</br>
	| Precedence | Operators                         | Description              |</br>
	|------------|-----------------------------------|--------------------------|</br>
	| 1          | `()`                              | Parentheses (grouping)   |</br>
	| 2          | `++`, `--`, `+`, `-`, `~`, `!`     | Unary operators          |</br>
	| 3          | `*`, `/`, `%`                     | Multiplicative           |</br>
	| 4          | `+`, `-`                          | Additive                 |</br>
	| 5          | `<<`, `>>`, `>>>`                 | Bitwise shift            |</br>
	| 6          | `<`, `>`, `<=`, `>=`              | Relational               |</br>
	| 7          | `==`, `!=`                        | Equality                 |</br>
	| 8          | `&`                               | Bitwise AND              |</br>
	| 9          | `^`                               | Bitwise XOR              |</br>
	| 10         | `|`                               | Bitwise OR               |</br>
	| 11         | `&&`                              | Logical AND              |</br>
	| 12         | `||`                              | Logical OR               |</br>
	| 13         | `?:`                              | Ternary conditional      |</br>
	| 14         | `=`, `+=`, `-=`, etc.             | Assignment               |</br>

	🔹 Associativity</br>
	Associativity determines the direction in which operators of the same precedence are evaluated.</br>
	
	Left-to-right: Most binary operators (+, -, *, /, etc.)</br>
	Right-to-left: Assignment (=, +=, etc.), unary operators (++, --), ternary (?:)</br>

 * @author Venkata.Pulipati
 * @since Thursday 18-September-2025 15:32:46
 */
public class OperatorPrecedenceAndAssociativity {
	public static void main(String[] args) {
//		✅ Example 1: Precedence
		int result = 10 + 5 * 2;
		// Multiplication (*) has higher precedence than addition (+)
		// So: 5 * 2 = 10, then 10 + 10 = 20
		System.out.println(result); // Output: 20

//		✅ Example 2: Associativity
		int a = 5;
		int b = 10;
		int c = 15;

		int result1 = a + b + c;
		// '+' is left-associative: (a + b) + c = 15 + 15 = 30
		System.out.println(result1); // Output: 30
		
//		✅ Example 3: Parentheses override precedence
		int result3 = (10 + 5) * 2;
		// Parentheses force addition first: 15 * 2 = 30
		System.out.println(result3); // Output: 30
		
//		✅ Example 4: Assignment associativity
		int a1, b1, c1;
		a1 = b1 = c1 = 100;
		// '=' is right-associative: c = 100, then b = 100, then a = 100
		System.out.println(a1 + " " + b1 + " " + c1); // Output: 100 100 100



	}
}
