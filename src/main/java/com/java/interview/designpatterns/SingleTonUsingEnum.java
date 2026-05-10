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


	}
}
