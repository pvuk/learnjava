package com.practice.java.interview.copilot;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Top‑K scores only (e.g., from int[] or List<Integer>)
 * 
 * @author Venkata.Pulipati
 * @since Wednesday 18-February-2026 19:07:25
 */
public class Top_K_ScoresOnly {
	public static void main(String[] args) {
		int[] scores = {95, 67, 88, 88, 72, 99, 72, 60};
		int K = 3;

		List<Integer> topK = Arrays.stream(scores)
		    .boxed()
		    .sorted(Comparator.reverseOrder())
		    .limit(K)
		    .toList();

		System.out.println(topK); // [99, 95, 88]
	}
}
