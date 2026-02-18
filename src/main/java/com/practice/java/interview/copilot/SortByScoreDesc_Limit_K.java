package com.practice.java.interview.copilot;

import java.util.Comparator;
import java.util.List;

/**
 * Good when N is small/medium or when simplicity > performance.</br>
 * 
 * reversed() gives descending by score</br>
 * Added thenComparing(name) as a tie-breaker to make the order deterministic.</br>
 * 
 * @author Venkata.Pulipati
 * @since Wednesday 18-February-2026 19:04:56
 */
public class SortByScoreDesc_Limit_K {
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
	    
	    	List<Player> topK = players.stream()
	    		    .sorted(Comparator.comparingInt(Player::getScore).reversed()
	    		            .thenComparing(Player::getName)) // optional tie-breaker
	    		    .limit(K)
	    		    .toList();

	    		System.out.println(topK); // [Frank(99), Alice(95), Cathy(88)]
	    		
	}
}
