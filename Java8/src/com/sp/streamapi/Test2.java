package com.sp.streamapi;

import java.util.*;
import java.util.stream.Collectors;

public class Test2 {
public static void main(String[] args) {
	List<Student> l=new ArrayList<>();
	l.add(new Student("roshan",8,"java"));
	l.add(new Student("prakash",8,"c++"));
	l.add(new Student("prabhu",8,"python"));
	l.add(new Student("simran",8,"html"));
	l.add(new Student("jyoshna",8,"css"));
	l.add(new Student("kanha",8,"javascript"));
	l.add(new Student("simi",8,"tailwindcss"));
	


//	
//	u.forEach(e->System.out.println(e));
	
//	
//	List<Integer> lists=List.of(4,7,3,3,9,3,3,1,3,6,8,9,4,5);
//	
//	Integer min=lists.stream().min((e1,e2)->e1-e2).get();
	//check implementataion of Optional class of get()
//	System.out.println(min);
	
	Student u= l.stream().min((s1,s2)->s1.getName().compareTo(s2.getName())).get();
//	Student g= l.stream().min((s1,s2)->s1.getId()-(s2.getId())).get();
//	Student h= l.stream().min((s1,s2)->s1.getCourse().compareTo(s2.getCourse())).get();
//	Student i= l.stream().min((s1,s2)->s1.toString().compareTo(s2.toString())).get();
//	
//	System.out.println(u);
//	System.out.println(g);
//	System.out.println(h);
//	System.out.println(i);
	
	
	Student u= l.stream().max((s1,s2)->s1.getName().compareTo(s2.getName())).get();
	Student g= l.stream().max((s1,s2)->s1.getId()-(s2.getId())).get();
	Student h= l.stream().max((s1,s2)->s1.getCourse().compareTo(s2.getCourse())).get();
	Student i= l.stream().max((s1,s2)->s1.toString().compareTo(s2.toString())).get();
	
	System.out.println(u);
	System.out.println(g);
	System.out.println(h);
	System.out.println(i);
	
	
}
}

/**
 * consumer is a functional interface of java.function package 
 * this interface has an abstract method called accept () which has object type parameter and void as return type.
 * 
 *  min() and max() mtd takes stream type and converts to optional type 
 * get() is from optional class used to return the object or data contained from optional class object.
 */
 
