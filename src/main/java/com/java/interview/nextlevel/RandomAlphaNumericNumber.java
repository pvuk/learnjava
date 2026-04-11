package com.java.interview.nextlevel;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Input types: A-Z, 1-9</br>
 * Generate length upto: 5</br>
 * Example: ABCDI, UDAY9, PVUKI, P5V79</br>
 * 
 * To calculate the maximum number of unique 5-character alphanumeric strings that can be generated from the character set:</br>

	<b>Character Set:</b></br>
	ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789</br>
	This gives us 36 characters (26 letters + 10 digits).</br>
	
	Length of each string: 5 characters</br>
	
	<b>Total possible combinations:</b></br>
	Each character in the 5-character string can be any of the 36 characters.</br>
	
	So, the total number of unique combinations is:</br>
	
	36 ^ 5 = 60,466,176</br>
 
	✅ Final Answer:</br>
	You can generate 60,466,176 unique 5-character alphanumeric strings from the given character set.</br>
	
	🧮 Example Estimation
Let’s assume you're using a reasonably fast script (e.g., Python or Java) and generating + writing to a file at:

Speed: 100,000 records per second (a conservative estimate)
Then:

60,466,176 records ÷ 100,000 records/sec = 604.66 seconds ≈ 10.1 minutes

 * 
 * @author Venkata.Pulipati
 * @since Monday 29-September-2025 11:32:05
 */
public class RandomAlphaNumericNumber {
	public static void main(String[] args) {
		
		/*
		 * 🔍 Explanation:
			IntStream.range(65, 91):
			
			This generates a stream of integers starting from 65 (inclusive) to 91 (exclusive).
			In ASCII, 65 is 'A' and 90 is 'Z'.
		 */
		String collectAtoZ = IntStream.rangeClosed(65, 90).mapToObj(i -> String.valueOf((char) i)).collect(Collectors.joining());//Get A-Z String. Converting ASCII to char
		String collect1to9 = IntStream.rangeClosed(49, 57).mapToObj(i -> String.valueOf((char) i)).collect(Collectors.joining());//Get 1-9
//		List<String> collectAtoZ = IntStream.range(65, 91).boxed().map(i -> String.valueOf(i)).collect(Collectors.toList());//Get A-Z List<String>. Converting ASCII to char 
//		List<String> collect1to9 = IntStream.range(49, 58).boxed().map(i -> String.valueOf(i)).collect(Collectors.toList());//Get 1-9
//		forEach(i -> System.out.print((char) i));

		String alphaNumeric = collectAtoZ + collect1to9;
		Random random = new Random();
		int lengthOfRandomString = 5;//Length of each AlphaNumeric random String
		int batchSize = 1000;// Number of strings to generate per batch
		List<String> alphaNumericStrings = new ArrayList<>();
		
		/**
		 * Code Ref: Interview Q&A
		 * How do you handle OutOfMemoryError ?
		 * Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
		 * 
		 * Always limit infinite streams to avoid memory overflow.
		 */
//		List<String> collect = Stream.generate(() -> {//Stream.generate > creates an infinite stream by default.
//			String randomString = random.ints(streamSize, 0, alphaNumeric.length())//generates random indices
//				  .mapToObj(i -> String.valueOf(alphaNumeric.charAt(i)))
//				  .reduce("", String::concat);
//			return randomString;
//		}).collect(Collectors.toList());
		
		System.out.println("AlphaNumeric Strings limit 1000: ");
		/*
		 * Used Collectors.joining() instead of reduce("", String::concat) for better performance and readability
		 */
		List<String> collect = Stream.generate(() -> {// Stream.generate > creates an infinite stream by default.
			String randomString = random.ints(lengthOfRandomString, 0, alphaNumeric.length())// generates random indices
					.mapToObj(i -> String.valueOf(alphaNumeric.charAt(i)))
					.collect(Collectors.joining());
			return randomString;
		}).limit(1000).collect(Collectors.toList());
		collect.forEach(System.out::println);
		
//		System.out.println("Example 1: ");
//		List<String> result = new ArrayList<>();
//
//        for (int i = 0; i < batchSize; i++) {
//            StringBuilder sb = new StringBuilder();
//            for (int j = 0; j < lengthOfRandomString; j++) {
//                int index = random.nextInt(alphaNumeric.length());
//                sb.append(alphaNumeric.charAt(index));
//            }
//            result.add(sb.toString());
//        }
//        result.forEach(System.out::println);

		
//        List<String> collect = IntStream.range(0, batchSize)
//        		.mapToObj(i -> IntStream.range(0, lengthOfRandomString)
//        								.mapToObj(j -> String.valueOf(alphaNumeric.charAt(random.nextInt(alphaNumeric.length()))))
//        								.collect(Collectors.joining()))
//        		.collect(Collectors.toList());
//		collect.forEach(System.out::println);
		
//		long totalRandomAlphaNumericStrings = Stream.generate(() -> {
//			String randomString = random.ints(lengthOfRandomString, 0, alphaNumeric.length())//generates random indices
//				  .mapToObj(i -> String.valueOf(alphaNumeric.charAt(i)))
//				  .collect(Collectors.joining());//Used Collectors.joining() instead of reduce("", String::concat) for better performance and readability
//			return randomString;
//		}).count();//String::concat creates many intermediate strings. StringBuilder is more memory-efficient.

		//Or
		
//		int totalRandomAlphaNumericStrings = random.ints(lengthOfRandomString, 0, alphaNumeric.length())//generates random indices
//		  .collect(StringBuilder::new, (sb, i) -> sb.append(alphaNumeric.charAt(i)), StringBuilder::append)
//		  .length();
		
//		System.out.println("Total Random AlphaNumeric Strings: "+ totalRandomAlphaNumericStrings);
		
//		String randomAlphaNumericStrings = random.ints(streamSize, 0, alphaNumeric.length())//generates random indices
//				  .collect(StringBuilder::new, (sb, i) -> sb.append(alphaNumeric.charAt(i)), StringBuilder::append)
//				  .toString();//String::concat creates many intermediate strings. StringBuilder is more memory-efficient.
		
		/*
		 * ✅ 4. Estimate Record Capacity
			You can estimate how many records fit in memory by:
	
			Measuring memory before and after generating n records.
			Calculating average memory per record.
			Dividing total heap size by average record size.
		 */
		
		System.out.println("Memory Estimator");
		Runtime runtime = Runtime.getRuntime();
		long maxMemory = runtime.maxMemory();
		System.out.println("Max JVM Heap (MB) :"+ (maxMemory / (1024 * 1024)));
		
		try {
			while(true) {
				List<String> batch = new ArrayList<>(batchSize);
				for(int i = 0; i < batchSize; i++) {
					batch.add(generateRandomString(alphaNumeric, random, lengthOfRandomString));
				}
				alphaNumericStrings.addAll(batch);
				
				long usedMemory = runtime.totalMemory() - runtime.freeMemory();
//				System.out.println("Generated: "+ alphaNumericStrings.size() +" strings | Used Memory (MB): "+ (usedMemory / (1024 * 1024)));
				
				// Optional: break if usage exceeds 80% of max heap
				if(usedMemory > maxMemory * 0.8) {
					System.out.println("Approaching heap limit. Stopping...");
					break;//loop terminate
				}
			}
//			alphaNumericStrings.forEach(System.out::println);
			System.out.println("Total estimated AlphaNumericStrings: "+ alphaNumericStrings.size() +" were generated, utilizing upto 80% of the heap memory");
		} catch (OutOfMemoryError e) {
			System.err.println("Out of memory after generating: "+ alphaNumericStrings.size() +" strings");
		}
	}

	/**
	 *@author Venkata.Pulipati
	 * @param alphaNumeric 
	 * @param random 
	 * @since Monday 29-September-2025 17:05:48
	 */
	private static String generateRandomString(String alphaNumeric, Random random, int lengthOfRandomString) {
		StringBuilder sb = new StringBuilder(lengthOfRandomString);
		for(int i = 0; i < lengthOfRandomString; i++) {
			sb.append(alphaNumeric.charAt(random.nextInt(alphaNumeric.length())));
		}
		return sb.toString();
	}
}
