package com.practice.java.thread;

public class ChildBaseThread extends BaseThread {
	
	@Override
	public void run() {
		System.out.println("Child Base run()");
		super.run();
	}
}
