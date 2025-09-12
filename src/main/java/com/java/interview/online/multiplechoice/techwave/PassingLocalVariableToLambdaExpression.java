package com.java.interview.online.multiplechoice.techwave;

public class PassingLocalVariableToLambdaExpression {
	public static void main(String[] args) {
		String x = "a";
//		Runnable r = () -> System.out.println(x);//It will not compile because x is not final.
//		x = "b";
//		r.run();
	}
}

