package com.practice.java.thread;

public class BaseThread extends Thread {
	
	@Override
	public void run() {
		System.out.println("Base run()");
		super.run();
	}
}
