package com.practice.java.operator.example;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Test {
	
	public static void main(String[] args) {
		log.info("{}", 2 != 1 ^ 5 != 5);
	}
}
