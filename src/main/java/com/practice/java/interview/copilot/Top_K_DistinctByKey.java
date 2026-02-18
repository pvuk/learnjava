package com.practice.java.interview.copilot;

import java.util.Comparator;
import java.util.List;
import java.util.Set;

/**
 * @author Venkata.Pulipati
 * @since Wednesday 18-February-2026 19:08:34
 */
public class Top_K_DistinctByKey {

	// helper: distinct by a key extractor
//	static <T> java.util.function.Predicate<T> distinctByKey(
//	        java.util.function.Function<? super T, ?> keyExtractor) {
//	    Set<Object> seen = java.util.ConcurrentHashMap.newKeySet();//ConcurrentHashMap is Java 21 compatible 
//	    return t -> seen.add(keyExtractor.apply(t));
//	}
	
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
	    
	    //If you want unique by name first (or any key), then take top‑K by score
		List<Player> topKDistinctByName = players.stream()
//		    .filter(distinctByKey(Player::getName)) // only first occurrence per name
		    .sorted(Comparator.comparingInt(Player::getScore).reversed())
		    .limit(K)
		    .toList();
		
		//Distinct by score (to get top‑K unique scores):
		List<Player> topKDistinctScores = players.stream()
			    .sorted(Comparator.comparingInt(Player::getScore).reversed())
//			    .filter(distinctByKey(Player::getScore))
			    .limit(K)
			    .toList();
			// Gives one representative per score value
	}
}
