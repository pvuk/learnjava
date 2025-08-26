package com.practice.java.thread.streams;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author Venkata.Pulipati
 * @since Tuesday 26-August-2025 10:26:40
 */
public class ThreadPartitionPrintOddEvenNumbers {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		int number = 20;
		List<Integer> list = IntStream.range(1, number).boxed().toList();// Generate list of integers from 1 to number (exclusive)
		
		Callable<List<Integer>> evenTask = () -> list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());//Each thread filters either even or odd numbers.
		Callable<List<Integer>> oddTask = () -> list.stream().filter(i -> i % 2 != 0).collect(Collectors.toList());
		
		ExecutorService executor = Executors.newFixedThreadPool(2);//We use ExecutorService with two threads.
		
		Future<List<Integer>> evenFuture = executor.submit(evenTask);//Results are collected using Future.
		Future<List<Integer>> oddFuture = executor.submit(oddTask);
		
		List<Integer> evens = evenFuture.get();
		List<Integer> odds = oddFuture.get();
		
		Map<Boolean, List<Integer>> map = new HashMap<Boolean, List<Integer>>();
		map.put(true, evens);
		map.put(false, odds);
		
		System.out.println("Even Numbers: "+ map.get(true));//Finally, we print the map.
		System.out.println("Odd Numbers: "+ map.get(false));
		
		executor.shutdown();
		
		//Example: 2
		Runnable evenPrinter = () -> {
//			System.out.println("Even Numbers: ");
			for (Iterator<Integer> iterator = evens.iterator(); iterator.hasNext();) {
				try {
					System.out.println("Even Numbers: "+ (Integer) iterator.next());
					Thread.sleep(1000);//Creates a thread that prints each even number with a 1-second pause using Thread.sleep(1000).
				} catch (Exception e) {
					Thread.currentThread().interrupt();
					System.err.println("Thread interrupted");
				}
			}
		};
		Thread evenThread = new Thread(evenPrinter);
		evenThread.start();//Runs the logic in a separate thread using Thread.
		
		Thread oddPrinter = new Thread(() -> {
//			System.out.println("Odd Numbers: ");
			for (Iterator<Integer> iterator = odds.iterator(); iterator.hasNext();) {
				try {
					System.out.println("Odd Numbers: "+ (Integer) iterator.next());
					Thread.sleep(1000);//Creates a thread that prints each even number with a 1-second pause using Thread.sleep(1000).
				} catch (Exception e) {
					Thread.currentThread().interrupt();
					System.err.println("Thread interrupted");
				}
			}
		});
		oddPrinter.start();
	}
}
