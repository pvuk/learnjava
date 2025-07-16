package com.java.abstractclass.examples;

import java.util.Calendar;
import java.util.Date;

/**
 * Code Ref:
 * What Is Method Overriding?
Method overriding occurs when a subclass redefines a method from its superclass with the same name, return type, and parameters but provides its own implementation.
💡 Key Points of Method Overriding:
- The overridden method must have the same signature (same name and parameter list).
- The overridden method must be in a subclass (child class).
- The method must be non-static (instance method), as static methods can't be overridden but can be redefined.
- The access modifier cannot be more restrictive (e.g., a public method in the parent can't be overridden as private in the subclass).
- The method can be invoked <b>using the super keyword</b> to call the parent class’s version.</br>

Code Ref:
🔹 How Does Overriding Work in Java?
	- Runtime Polymorphism:
	When a method is overridden in a subclass, 
		Java determines at runtime which version of the method to call <b>based on the object type</b>—not the reference type.


 * @author P.V. UdayKiran
 * @version 1
 * @since created on Wed 07-Dec-2019 07:59
 */
public class CalculateDate extends AbstractDateOne{

	/**
	 * override abstract method doesn't contain abstract in method syntax.
	 */
	@Override
	public int getDays(Date from, Date to) {
		int days = (int) ((to.getTime() - from.getTime()) / (1000 * 60 * 60 * 24));
		return days;
	}
	
	/**
	 * Code Ref: below error will get when method modifier is changed to private
	 * <p>
	 * Exception in thread "main" java.lang.Error: Unresolved compilation problem: </br>
	 * Cannot reduce the visibility of the inherited method from AbstractDateOne
	 * </p>
	 * 
	 * Code Ref: 
	 * 
	 * - Execution Flow in Your Code:
		- You’ve overridden addDays in CalculateDate, so any call to addDays, 
			whether from an instance of CalculateDate (cDate.addDays()) or from a reference of type AbstractDateOne (aDateOne.addDays()), 
			will always call the overridden method from CalculateDate.
		
		- Why Not Calling Parent Method?
		- The parent class’s method is not explicitly called because:
		- You commented out return super.addDays(date, days);
		- Without that, the superclass method won’t be executed at all.

		Code Ref:
		- If a subclass overrides a method from its parent, the subclass version replaces the parent version.

		Code Ref:
		- Method Overriding Mechanism:
			- In Java, when a subclass overrides a method from the parent class, 
			calls to that method on an instance of the subclass will invoke the subclass’s version, 
			even if the <b>reference type</b> is the parent class.


	 * @param date
	 * @param days
	 * @return date
	 */
	@Override
	public Date addDays(Date date, int days) {
//		return super.addDays(date, days);//
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
		
		System.out.println("Achieved runtime polymorphism");
		AbstractDateOne aDateOne = new CalculateDate();
		Date overrideDate = aDateOne.addDays(new Date(), 40);// Calls Child's addDays method (runtime polymorphism)
		System.out.println(overrideDate);
	}
}
