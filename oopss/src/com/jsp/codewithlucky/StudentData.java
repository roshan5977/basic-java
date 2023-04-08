package com.jsp.codewithlucky;
import java.util.*;
//usage of this keyword
class Student
{
	int id;      //non static variable
	String name;  //non static data member
	String gender;  //non static data member
	
	public void insertStudent(int id,String name,String gender)  //non static member function
	{
		//usage of this keyword
		this.id=id;
		this.name=name;
		this.gender=gender;
	}
	public void display()          //non static member function
	{
		System.out.println("id :"+id);
		System.out.println("name:"+name);
		System.out.println("gender:"+gender);	
	}
}
public class StudentData {
           //driver method
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("welcome to dark world coding");
		Student s1 = new Student();    //object creation
		Student s2 = new Student();     //instantiation
		Student s3 = new Student();
		System.out.println("ENTER THE ID OF 1ST student");
		int id1 =sc.nextInt();
		System.out.println("ENTER THE NAME OF 1ST STUDENT");
		String name1=sc.next();
		System.out.println("ENETER THE GENDER OF THE 1ST STUDENT");
		String gender1=sc.next();
		s1.insertStudent(id1, name1, gender1);
		s1.display();
		System.out.println();
		System.out.println("ENTER THE ID OF 2nd student");
		int id2 =sc.nextInt();
		System.out.println("ENTER THE NAME OF 2nd STUDENT");
		String name2=sc.next();
		System.out.println("ENETER THE GENDER OF 2nd STUDENT");
		String gender2=sc.next();
		s2.insertStudent(id2, name2, gender2);
		s2.display();
		System.out.println();
		System.out.println("ENTER THE ID OF 3rd student");
		int id3 =sc.nextInt();
		System.out.println("ENTER THE NAME OF 3rd STUDENT");
		String name3=sc.next();
		System.out.println("ENETER THE GENDER OF 3rd STUDENT");
		String gender3=sc.next();
		s3.insertStudent(id3, name3, gender3);
		s3.display();
		System.out.println();
		System.out.println("this is all details of three students");
		s1.display();
		s2.display();
		s3.display();
		
	}

}
