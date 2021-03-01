package com.java.collections.convert.examples;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 1. Convert list to Map
 * 2. Group by list and sum of exposure values using Java 8 Lambda expressions.
 * 
 * @author P.V. UdayKiran
 * @version 1, created on Wed 17-Feb-2021 21:27
 */
public class GroupByListUsingJava8 {
	
	public static void main(String[] args) {
		List<Account> accounts = new ArrayList<>();
		List<Worksheet> worksheet = new ArrayList<>();
		
		/**
		 * 1. If exposure not null it is CRM Account, if null it is ORM account.
		 */
		accounts.add(Account.builder().accountId(1L).accountNumber("11AA22BB").exposure(new BigDecimal(0.76)).build());
		accounts.add(Account.builder().accountId(2L).accountNumber("21AA22BB").exposure(null).build());
		accounts.add(Account.builder().accountId(3L).accountNumber("31AA22BB").exposure(new BigDecimal(1.76)).build());
		accounts.add(Account.builder().accountId(4L).accountNumber("41AA22BB").exposure(null).build());
		accounts.add(Account.builder().accountId(5L).accountNumber("51AA22BB").exposure(null).build());
		accounts.add(Account.builder().accountId(6L).accountNumber("61AA22BB").exposure(null).build());
		
		/**
		 * 1. Filter inspectionIdFk and vsTrnsId with input parameters.
		 * 2. filter devCatIO Y and map InspSamplWorksheet.accountIdFk == Account.accountId then exposure not null.
		 * 3. For CRM Get percentage from sum of exposure [devCatIO = Y] / exposure [devCatIO = Y] + exposure [devCatIO = N]
		 * 4. For ORM Get percentage from sum of [devCatIO = Y] / [devCatIO = Y] + [devCatIO = N]
		 */
		worksheet.add(Worksheet.builder().worksheetId(1L).inspectionIdFk("HOA67").accountIdFk(1L).vsTrnsId(1L).devCatIO("Y").build());
		worksheet.add(Worksheet.builder().worksheetId(2L).inspectionIdFk("HOA67").accountIdFk(2L).vsTrnsId(2L).devCatIO("N").build());
		worksheet.add(Worksheet.builder().worksheetId(3L).inspectionIdFk("HOA67").accountIdFk(1L).vsTrnsId(3L).devCatIO("N").build());
		worksheet.add(Worksheet.builder().worksheetId(4L).inspectionIdFk("HOA67").accountIdFk(3L).vsTrnsId(1L).devCatIO("Y").build());
		worksheet.add(Worksheet.builder().worksheetId(5L).inspectionIdFk("HOA67").accountIdFk(3L).vsTrnsId(3L).devCatIO("Y").build());
		worksheet.add(Worksheet.builder().worksheetId(6L).inspectionIdFk("HOA67").accountIdFk(2L).vsTrnsId(4L).devCatIO("Y").build());
		worksheet.add(Worksheet.builder().worksheetId(7L).inspectionIdFk("HOA67").accountIdFk(1L).vsTrnsId(5L).devCatIO("Y").build());
		worksheet.add(Worksheet.builder().worksheetId(8L).inspectionIdFk("HOA67").accountIdFk(5L).vsTrnsId(1L).devCatIO("N").build());
		worksheet.add(Worksheet.builder().worksheetId(9L).inspectionIdFk("HOA67").accountIdFk(6L).vsTrnsId(1L).devCatIO("N").build());
		worksheet.add(Worksheet.builder().worksheetId(9L).inspectionIdFk("HOA67").accountIdFk(6L).vsTrnsId(1L).devCatIO("NAP").build());
//		worksheet.add(Worksheet.builder().worksheetId(9L).inspectionIdFk("HOA67").accountIdFk(6L).vsTrnsId(1L).devCatIO(null).build());
		
		/**
		 * 1. filter exposure not null
		 * 2. Convert list to Map
		 */
		Map<Object, Object> mapCRM = accounts.stream().filter(account -> account.getExposure() != null)
				.collect(Collectors.toMap(key -> key.getAccountId(), value -> {
					value.setExposure(value.getExposure().setScale(2, RoundingMode.HALF_UP));
					return value.getExposure();
				}));
		System.out.println(mapCRM);
		
		String inspectionId = "HOA67";
		Long vsTrnsId = 1L;
		Map<Object, Long> mapISWS = worksheet.stream()
				.filter(ws -> ws.getInspectionIdFk().equals(inspectionId)
						&& ws.getVsTrnsId().equals(vsTrnsId))
				.collect(Collectors.groupingBy(dev-> dev.getDevCatIO(), Collectors.counting()));
		System.out.println("Grouping Accounts: "+ mapISWS);
		
//		System.out.println((2f / 3f) * 100f);
	}
}
