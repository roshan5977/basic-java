package com.feuji.feb20th;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Company3HashTable {

	public static void main(String[] args) {
		Map<Integer, Customer> company1hashmap = new Hashtable<>();
		company1hashmap.put(101, new Customer("Rahim", 25, "Male"));
		company1hashmap.put(204, new Customer("Rashmi", 34, "Male"));
		company1hashmap.put(357, new Customer("Roshni", 19, "Female"));
		company1hashmap.put(104, new Customer("Karan", 26, "Male"));
		company1hashmap.put(305, new Customer("Putin", 40, "Male"));
		company1hashmap.put(363, new Customer("Sonali", 22, "Female"));
		company1hashmap.put(724, new Customer("Saloni", 24, "Female"));

//		company1hashmap.forEach((k,v)->System.out.println(k+" values: "+v));
		Set<Integer> key = company1hashmap.keySet();

		for (Iterator<Integer> emu = company1hashmap.keySet().iterator(); emu.hasNext(); emu.next().
			;

	}

}
