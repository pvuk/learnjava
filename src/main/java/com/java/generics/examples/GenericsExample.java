package com.java.generics.examples;

/**
 * 
 * @author VenkataUdayKiranP
 * 
 * Using Type Parameter
 *
 * @param <T>
 */
public class GenericsExample<T> {

	// Accept any object of type T
	T obj;

	GenericsExample(T obj) {
		this.obj = obj;
	}

	public T getObject() {
		return this.obj;
	}

	public static void main(String[] args) {
		GenericsExample<Integer> intObj = new GenericsExample<Integer>(16);
		System.out.println(intObj.getObject());
		GenericsExample<String> strObj = new GenericsExample<String>("Formula");
		System.out.println(strObj.getObject());
	}

}