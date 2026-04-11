package com.practice.java.array.examples;

import java.util.List;

@FunctionalInterface
public interface FunInt_SortAlphabets {
	 
	abstract List<String> sort(List<String> list, SortOrder direction);
}
