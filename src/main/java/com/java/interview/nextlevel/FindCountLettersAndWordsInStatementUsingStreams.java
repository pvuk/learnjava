package com.java.interview.nextlevel;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author Venkata.Pulipati
 * @since Monday 23-March-2026 16:07:31
 */
public class FindCountLettersAndWordsInStatementUsingStreams {
	public static void main(String[] args) {
		String statement = "Top 5 Java 17 Features\r\n"
				+ "1. Sealed Classes (Finalized)\r\n"
				+ "Allows you to control which classes can extend or implement a class.\r\n"
				+ "✔ Improves security, maintainability, and domain modeling."
				+ ""
				+ "2. Pattern Matching for instanceof (Finalized)\r\n"
				+ "Removes boilerplate code when checking and casting types."
				+ ""
				+ "3. Switch Expressions Enhancements (Preview in earlier, stable in 17)\r\n"
				+ "Better, cleaner, and safer switch syntax."
				+ ""
				+ "4. New macOS Rendering Pipeline (JEP 382)\r\n"
				+ "A new pipeline based on Metal API (instead of deprecated OpenGL).\r\n"
				+ "✔ Better performance & consistent rendering\r\n"
				+ "✔ Important for desktop apps"
				+ ""
				+ "5. JDK Internals Strong Encapsulation (JEP 403)\r\n"
				+ "Java 17 fully encapsulates JDK internals, blocking reflective access.\r\n"
				+ "✔ Improves security\r\n"
				+ "✔ Avoids relying on unsupported APIs\r\n"
				+ "You must use public APIs or add --add-opens if needed."
				+ ""
				+ "⭐ Bonus Features\r\n"
				+ "\r\n"
				+ "Enhanced Pseudo‑Random Number Generators (PRNGs)\r\n"
				+ "Deprecation of Applet API\r\n"
				+ "New macOS/AArch64 support\r\n"
				+ "Foreign Function & Memory API (Incubator)";
		
		String cleanStatement = statement
				.replaceAll("[\\r\\n]", " ") //newLine replacing with space
				.replaceAll("[^a-zA-Z0-9]", " ");//remove special characters
		String[] words = cleanStatement.split("\\s+");
		
		Map<String, Integer> wordCount = new LinkedHashMap<>();
		for(String word : words) {
			wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);//If word fount increment +1 otherwise 1
		}
		
		wordCount.forEach((k, v) -> System.out.println("Word: "+ k +" -> "+ v));
	}
}
