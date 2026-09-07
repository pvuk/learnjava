package com.practice.java.interview.copilot;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Venkata.Pulipati
 * @since Wednesday 18-February-2026 19:12:26
 */
public class Top_K_PerGroup {
	public static void main(String[] args) {

		List<PlayerWithTeam> playersWithTeams = List.of(
	    	    new PlayerWithTeam("Alice", 95, "A"),
	    	    new PlayerWithTeam("Bob", 67, "A"),
	    	    new PlayerWithTeam("Cathy", 88, "B"),
	    	    new PlayerWithTeam("Derek", 88, "C"),
	    	    new PlayerWithTeam("Eve", 72, "C"),
	    	    new PlayerWithTeam("Frank", 99, "D"),
	    	    new PlayerWithTeam("Grace", 72, "D"),
	    	    new PlayerWithTeam("Hank", 60, "D")
	    	);
	    	int K = 3;
	    	
		// Suppose playersWithTeams is List<Player> with team set
		Map<String, List<PlayerWithTeam>> topKPerTeam = playersWithTeams.stream()
		    .collect(Collectors.groupingBy(
		    		PlayerWithTeam::getTeam,
		        Collectors.collectingAndThen(
		            Collectors.toList(),
		            lst -> lst.stream()
		                      .sorted(Comparator.comparingInt(PlayerWithTeam::getScore).reversed()
		                               .thenComparing(PlayerWithTeam::getName))
		                      .limit(K)
		                      .toList()
		        )
		    ));
	}
}
