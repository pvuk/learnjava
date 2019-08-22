package com.java.designpatterns.strategy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class InstagramStrategy implements ISocialMediaStrategy {

	@Override
	public void connectTo(String name) {
		log.info("Connecting with "+ name +" through Instagram");
	}

}
