package com.java.collection.examples;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Map.Entry;

/**
 * 
 * The reason is that HashMap doesn't allow two identical elements. By default,
 * the hashCode() and equals() methods implemented in Object class are used. The
 * default hashCode() method gives distinct integers for distinct objects, and
 * the equals() method only returns true when two references refer to the same
 * object.
 * 
 * @author venkataudaykiranp
 *
 */
public class TestHashMap {
	public static void main(String[] args) {
		HashMap<Dog, Integer> hashMap = new HashMap<Dog, Integer>();
		Dog d1 = new Dog("red");
		Dog d2 = new Dog("black");
		Dog d3 = new Dog("white");
		Dog d4 = new Dog("white");
		hashMap.put(d1, 10);
		hashMap.put(d2, 15);
		hashMap.put(d3, 5);
		hashMap.put(d4, 20);
		// print size
		System.out.println(hashMap.size());
		// loop HashMap
		for (Entry<Dog, Integer> entry : hashMap.entrySet()) {
			System.out.println(entry.getKey().toString() + " - " + entry.getValue());
		}

		try {
			String producerId = InetAddress.getLocalHost().getHostName();
			String producerId2 = InetAddress.getLocalHost().getHostAddress();

			System.out.println("Producer ID: " + producerId +", ProducerId2: "+ producerId2);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

class Dog {
	String color;

	Dog(String c) {
		color = c;
	}

	public boolean equals(Object o) {
		return ((Dog) o).color == this.color;
	}

	public int hashCode() {
		return color.length();
	}

	public String toString() {
		return color + " dog";
	}
}