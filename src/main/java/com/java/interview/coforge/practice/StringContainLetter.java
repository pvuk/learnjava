package com.java.interview.coforge.practice;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Venkata.Pulipati
 * @since Wednesday 20-August-2025 11:50:33
 */
public class StringContainLetter {
	public static void main(String[] args) {
		List<String> list = List.of("Ram", "Shiva", "UdayKiran", "Devashish");
		String strContain = "s", lowerKeyWord = strContain.toLowerCase();
		
		Map<Boolean,List<String>> collect = list.stream()
				.collect(Collectors.partitioningBy(s -> s.toLowerCase().contains(lowerKeyWord)));//case-insensitive partitioning
		
		collect.forEach((contain, listContains) -> {
			if(contain) {
				/**
				 * Code Ref:
				 * Summary:
				 * peek() is for debugging individual elements, not for printing a single message before iteration.
				 * Use System.out.println(...) outside the stream to print a message once per group.
				 */
				System.out.println("\nString contains: "+ strContain);
				listContains
//				.parallelStream()
//				.peek(s -> System.out.println("String contains: "+ strContain))
				.forEach(s -> System.out.print(s +"\n"));
			} else {
				System.out.println("String not contains: "+ strContain);
				listContains
//				.parallelStream()
//				.peek(s -> System.out.println("String not contains: "+ strContain +"\n"))
				.forEach(s -> System.out.print(s +"\n"));
			}
		});
	}
}
