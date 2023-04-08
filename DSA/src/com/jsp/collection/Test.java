package com.jsp.collection;

import java.util.Collections;
import java.util.LinkedList;

public class Test {

	public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();
        list.add(20);
        list.add(45);
        list.add(0, 30);
        list.add(99);
        System.out.println(list);
       LinkedList <Integer>list1= new LinkedList<>();
       list1.add(56);
       list1.add(24);
       list1.add(3);
       list.addAll(list1);
       System.out.println(list);
       System.out.println(list.contains(563));
       Object[]a=list.toArray();
       for(Object x:a)System.out.print(x+" ");
       Collections.sort(list);
       System.out.println(list);
	}

}
