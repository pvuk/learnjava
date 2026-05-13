package com.practice.java.collectors;
import java.util.*;
import java.util.stream.*;
/**
 * Parallel streams improve performance for large datasets by leveraging multi-core processing.</br>
 * 
 * ✅ Advanced Interview Answer (Perfect)</br>

	“Parallel streams internally use ForkJoinPool and divide data into multiple chunks processed by worker threads. Each thread computes partial results which are merged using a combiner. This makes collectors critical in parallel streams. However, we must ensure stateless operations and avoid shared mutable state to prevent race conditions.”</br>
	
	✅ Real Stream Examples</br>

	✅ Stateless (Correct)</br>
	List<Integer> result =
    list.parallelStream()
        .map(x -> x * 2)
        .collect(Collectors.toList());

	❌ Stateful (Wrong)</br>
	List<Integer> result = new ArrayList<>();

	list.parallelStream()
	    .forEach(x -> result.add(x * 2)); // ❌</br>
	
	

	✅ Interview Perfect Answer</br>
	
	✅ Race Condition</br>
	
	“A race condition occurs when multiple threads access and modify shared data concurrently without proper synchronization, leading to unpredictable and incorrect results.”</br>
	
	
	✅ Stateless</br>
	
	“Stateless operations do not rely on shared mutable data and each computation is independent, making them safe for parallel execution.”</br>
	
	
	✅ Stateful</br>
	
	“Stateful operations depend on shared or changing data, which can cause race conditions and should be avoided in parallel streams.”</br>
	
	
 * @author Venkata.Pulipati
 * @since Wednesday 13-May-2026 12:16:56
 */
public class AverageSalesPerCity {
    public static void main(String[] args) {

        List<CitySales> transactions = List.of(

            // Hyderabad (10)
            new CitySales("Hyderabad", 120),
            new CitySales("Hyderabad", 80),
            new CitySales("Hyderabad", 200),
            new CitySales("Hyderabad", 150),
            new CitySales("Hyderabad", 90),
            new CitySales("Hyderabad", 300),
            new CitySales("Hyderabad", 110),
            new CitySales("Hyderabad", 95),
            new CitySales("Hyderabad", 250),
            new CitySales("Hyderabad", 400),

            // Bangalore (8)
            new CitySales("Bangalore", 220),
            new CitySales("Bangalore", 75),
            new CitySales("Bangalore", 130),
            new CitySales("Bangalore", 180),
            new CitySales("Bangalore", 60),
            new CitySales("Bangalore", 210),
            new CitySales("Bangalore", 140),
            new CitySales("Bangalore", 170),

            // Chennai (7)
            new CitySales("Chennai", 90),
            new CitySales("Chennai", 110),
            new CitySales("Chennai", 160),
            new CitySales("Chennai", 200),
            new CitySales("Chennai", 50),
            new CitySales("Chennai", 300),
            new CitySales("Chennai", 120),

            // Mumbai (12)
            new CitySales("Mumbai", 500),
            new CitySales("Mumbai", 450),
            new CitySales("Mumbai", 300),
            new CitySales("Mumbai", 200),
            new CitySales("Mumbai", 150),
            new CitySales("Mumbai", 600),
            new CitySales("Mumbai", 100),
            new CitySales("Mumbai", 250),
            new CitySales("Mumbai", 350),
            new CitySales("Mumbai", 400),
            new CitySales("Mumbai", 50),
            new CitySales("Mumbai", 700),

            // Delhi (6)
            new CitySales("Delhi", 110),
            new CitySales("Delhi", 130),
            new CitySales("Delhi", 90),
            new CitySales("Delhi", 200),
            new CitySales("Delhi", 300),
            new CitySales("Delhi", 80),

            // Pune (5)
            new CitySales("Pune", 140),
            new CitySales("Pune", 70),
            new CitySales("Pune", 200),
            new CitySales("Pune", 220),
            new CitySales("Pune", 95),

            // Kolkata (9)
            new CitySales("Kolkata", 100),
            new CitySales("Kolkata", 150),
            new CitySales("Kolkata", 180),
            new CitySales("Kolkata", 75),
            new CitySales("Kolkata", 220),
            new CitySales("Kolkata", 300),
            new CitySales("Kolkata", 60),
            new CitySales("Kolkata", 140),
            new CitySales("Kolkata", 160),

            // Ahmedabad (6)
            new CitySales("Ahmedabad", 130),
            new CitySales("Ahmedabad", 80),
            new CitySales("Ahmedabad", 170),
            new CitySales("Ahmedabad", 210),
            new CitySales("Ahmedabad", 95),
            new CitySales("Ahmedabad", 300),

            // Jaipur (5)
            new CitySales("Jaipur", 60),
            new CitySales("Jaipur", 120),
            new CitySales("Jaipur", 140),
            new CitySales("Jaipur", 200),
            new CitySales("Jaipur", 180),

            // Lucknow (7)
            new CitySales("Lucknow", 90),
            new CitySales("Lucknow", 110),
            new CitySales("Lucknow", 150),
            new CitySales("Lucknow", 175),
            new CitySales("Lucknow", 80),
            new CitySales("Lucknow", 210),
            new CitySales("Lucknow", 250)
        );

        calculateAverage(transactions);
        
        calculateAverageUsingCustomCollector(transactions);
        
        //✅ Example Showing Thread Usage
        System.out.println("\n✅ Example Showing Thread Usage:");
        exampleShowingThreadUsage(transactions);
    }
    
    private static void exampleShowingThreadUsage(List<CitySales> transactions) {
    	transactions.parallelStream()
        .forEach(t -> {
            System.out.println(Thread.currentThread().getName()
                + " -> " + t.getCity());
        });
	}

	/**
     * Code Ref: Interview: 
     * ✅ Interview Explanation (VERY IMPORTANT)</br>

		“Collector has 4 key parts:
		
		Supplier → creates container (AvgAccumulator)
		Accumulator → processes each element
		Combiner → merges results from different threads
		Finisher → transforms result into final output
		
		Combiner is mainly used in parallel streams.”</br>
		
		🔥 Follow-up Interview Questions</br>
		Q: Why not use simple variables?
		👉 Because parallel streams process chunks independently, so we need a thread-safe merge (combiner).</br>
		
		Q: What happens if combiner is wrong?</br>
		👉 You get:
		
		Incorrect results
		Data inconsistency in parallel execution</br>
		
		✅ 2. Thread Behavior in Parallel Streams (VERY IMPORTANT)</br>

		✅ How Parallel Streams Work</br>
			transactions.parallelStream()</br>
		👉 Uses ForkJoinPool.commonPool()</br>
		
		✅ Internally</br>

		1. Data is split into chunks
		2. Each chunk runs in separate threads
		3. Partial results are computed
		4. Results are combined</br>
		
		✅ Visual Flow</br>
		Main Thread
		   |
		Split Data
		   |
		-------------------------------
		| Thread-1 | Thread-2 | Thread-3 |
		|   Part A |   Part B |   Part C |
		-------------------------------
		        ↓ Combine
		       Final Result</br>
		       
		✅ Key Concepts (Interview Must Know)</br>
		✅ 1. ForkJoinPool</br>
		
		. Default pool used</br>
		. Threads = CPU cores - 1</br>
			ForkJoinPool.commonPool()</br>
			
		✅ 2. Work Stealing</br>
		👉 If one thread finishes early:</br>
		
		It <b>steals tasks</b> from others</br>
		✅ Improves performance</br>
		
		✅ 3. Order is NOT guaranteed</br>
			parallelStream().forEach(...)</br>
		
		✅ Use if order matters:</br>
			forEachOrdered()</br>
			
		✅ 4. Stateless vs Stateful (CRITICAL)</br>
		✔ GOOD (stateless):</br>
			.map(x -> x * 2)

		❌ BAD (stateful):</br>
			List<Integer> list = new ArrayList<>();
			stream.parallel().forEach(x -> list.add(x)); // ❌ Unsafe

		👉 Why? → Multiple threads modify same object</br>
		
		✅ 5. When Parallel Streams HELP</br>
		✔ Large data
		✔ CPU-intensive work
		✔ Independent operations
		❌ NOT good for:
		
		. Small datasets
		. IO operations (DB, API calls)
		. Shared mutable state</br>
		
		✅ Mutable State (Simple + Interview Explanation)</br>

		✅ Definition</br>
		👉 Mutable state means:</br>
		
		An object or variable whose value can be changed after it is created.</br>
		✅ Simple Example</br>
		int x = 10;</br>
		x = 20;  // ✅ value changed → mutable</br>
		
		More Info...</br>
		🚨 Mutable State in Parallel Streams (CRITICAL)</br>
		❌ Dangerous Example</br>
		List<Integer> list = new ArrayList<>();</br>

		IntStream.range(1, 1000)
		    .parallel()
		    .forEach(list::add); // ❌ PROBLEM</br>
		
		❌ Why is this wrong?</br>
		👉 Because:
		
		. Multiple threads try to modify same list
		. Leads to:
		
			. Race conditions
			. Missing data
			. Corrupted results</br>
			
		✅ Correct Approach (Stateless)</br>
		List<Integer> list =
		    IntStream.range(1, 1000)
		        .parallel()
		        .boxed()
		        .collect(Collectors.toList()); // ✅ SAFE
        
        👉 Here:

		Each thread works independently
		Framework handles merge safely</br>
		
		✅ Real-Life Analogy (Easy to Explain in Interview)</br>
		👉 Imagine:
		
		5 people updating the same notebook at same time ❌</br>
		vs</br>
		5 people writing on separate papers and combining later ✅</br>
		
		
     * @author Venkata.Pulipati
     * @since Wednesday 13-May-2026 14:30:37
     * @param transactions
     */
	private static void calculateAverageUsingCustomCollector(List<CitySales> transactions) {
		Collector<CitySales, AvgAccumulator, Double> avgCollector =
			    Collector.of(
			        AvgAccumulator::new,                 // Supplier
			        (acc, t) -> acc.add(t.getAmount()), // Accumulator
			        AvgAccumulator::combine,            // Combiner
			        AvgAccumulator::getAverage          // Finisher
			    );

		Map<String, Double> avgSalesByCity =
			    transactions.parallelStream()
			        .filter(t -> t.getAmount() > 100)
			        .collect(Collectors.groupingBy(
			            CitySales::getCity,
			            avgCollector
			        ));
		
		System.out.println("\nCalculate Average using custom Collector:");
		avgSalesByCity.forEach((city, avg) -> System.out.println(city +"> Avg Sales: "+ avg));
	}

	private static void calculateAverage(List<CitySales> transactions) {
		// ✅ Your logic
        Map<String, Double> avgSalesByCity =
            transactions.parallelStream()//Uses parallelStream() for performance
                .filter(t -> t.getAmount() > 100)
                .collect(Collectors.groupingBy(
                    CitySales::getCity,
                    Collectors.averagingDouble(CitySales::getAmount)//compute the average using averagingDouble
                ));

        // ✅ Print output
        avgSalesByCity.forEach((city, avg) ->
            System.out.println(city + " -> Avg Sales: " + avg));
    }
}