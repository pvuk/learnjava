package com.java.escapesequence;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EscapseSequence {
	
	public static void main(String[] args) {
		//\r is carriage return and \n is line feed
		log.info("printing slach(\\)r value: {} in log.", "\r"); // \r for mac(before OS X)
		log.info("printing slach(\\)n value: {} in log.", "\n");// \n for unix
		log.info("printing slach(\\)r(\\)n value: {} in log.", "\r\n"); // \r\n windows
		log.info("printing slach(\\)r(\\)r(\\)n value: {} in log.", "\r\r\n");
		log.info("printing slach(\\)r(\\)n(\\)n value: {} in log.", "\r\n\n");
		String lineSeparator = new StringBuilder().append(System.lineSeparator()).toString();// why \r\n in windows not appending
		log.info("Printing lineSeparator: " + lineSeparator + ""
				+ System.lineSeparator() + " in OS: " + System.getProperty("os.name"));// it will give you appropriate to the OS
	}
}
