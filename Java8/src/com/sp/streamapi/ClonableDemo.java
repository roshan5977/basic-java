package com.sp.streamapi;

public class ClonableDemo {

	public static void main(String[] args) throws CloneNotSupportedException  {
		Student s=new Student("gh",767,"fdg");
	Student s1=	(Student)s.clone();
	System.out.println(s1);
	System.out.println(s==s1);
	}

}
