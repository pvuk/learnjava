package com.java.abstractclass.examples;

import java.util.Calendar;
import java.util.Date;

public class CalculateDate extends AbstractDateOne{

	/**
	 * override abstract method doesn't contain abstract in method syntax.
	 */
	@Override
	public int getDays(Date from, Date to) {
		
		return 0;
	}
	
	/**
	 * below error will get when method modifier is changed to private
	 * <p>
	 * Exception in thread "main" java.lang.Error: Unresolved compilation problem: </br>
	 * Cannot reduce the visibility of the inherited method from AbstractDateOne
	 * </p>
	 * 
	 * @param date
	 * @param days
	 * @return date
	 */
	@Override
	public Date addDays(Date date, int days) {
//		return super.addDays(date, days);
		System.out.println("Calling CalculateDate addDays method");
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.DAY_OF_MONTH, days);
		return calendar.getTime();
	}

	public static void main(String[] args) {
		CalculateDate cDate = new CalculateDate();
		Date newDate = cDate.addDays(new Date(), 40);
		System.out.println(newDate);
		
		AbstractDateOne aDateOne = new CalculateDate();
		Date overrideDate = aDateOne.addDays(new Date(), 40);
		System.out.println(overrideDate);
	}
}
