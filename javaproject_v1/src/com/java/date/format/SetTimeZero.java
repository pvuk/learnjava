package com.java.date.format;

import java.util.Date;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SetTimeZero {
	public static void main(String[] args) {
		Date date = new Date();
		log.info("Current Date with Time: {}", date);
		date.setHours(0);
		date.setMinutes(0);
		date.setSeconds(0);
		log.info("Current Date with Default Time: {}", date);
	}
}
