package com.java.thread;

public class PrintEvenOddNumbersUsingThread implements Runnable {

	private int max;
	private PrintNumbers printNumbers;
	private boolean isEvenNumber;
	
	public PrintEvenOddNumbersUsingThread(PrintNumbers printNumbers, int max, boolean isEvenNumber) {
		this.printNumbers = printNumbers;
		this.max = max;
		this.isEvenNumber = isEvenNumber;
	}
	
	@Override
	public void run() {
		int number = isEvenNumber ? 2 : 1, i = 1;
		while(number <= max) {
			System.out.println("Loop: "+ i +", Number: "+ number);
			if (isEvenNumber) {
				printNumbers.printEven(number);
			} else {
				printNumbers.printOdd(number);
			}
			number += 2;
			i++;
		}
	}
	public static void main(String[] args) {
		PrintNumbers printNumbers = new PrintNumbers();
		Thread t1 = new Thread(new PrintEvenOddNumbersUsingThread(printNumbers, 10, false), "Odd");
		Thread t2 = new Thread(new PrintEvenOddNumbersUsingThread(printNumbers, 10, true), "Even");
		t1.start();
		t2.start();
	}

}
