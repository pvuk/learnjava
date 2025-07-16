package com.java.loop.forloop.examples;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ReverseIntegerNumber {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i = 1234, coff = 0;
		while(i != 0) {
			coff = i % 10;
			i = i / 10;//remainder 123, 12, 1
			log.info("{}", coff);
		}
		
		/*
		 * Example 2:
		 * Time Complexity - O(log n)
		 * Space Complexity - O(1)
		 */
		int j = 4562, revNum = 0;
		while(j > 0) {
			revNum = revNum * 10 + (j % 10);
			j = j / 10;
		}
		System.out.println("Rever Number: "+ revNum);
	}
}
