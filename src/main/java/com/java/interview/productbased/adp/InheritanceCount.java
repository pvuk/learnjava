package com.java.interview.productbased.adp;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class InheritanceCount implements Alphabets {

//	public int i = 4;//this variable value not consider
	
	public static void main(String[] args) {
		Alphabets a = new InheritanceCount();
		Number b = new InheritanceCount();
		log.info("Output: {}, {}", a.i, b.i);
	}
}
