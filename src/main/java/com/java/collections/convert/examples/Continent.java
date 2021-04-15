package com.java.collections.convert.examples;

import lombok.Builder;
import lombok.Data;

/**
 * @author P.V. UdayKiran
 * @version 1, created on Thu 25-Feb-2021 22:17
 */
@Data
@Builder
public class Continent {
	
	private Long continentId;
	private String continentName;
}
