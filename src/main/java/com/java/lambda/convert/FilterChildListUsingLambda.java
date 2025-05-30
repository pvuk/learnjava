package com.java.lambda.convert;

import java.util.List;
import java.util.stream.Collectors;

import com.java.model.CategoryExclusionMaster;
import com.java.model.CategoryMaster;
import com.java.model.SubParamMaster;

/**
 * @author P.V. UdayKiran
 * @version 1, created on Thu 12-Nov-2020 21:19
 */
public class FilterChildListUsingLambda {
	
	public static void main(String[] args) {
		List<CategoryMaster> categoryMasters = new CategoryMaster().getCategoryMasters();
		
		List<CategoryExclusionMaster> exclusionMasters = new CategoryExclusionMaster().getCategoryExclusionMasters();
		
		List<SubParamMaster> subParamMasters = new SubParamMaster().getSubParamMasters();
		
		List<Long> categoryIdList = categoryMasters.stream().map(CategoryMaster :: getCategoryId).collect(Collectors.toList());
		System.out.println("CateogyrIdList :: "+ categoryIdList);
		
		String exclusions = categoryMasters.stream().map(CategoryMaster::getCategoryId)
				.filter(id -> id.equals(8L))//CategoryId 8 :: Technologies
			.map(categoryId -> {
				List<Long> subParamIdList = exclusionMasters.stream()
						.filter(exclusion -> exclusion.getCategoryId().equals(categoryId))
						.map(CategoryExclusionMaster:: getSubParamId)
						.collect(Collectors.toList());
				return subParamIdList;
			}).map(subParamId -> {
				String subParamName = subParamMasters.stream()
						.filter(subParam -> subParam.getSubParamId().toString().equals(subParamId))
						.findAny()
						.get()
						.getSubParamName();
				return subParamName;
			}).collect(Collectors.joining(", "));
		System.out.println("SubParamIdList :: "+ exclusions);
	}
}
