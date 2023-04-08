package com.jsp.linkedlist;

public class LinkedlistCheck {

	public static void main(String[] args) {
     LinkedList list = new LinkedList();
     System.out.println(list);
     list.add(3);
     System.out.println(list.size());
     list.add(6);
     System.out.println(list.size());
     list.add(7);
     list.add(9);
     list.add(1);
     System.out.println(list.size());
     System.out.println(list);
     list.reverse();
     System.out.println(list);

	}

}
