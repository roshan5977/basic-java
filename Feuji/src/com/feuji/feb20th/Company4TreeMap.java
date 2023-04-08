package com.feuji.feb20th;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Company4TreeMap {
	public static void main(String[] args) {
		Map<Integer, Customer> company1hashmap = new TreeMap<>();
		company1hashmap.put(101, new Customer("Rahim", 25, "Male"));
		company1hashmap.put(204, new Customer("Rashmi", 34, "Male"));
		company1hashmap.put(357, new Customer("Roshni", 19, "Female"));
		company1hashmap.put(104, new Customer("Karan", 26, "Male"));
		company1hashmap.put(305, new Customer("Putin", 40, "Male"));
		company1hashmap.put(363, new Customer("Sonali", 22, "Female"));
		company1hashmap.put(724, new Customer("Saloni", 24, "Female"));
		company1hashmap.put(724, new Customer("jery", 24, "other"));
		company1hashmap.forEach((k, v) -> System.out.println("key: " + k + "values: " + v));
//		ArrayList<Customer> male = new ArrayList<>();
//		ArrayList<Customer> female = new ArrayList<>();
//	
//		Iterator<Integer> i = company1hashmap.keySet().iterator();
//		while ( i.hasNext()) {
//			Integer cons = i.next();
//			if (company1hashmap.get(cons).getGender().equalsIgnoreCase("MALE")) {
//				male.add(company1hashmap.get(cons));
//			} else
//				female.add(company1hashmap.get(cons));
//		}
//		male.stream().forEach(System.out::println);
//		System.out.println("+++++++");
//		female.stream().forEach(System.out::println);

		Map<String, ArrayList<Customer>> grouping = new HashMap<>();//map

		for (Iterator<Integer> i = company1hashmap.keySet().iterator(); i.hasNext();) {
			Integer cons = i.next();
			String Gender = company1hashmap.get(cons).getGender();
			if (grouping.containsKey(Gender)) {
				grouping.get(Gender).add(company1hashmap.get(cons));
			} else {
				ArrayList<Customer> customerss = new ArrayList<>();
				customerss.add(company1hashmap.get(cons));
				grouping.put(Gender, customerss);
			}
		}
		grouping.forEach((k, v) -> System.out.println("key : " + k + " values : " + v));

		company1hashmap.keySet().stream().filter(e->e%2==0).forEach(System.out::println);

	}

}
