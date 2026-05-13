package com.java.interview.linkedin.assessment;

//What is the result of this code? 
//Ans: "Hello!"
class PrintTryFinally {
	public static void main(String[] args) {
		print();
		
		int num = getNumber();
		System.out.println(num);
	}
	
	/**
	 * Code Ref: Interview: In below finally block print syso then return will returned the value. When return it out of control.</br>
	 * 
	 * ⚠️ BUT… There are few rare cases where finally will NOT execute
	 *	🔴 1. JVM Crash / System Failure
	 *	System.exit(0);</br>
	 *
	 * 	2. Infinite Loop / Thread stuck
	 * try {
		    while(true) {}
		} finally {
		    System.out.println("Never reached");
		}</br>
	 * 🔴 3. Kill JVM forcefully

		Task manager kill
		kill -9 in Linux
		
		👉 JVM doesn’t get chance → finally is skipped</br>
		
		🔴 4. Power failure / System crash
		
		Hardware-level interruptions</br>
		🔴 5. Daemon threads (some cases)

		If only daemon threads are running, JVM may exit without executing finally</br>
		
		✅ Interview Best Answer (Short Version)</br>
		👉 "Finally block always executes except in abnormal termination cases like System.exit(), JVM crash, infinite loops, or forceful shutdown."</br>
		
	 * @author Venkata.Pulipati
	 * @since Wednesday 13-May-2026 10:44:31
	 * @return
	 */
	private static int getNumber() {
		try {
			return 1;
		} catch (Exception e) {
			return 0;
		} finally {
			System.out.println("Finally block");
//			return 2;//Which value return 1 / 2 ?
			//Answer: . If finally has a return, it overrides any previous return from try/catch.
					//. Using return in finally is bad practice because it hides original results/errors.
		}
	}

	static void print() {
		try {
			System.out.print("Hello");
		} finally {
			System.out.println("!");
		}
	}
}