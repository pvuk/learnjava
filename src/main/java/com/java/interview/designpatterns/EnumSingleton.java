package com.java.interview.designpatterns;
/**
 * 🛡️ How to Protect Singleton</br>
	Use Enum Singleton (most robust, prevents reflection, serialization, cloning issues).</br>

 * Pros: Simplest, inherently thread-safe, protects against serialization/deserialization and reflection attacks.</br>
 * Cons: Less flexible if you need lazy initialization.</br>
 * 
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
