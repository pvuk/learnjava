package com.java.date.format;

import java.util.Calendar;
import java.util.Date;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PrintFullDateAndTime {
	
	public static void main(String[] args) {
		Date date = new Date();
		log.info("Date: {}", date);
		
		Date time = Calendar.getInstance().getTime();
		log.info("Calendar Date: {}", time);
		
		log.info("Day: {}", date.getDay());
		log.info("Month: {}", date.getMonth());
		log.info("Year: {}", time.getYear());
	}
}
