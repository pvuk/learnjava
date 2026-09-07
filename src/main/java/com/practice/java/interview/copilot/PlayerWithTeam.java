package com.practice.java.interview.copilot;

/**
 * @author Venkata.Pulipati
 * @since Wednesday 18-February-2026 19:14:59
 */
public class PlayerWithTeam {

	private final String name;
    private final int score;
    private final String team;

    public PlayerWithTeam(String name, int score, String team) {
        this.name = name; this.score = score;
		this.team = team;
    }
    public String getName() { return name; }
    public int getScore() { return score; }
    public String getTeam() {
		return team;
	}
    
	@Override public String toString() {
        return name + "(" + score + ")";
    }
    
}
