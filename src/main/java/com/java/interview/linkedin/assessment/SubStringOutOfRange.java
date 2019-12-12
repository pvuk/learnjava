package com.java.interview.linkedin.assessment;

class SubStringOutOfRange {
	public static void main(String[] args) {
		String message = "Hello world!";
		String newMessage = message.substring(6, 12) + message.substring(12, 6);
		System.out.println(newMessage);
	}
}