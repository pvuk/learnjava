package com.java.practice.interview.online.multiplechoice.techwave;

public class IsThisProgramCauseMemoryLeak {
	IsThisProgramCauseMemoryLeak other;

	public static void main(String[] args) {
		fun();
	}

	static void fun() {
		IsThisProgramCauseMemoryLeak a = new IsThisProgramCauseMemoryLeak();
		IsThisProgramCauseMemoryLeak b = new IsThisProgramCauseMemoryLeak();
		a.other = b;
		b.other = a;
	}
}