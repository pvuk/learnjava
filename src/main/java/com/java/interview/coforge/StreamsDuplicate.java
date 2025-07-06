package com.java.interview.coforge;

import java.util.Arrays;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

/**
 * @author P.V. UdayKiran
 * @version 1
 * @since created on Tue 17-Jun-2025 15:08
 * 
 */
public class StreamsDuplicate {
	public static void main(String[] args) {
		String str = "Java is awesome";//2nd duplicate character
		Map<Object,Long> collect = Arrays.asList(str.split("")).stream().collect(Collectors.groupingBy(s->s, Collectors.counting()));
		AtomicInteger count = new AtomicInteger(1);
		collect.forEach((k, v) -> {
			if(count.incrementAndGet() == 2) {
				System.out.println("2nd Duplicate Char: "+ k +", Repeated times: "+ v);
			}
		});
		
		//Example 2
		Optional<Entry<String, Long>> first = Arrays.asList(str.split("")).stream().collect(Collectors.groupingBy(s->s, Collectors.counting()))
				.entrySet().stream()
				.skip(0)//- Use .skip(0) to get the second duplicate.
				.findFirst();
		System.out.println("2nd duplicate character: "+ (first.isPresent() ? first.get().getKey() : null));
	}
}
