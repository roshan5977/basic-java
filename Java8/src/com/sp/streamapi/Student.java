package com.sp.streamapi;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Student implements Cloneable {

	private String name;
	private int id;
	private String course;

	public String getName() {
		return name;
	}
@Override
public Object clone() throws CloneNotSupportedException {
	// TODO Auto-generated method stub
	return super.clone();
}
	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public Student(String name, int id, String course) {
		super();
		this.name = name;
		this.id = id;
		this.course = course;
	}

	public static void main(String[] args) {
		List<Student> slist = new ArrayList<>();
		slist.add(new Student("arun", 23, "c++"));
		slist.add(new Student("rahim", 23, "java"));
		slist.add(new Student("pretika", 23, "python"));
		slist.add(new Student("aiswariya", 23, "java"));
		slist.add(new Student("rohit", 23, "python"));
		slist.add(new Student("pankaj", 23, "oracle"));
		slist.add(new Student("akanshya", 23, "sql"));
		slist.add(new Student("roshan", 23, "java"));

	Predicate<Student> p=new Predicate<>() {
		@Override
		public boolean test(Student t) {
			return t.getCourse().startsWith("j");
		}
		
	};

	//	List<Student> list2 = slist.stream().filter((s1) -> s1.getCourse().charAt(0) == 'j').collect(Collectors.toList());
		List<Student> list2 = slist.stream().filter(p).collect(Collectors.toList());

		for (Student s : list2)
			System.out.println(s);
	}


}
