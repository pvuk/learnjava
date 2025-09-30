package com.java.heap;

/**
 * Code Ref: Interview Q&A
 * 
 * how much data your JVM can handle and optimizing memory usage is crucial for building scalable and efficient applications.

	✅ 1. How to Identify Maximum Records JVM Can Handle
	There’s no fixed number of records because it depends on:
	
	. JVM heap size
	. Size of each object (e.g., length of each string)
	. Other memory usage (threads, GC, etc.)
	But you can estimate it by:
	
	🔹 Checking JVM Heap Size:
	

 * @author Venkata.Pulipati
 * @since Monday 29-September-2025 14:30:26
 */
public class HeapMemory {
	public static void main(String[] args) {
		//✅ 1. How to Identify Maximum Records JVM Can Handle
		long maxHeapSize = Runtime.getRuntime().maxMemory(); // in bytes
		System.out.println("Max Heap Size (MB): " + (maxHeapSize / (1024 * 1024)));//This gives you the maximum heap memory allocated to the JVM.

		//✅ 2. How to Get Current Memory Usage
		Runtime runtime = Runtime.getRuntime();
		long usedMemory = runtime.totalMemory() - runtime.freeMemory();
		System.out.println("Used Memory (MB): " + (usedMemory / (1024 * 1024)));//You can run this before and after generating your list to see how much memory it consumes.
		
		/*
		 * ✅ 3. How to Optimize Memory Usage
		 * 
		 * 🔹 a. Use .limit(n) on streams
			Always limit infinite streams to avoid memory overflow.
			
			🔹 b. Use StringBuilder instead of reduce("", String::concat)
			String::concat creates many intermediate strings. StringBuilder is more memory-efficient.
			
		 * 🔹 c. Tune JVM Heap Settings
			You can increase heap size using JVM options:
			java -Xms512m -Xmx2048m YourApp
			
			. -Xms: initial heap size
			. -Xmx: maximum heap size
		
			🔹 d. Profile with Tools
			Use tools like:
			
			. VisualVM
			. JConsole
			. JProfiler
			. YourKit
			These help monitor memory usage, GC activity, and object allocation.
			
		 * ✅ 4. Estimate Record Capacity
			You can estimate how many records fit in memory by:
			
			Measuring memory before and after generating n records.
			Calculating average memory per record.
			Dividing total heap size by average record size.
		 */
	}
}
