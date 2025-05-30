package com.java.interview.codility.techwave;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author P.V. UdayKiran
 * @version 1, created on Fri 11-Sep-2020 15:33
 */
public class StringOutput {
	
	public static void main(String[] args) {
//		String xString = "a";
//		Runnable runnable = () -> System.out.println(xString);
//		xString = "b";
//		runnable.run();
		
		//task 2
//		int[] A = new int[] {1,0,1};
//        System.out.println(solution2(A));
		
		//task 3
		System.out.println();
	}
	
	public int[] solution(int N) {
		return null;
    }
	
	public static int solution2(int[] A) {
		Map<String, Long> couterMap = IntStream.of(A).
				boxed().collect(Collectors.toList()).stream()
				.collect(Collectors.groupingBy(e -> e.toString(), Collectors.counting()));
		return Integer.valueOf(String.valueOf(couterMap.get("1")));
	}
}
