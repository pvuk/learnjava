package com.java.interview.coforge;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author P.V. UdayKiran
 * @version 1
 * @since created on Thu 19-Jun-2025 16:53
 * 
 */
public class FilterListUsingStreams {
	public static void main(String[] args) {
		List<Transaction> list = new ArrayList<Transaction>();
		list.add(Transaction.builder().id(1L).name("SBI").status("InProgress").build());
		list.add(Transaction.builder().id(2L).name("HSBC").status("Success").build());
		list.add(Transaction.builder().id(3L).name("ICICI").status("Pending").build());
		list.add(Transaction.builder().id(4L).name("HDFC").status("InProgress").build());
		list.add(Transaction.builder().id(5L).name("BOB").status("InProgress").build());
		
		System.out.println("Filter Status: ");
		list.stream().filter(trns -> trns.getStatus().equals("InProgress"))
		.collect(Collectors.toList())
		.forEach(trnsObj -> System.out.println(trnsObj));
		
		System.out.println("Sorting using Status: ");
		list.stream().sorted((t1, t2) -> t1.getStatus().compareTo(t2.getStatus())).forEach(trnsObj -> System.out.println(trnsObj));
	}
}
