package com.java.interview.designpatterns;
/**
 * ✅ JVM guarantees:

	. One instance
	. Serialization safety
	. Reflection safety

 * @author venkata.pulipati
 * @since Tuesday 05-May-2026 13:16:43
 */
public enum EnumSingleton {
    INSTANCE;

	private int counter;

    // Constructor (implicitly private)
    EnumSingleton() {
        counter = 0;
    }

    public void increment() {
        counter++;
    }

    public int getCounter() {
        return counter;
    }

	public void showMessage() {
        System.out.println("Hello from Enum Singleton!");
    }
}
