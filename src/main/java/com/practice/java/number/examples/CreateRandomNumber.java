package com.practice.java.number.examples;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

/**
 * 
 * @author venkataudaykiranp
 * @Date Thu 12-Dec-2019 14:35
 */
public class CreateRandomNumber {
	
	private int randomNumberSize;
	private static int totalNumbers;
	
	public static void main(String[] args) {
		Random random = new Random();
		DoubleStream doubleStream = random.doubles(0000, 9999).limit(totalNumbers);
		List<Double> collect = doubleStream.boxed().collect(Collectors.toList());
		System.out.println(collect);
	}
}
