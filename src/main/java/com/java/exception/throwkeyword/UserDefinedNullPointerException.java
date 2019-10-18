package com.java.exception.throwkeyword;

public class UserDefinedNullPointerException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	String message;

	UserDefinedNullPointerException(String message){
		this.message = message;
	}
	
	@Override
	public String toString() {
		return "Custom Exception: "+ message;
	}
}
