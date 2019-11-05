package com.java.thread.task;

import java.util.Date;

import lombok.extern.slf4j.Slf4j;

/**
 * 
 * @author venkataudaykiranp
 * 
 * <p>
 * This is very simple, which creates the simple thread puts it run in forever with use of while loop and makes use of sleep method to put the interval between running.
	<br>
	This is simply fast and quick way to achieve it
	</p>
 *
 */
@Slf4j
public class RunSingleThreadEvery2Seconds {
	public static void main(String[] args) {
		
		int timeInterval = 2000;
		Runnable r = new Runnable() {
			
			@Override
			public void run() {
				
				while(true) {
					log.info("Running Task: {}, Time: {}", "Call db task", new Date());
					try {
						Thread.sleep(timeInterval);
					} catch (InterruptedException e) {
						e.printStackTrace();
						log.error("RunThreadEvery2Seconds: {}", e.getMessage());
					}
				}
			}
		};
		Thread t = new Thread(r);
		t.start();
	}
}
