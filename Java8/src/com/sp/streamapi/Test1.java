package com.sp.streamapi;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Steam Api
 * 
 * @author Roshan ctrl shift o
 */

public class Test1 {
	public static void main(String[] args) {
		List<Integer> slist = new ArrayList<>();
		slist.add(1);
		slist.add(2);
		slist.add(3);
		slist.add(4);
		slist.add(5);
		slist.add(6);
		slist.add(7);
		slist.add(8);
//		List<Integer> stlist = new ArrayList<>();
//		Iterator i = slist.iterator();
//		while (i.hasNext())
//			if ((int) i.next() % 2 != 0)
//				stlist.add((Integer) i.next());
//		System.out.println(stlist);
		
        List<Integer> list2 =slist.stream().filter(e->e%2==0).collect(Collectors.toList());
        System.out.println(list2);
		
	}
}
