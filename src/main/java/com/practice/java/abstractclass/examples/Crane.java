package com.practice.java.abstractclass.examples;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Crane extends HeavyVehicle {

	@Override
	String color() {

		return "Yellow";
	}
	
	@Override
	long speed(long speed) {
		return super.speed(speed);
	}

	@Override
	long cc(long cc) {
//		cc = 180;
//		log.info("cc (override in Crane cc[180]): {}", cc);
		return super.cc(cc);
	}

	@Override
	String modelNumber() {
		return "Sep30";
	}

	@Override
	long modelYear() {
		
		return 2019;
	}

	public static void main(String[] args) {
		HeavyVehicle hv = new Crane();
		log.info("Model Year (override in Crane): {}", hv.modelYear());
		
		log.info("cc (override in Crane cc[160] main): {}", hv.cc(160));
		
		log.info("speed (override in Crane speed[60]): {}", hv.speed(60));
		
		log.info("Modle Number(override value in Crane [Sep30]): {}", hv.modelNumber());
		
	}
}
