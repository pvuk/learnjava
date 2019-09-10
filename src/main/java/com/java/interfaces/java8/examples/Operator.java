package com.java.interfaces.java8.examples;

interface Operator {
	int operate(int n);

	default int inverse(int n) {
		return -operate(n);
	}
}
