package com.java.thread;

/**
 * 
 * <h1>Ref:</h1><a href="https://java2blog.com/print-even-odd-numbers-threads-java/">How to print even and odd numbers using threads in java</a>
 *
 */
public class OddEvenPrintMain {
 
	boolean odd;
	int count = 1;
	int MAX = 10;
 
	public synchronized void printOdd() {
//		synchronized (this) {
			while (count < MAX) {
				System.out.println("Checking odd loop");
 
				while (!odd) {
					try {
						System.out.println("Odd waiting : " + count);
						wait();
						System.out.println("Notified odd :" + count);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("Odd Thread :" + count +"\n");
				count++;
				odd = false;
				notify();
			}
//		}
	}
 
	public synchronized void printEven() {
 
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
//		synchronized (this) {
			while (count < MAX) {
				System.out.println("Checking even loop");
 
				while (odd) {
					try {
						System.out.println("Even waiting: " + count);
						wait();
						System.out.println("Notified even:" + count);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("Even thread :" + count +"\n");
				count++;
				odd = true;
				notify();
 
			}
//		}
	}
 
	public static void main(String[] args) {
 
		OddEvenPrintMain oep = new OddEvenPrintMain();
		oep.odd = true;
		Thread t1 = new Thread(new Runnable() {
 
			@Override
			public void run() {
				oep.printEven();
 
			}
		});
		Thread t2 = new Thread(new Runnable() {
 
			@Override
			public void run() {
				oep.printOdd();
 
			}
		});
 
		t1.start();
		t2.start();
 
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
 
	}
}