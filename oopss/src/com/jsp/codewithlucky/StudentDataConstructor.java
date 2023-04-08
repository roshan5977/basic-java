package com.jsp.codewithlucky;
import java.util.Scanner;

class Stud
{
int id;
String name;
String gender;
int age;

public Stud(int id,String name,String gender,int age)
{
	this.id=id;
	this.name=name;
	this.gender=gender;
	this.age=age;
}
public void display()
{
	System.out.println("id : "+id);
	System.out.println("name : "+name);
	System.out.println("gender : "+gender);
	System.out.println("age : "+age);
}
}
public class StudentDataConstructor {
	
	public static void main(String[] args) {
		System.out.println("Enter student id,name,gender and age just keep space in betwn");
		Scanner sc=new Scanner(System.in);
	    Stud s1=new Stud(sc.nextInt(),sc.next(),sc.next(),sc.nextInt());
	    s1.display();
	}
}
