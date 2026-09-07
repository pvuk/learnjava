package com.java.interview.designpatterns;

/**
 * @author venkata.pulipati
 * @since Wednesday 06-May-2026 14:57:49
 */
public class SingleTonUsingEnum {
	public static void main(String[] args) {

		EnumSingleton singleton = EnumSingleton.INSTANCE;
        singleton.showMessage();
        

        EnumSingleton s1 = EnumSingleton.INSTANCE;
        EnumSingleton s2 = EnumSingleton.INSTANCE;

        s1.increment();
        s2.increment();

        System.out.println(s1.getCounter()); // 2 (same instance)
		/*
		 * The output will be 2 because both s1 and s2 refer to the same instance of
		 * EnumSingleton. Enums in Java are inherently singletons, so any reference to
		 * EnumSingleton.INSTANCE will point to the same object.</br>
		 * 
		 * 🔎 Why Enum Singleton is Always One Instance</br>
			Enum contract in Java: Each enum constant is instantiated exactly once when the enum class is loaded.
			
			JVM guarantee: The same reference is returned every time you access EnumSingleton.INSTANCE.
			
			Serialization safety: Even if you serialize/deserialize, the JVM ensures you still get the same instance.
		 */
        System.out.println(s1 == s2); // true (same instance));
	}
}
