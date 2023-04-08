package com.sp.lambda;

import java.util.Collections;
import java.util.List;

public class Student implements Cloneable {
	private int stuid;
	private String name;
	private String course;
	public Student() {
		super();
	}
	public Object jhu() throws CloneNotSupportedException {
		return super.clone();
	}
	public int getStuid() {
		return stuid;
	}
	public void setStuid(int stuid) {
		this.stuid = stuid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public Student(int stuid, String name, String course) {
		super();
		this.stuid = stuid;
		this.name = name;
		this.course = course;
	}
	@Override
	public String toString()
	{
		return "["+getStuid()+","+getName()+","+getCourse()+"]";
	}
	
	
}
