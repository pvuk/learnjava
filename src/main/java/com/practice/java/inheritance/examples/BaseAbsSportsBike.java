package com.practice.java.inheritance.examples;

public abstract class BaseAbsSportsBike extends BaseAbsBreak {
	
	public abstract double diskBreak(long breakInAtSpeedOf, int diskSupportsOnWheels);
	
	@Override
	public double diskBreak(long breakInAtSpeedOf) {
		return super.diskBreak(breakInAtSpeedOf);
	}
}
