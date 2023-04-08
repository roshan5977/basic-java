package com.jsp.comparable;

import com.jsp.ArrayList.ArrayList;

public class Demo {

	public static void main(String[] args) {
      ArrayList list=new ArrayList();
      System.out.println(list);
      System.out.println(list.size());
      list.add(10);
      list.add(20);
      list.add(30);
      list.add(40);
      list.add(50);
      list.add(60);
      list.add(70);
      System.out.println(list);
      System.out.println(list.size());
      list.remove(3);
      System.out.println(list);
      System.out.println(list.size());

	}

}
