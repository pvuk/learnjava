package com.java.date.format;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import lombok.extern.slf4j.Slf4j;

/**
 * <p>
 * <h1><a href="https://www.simetric.co.uk/si_time.htm">The shorter intervals like nanoseconds and femtoseconds</a> are used in
 * computers and laser technology while light years and astronomical units are
 * used in space research. There are 1,000 milliseconds in 1 second; 1,000
 * microseconds in 1 millisecond; and so on. NOTE:- A millisecond is one
 * thousandth of a second, NOT one millionth.</h1>
 * 
 * <table border="1">
 * <th>fractions of a second</th>
 * <th>metric name</th>
 * <tr>
 * <td>
 * 0,000 000 000 000 000 000 000 001 &nbsp;&nbsp;&nbsp;&nbsp;
 * </td>
 * <td>
 * yoctosecond [ ys ]
 * </td>
 * </tr>
 * <tr>
 * <td>
 * 0,000 000 000 000 000 000 001 &nbsp;&nbsp;&nbsp;&nbsp;
 * </td>
 * <td>
 * zeptosecond [ zs ]
 * </td>
 * </tr>
 * <tr>
 * 		<td>
 * 0,000 000 000 000 000 001	
 * 		</td>
 * 		<td>
 * attosecond [ as ] &nbsp;&nbsp;&nbsp;&nbsp;
 * 		</td>
 * </tr>
 * <tr>
 * 		<td>
 * 0,000 000 000 000 001	
 * 		</td>
 * 		<td>
 * femtosecond [ fs ] &nbsp;&nbsp;&nbsp;&nbsp;
 * 		</td>
 * </tr>
 * <tr>
 * 		<td>
 * 0,000 000 000 001 [ trillionth ]	
 * 		</td>
 * 		<td>
 * picosecond [ ps ] &nbsp;&nbsp;&nbsp;&nbsp;
 * 		</td>
 * </tr>
 * <tr>
 * 		<td>
 * 0,000 000 001 [ billionth ]	
 * 		</td>
 * 		<td>
 * nanosecond [ ns ] &nbsp;&nbsp;&nbsp;&nbsp;
 * 		</td>
 * </tr>
 * <tr>
 * 		<td>
 * 0,000 001 [ millionth ]	
 * 		</td>
 * 		<td>
 * microsecond [ µs ] &nbsp;&nbsp;&nbsp;&nbsp;
 * 		</td>
 * </tr>
 * <tr>
 * 		<td>
 * 0,001 [ thousandth ]	
 * 		</td>
 * 		<td>
 * millisecond [ ms ] &nbsp;&nbsp;&nbsp;&nbsp;
 * 		</td>
 * </tr>
 * <tr>
 * 		<td>
 * 0.01 [ hundredth ]	
 * 		</td>
 * 		<td>
 * centisecond [ cs ] &nbsp;&nbsp;&nbsp;&nbsp;
 * 		</td>
 * </tr>
 * <tr>
 * 		<td>
 * 1.0	
 * 		</td>
 * 		<td>
 * second [ s ]
 * 		</td>
 * </tr>
 * </table>
 * </p>
 * 
 * @author venkataudaykiranp
 * @Date Tue 25-Feb-2020 11:14
 */
@Slf4j
public class ConvertDateToString {
	
	public static void main(String[] args) {
		log.info("Date: {}", ZonedDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH_mm_ss_S")));
		log.info("Date: {}", ZonedDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH_mm_ss_SS")));
		log.info("Date: {}", ZonedDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH_mm_ss_SSS")));
		log.info("Date: {}", ZonedDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH_mm_ss_SSSSS")));
		log.info("Date: {}", ZonedDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH_mm_ss_SSSSSSSS")));
		log.info("Date: upto MicroSecond(1 Million) {}", ZonedDateTime.now().format(DateTimeFormatter.ofPattern("ddMMYYYYHHmmssSSSSSSS")));
		
		LocalDateTime oldDate = LocalDateTime.of(1989, Month.SEPTEMBER, 24, 10, 00);
		LocalDateTime newDate = LocalDateTime.of(2020, Month.FEBRUARY, 25, 12, 02);
		log.info("{} Old Date", oldDate);
		log.info("{} New Date", newDate);
		
		// count between dates
		long years 			= ChronoUnit.YEARS.between(oldDate, newDate);
		long months 		= ChronoUnit.MONTHS.between(oldDate, newDate);
		long days			= ChronoUnit.DAYS.between(oldDate, newDate);
		long seconds 		= ChronoUnit.SECONDS.between(oldDate, newDate);
		long milliseconds	= ChronoUnit.MILLIS.between(oldDate, newDate);
		long microseconds	= ChronoUnit.MICROS.between(oldDate, newDate);
		long nanoseconds	= ChronoUnit.NANOS.between(oldDate, newDate);
		log.info("{} years", years);
		log.info("{} months", months);
		log.info("{} days", days);
		log.info("{} seconds", seconds);
		log.info("{} milliseconds", milliseconds);
		log.info("{} microseconds", microseconds);
		log.info("{} nanoseconds", nanoseconds);
		
		log.info("{} Instant date", Instant.now());
	}
}
