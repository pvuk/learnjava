package com.java.interview.coforge;
/**
 * @author P.V. UdayKiran
 * @version 1
 * @since created on Tue 17-Jun-2025 15:16
 * 
 */
public class SinglePattern {
	
	private static SinglePattern singlePattern = null;
	
	/**
	 * ✅ Private constructor → prevents new keyword
	 */
	private SinglePattern() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * ✅ Static getInstance() → returns same instance
	 * 
	 * @author venkata.pulipati
	 * @since Tuesday 05-May-2026 12:21:55
	 * @return
	 */
	public static SinglePattern getInstance() {
		if(singlePattern == null) {
			singlePattern = new SinglePattern();
		}
		return singlePattern;
	}
}
