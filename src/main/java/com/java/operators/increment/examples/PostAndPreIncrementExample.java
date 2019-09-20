package com.java.operators.increment.examples;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PostAndPreIncrementExample {
	public static void main(String[] args) {
		int i = 0, j = 0;
		log.info("{}", i++);
		log.info("{}", ++j);
		log.info("K Loop");
		for (int k = 0; k < 10; k++) {
			log.info("{}", k);
		}
		log.info("L Loop -> Post increment");
		for (int l = 0; l < 10; ++l) {
			log.info("{}", l);
		}
		log.info("L Loop -> Pre increment");
		for (int l = 0; l < 10;) {
			log.info("{}", ++l);
		}
		
		int a = 5, A;
		A = ++a + ++a + a++;
		log.info("a = 5, A = ++a + ++a + a++, A = {}", A);//20
		
		A = a++ + ++a + ++a;
		log.info("a = 5, A = a++ + ++a + ++a, A = {}", A);//29
	}
}
