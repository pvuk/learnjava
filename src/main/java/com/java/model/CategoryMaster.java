package com.java.model;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

/**
 * @author P.V. UdayKiran
 * @version 1, created on Thu 12-Nov-2020 21:16
 */
@Data
public class CategoryMaster {
	
	public CategoryMaster() {
		categoryMasters = new ArrayList<>();
		categoryMasters.add(new CategoryMaster(1L, "UI"));
		categoryMasters.add(new CategoryMaster(2L, "Banks"));
		categoryMasters.add(new CategoryMaster(5L, "Land"));
		categoryMasters.add(new CategoryMaster(7L, "Fruits"));
		categoryMasters.add(new CategoryMaster(9L, "Currency"));
		categoryMasters.add(new CategoryMaster(8L, "Technologies"));
		categoryMasters.add(new CategoryMaster(10L, "Travel"));
		categoryMasters.add(new CategoryMaster(28L, "City"));
	}
	
	/**
	 * 
	 * @param categoryId
	 * @param categoryName
	 */
	CategoryMaster(Long categoryId, String categoryName) {
		this.categoryId = categoryId;
		this.categoryName =categoryName;
	}
	
	private Long categoryId;
	private String categoryName;
	
	List<CategoryMaster> categoryMasters;
}
