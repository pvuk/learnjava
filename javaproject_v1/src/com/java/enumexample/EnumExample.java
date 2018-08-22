package com.java.enumexample;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EnumExample {
	
	public static void main(String[] args) {
		Level level = Level.HIGH;
		log.info("Level: {}", level);
		log.info("Level High compare with MEDIUM: {}", level.compareTo(level.MEDIUM));
		log.info("Level High compare with HIGH: {}", level.compareTo(level.HIGH));
		log.info("Level High compare with LOW: {}", level.compareTo(level.LOW));
		log.info("Level MEDIUM compare with LOW: {}", Level.MEDIUM.compareTo(Level.LOW));
		log.info("Level MEDIUM compare with MEDIUM: {}", Level.MEDIUM.compareTo(Level.MEDIUM));
		log.info("Level MEDIUM compare with HIGH: {}", Level.MEDIUM.compareTo(Level.HIGH));
		log.info("Level LOW compare with HIGH: {}", Level.LOW.compareTo(Level.HIGH));
		log.info("Level LOW compare with MEDIUM: {}", Level.LOW.compareTo(Level.MEDIUM));
		log.info("Level LOW compare with LOW: {}", Level.LOW.compareTo(Level.LOW));
		
		log.info("Level level = Level.HIGH;");
		log.info("if conditin");
		log.info("level == Level.HIGH");
		if (level == Level.HIGH){
			log.info("true");
		}
		
		log.info("level.toString(): {}", level.toString());
		log.info("Level level = Level.HIGH; Level.valueOf(level.name()): {}", Level.valueOf(level.name()));
		
		log.info("switch statement");
		switch (level) {
		case HIGH:
			log.info("HIGH");
			break;
		case MEDIUM:
			log.info("MEDIUM");
			break;
		case LOW:
			log.info("LOW");
			break;
		}
		
		log.info("EnumLevel");
		EnumLevel enumLevel = EnumLevel.HIGH;
		log.info("calls EnumLevel.HIGH constructor value: getLevelCode: {}",enumLevel.getLevelCode());
		log.info("HIGH ordinal: {}", enumLevel.HIGH.ordinal());
	}
}
