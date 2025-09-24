package com.java.interview.coforge;

import java.lang.reflect.Constructor;

/**
 * @author Venkata.Pulipati
 * @since Friday 19-September-2025 13:57:49
 */
public class BreakSingleTon {
	public static void main(String[] args) {
		try {
			SinglePattern instanceOne = SinglePattern.getInstance();
			Constructor<SinglePattern> constructor = SinglePattern.class.getDeclaredConstructor();
			constructor.setAccessible(true);
			
			SinglePattern instanceTwo = SinglePattern.getInstance();
			System.out.println(instanceOne == instanceTwo);
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}
	}
}
