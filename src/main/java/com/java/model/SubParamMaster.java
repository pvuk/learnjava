package com.java.model;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

/**
 * @author P.V. UdayKiran
 * @version 1, created on Thu 12-Nov-2020 21:16
 */
@Data
public class SubParamMaster {
	
	public SubParamMaster() {
		subParamMasters = new ArrayList<>();
		subParamMasters.add(new SubParamMaster(1L, "Angular"));
		subParamMasters.add(new SubParamMaster(2L, "Spring JPA"));
		subParamMasters.add(new SubParamMaster(3L, "TypeScript"));
		subParamMasters.add(new SubParamMaster(4L, "Hyderabad"));
		subParamMasters.add(new SubParamMaster(5L, "Apple"));
		subParamMasters.add(new SubParamMaster(6L, "Orange"));
	}
	
	/**
	 * @param subParamId
	 * @param subParamName
	 */
	public SubParamMaster(long subParamId, String subParamName) {
		this.subParamId = subParamId;
		this.subParamName = subParamName;
	}

	private Long subParamId;
	private String subParamName;
	
	private List<SubParamMaster> subParamMasters;
}
