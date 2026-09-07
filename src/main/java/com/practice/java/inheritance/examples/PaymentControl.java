package com.practice.java.inheritance.examples;
/**
 * SOLID Principles:
 * 4. Interface Segregation Principle
 * 
 * The Interface Segregation Principle (ISP) states that clients should not be forced to depend on interfaces they do not use. In simpler terms, it advocates for creating smaller, more specific interfaces rather than large, general-purpose ones. This principle aims to reduce the coupling between classes and promote flexibility and maintainability. 
Example:
Consider a scenario with different types of payment methods, such as online and offline payments. Instead of having a single large Payment interface with methods for both online and offline transactions, it's better to segregate the functionalities into separate interfaces.
Here's how you might apply the ISP in a Spring Boot application: Define Specific Interfaces.

In this example, CreditCardPaymentService only implements the OnlinePayment interface, and CashPaymentService only implements OfflinePayment. This adheres to the ISP by ensuring that each service only implements the methods that are relevant to its functionality. The PaymentController uses these specific interfaces to perform payment operations.

By following the ISP, you create a more flexible and maintainable system where changes in one area are less likely to affect other parts.

NOT TO DO:
Having said that, by violating the Interface Segregation Principle you would face these problems: 
A change in a large interface is going to force you to change clients that implement it even though they don't need it. 
Large interfaces end up with more coupling, which makes your code more brittle and hard to maintain.

 * @author P.V. UdayKiran
 * @version 1
 * @since created on Tue 03-Jun-2025 17:31
 * 
 */
public class PaymentControl {
	public static void main(String[] args) {
		OnlinePayment creditCardPayment = new CreditCardPaymentService();
		System.out.println(creditCardPayment.processingOnlinePayment(100));
		
		OfflinePayment offlineCashPayment = new CashPaymentService();
		System.out.println(offlineCashPayment.processingOfflinePayment(50));
		
		/*
		 * You can implement the same interface in multiple classes, 
		 * as long as each class provides its own implementation of the interface's methods. 
		 * This is a common practice in object-oriented design, 
		 * allowing different classes to share a common contract while maintaining their own unique behaviors.
		 */
		OfflinePayment offlineChequePayment = new ChequePaymentService();
		System.out.println(offlineChequePayment.processingOfflinePayment(100));
	}
}
