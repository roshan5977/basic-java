package com.jsp.streamapi;

import java.io.Serializable;

public class Student extends Employee{
      int id;
     String name;
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
     
}
class Employee implements Serializable{
	static int id;
	private static final long s=2L;
	transient int sal;
	String Name;
	public Employee(int sal, String name) {
		super();
		this.sal = sal;
		Name = name;
	}
	public Employee() {}
	
}
