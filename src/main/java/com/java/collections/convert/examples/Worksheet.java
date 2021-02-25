package com.java.collections.convert.examples;

import lombok.Builder;
import lombok.Data;

/**
 * @author P.V. UdayKiran
 * @version 1, created on Wed 17-Feb-2021 21:30
 */
@Data
@Builder
public class Worksheet {
	
	private Long worksheetId;
	private String inspectionIdFk;
	private Long accountIdFk;
	private Long vsTrnsId;
	private String devCatIO;
//	private Boolean isSampling;
}
