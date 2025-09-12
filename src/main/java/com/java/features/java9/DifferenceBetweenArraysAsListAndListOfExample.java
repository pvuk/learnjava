package com.java.features.java9;

import java.util.Arrays;
import java.util.List;

/**
 * What's difference between Arrays.asList and List.of</br>
 * Great question! In Java, both Arrays.asList() and List.of() are used to create lists, but they have important differences in behavior and use cases. Here's a breakdown:</br>

✅ 1. Mutability</br>
Arrays.asList(): Returns a mutable list, but the size is fixed. You can change elements, but you cannot add or remove elements.</br>


List.of() (Java 9+): Returns an immutable list. You cannot modify it at all.</br>


✅ 2. Null Elements</br>
Arrays.asList(): Allows null elements.</br>


List.of(): Throws NullPointerException if any element is null.</br>


✅ 3. Backed by Array</br>
Arrays.asList(): The returned list is backed by the original array. Changes to the array reflect in the list.</br>


List.of(): Not backed by an array. It creates a new immutable list.</br>

✅ 4. Performance and Use Case</br>
Arrays.asList(): Useful when you need a fixed-size list that can be modified.</br>
List.of(): Preferred for creating read-only lists with better safety and performance.</br>

Summary Table</br>
| Feature              | `Arrays.asList()`         | `List.of()` (Java 9+)       |
|----------------------|---------------------------|-----------------------------|
| Mutability           | Mutable (fixed size)      | Immutable                   |
| Allows `null`        | Yes                       | No                          |
| Backed by array      | Yes                       | No                          |
| Modification allowed | Element change only       | No modification allowed     |
| Java version         | Java 1.2+                 | Java 9+                     |

 * @author Venkata.Pulipati
 * @since Wednesday 20-August-2025 14:27:01
 */
public class DifferenceBetweenArraysAsListAndListOfExample {
	public static void main(String[] args) {

		// Using Arrays.asList()
		        String[] array = {"A", "B", "C"};
		        List<String> arrayList = Arrays.asList(array);

		        System.out.println("Arrays.asList(): " + arrayList);

		        // Modifying element - allowed
		        arrayList.set(0, "X");
		        System.out.println("Modified Arrays.asList(): " + arrayList);

		        // Trying to add element - throws UnsupportedOperationException
		        try {
		            arrayList.add("D");
		        } catch (UnsupportedOperationException e) {
		            System.out.println("Cannot add to Arrays.asList(): " + e);
		        }

		        // Using List.of()
		        List<String> immutableList = List.of("A", "B", "C");
		        System.out.println("List.of(): " + immutableList);

		        // Trying to modify element - throws UnsupportedOperationException
		        try {
		            immutableList.set(0, "X");
		        } catch (UnsupportedOperationException e) {
		            System.out.println("Cannot modify List.of(): " + e);
		        }

		        // Trying to add element - throws UnsupportedOperationException
		        try {
		            immutableList.add("D");
		        } catch (UnsupportedOperationException e) {
		            System.out.println("Cannot add to List.of(): " + e);
		        }

		        // Trying to create List.of() with null - throws NullPointerException
		        try {
		            List<String> nullList = List.of("A", null, "C");
		        } catch (NullPointerException e) {
		            System.out.println("Cannot create List.of() with null: " + e);
		        }

	}
}
