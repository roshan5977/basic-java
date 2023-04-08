package com.feuji.feb15th;


class Feuji{
	int id;
	String project;
}
public class Student extends Feuji{
    int sal;
    String name;
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
    
}
