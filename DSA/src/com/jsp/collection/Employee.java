package com.jsp.collection;

import java.util.*;

public class Employee {
	int age;
   Employee(int age)
   {
	 this.age=age;  
   }
	public static void main(String[] args) {
     List<Employee> list= new ArrayList<>();
     list.add(new Employee(223));
     list.add( new Employee(25));
     list.add(new Employee(88));
     list.add(new Employee(33));
     list.add( new Employee(88));
     System.out.println(list);
	}

}
