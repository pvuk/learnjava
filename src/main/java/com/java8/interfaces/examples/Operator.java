package com.java8.interfaces.examples;

interface Operator {
	int operate(int n);

	default int inverse(int n) {
		return -operate(n);
	}
}
