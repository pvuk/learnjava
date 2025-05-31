package com.java.interview.mycomplianceoffice;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Supplier;
import java.util.stream.Collectors;

/**
 * @author P.V. UdayKiran
 * @version 1
 * @since created on Sat 31-May-2025 09:31
 */
public class GetCountOfEachLetterInString {
	public static void main(String[] args) {
		String s = "Program with Java";
        char[] ch = s.toCharArray();
        boolean[] b = new boolean[s.length()];

        System.out.println("Character Occurrences:");
        for (int i = 0; i < ch.length; i++) {
            if (b[i]) {
            	continue;     // Skip already counted characters
            }
            
            int c = 1;
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    c++;
                    b[j] = true;     // Mark character as counted
                }
            }
            System.out.println(ch[i] + " : " + c);
        }
        
        System.out.println("Example 2");
        String str = "Hello MCO";
		Map<String, Long> collect = Arrays.asList(str.split("")).stream().collect(Collectors.groupingBy(character -> character, Collectors.counting()));
		collect.forEach((k, v) -> System.out.println("Character: "+ k +"-> "+ v));
		
		System.out.println("Example 3: Iterate with same order");
		Map<String, Long> collectOrder = Arrays.asList(str.split("")).stream().collect(Collectors.groupingBy(character -> character, LinkedHashMap::new, Collectors.counting()));
		collectOrder.forEach((k, v) -> System.out.println("Character: "+ k +"-> "+ v));
	}
}
