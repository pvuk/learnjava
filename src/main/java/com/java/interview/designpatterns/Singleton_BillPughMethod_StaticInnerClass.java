package com.java.interview.designpatterns;

/**
 * Pros: Lazy-loaded, thread-safe, no synchronization cost.</br>
 * Cons: Slightly less intuitive for beginners.</br>
 * 
 * @author PULIPATI VENKATA UDAYKIRAN
 * @since Wednesday 22-July-2026 12:20:18
 */
public class Singleton_BillPughMethod_StaticInnerClass {

	// Private constructor to prevent instantiation
	private Singleton_BillPughMethod_StaticInnerClass() {
		// Optional: Prevent instantiation via reflection
		if (SingletonHelper.INSTANCE != null) {
			throw new IllegalStateException("Singleton instance already created!");
		}
	}

	// Static inner class responsible for holding the Singleton instance
	private static class SingletonHelper {
		// The JVM ensures that this instance is created only when the class is loaded
		private static final Singleton_BillPughMethod_StaticInnerClass INSTANCE = new Singleton_BillPughMethod_StaticInnerClass();
	}

	// Public method to provide access to the Singleton instance
	public static Singleton_BillPughMethod_StaticInnerClass getInstance() {
		return SingletonHelper.INSTANCE;
	}
}
