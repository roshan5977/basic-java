package com.jsp.collection;

import java.util.*;

public class Television implements Comparable<Television> {
     int size;
     double price;
     String name;
     Television(int s,String n,double p)
     {
    	 size=s;
    	 name=n;
    	 price=p;
     }
     @Override
     public int compareTo(Television t1)
     {
    	 return this.name.compareTo(t1.name);
     }
     public String toString()
     {
    	 return name;
     }
	public static void main(String[] args) {
     TreeSet<Television> s=new TreeSet<>(new Bysize());
     System.out.println(s.add(new Television(22,"sony",50000.0)));
     System.out.println(s.add(new Television(25,"lg",150000.0)));
     System.out.println(s.add(new Television(66,"mi",70000.0)));
     System.out.println(s.add(new Television(22,"sony",50000.0)));
     System.out.println(s.add(new Television(22,"samsung",90000.0)));
     System.out.println(s.add(new Television(44,"heroku",100000.0)));
     System.out.println(s.add(new Television(66,"mi",60000.0)));
     System.out.println(s.add(new Television(32,"acer",120000.0)));
     System.out.println(s.add(new Television(55,"apple",150000.0)));
     System.out.println(s.add(new Television(102,"nokia",35000.0)));
     System.out.println(s.add(new Television(64,"oneplus",95000.0)));
     System.out.println(s);




	}
	
}
class Byprice implements Comparator<Television>
{
	public int compare(Television t1,Television t2)
	{
		if(t1.price>t2.price)return 1;
		if(t1.price<t2.price)return -1;
		return 0;
	}
}
class Bysize implements Comparator<Television>
{
	public int compare(Television t1,Television t2)
	{
		return t1.size-t2.size;
	}
}

