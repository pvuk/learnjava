package com.java.convert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lombok.extern.slf4j.Slf4j;

/**
 * <p>
 * 	<ol>How to put more than 1000 values into an Oracle IN clause
 * 	<li>select * from table1 where ID in (1,2,3,4,...,1000) or ID in (1001,1002,...,2000)</li>
 * 	</ol>
 * </p>
 * @author venkataudaykiranp
 * @version 1, changes on Mon 09-Dec-2019 12:30
 */
@Slf4j
public class SplitStringByCommaConvertStringArrayToLongArray {
	
	/**
	 * 1. Oracle In Clause supports upto 1000 ids. Converting ids to subIds.
	 */
	private static final int IN_CLAUSE_LIMIT = 999;
	
	public static void main(String[] args) {
		String values = "5423, 6843, 9733, 1676, 3674, 6643, 6497,"
						+ "  6997, 5498, 3969, 6174, 6325, 6419, 6885,"
						+ "  1547, 6484, 6487, 6219";
		long start = System.currentTimeMillis();
		String[] split = values.split(",");
		int count = split.length - 1;
		log.info("Total Count: {}", count);
		
		Long[] longArray = Arrays.stream(values.split(","))
									.map(String::trim)
									.map(Long::valueOf)
									.toArray(Long[]::new);//Convert String array to Long array
//		long[] longPrimitiveArray = Arrays.stream(values.split(","))
//											.map(String::trim)
//											.mapToLong(Long::valueOf)
//											.toArray();//Convert String array to long array
		
		List<Long> idList = Arrays.asList(longArray);
		List<List<Long>> partitionLongIds = partitionLongIds(idList);//convert list to sublist
		System.out.println(partitionLongIds);
		
//		queryBuild(partitionLongIds);
		
		log.info("Time: {}ms", System.currentTimeMillis() - start);
	}
	
	private static void queryBuild(List<List<Long>> partitionLongIds) {
		StringBuilder qs = new StringBuilder();
		Map<String, Object> parameterMap = new HashMap<String, Object>();
		
		String entityFieldName = "requestor.id";
		String queryFieldName = "RequestorId";
		qs.append(" AND (");
		
		qs.append("(");
		int i = 0;
		for(List<Long> subList: partitionLongIds) {
			queryFieldName += i;
			if(i > 0) {
				qs.append(" OR ");
				qs.append(entityFieldName + " IN (:" + queryFieldName + ")");
			} else {
				qs.append(entityFieldName + " IN (:" + queryFieldName + ")");
			}
			parameterMap.put(queryFieldName, subList);
			i++;
		}
		qs.append(')');
		
		qs.append(')');
		log.info("Query: {}", qs.toString());
	}

	/**
	 * <p>
	 * 	1.If records contains more than 999 converting it to list.subList.
	 * 	2. Converting List<Long> to List<List<Long>>
	 * </p>
	 * @param list
	 * @return
	 */
	public static List<List<Long>> partitionLongIds(List<Long> list)
    {
        assert(IN_CLAUSE_LIMIT > 0);
        assert(list != null);
        assert(list.size() + IN_CLAUSE_LIMIT <= Integer.MAX_VALUE); //avoid overflow

        int idx = 0;

        List<List<Long>> result = new ArrayList<List<Long>>();

        for (idx = 0; idx + IN_CLAUSE_LIMIT <= list.size(); idx += IN_CLAUSE_LIMIT) {
            result.add(list.subList(idx, idx + IN_CLAUSE_LIMIT));
        }
        if (idx < list.size()) {
            result.add(list.subList(idx, list.size()));
        }

        return result;
    }
}
