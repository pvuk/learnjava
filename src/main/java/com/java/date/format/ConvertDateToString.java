package com.java.date.format;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ConvertDateToString {
	
	public static void main(String[] args) {
		log.info("Date: {}", ZonedDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH_mm_ss_SSS")));
	}
}
