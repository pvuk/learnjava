package com.java.generics.examples;

/**
 * 
 * @author VenkataUdayKiranP
 * 
 * Using Multi Parameter
 *
 * @param <T>
 * @param <U>
 */
public class GenericsMultipleTypeExample<T, U> {

	T t;
	U u;

	GenericsMultipleTypeExample(T t, U u) {
		this.t = t;
		this.u = u;
	}

	public void print() {
		System.out.println(t);
		System.out.println(u);
	}
}

class Main {
	public static void main(String[] args) {
		GenericsMultipleTypeExample<String, Integer> multiGeneric = new GenericsMultipleTypeExample<String, Integer>(
				"Formula", 16);
		multiGeneric.print();
	}
}