package com.practice.java.interview.copilot;

/**
 * @author Venkata.Pulipati
 * @since Wednesday 18-February-2026 19:02:07
 */
public class Player {

	private final String name;
    private final int score;

    public Player(String name, int score) {
        this.name = name; this.score = score;
    }
    public String getName() { return name; }
    public int getScore() { return score; }

    @Override public String toString() {
        return name + "(" + score + ")";
    }
    
}
