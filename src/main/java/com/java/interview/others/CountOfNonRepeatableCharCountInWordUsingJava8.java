package com.java.interview.others;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author P.V. UdayKiran
 * @version 1, created on Tue 29-Sep-2020 08:33
 */
public class CountOfNonRepeatableCharCountInWordUsingJava8 {
	public static void main(String[] args) {
		String word = "Java";
//		Arrays.stream(word)
//        .boxed()
//        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
//        .entrySet()
//        .stream()
//        .filter(e -> e.getValue() == 1)
//        .map(Map.Entry::getKey)
//        .collect(Collectors.toList());
//		Map<String, Long> collect = Stream.of(word.toCharArray())
//				.map(c -> (char) c)
//				.collect(Collectors.groupingBy(Object::toString, Collectors.counting()));
		Map<String, Integer> map = new LinkedHashMap<>();
		Function<Character, String> fun = (ch) -> {
			if(map.containsKey(ch.toString())) {
				map.remove(ch.toString());
			} else {
				map.put(ch.toString(), 1);
			}
			return map.toString();
		};
		
		float fl = 1;
		Stream<Object> collect = word.chars()
		.mapToObj(c -> (char) c)
		;
		
		word.chars()
				.mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Object::toString, Collectors.counting()))
				.entrySet()
				.stream()
				.filter(count -> count.getValue() == 1)
				
				.forEach(System.out::print);
		System.out.println();
	
	}
	
	
}
