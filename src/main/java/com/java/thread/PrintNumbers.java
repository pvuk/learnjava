package com.java.thread;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PrintNumbers {
	private volatile boolean isOdd;

	synchronized void printEven(int number) {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			log.error("Thread sleep printEven: {}", e.getMessage());
			e.printStackTrace();
		}
		/*
		 * A new line character appropriate to the platform running the application(%n
		 * is portable across platforms \n is not.). You should always use %n, rather
		 * than \n. 
		 * Reference: https://docs.oracle.com/javase/tutorial/java/data/numberformat.html
		 */
		System.out.printf("Checking even loop: %b%n", !isOdd);
//		log.info("Checking even loop: {}", !isOdd);
		/*
		 * below loop is not handled
		 */
		while (!isOdd) {
			try {
				System.out.println("Even waiting: " + number);
//				log.info("Even waiting: " + number);
				wait();
				System.out.println("Notified even:" + number);
//				log.info("Notified even:" + number);
			} catch (InterruptedException e) {
				log.error("printEven: {}", e.getMessage());
				e.printStackTrace();
				Thread.currentThread().interrupt();
			}
		}
//		log.info("{}: {}", Thread.currentThread().getName(), number);
		System.out.println(Thread.currentThread().getName() +":"+ number);
		System.out.printf("%n");
		isOdd = false;
		System.out.println("printEven isOdd: "+ isOdd);
		notify();
	}

	synchronized void printOdd(int number) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			log.error("Thread sleep printOdd: {}", e.getMessage());
			e.printStackTrace();
		}
		System.out.printf("Checking odd loop: %b%n", isOdd);
//		log.info("Checking odd loop: {}", isOdd);
		/*
		 * below loop is not handled
		 */
		while (isOdd) {
			try {
				System.out.println("Odd waiting : " + number);
//				log.info("Odd waiting : " + number);
				wait();
				System.out.println("Notified odd :" + number);
//				log.info("Notified odd :" + number);
			} catch (InterruptedException e) {
				log.error("printOdd: {}", e.getMessage());
				e.printStackTrace();
				Thread.currentThread().interrupt();
			}
		}
//		log.info("{}: {}", Thread.currentThread().getName(), number);
		System.out.println(Thread.currentThread().getName() +":"+ number);
		System.out.printf("%n");
		isOdd = true;
		System.out.println("printOdd isOdd: "+ isOdd);
		notify();
	}
}