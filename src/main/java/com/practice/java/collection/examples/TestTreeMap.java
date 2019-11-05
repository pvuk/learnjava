package com.practice.java.collection.examples;

import java.util.Map.Entry;
import java.util.TreeMap;

/**
 * https://dzone.com/articles/hashmap-vs-treemap-vs
 * 
 * @author venkataudaykiranp
 *
 */
public class TestTreeMap {
	public static void main(String[] args) {
		Dog2 d1 = new Dog2("red", 30);
		Dog2 d2 = new Dog2("black", 20);
		Dog2 d3 = new Dog2("white", 10);
//		Dog2 d4 = new Dog2("white", 10);
		
		// It is sorted by key, i.e., dog size in this case. If "Dog d4 = new
		// Dog("white", 10);" is replaced with "Dog d4 = new Dog("white", 40);", the
		// output would be: 
		//		white dog – 20
		//		red dog – 10
		//		black dog – 15
		//		white dog – 5
		// The reason is that TreeMap now uses compareTo() method to compare keys. Different sizes make different dogs!  
		Dog2 d4 = new Dog2("white", 40);
		
		TreeMap<Dog2, Integer> treeMap = new TreeMap<Dog2, Integer>();
		treeMap.put(d1, 10);
		treeMap.put(d2, 15);
		treeMap.put(d3, 5);
		treeMap.put(d4, 20);
		for (Entry<Dog2, Integer> entry : treeMap.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}
	}
}

/*
 * Exception in thread "main" java.lang.ClassCastException:
 * com.java.collection.examples.Dog2 cannot be cast to java.lang.Comparable at
 * java.util.TreeMap.compare(TreeMap.java:1294) at
 * java.util.TreeMap.put(TreeMap.java:538)
 * 
 * Since TreeMaps are sorted by keys, the object for key has to be able to
 * compare with each other, that's why it has to implement Comparable interface.
 * For example, you use String as key, because String implements Comparable
 * interface. Let's change the Dog, and make it comparable.
 */
class Dog2 implements Comparable<Dog2> {
	String color;
	int size;

	Dog2(String c, int s) {
	color = c;
	size = s;
	}
	
	public boolean equals(Object o) {
		return ((Dog2) o).color == this.color;
	}

	public int hashCode() {
		return color.length();
	}
	
	public String toString() {
		return color + " dog";
	}

	@Override
	public int compareTo(Dog2 o) {
		return o.size - this.size;
	}
}