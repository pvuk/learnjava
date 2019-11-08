package com.practice.java.collection.examples;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class CollectionInsertExample {
	public static void main(String[] args) {
		Map<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(4, "d");
		hashMap.put(1, "a");
		hashMap.put(5, "e");
		hashMap.put(2, "b");
		hashMap.put(3, "c");
		hashMap.put(2, "b2");
		hashMap.put(4, "d2");
		hashMap.put(6, "f");
		hashMap.put(10, null);
		hashMap.put(null, null);
		hashMap.put(null, "g");
		/*
		 * 1. hashMap doesn't allow duplicate keys., duplicate key value is taken as new value
		 * 2. not maintain key order., but if we print keys they are printing in asc order
		 */
		System.out.println("========HashMap Print========");
//		printMap(hashMap);
		// Print result 
		for (Map.Entry m : hashMap.entrySet())
          System.out.println(m.getKey() +", " + m.getValue()); 
		
		Map<Integer, String> treeMap = new TreeMap<Integer, String>();
		treeMap.put(1, "a");
		treeMap.put(4, "d");
		treeMap.put(5, "e");
		treeMap.put(2, "b");
		treeMap.put(3, "c");
		treeMap.put(2, "b2");
		treeMap.put(4, "d2");
		treeMap.put(6, "f");
		treeMap.put(10, null);
		System.out.println("========TreeMap Print========");
		printMap(treeMap);
		
		/*
		 * LinkedHashMap is a subclass of HashMap. That means it inherits the features
		 * of HashMap. In addition, the linked list preserves the insertion-order.
		 */
		Map<Integer, String> linkedhashMap = new LinkedHashMap<Integer, String>();
		linkedhashMap.put(1, "a");
		linkedhashMap.put(4, "d");
		linkedhashMap.put(5, "e");
		linkedhashMap.put(2, "b");
		linkedhashMap.put(3, "c");
		linkedhashMap.put(2, "b2");
		linkedhashMap.put(4, "d2");
		linkedhashMap.put(6, "f");
		linkedhashMap.put(10, null);
		System.out.println("========LinkedhashMap Print========");
		printMap(linkedhashMap);
		
		Map<Integer, String> hashTable = new Hashtable<Integer, String>();
		hashTable.put(1, "a");
		hashTable.put(4, "d");
		hashTable.put(5, "e");
		hashTable.put(2, "b");
		hashTable.put(3, "c");
		hashTable.put(2, "b2");
		hashTable.put(4, "d2");
		hashTable.put(6, "f");
		/*
		 * To successfully store and retrieve objects from a HashTable, the objects used
		 * as keys must implement the hashCode method and the equals method. Since null
		 * is not an object, it can’t implement these methods. HashMap is an advanced
		 * version and improvement on the Hashtable. HashMap was created later.
		 */
		hashTable.put(10, null);
		System.out.println("========Hashtable Print========");
		printMap(hashTable);
	}

	private static void printMap(Map<Integer, String> map) {
		System.out.println("Map forEach");
		map.forEach((k, v) -> System.out.println(k +", "+ v));
		
//		System.out.println("keySet iterate");
//		map.keySet().iterator().forEachRemaining(key -> System.out.println(key +", "+ map.get(key)));
	}
}
