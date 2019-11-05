package com.practice.java.date.format;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ConvertStringToDate {
	
	public static void main(String[] args) throws ParseException {
		String date = "22-Nov-2018";
		DateFormat df = new SimpleDateFormat("dd-MMM-yyyy");
		log.info("Date: {}", df.parse(date));
	}
}
