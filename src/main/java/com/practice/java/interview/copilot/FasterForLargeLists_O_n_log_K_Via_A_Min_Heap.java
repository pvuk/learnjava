package com.practice.java.interview.copilot;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.stream.Collector;

/**
 * Sorting the entire list is O(n log n). For large n, prefer a heap of size K.</br>
 * This still uses Streams, but keeps only K best elements.</br>
 * 
 * @author Venkata.Pulipati
 * @since Wednesday 18-February-2026 19:20:18
 */
public class FasterForLargeLists_O_n_log_K_Via_A_Min_Heap {
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
		Comparator<Player> byScoreAsc = Comparator.comparingInt(Player::getScore);

		// min-heap keeps the smallest at the top; we drop it if we find a bigger score
//		PriorityQueue<Player> heap = players.stream().collect(
		Object heap = players.stream().collect(
		    Collector.of(
		        // supplier
		        () -> new PriorityQueue<>(K, byScoreAsc.thenComparing(Player::getName)),
		        // accumulator
		        (pq, p) -> {
		            if (pq.size() < K) {
		                pq.offer(p);
		            } else if (byScoreAsc.compare(p, pq.peek()) > 0) { // p.score > min.score
		                pq.poll();
		                pq.offer(p);
		            }
		        },
		        // combiner (for parallel streams)
		        (pq1, pq2) -> {
		            // merge pq2 into pq1 preserving top-K
		            while (!pq2.isEmpty()) {
		                Player p = pq2.poll();
		                if (pq1.size() < K) {
		                    pq1.offer(p);
		                } else if (byScoreAsc.compare(p, pq1.peek()) > 0) {
		                    pq1.poll();
		                    pq1.offer(p);
		                }
		            }
		            return pq1;
		        },
		        // finisher: produce a list sorted descending
		        pq -> pq.stream()
		                .sorted(Comparator.comparingInt(Player::getScore).reversed()
		                        .thenComparing(Player::getName))
		                .toList()
		    )
		);

		System.out.println(heap); // top K in descending order
	}
}
