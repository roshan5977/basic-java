package com.feuji.feb20th;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Company1HashMap {

	public static void main(String[] args) {

		Map<Integer, Customer> company1hashmap = new HashMap<>();
		company1hashmap.put(101, new Customer("Rahim", 25, "Male"));
		company1hashmap.put(204, new Customer("Rashmi", 34, "Male"));
		company1hashmap.put(357, new Customer("Roshni", 19, "Female"));
		company1hashmap.put(104, new Customer("Karan", 26, "Male"));
		company1hashmap.put(305, new Customer("Putin", 40, "Male"));
		company1hashmap.put(363, new Customer("Sonali", 22, "Female"));
		company1hashmap.put(724, new Customer("Saloni", 24, "Female"));
		Customer c = new Customer();
		c.setAge(23);
		c.setGender("Male");
		c.setName("Rohan");
		company1hashmap.put(353, new Customer(c.getName(), c.getAge(), c.getGender()));

//     System.out.println(company1hashmap.containsKey(205));
//     System.out.println(company1hashmap.containsKey(205));
//     System.out.println(company1hashmap.containsKey(205));

		Company1HashMap.dispay(company1hashmap);

		System.out.println("+++++++++++++++++++++++++");
		System.out.println("linkedHashmap+ printed by for each");
		Map<Integer, Customer> company2 = new LinkedHashMap<>();
		company2.putAll(company1hashmap);

//		Company1HashMap.display(company2);

		company2.forEach((k, v) -> System.out.println(k + ":" + v));
		company2.merge(26, new Customer("Ramu",34,"male"),(oldValue,newValue)->oldValue+newValue )
		

	}

	private static void display(Map<Integer, Customer> company2) {
		for (Map.Entry<Integer, Customer> com : company2.entrySet()) {
			System.out.println(com.getKey() + ":" + com.getValue());
		}
	}

	private static void dispay(Map<Integer, Customer> hm) {
		Set s = hm.keySet();
		for (Iterator<Integer> i = s.iterator(); i.hasNext();) {
			Integer p = i.next();
			System.out.println("keys:" + p + "    values:" + hm.get(p));
		}
	}

}
