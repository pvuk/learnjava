package com.java.collections.convert.examples;

import lombok.Builder;
import lombok.Data;

/**
 * @author P.V. UdayKiran
 * @version 1, created on Thu 25-Feb-2021 22:17
 */
@Data
@Builder
public class District {
	
	private Long districtId;
	private String districtName;
	
	private Long stateId;
	
	private Long accountId;
	private boolean developed;
}
