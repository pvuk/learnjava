package com.java.collection.examples;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

/**
 * <a href="https://dzone.com/articles/hashmap-vs-treemap-vs">LinkedHashMap</a> is a subclass of HashMap. That means it inherits the features
 * of HashMap. In addition, the linked list preserves the insertion-order. Let's
 * replace the HashMap with LinkedHashMap using the same code used for HashMap.
 * 
 * @author venkataudaykiranp
 *
 */
public class TestLinkedHashMap {
	public static void main(String[] args) {
		Dog3 d1 = new Dog3("red");
		Dog3 d2 = new Dog3("black");
		Dog3 d3 = new Dog3("white");
		Dog3 d4 = new Dog3("white");
		LinkedHashMap<Dog3, Integer> linkedHashMap = new LinkedHashMap<Dog3, Integer>();
		linkedHashMap.put(d1, 10);
		linkedHashMap.put(d2, 15);
		linkedHashMap.put(d3, 5);
		linkedHashMap.put(d4, 20);
		for (Entry entry : linkedHashMap.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}
	}
}

class Dog3 {
	String color;

	Dog3(String c) {
		color = c;
	}

	public boolean equals(Object o) {
		return ((Dog3) o).color == this.color;
	}

	public int hashCode() {
		return color.length();
	}

	public String toString() {
		return color + " dog";
	}
}