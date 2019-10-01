package com.java.operators.increment.examples;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PostAndPreIncrementExample {
	public static void main(String[] args) {
		int i = 0, j = 0;
		log.info("i: {}, i++: {}", i, i++);
		log.info("j: {}, ++j: {}", j, ++j);
		int kLoop = 5;
		log.info("K Loop times: {}", kLoop);
		for (int k = 0; k < kLoop; k++) {
			log.info("{}", k);
		}
		log.info("L Loop -> Post increment");
		for (int l = 0; l < 5; l++) {
			log.info("{}", l);
		}
		log.info("L Loop -> Pre increment");
		for (int l = 0; l < 5;) {
			log.info("{}", ++l);
		}
		
		int a = 5, A;
		A = ++a + ++a + a++;
		log.info("a = {}, A = ++a + ++a + a++, A = {}", a, A);//20
		
		A = a++ + ++a + ++a;
		log.info("a = {}, A = a++ + ++a + ++a, A = {}", a, A);//29
	}
}
