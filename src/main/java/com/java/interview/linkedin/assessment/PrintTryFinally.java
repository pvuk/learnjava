package com.java.interview.linkedin.assessment;

//What is the result of this code? 
//Ans: "Hello!"
class PrintTryFinally {
	public static void main(String[] args) {
		print();
	}

	static void print() {
		try {
			System.out.print("Hello");
		} finally {
			System.out.println("!");
		}
	}
}