package com.practice.java.collection.examples;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListInsertExample {
	
	public static void main(String[] args) {
		List<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(1);
		arrayList.add(4);
		arrayList.add(2);
		arrayList.add(6);
		arrayList.add(3);
		arrayList.add(4);
		System.out.println("=============Print ArrayList=============");
		printList(arrayList);
		
		List<Integer> linkedList = new LinkedList<Integer>();
		linkedList.add(1);
		linkedList.add(4);
		linkedList.add(2);
		linkedList.add(6);
		linkedList.add(3);
		linkedList.add(4);
		System.out.println("=============Print LinkedList=============");
		printList(linkedList);
		
		List<Integer> vectorList = new Vector<>();
		vectorList.add(1);
		vectorList.add(4);
		vectorList.add(2);
		vectorList.add(6);
		vectorList.add(3);
		vectorList.add(4);
		System.out.println("=============Print Vector=============");
		printList(vectorList);
	}

	private static void printList(List<Integer> list) {
		list.forEach(i -> System.out.println(i));
	}
}
