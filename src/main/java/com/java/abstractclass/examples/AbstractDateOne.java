package com.java.abstractclass.examples;

import java.util.Calendar;
import java.util.Date;

/**
 * <p>
 * 	Reference 1: <a href="https://www.guru99.com/java-data-abstraction.html">What is Abstraction in OOPs? Learn with Java Example</a>
 * </p>
 * @author P V UdayKiran
 *
 * @version 1, changes on Sat 07-Dec-2019 07:09
 * @version: %I%
 */
public abstract class AbstractDateOne {
	
	public abstract int getDays(Date from, Date to);
	
	/**
	 * Abstract methods do not specify a body
	 */
//	public abstract int addMonths(Date date, int months) {};
	
	public Date addDays(Date date, int days) {
		System.out.println("Calling AbstractDateOne addDays method");
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.DAY_OF_MONTH, days);
		return calendar.getTime();
	}
}
