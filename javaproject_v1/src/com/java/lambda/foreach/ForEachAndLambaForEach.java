package com.java.lambda.foreach;

import java.util.ArrayList;
import java.util.List;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ForEachAndLambaForEach {
	
	public static void main(String[] args) {
		List<String> fruits = new ArrayList<String>();
		fruits.add("Apple");
		fruits.add("Grapes");
		fruits.add("Mango");
		fruits.add("Pomogranate");
		fruits.add("Banana");
		fruits.add("Pinapile");
		
		log.info("for loop using normal forloop");
		for (int i = 0; i < fruits.size(); i++){
			System.out.println(fruits.get(i));
		}
		
		log.info("for loop using Lamba Express");
		fruits.forEach(fruit -> System.out.println(fruit));
	}
}
