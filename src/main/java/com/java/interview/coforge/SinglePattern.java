package com.java.interview.coforge;
/**
 * @author P.V. UdayKiran
 * @version 1
 * @since created on Tue 17-Jun-2025 15:16
 * 
 */
public class SinglePattern {
	
	private static SinglePattern singlePattern = null;
	
	private SinglePattern() {
		// TODO Auto-generated constructor stub
	}
	
	public static SinglePattern getInstance() {
		if(singlePattern == null) {
			singlePattern = new SinglePattern();
		}
		return singlePattern;
	}
}
