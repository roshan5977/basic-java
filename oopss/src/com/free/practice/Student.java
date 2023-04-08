package com.free.practice;

import java.util.Scanner;

public class Student {

	Scanner sc=new Scanner(System.in);
	
	String name="";
	int marks=0;
	
	public void get_details()
	{
		System.out.println("ENTER UR NAME");
		name= sc.nextLine();
		System.out.println("enter ur marks");
		marks=sc.nextInt();
	}
	public void show_details()
	{
		System.out.println("name of student is "+name);
		System.out.println("marks of student is "+marks);
	}
		

	}


