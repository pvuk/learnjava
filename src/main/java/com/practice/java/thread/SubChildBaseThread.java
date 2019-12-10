package com.practice.java.thread;

public class SubChildBaseThread extends ChildBaseThread {
	
	@Override
	public void run() {
		System.out.println("Sub Child Base run()");
		super.run();
	}
	
	public static void main(String[] args) {
		BaseThread scbThread = new SubChildBaseThread();
		BaseThread cbThread = new ChildBaseThread();
		BaseThread bThread = new BaseThread();
		scbThread.run();
		System.out.println("===========");
		cbThread.run();
		System.out.println("===========");
		bThread.run();
	}
}
