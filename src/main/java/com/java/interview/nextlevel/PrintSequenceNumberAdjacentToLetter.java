package com.java.interview.nextlevel;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

/**
 * A1, B2, C3 ...., Z26
 * 
 * @author Venkata.Pulipati
 * @since Monday 13-April-2026 12:45:09
 */
public class PrintSequenceNumberAdjacentToLetter {
	public static void main(String[] args) {
		AtomicInteger count = new AtomicInteger();
		/**
		 * So when you write:
			IntStream.rangeClosed('A', 'Z')
			
			Java automatically converts:
			'A' → 65
			'Z' → 90
			
			This is called implicit widening primitive conversion.
			✅ char → int is always allowed
			❌ int → char is NOT implicit (possible data loss)
			
		 * Why Java allows this (language rule)
			Java permits widening conversions automatically:
			byte → short → int → long → float → double
			char → int → long → float → double
		 */
		IntStream.rangeClosed('A', 'Z').forEach(i -> System.out.println((char) i + "" + count.incrementAndGet()));//converting ascii value i to char
	}
}
	