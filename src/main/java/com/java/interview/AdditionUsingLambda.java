package com.java.interview;

import java.util.function.BiConsumer;

/**
 * <p>What is the output of below statements ?</p>
 * @author P V UdayKiran
 *
 * @version 1, changes on Sun 12-Apr-2020 15:34
 *
 */
public class AdditionUsingLambda {
	public static void main(String[] args) {
		BiConsumer<Integer, Integer> sum = (a, b) -> {
			System.out.print("Add two numbers using Lambda(BiConsumer): ");
			System.out.println(a + b);
		};
		sum.accept(10, 20);

		int a = 10, b = 20;
		System.out.println("Normal Java7 Add: " + (a + b));
	}
}
