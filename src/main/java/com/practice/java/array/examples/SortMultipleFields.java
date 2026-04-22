package com.practice.java.array.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author Venkata.Pulipati
 * @since Thursday 16-April-2026 16:22:20
 */
public class SortMultipleFields {
	public static void main(String[] args) {
		
		/*
		 * ⚠️ Double Brace Initialization (Not Recommended)
		 * 
		 *  🚫 Creates anonymous inner class
		 *	🚫 Memory leak risk
		 *	🚫 Avoid in production and interviews
		 */
//		List<Vegetable> vegetableList1 = new ArrayList<>() {
//			{
//				new Vegetable("Tamato", "Red");
//				new Vegetable("Capsicum", "Green");
//			}
//		};
		
		//✅ Final Recommendation (Interview + Real Projects)
		List<Vegetable> vegetableList = new ArrayList<>(
				List.of(new Vegetable("Tamato", "Red"), new Vegetable("Capsicum", "Green")
						, new Vegetable("Cucumber", "Yellow")
						, new Vegetable("Capsicum", "Yellow")));
		
		sortUsingComparator(vegetableList);
		sortAscendingThenDescending(vegetableList);//Sort by Name (Ascending), then Color (Descending)
	}

	private static void sortAscendingThenDescending(List<Vegetable> vegetableList) {
		Comparator<Vegetable> comparator = Comparator.comparing(Vegetable::getName)
				.thenComparing(Comparator.comparing(Vegetable::getColor).reversed());

		Collections.sort(vegetableList, comparator);
	}

	private static void sortUsingComparator(List<Vegetable> vegetableList) {
		Comparator<Vegetable> comparator = Comparator.comparing(Vegetable::getName).thenComparing(Vegetable::getColor);
		Collections.sort(vegetableList, comparator);
		System.out.println(vegetableList);
	}
}
