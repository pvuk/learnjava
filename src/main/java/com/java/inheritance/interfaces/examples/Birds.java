package com.java.inheritance.interfaces.examples;

import lombok.extern.slf4j.Slf4j;

/**
 * 
 * @author venkataudaykiranp
 * 
 *         one class implements two interfaces with common methods. At Run-time
 *         polymorphism which method is need to be initialize will be decided by
 *         compiler
 *
 */
@Slf4j
public class Birds implements Food, Nuts {

	@Override
	public String forBirds() {
		return "chapathi";
	}

	@Override
	public String forHumans() {
		
		return "for Humans";
	}

	@Override
	public String forAnimals() {
		
		return "for Animals";
	}

	public static void main(String[] args) {
		Food f = new Birds();
		log.info("Food for Birds: {}", f.forBirds());
	}
}
