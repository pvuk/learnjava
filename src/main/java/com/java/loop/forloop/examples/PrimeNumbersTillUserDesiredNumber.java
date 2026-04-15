package com.java.loop.forloop.examples;

import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * <h1><a href="https://www.guru99.com/prime-number-program-java.html">Program Logic:</a></h1>
 * <ul>
 * <li>The main method contains a loop to check prime numbers one by one.</li>
 * <li>The main method calls the method CheckPrime to determine whether a number
 * is prime</li>
 * <li>We need to divide an input number, say 17 from values 2 to 17 and check
 * the remainder. If the remainder is 0 number is not prime.</li>
 * <li>No number is divisible by more than half of itself. So, we need to loop
 * through just numberToCheck/2. If the input is 17, half is 8.5, and the loop
 * will iterate through values 2 to 8</li>
 * <li>If numberToCheck is entirely divisible by another number, we return
 * false, and loop is broken.</li>
 * <li>If numberToCheckis prime, we return true.</li>
 * <li>In the main method, check isPrime is TRUE and add to primeNumbersFound
 * String</li>
 * </ul>
 * 
 * @author venkataudaykiranp
 *
 */
public class PrimeNumbersTillUserDesiredNumber {
	public static void main(String[] args) {
		Scanner scanner = null;
		int num = 0;
		try {
			System.out.println("You can enter 100 number or more");
			System.out.print("Please enter Number: ");
			scanner = new Scanner(System.in);
			num = scanner.nextInt();
			for (int i = 1; i <= num; i++) {
				// prime number check
				boolean isPrime = isPrime(i);
				if (isPrime) {
					System.out.print(i + " ");
				}
				//System.out.print("\nSqrt of "+ i +": "+ (int) Math.sqrt(i) +" ");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
		
		primeAndNonPrimeNumbers(num);
	}

	private static void primeAndNonPrimeNumbers(int num) {
		System.out.println("\n Prime Numbers: ");
		IntStream.rangeClosed(2, num)
			.filter(PrimeNumbersTillUserDesiredNumber::isPrimeCheckUsingStreams)
			.forEach(i -> System.out.print(i +" "));
		
		System.out.println("\n Non Prime Numbers: ");
		IntStream.rangeClosed(2, num).filter(i -> !isPrimeCheckUsingStreams(i)).forEach(i -> System.out.print(i +" "));
	}

	private static boolean isPrime(int numToCheck) {
		int remainder;
		for (int j = 2; j <= numToCheck / 2; j++) {
			remainder = numToCheck % j;
			// if remainder is 0 than numToCheck is not prime and break loop. Else continue
			// loop
			if (remainder == 0) {
				return false;
			}
		}
		return true;
	}
	
	/**
	 * ✅ Why Math.sqrt(number) is used in prime checking
		🔹 Basic idea
		If a number n is NOT prime, then it must have at least one factor less than or equal to √n.
		So instead of checking divisibility up to n - 1, we only check up to √n.</br>
		
		✅ Example 1: Prime number (29)
			√29 ≈ 5.38
		
		Check divisibility only by:
			2, 3, 4, 5
		
		✅ No divisor found → 29 is prime
		Checking beyond 5 is wasteful and unnecessary.</br>
		
		✅ Example 2: Non‑prime number (36)
			√36 = 6
		
		Divisors:
			2 × 18
			3 × 12
			4 × 9
			6 × 6
		
		✅ A factor is found before √36, so stop early.</br>
		
		Breakdown:</br>
			. Math.sqrt(number) → limits checking range</br>
			. rangeClosed(2, √number) → only necessary checks</br>
			. noneMatch(...) → ensures no divisor exists</br>
			✅ Efficient and clean</br>
		
		
		✅ Performance Difference</br>


		 Method            | Iterations for n = 1,000,000 |</br>
		|-------------------|-------------------------------|</br>
		| Check till n      | ~1,000,000                    |</br>
		| Check till √n     | ~1,000 ✅                      |</br>


		⚡ 1000× faster</br>
		
		
		✅ Without Math.sqrt (Wrong Approach)</br>
			JavaIntStream.rangeClosed(2, number - 1)
		❌ Unnecessary checks</br>
		❌ Poor performance for large numbers</br>
		
		✅ Interview‑ready answer (short)</br>
		
		We use Math.sqrt(n) because if a number has any divisor, at least one divisor must be less than or equal to √n.</br>
		This significantly reduces time complexity from O(n) to O(√n).</br>
	 * 
	 * @author Venkata.Pulipati
	 * @since Wednesday 15-April-2026 15:39:01
	 * @param num
	 * @return
	 */
	private static boolean isPrimeCheckUsingStreams(int num) {
		if(num < 2) return false;
		return IntStream.rangeClosed(2, (int) Math.sqrt(num)).noneMatch(i -> num % i == 0);
	}
}
