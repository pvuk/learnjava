package com.java.accessmodifier.examples;

import lombok.Data;

@Data
public class PrivateConstructorExample {
	
	private String message;
	
	private PrivateConstructorExample() {
		
	}
}
