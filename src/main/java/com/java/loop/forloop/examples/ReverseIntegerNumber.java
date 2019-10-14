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
	}
}
