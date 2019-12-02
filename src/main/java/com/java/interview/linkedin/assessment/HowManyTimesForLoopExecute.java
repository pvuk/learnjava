package com.java.interview.linkedin.assessment;

//Ans: 10 times
class HowManyTimesForLoopExecute {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i = i++) {
			i += 1;
			System.out.println("Hello World!");
		}
	}
}