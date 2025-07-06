package com.practice.java.inheritance.examples;
/**
 * @author P.V. UdayKiran
 * @version 1
 * @since created on Tue 03-Jun-2025 17:40
 * 
 */
public class ChequePaymentService implements OfflinePayment{

	@Override
	public String processingOfflinePayment(double payment) {
		return "Offline Cheque Payment $"+ payment +" initiated";
	}

}
