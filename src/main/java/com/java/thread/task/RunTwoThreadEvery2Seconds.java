package com.java.thread.task;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import lombok.extern.slf4j.Slf4j;

/**
 * 
 * @author venkataudaykiranp
 * 
 * <p>
 * In RunSingleThreadEvery2Seconds.java method we saw was very quickest possible, but it lacks some functionality
</br>
This has much more benefits than previous they are as follows
</br>
<ul>
<li>control over when start and cancel task</li>
<li>first execution can be delayed if wanted, provides useful</li>
</ul>
</br>
In this we use, Timer class for scheduling purpose and TimerTask is used for enclosing task to be executed inside its run() method.
</br>
Timer instance can be shared to schedule the multiple task and it is thread-safe.
</br>
When Timer constructor is called , it creates one thread and this single thread is used any scheduling of task.
</br>
For our purpose, we use Timer#scheduleAtFixedRate
 * </p>
 *
 */
@Slf4j
public class RunTwoThreadEvery2Seconds {
	
	public static void main(String[] args) {
		long timeIntervalForTaskOne = 2000;
		long timeIntervalForTaskTwo = 2000;
		int delaySeconds = 6*1000;//6 seconds
		TimerTask taskOne = new TimerTask() {
			
			@Override
			public void run() {
				log.info("Running Task One: {}, Time: {}", "call db", new Date());
//				System.out.printf("Running Task One: %s, Time: %s", "call db", new Date() +"\n");
			}
		};
		
		TimerTask taskTwo = new TimerTask() {
		
			@Override
			public void run() {
				log.info("Running Task Two:{}, Time: {}", "call db", new Date());
			}
		};
		
		Timer timer = new Timer();
		Calendar runningTime = Calendar.getInstance();
		System.out.printf("Running Task One -> Actual starting Time:%s", runningTime.getTime() +"\n");
		
		//updating delay time
		runningTime.setTimeInMillis(runningTime.getTimeInMillis() + delaySeconds);
		
		System.out.printf("Scheduled Running Task One will start at: %s", runningTime.getTime() +"\n");
		System.out.println("Waiting for Schedule of Running Task One");

		timer.scheduleAtFixedRate(taskOne, delaySeconds, timeIntervalForTaskOne);
		timer.schedule(taskTwo, 0, timeIntervalForTaskTwo);
	
	}
}
