package com.practice.java.inheritance.examples;

public interface BaseBreak extends BaseSeater{

	double normalBreak(long breakInAtSpeedOf);
	
	double airBreak(long breakInAtSpeedOf);
	
	double diskBreak(long breakInAtSpeedOf);

	double parachuteBreak(long breakInAtSpeedOf);
	
	double wheelBreak(long breakInAtSpeedOf);
	
	double reverseThrustBreak(long breakInAtSpeedOf);
	
	double spoilersBreak(long breakInAtSpeedOf);
}
