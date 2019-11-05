package com.practice.java.inheritance.examples;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DerivedBike extends BaseAbsSportsBike {
	
	public static void main(String[] args) {
		DerivedBike db = new DerivedBike();
		log.info("Break In At SpeedOf: {}", db.diskBreak(40));
	}
	
	@Override
	public double diskBreak(long breakInAtSpeedOf) {
		// TODO Auto-generated method stub
		return super.diskBreak(breakInAtSpeedOf);
	}

	@Override
	public double airBreak(long breakInAtSpeedOf) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double parachuteBreak(long breakInAtSpeedOf) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double wheelBreak(long breakInAtSpeedOf) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double reverseThrustBreak(long breakInAtSpeedOf) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double spoilersBreak(long breakInAtSpeedOf) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double diskBreak(long breakInAtSpeedOf, int diskSupportsOnWheels) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int seater(int noOfSeatsAvailable) {
		// TODO Auto-generated method stub
		return 0;
	}

}
