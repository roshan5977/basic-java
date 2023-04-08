package com.jsp.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Demo {

	public static void main(String[] args) {
		Map m = new TreeMap();
		System.out.println(m.put("sachin", 99));
		System.out.println(m.put("raina", 94));
		System.out.println(m.put("virat", 57));
		System.out.println(m.put("dhoni", 56));
		System.out.println(m.put("sachin", 100));
		System.out.println(m);
		Set s = m.entrySet();
		Iterator i = s.iterator();
		while (i.hasNext())
			System.out.println(i.next());

	}
}
