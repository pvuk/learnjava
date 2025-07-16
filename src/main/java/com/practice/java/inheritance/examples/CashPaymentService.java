package com.practice.java.inheritance.examples;
/**
 * @author P.V. UdayKiran
 * @version 1
 * @since created on Tue 03-Jun-2025 17:36
 * 
 */
public class CashPaymentService implements OfflinePayment {

	@Override
	public String processingOfflinePayment(double payment) {
		return "Offline Cash Payment $"+ payment +" initiated";
	}

}
