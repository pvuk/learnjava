package com.java.lambda.foreach;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMapUsingLambda {
	public static void main(String[] args) {
		List<Hosting> list = new ArrayList<Hosting>();
		list.add(new Hosting(1, "liquidweb.com", 80000));
        list.add(new Hosting(2, "linode.com", 90000));
        list.add(new Hosting(3, "digitalocean.com", 120000));
        list.add(new Hosting(4, "aws.amazon.com", 200000));
        list.add(new Hosting(5, "mkyong.com", 1));
		Map<Integer, String> result1 = list.stream().collect(Collectors.toMap(Hosting::getId, Hosting::getWebSites));
		System.out.println("Result1: "+ result1);
		Map<String, Integer> result2 = list.stream().collect(Collectors.toMap(x -> x.getWebSites(), x -> x.getValue()));
		System.out.println("Result2: "+ result2);
	}
}
