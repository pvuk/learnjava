package com.java.set.example;

import java.util.Set;
import java.util.TreeSet;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DefaultSortWhatEverDataInsert {
	public static void main(String[] args) {
		Set<String> treeSet = new TreeSet<String>();
		treeSet.add("COUNTRY");
		treeSet.add("STATE");
		treeSet.add("EMPLOYEE");
		treeSet.add("ADDRESS");
		treeSet.add("PHONE_NUMBER");
		treeSet.add("APPLICATION_DEVELOPER");
		treeSet.add("QA_DEVELOPER");
		treeSet.add("DATABASE_DEVELOPER");
		treeSet.add("FULL_STACK_DEVELOPER");
		log.info("Total records: {}", treeSet.size());
		treeSet.forEach(System.out::println);
	}
}
