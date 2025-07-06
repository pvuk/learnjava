package com.practice.java.inheritance.examples;
/**
 * @author P.V. UdayKiran
 * @version 1
 * @since created on Tue 03-Jun-2025 17:35
 * 
 */
public class CreditCardPaymentService implements OnlinePayment {

	@Override
	public String processingOnlinePayment(double payment) {
		return "Online Creditcard Payment $"+ payment +" initiated";
	}

}
