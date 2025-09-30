package com.java.interview.nextlevel;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author Venkata.Pulipati
 * @since Monday 29-September-2025 13:32:11
 */
public class MergeList {
	public static void main(String[] args) {
		List<String> collectAtoZ = IntStream.range(65, 91).boxed().map(i -> String.valueOf(i)).collect(Collectors.toList());//Get A-Z. Converting ASCII to char 
		List<String> collect1to9 = IntStream.range(49, 58).boxed().map(i -> String.valueOf(i)).collect(Collectors.toList());//Get 1-9
		
		List<List<String>> asList = Arrays.asList(collectAtoZ, collect1to9);
		List<String> collectUsingFlatMap = asList.stream()
				.flatMap(List::stream)
				.collect(Collectors.toList());
		
		List<String> collectUsingStreamConcat = Stream.concat(collectAtoZ.stream(), collect1to9.stream())
				.collect(Collectors.toList());
		
		/*
		 * Remove duplicate values
		 */
		LinkedHashSet<String> collectWithoutDuplicates = Stream.concat(collectAtoZ.stream(), collect1to9.stream())
				.collect(Collectors.toCollection(LinkedHashSet::new));
		
		Optional<List<String>> collectUsingReducing = Stream.of(collectAtoZ, collect1to9).collect(Collectors.reducing((l1, l2) -> {
			l1.addAll(l2);
			return l1;
		}));
		List<String> list = collectUsingReducing.get();
		
		/*
		 * Get unique list
		 */
		List<String> collectDistinct = Stream.concat(collectAtoZ.stream(), collect1to9.stream()).distinct().collect(Collectors.toList());
		
	}
}
