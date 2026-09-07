package com.java.interview.coforge;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * @author P.V. UdayKiran
 * @version 1
 * @since created on Tue 17-Jun-2025 15:08
 * 
 */
public class SecondDuplicateCharacterInWord {
	public static void main(String[] args) {
		String str = "Java is awesome";//2nd duplicate character
		Map<Object, Long> collect = Arrays.asList(str.split("")).stream()
				.collect(Collectors.groupingBy(s -> s, LinkedHashMap::new, Collectors.counting()));// maintaining order LinkedHashMap
		collect.forEach((k, v) -> {
			if(v > 1)
				System.out.println("Duplicate Char: "+ k +", Repeated times: "+ v);
		});
		
		//Example 2
		Optional<Entry<String, Long>> optionalEntry = Arrays.asList(str.split("")).stream()
				.filter(val -> !val.equals(" "))
				.collect(Collectors.groupingBy(s->s, LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream()
				.filter(entry -> entry.getValue() > 1)// only duplicates
				.skip(1)//- <-- skip the first duplicate, get the second duplicate.
				.findFirst();
//		System.out.println("Exclude Spaces: 2nd Duplicate Char: "+ (optionalEntry.isPresent() ? optionalEntry.get().getKey() : null));
		//or
		optionalEntry.ifPresent(entry -> System.out.println("Exclude Spaces: 2nd Duplicate Char: "+ entry.getKey() +", Repeated times: "+ entry.getValue()));
	}
}
