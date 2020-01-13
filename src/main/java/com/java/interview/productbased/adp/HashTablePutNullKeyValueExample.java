package com.java.interview.productbased.adp;

import java.util.Hashtable;

/**
 * Q 14. Hashtable which of the following A. One null key B. Multiple null
 * values C. Both A & B above D. None of the above Ans: D
 * 
 * <p>
 * <a href="https://www.geeksforgeeks.org/hashtable-in-java/">Hashtable</a> maps keys to values. Any non-null object can be used as a key or as a
 * value. To successfully store and retrieve objects from a hashtable, the
 * objects used as keys must implement the hashCode method and the equals
 * method.
 * 
 * <ul>
 * 	<li>It is similar to HashMap, but is synchronised.</li>
 *  <li>Hashtable stores key/value pair in hash table.</li>
 *  <li>In Hashtable we specify an object that is used as a key, and the value we want to associate to that key. The key is then hashed, and the resulting hash code is used as the index at which the value is stored within the table.</li>
 * </p>
 * 
 * @author Priyanka
 *
 * @Date Thu 07-Nov-2019 19:42 Internation date format yyyy-MM-dd
 */
public class HashTablePutNullKeyValueExample {

	public static void main(String[] args) {
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		ht.put(1, "A");
		ht.put(null, "B");
		ht.put(3, null);
		ht.put(4, null);
		ht.put(null, "E");
		System.out.println("Hashtable: " + ht);
	}
}
