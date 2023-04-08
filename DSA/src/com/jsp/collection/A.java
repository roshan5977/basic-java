package com.jsp.collection;

import java.util.*;

public class A {

	public static void main(String[] args) {
       Queue q= new LinkedList();
       q.add(20);
       q.add(45);
       q.add(77);
       q.add(345);
       q.add(99);
       q.add(33);
       System.out.println(q);
      Queue q2= new LinkedList();
      q2.add(22);
      q2.add(354);
      q2.add(645);//add
      q2.add(87);
      System.out.println(q.offer(98));//offer same as add
      q.addAll(q2);//addall
      System.out.println(q);
      System.out.println(q.remove(22));//remove
      System.out.println(q);
     System.out.println(q.remove());//if its empty exception//remove
     System.out.println(q);
     System.out.println(q.poll());//if its empty return null//poll
     System.out.println(q);
     System.out.println(q.contains(77));//contains
     System.out.println(q.containsAll(q2));//contains all
     q.add(22);
       System.out.println(q.containsAll(q2));
     System.out.println(q.element());//just see and return first ele//element
       System.out.println(q.peek());//just see and return first ele//peek
       //peek throws null and element throws exception if its empty!!!
       
       
      Queue q1= new ArrayDeque();
      
   Queue q4 =  new PriorityQueue(new Desc());
   q4.add(342);
   q4.offer(99);
   System.out.println(q4);
       
       
	}

}
class Desc implements Comparator{
	public int compare(Object o1,Object o2)
	{
		return ((Integer)o2)-((Integer)o1);
	}
}
