package com.java.date.format;

import java.time.Duration;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

import lombok.extern.slf4j.Slf4j;

/**
 * 
 * @author venkata udaykiran p <venkataudaykiranp@h-PUday.ffe.foxeg.com>
 * @since Monday 03-October-2018 17:09:45
 */
@Slf4j
public class PrintFullDateAndTime {
	
	public static void main(String[] args) throws InterruptedException {
		Date date = new Date();
		log.info("Date: {}", date);
		
		Date time = Calendar.getInstance().getTime();
		log.info("Calendar Date: {}", time);
		
		log.info("Day: {}", date.getDay());
		log.info("Month: {}", date.getMonth());
		log.info("Year: {}", time.getYear());
		
		Instant startTime = Instant.now();
		Thread.sleep(5000);
		Instant endTime = Instant.now();
		Duration timeElapsed = Duration.between(startTime, endTime);
		System.out.println("Total Time taken to execute: "+ timeElapsed.toMillis() +"ms");
		
		System.out.println("Execution Time: "+ formatDuration(timeElapsed));
	}
	
	/**
	 * 
	 * @author Venkata.Pulipati
	 * @since Monday 29-September-2025 15:22:28
	 * @param duration
	 * @return
	 */
    public static String formatDuration(Duration duration) {
        long seconds = duration.getSeconds();

        long years = seconds / (365 * 24 * 3600);
        seconds %= (365 * 24 * 3600);

        long months = seconds / (30 * 24 * 3600);
        seconds %= (30 * 24 * 3600);

        long weeks = seconds / (7 * 24 * 3600);
        seconds %= (7 * 24 * 3600);

        long days = seconds / (24 * 3600);
        seconds %= (24 * 3600);

        long hours = seconds / 3600;
        seconds %= 3600;

        long minutes = seconds / 60;
        seconds %= 60;

        return String.format("%dYear:%dMon:%dWeek:%dDay:%dHour:%dMin:%dSec",
                years, months, weeks, days, hours, minutes, seconds);
    }

}
