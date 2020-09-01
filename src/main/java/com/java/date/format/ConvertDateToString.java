package com.java.date.format;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.YearMonth;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.TimeZone;

import lombok.extern.slf4j.Slf4j;

/**
 * <p>
 * <h1><a href="https://www.simetric.co.uk/si_time.htm">The shorter intervals
 * like nanoseconds and femtoseconds</a> are used in computers and laser
 * technology while light years and astronomical units are used in space
 * research. There are 1,000 milliseconds in 1 second; 1,000 microseconds in 1
 * millisecond; and so on. NOTE:- A millisecond is one thousandth of a second,
 * NOT one millionth.</h1>
 * 
 * <table border="1">
 * <th>fractions of a second</th>
 * <th>metric name</th>
 * <tr>
 * <td>0,000 000 000 000 000 000 000 001 &nbsp;&nbsp;&nbsp;&nbsp;</td>
 * <td>yoctosecond [ ys ]</td>
 * </tr>
 * <tr>
 * <td>0,000 000 000 000 000 000 001 &nbsp;&nbsp;&nbsp;&nbsp;</td>
 * <td>zeptosecond [ zs ]</td>
 * </tr>
 * <tr>
 * <td>0,000 000 000 000 000 001</td>
 * <td>attosecond [ as ] &nbsp;&nbsp;&nbsp;&nbsp;</td>
 * </tr>
 * <tr>
 * <td>0,000 000 000 000 001</td>
 * <td>femtosecond [ fs ] &nbsp;&nbsp;&nbsp;&nbsp;</td>
 * </tr>
 * <tr>
 * <td>0,000 000 000 001 [ trillionth ]</td>
 * <td>picosecond [ ps ] &nbsp;&nbsp;&nbsp;&nbsp;</td>
 * </tr>
 * <tr>
 * <td>0,000 000 001 [ billionth ]</td>
 * <td>nanosecond [ ns ] &nbsp;&nbsp;&nbsp;&nbsp;</td>
 * </tr>
 * <tr>
 * <td>0,000 001 [ millionth ]</td>
 * <td>microsecond [ µs ] &nbsp;&nbsp;&nbsp;&nbsp;</td>
 * </tr>
 * <tr>
 * <td>0,001 [ thousandth ]</td>
 * <td>millisecond [ ms ] &nbsp;&nbsp;&nbsp;&nbsp;</td>
 * </tr>
 * <tr>
 * <td>0.01 [ hundredth ]</td>
 * <td>centisecond [ cs ] &nbsp;&nbsp;&nbsp;&nbsp;</td>
 * </tr>
 * <tr>
 * <td>1.0</td>
 * <td>second [ s ]</td>
 * </tr>
 * </table>
 * </br>
 * Java 8 Date and Time Examples: 1. <a href=
 * "https://www.baeldung.com/migrating-to-java-8-date-time-api">Migrating to the
 * New Java 8 Date Time API</a> 2.
 * <a href="https://www.boraji.com/java-8-offsetdatetime-example">Java 8 -
 * OffsetDateTime example</a>
 * 
 * <ol>
 * <li>
 * 	<h1>Overview</h1> In this tutorial you will learn how to refactor your code in order to leverage the new Date Time API introduced in Java 8.
 * </li>
 * 
 * 	<li>
 * <h1>New API at a Glance</h1> Working with dates in Java used to be hard. The old date
 * library provided by JDK included only three classes: java.util.Date,
 * java.util.Calendar and java.util.Timezone.
 * 
 * These were only suitable for the most basic tasks. For anything even remotely
 * complex, the developers had to either use third-party libraries or write tons
 * of custom code.
 * 
 * Java 8 introduced a completely new Date Time API (java.util.time.*) that is
 * loosely based on the popular Java library called JodaTime. This new API
 * dramatically simplified date and time processing and fixed many shortcomings
 * of the old date library.
 * </li>
 * 
 * <pre>Sublist 1.</pre>
 * <ol>
 * 	<li><h1>API Clarity</h1> A first advantage of the new API is clarity – the API is
 * very clear, concise and easy to understand. It does not have a lot of
 * inconsistencies found in the old library such as the field numbering (in
 * Calendar months are zero-based, but days of week are one-based).
 * </li>
 * 
 * <li><h1> API Flexibility</h1> Another advantage is flexibility – working with multiple
 * representations of time. The old date library included only a single time
 * representation class – java.util.Date, which despite its name, is actually a
 * timestamp. It only stores the number of milliseconds elapsed since the Unix
 * epoch.
 * 
 * The new API has many different time representations, each suitable for
 * different use cases:
 * 
 * Instant – represents a point in time (timestamp) LocalDate – represents a
 * date (year, month, day) LocalDateTime – same as LocalDate, but includes time
 * with nanosecond precision OffsetDateTime – same as LocalDateTime, but with
 * time zone offset LocalTime – time with nanosecond precision and without date
 * information ZonedDateTime – same as OffsetDateTime, but includes a time zone
 * ID OffsetLocalTime – same as LocalTime, but with time zone offset MonthDay –
 * month and day, without year or time YearMonth – month and year, without day
 * or time Duration – amount of time represented in seconds, minutes and hours.
 * Has nanosecond precision Period – amount of time represented in days, months
 * and years
 * </li>
 * 
 * <li><h1>Immutability and Thread-Safety</h1>
 * <p>Another advantage is that all time representations in Java 8 Date Time API are <b>immutable and thus thread-safe.</b></p>
 * 
 * All mutating methods return a new copy instead of modifying state of the
 * original object.
 * 
 * Old classes such as java.util.Date were not thread-safe and could introduce
 * very subtle concurrency bugs.
 * </li>
 * 
 * <li><h1>Method Chaining</h1> All mutating methods can be chained together, allowing
 * to implement complex transformations in a single line of code.
 *
 * <pre>
 * ZonedDateTime nextFriday = LocalDateTime.now()
 * 		.plusHours(1)
 * 		.with(TemporalAdjusters.next(DayOfWeek.FRIDAY))
 * 		.atZone(ZoneId.of("PST"));
 * </pre>
 * </li>
 * </ol> 
 * </ol>
 * 
 * </p>
 * 
 * @author venkataudaykiranp
 * @version 1, changes on Tue 25-Feb-2020 11:14
 * @version 2.0
 */
@Slf4j
public class ConvertDateToString {

	public static void main(String[] args) {
		log.info("Date: {}", ZonedDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH_mm_ss_S")));
		log.info("Date: {}", ZonedDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH_mm_ss_SS")));
		log.info("Date: {}", ZonedDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH_mm_ss_SSS")));
		log.info("Date: {}", ZonedDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH_mm_ss_SSSSS")));
		log.info("Date: {}", ZonedDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH_mm_ss_SSSSSSSS")));
		log.info("Date: upto MicroSecond(1 Million) {}",
				ZonedDateTime.now().format(DateTimeFormatter.ofPattern("ddMMYYYYHHmmssSSSSSSS")));

		LocalDateTime oldDate = LocalDateTime.of(1989, Month.SEPTEMBER, 24, 10, 00);
		LocalDateTime newDate = LocalDateTime.of(2020, Month.FEBRUARY, 25, 12, 02);
		log.info("{} Old Date", oldDate);
		log.info("{} New Date", newDate);

		// count between dates
		long years = ChronoUnit.YEARS.between(oldDate, newDate);
		long months = ChronoUnit.MONTHS.between(oldDate, newDate);
		long days = ChronoUnit.DAYS.between(oldDate, newDate);
		long seconds = ChronoUnit.SECONDS.between(oldDate, newDate);
		long milliseconds = ChronoUnit.MILLIS.between(oldDate, newDate);
		long microseconds = ChronoUnit.MICROS.between(oldDate, newDate);
		long nanoseconds = ChronoUnit.NANOS.between(oldDate, newDate);
		log.info("{} years", years);
		log.info("{} months", months);
		log.info("{} days", days);
		log.info("{} seconds", seconds);
		log.info("{} milliseconds", milliseconds);
		log.info("{} microseconds", microseconds);
		log.info("{} nanoseconds", nanoseconds);

		log.info("{} Instant date", Instant.now());

		// https://www.baeldung.com/migrating-to-java-8-date-time-api
		LocalDate birthDay = LocalDate.of(1990, Month.DECEMBER, 15);
		log.info("Representing specific time {}", birthDay);
		
		Month month = LocalDateTime.now().getMonth();
		log.info("Extracting specific fields {}", month);
		
		LocalDateTime fiveHoursBefore = LocalDateTime.now().minusHours(5);
		log.info("Adding and subtracting time {}", fiveHoursBefore);
		
		LocalDateTime inJune = LocalDateTime.now().withMonth(Month.JUNE.getValue());
		log.info("Altering specific fields {}", inJune);
		
		LocalTime truncated = LocalTime.now().truncatedTo(ChronoUnit.HOURS);
		log.info("Truncating {}", truncated);
		
		ZonedDateTime centralEastern = LocalDateTime.now().atZone(ZoneId.of("CET"));
		log.info("Time zone conversion {}", centralEastern);
		
		LocalDateTime localDateTime = LocalDateTime.now();
		LocalDateTime hourLater = LocalDateTime.now().plusHours(1);
		Duration span = Duration.between(localDateTime, hourLater);
		log.info("Getting time span between two points in time {}", span);
		
		LocalDate now = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		String formattedDate = now.format(formatter);
		LocalDate parsedDate = LocalDate.parse(formattedDate, formatter);
		log.info("Time formatting and parsing {}", parsedDate);
		
		int daysInMonth = YearMonth.of(2020, 2).lengthOfMonth();
		log.info("Number of days in a month {}", daysInMonth);
		
		/**
		 * In many cases a user might need to ensure interoperability with third-party
		 * libraries that rely on the old date library.
		 * 
		 * In Java 8 old date library classes have been extended with methods that
		 * convert them to corresponding objects from new Date API. New classes provide
		 * similar functionalities.
		 */
		ZoneId zoneIdFromTimeZone = TimeZone.getTimeZone("PST").toZoneId();
		log.info("ZoneId from TimeZone {}", zoneIdFromTimeZone);
	}
}
