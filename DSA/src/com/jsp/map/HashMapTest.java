package com.jsp.map;

import java.util.*;

public class HashMapTest {

	public static void main(String[] args) {
     Map<Integer,String> map=new HashMap<>();
     map.put(1,"Ramesh");
     map.put(2,"Rakesh");
     map.put(3,"Roshan");
     map.put(4,"Rahim");
     map.put(5,"Rajesh");
     map.put(6,"Roshan");
     map.put(7,"Rohit");
     
//     map.clear();
     System.out.println(map.containsKey(5));
     System.out.println(map.containsValue("Roshan"));
     System.out.println(map.isEmpty());
     System.out.println(map.get(4));
     System.out.println(map.getOrDefault(7, "Rahul"));
//     System.out.println(map.merge(null, null, null));try it
//     System.out.println(map.compute(null, null));
//     System.out.println(map.computeIfAbsent(null, null));
//     System.out.println(map.computeIfPresent(null, null));
     System.out.println(map.putIfAbsent(8, "Roshni"));
     System.out.println(map.size());
     
	}

}
