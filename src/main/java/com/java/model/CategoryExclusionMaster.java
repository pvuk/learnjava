package com.java.model;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

/**
 * @author P.V. UdayKiran
 * @version 1, created on Thu 12-Nov-2020 21:16
 */
@Data
public class CategoryExclusionMaster {
	
	public CategoryExclusionMaster() {
		categoryExclusionMasters = new ArrayList<>();
		categoryExclusionMasters.add(new CategoryExclusionMaster(1l, 1l, 1l));
		categoryExclusionMasters.add(new CategoryExclusionMaster(2l, 1l, 2l));
		categoryExclusionMasters.add(new CategoryExclusionMaster(3l, 5l, 1l));
		categoryExclusionMasters.add(new CategoryExclusionMaster(4l, 6l, 1l));
		categoryExclusionMasters.add(new CategoryExclusionMaster(5l, 28l, 4l));
		categoryExclusionMasters.add(new CategoryExclusionMaster(6l, 8l, 1l));
		categoryExclusionMasters.add(new CategoryExclusionMaster(7l, 8l, 2l));
		categoryExclusionMasters.add(new CategoryExclusionMaster(8l, 8l, 3l));
		categoryExclusionMasters.add(new CategoryExclusionMaster(9l, 7l, 5l));
		categoryExclusionMasters.add(new CategoryExclusionMaster(10l, 7l, 6l));
	}

	/**
	 * @param categoryExclusionId
	 * @param categoryId
	 * @param subParamId
	 */
	public CategoryExclusionMaster(long categoryExclusionId, long categoryId, long subParamId) {
		this.categoryExclusionId = categoryExclusionId;
		this.categoryId = categoryId;
		this.subParamId = subParamId;
	}

	private Long categoryExclusionId;
	private Long categoryId;
	private Long subParamId;
	
	private List<CategoryExclusionMaster> categoryExclusionMasters;
}
