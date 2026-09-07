package com.practice.java.interview.copilot;

import java.util.Comparator;
import java.util.List;

/**
 * @author Venkata.Pulipati
 * @since Wednesday 18-February-2026 19:23:36
 */
public class KeepAllTiedElementsAtTheKthScore {
	public static void main(String[] args) {
		List<Player> players = List.of(
	    	    new Player("Alice", 95),
	    	    new Player("Bob", 67),
	    	    new Player("Cathy", 88),
	    	    new Player("Derek", 88),
	    	    new Player("Eve", 72),
	    	    new Player("Frank", 99),
	    	    new Player("Grace", 72),
	    	    new Player("Hank", 60)
	    	);
		int K = 3;
		
		// First, get the K-th score (after sorting desc)
		List<Integer> sortedScoresDesc = players.stream()
		    .map(Player::getScore)
		    .sorted(Comparator.reverseOrder())
		    .toList();

		int kthScore = (sortedScoresDesc.size() >= K) ? sortedScoresDesc.get(K - 1)
		                                              : Integer.MIN_VALUE;

		List<Player> topKWithTies = players.stream()
		    .filter(p -> p.getScore() >= kthScore)
		    .sorted(Comparator.comparingInt(Player::getScore).reversed()
		            .thenComparing(Player::getName))
		    .toList();
		
		System.out.println(topKWithTies);
	}
}
