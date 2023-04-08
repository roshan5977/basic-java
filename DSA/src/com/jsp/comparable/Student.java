package com.jsp.comparable;

import java.util.Arrays;
import java.util.Comparator;

public class Student implements Comparable,Comparator
{
	  int regno;
	    String name;
	    double marks;
	    public Student(int reg,String n,double m )
	    {
	    	regno=reg;
	    	name=n;
	    	marks=m;
	    }
	    @Override
	    public String toString()
	    {
	    	return "[name "+name+" regno "+regno+" secured "+marks+" ]";
	    }
	    @Override
	    public int compareTo(Object args)
	    {
	    	return name.compareTo(((Student)args).name);
	    }
	    public int compare(Object a,Object b)
	    {
	    	Student s1=(Student)a;
	    	Student s2=(Student)b;
	    	if(s1.regno>s2.regno)return 1;
	    	if(s1.regno<s2.regno)return -1;
	    	return 0;
	    }
	public static void main(String[] args) {
//      Student s=new Student(98989,"roshan",88);
      Student []t=new Student[4];
      t[0]= new Student(8574,"prakash",67);
      t[1]=new Student(345345,"rajesh",45);
      t[2]= new Student(4556,"garud",97);
      t[3]=new Student(345345,"rahim",76);
      Arrays.sort(t);
      System.out.println("+++++++++++++++++++++++++++++");
     for(Student a:t) System.out.println(a);
     Arrays.sort(t,new Student(98989,"roshan",88));
     for(Student a:t) System.out.println(a);

	}
}
