package com.java.collection.examples;

import java.util.TreeSet;

/**
 * 
 * <table border="1" cellspacing="0" cellpadding="6">
    <thead>
        <tr>
            <th>Feature</th>
            <th>TreeMap</th>
            <th>TreeSet</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td>Definition</td>
            <td>Stores data in key–value pairs</td>
            <td>Stores only unique values</td>
        </tr>
        <tr>
            <td>Implements</td>
            <td>NavigableMap&lt;K,V&gt; → SortedMap&lt;K,V&gt;</td>
            <td>NavigableSet&lt;E&gt; → SortedSet&lt;E&gt;</td>
        </tr>
        <tr>
            <td>Underlying Data Structure</td>
            <td>Red‑Black Tree</td>
            <td>Red‑Black Tree</td>
        </tr>
        <tr>
            <td>Sorting</td>
            <td>Sorted by keys</td>
            <td>Sorted by elements</td>
        </tr>
        <tr>
            <td>Duplicates</td>
            <td>Keys must be unique, values can repeat</td>
            <td>No duplicates allowed</td>
        </tr>
        <tr>
            <td>Null Handling</td>
            <td>Null key not allowed (Java 8+)</td>
            <td>Null element not allowed</td>
        </tr>
        <tr>
            <td>Use Case</td>
            <td>When you want sorted mapping of key → value</td>
            <td>When you want sorted collection of unique elements</td>
        </tr>
    </tbody>
</table>
</br>
✅ Short Interview Answer
TreeSet stores only unique elements in sorted order using a Red‑Black Tree.
TreeMap stores key–value pairs in sorted order of keys using a Red‑Black Tree.
TreeSet = Set implementation; TreeMap = Map implementation.</br>

 * @author Venkata.Pulipati
 * @since Thursday 26-March-2026 13:56:26
 */
public class TreeSetExample {
	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<>();
		set.add(30);
		set.add(10);
		set.add(20);
		System.out.println(set); 
	}
}
