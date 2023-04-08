package com.jsp.collection;
import java.util.*;
public class B {

	public static void main(String[] args) {
                 Set s= new HashSet();
                 s.add(99);
                 s.add(44);
                 s.add(22);
                 s.add(22);
                SortedSet s1= new TreeSet();
                s1.add(22);
                s1.add(44);
                s1.add(77);
                System.out.println(s1.add(73));
                System.out.println(s1);
               System.out.println(s1.first());
               System.out.println(s1.last());
               System.out.println(s1);
               System.out.println("++++++++");
               SortedSet  s5=s1.headSet(77);
               System.out.println(s5);
               SortedSet s6=s1.tailSet(22);
               System.out.println(s6);
               SortedSet s7=s1.subSet(22,77);
               System.out.println(s7);


               
                
                Set s2= new LinkedHashSet();
                
	}

}
