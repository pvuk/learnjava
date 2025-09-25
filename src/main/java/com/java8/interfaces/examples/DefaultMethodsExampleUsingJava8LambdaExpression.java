package com.java8.interfaces.examples;

public class DefaultMethodsExampleUsingJava8LambdaExpression {
	public static int applyInverse(int n, Operator operator) {
		return operator.inverse(n);
	}

	public static void main(String[] args) {
		System.out.println(applyInverse(3, n -> n * n + 7));
	}
}