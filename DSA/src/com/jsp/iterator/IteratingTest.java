package com.jsp.iterator;
import java.util.*;
public class IteratingTest {

	public static void main(String[] args) {
      LinkedList<String> l=new LinkedList<>();
      l.add("wow");
      l.add("i");
      l.add("love");
      l.add("you");
      System.out.println(l);
      Iterator i=l.iterator();
     while( i.hasNext())
     System.out.println( i.next());
     ListIterator<String> k=l.listIterator();
    while( k.hasNext())
     System.out.println(k.next());
	
	while( k.hasPrevious())
	     System.out.println(k.previous());
		}



}
