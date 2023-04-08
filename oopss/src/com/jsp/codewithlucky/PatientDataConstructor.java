package com.jsp.codewithlucky;
import java.util.Scanner;
class Patie
{
int slno;
String name;
String gender; //non static variable
int age;
String disease;
//parameterised constructor
public Patie(int slno,String name,String gender,int age,String disease)
{
	this.slno=slno;
	this.name=name;
	this.gender=gender;
	this.age=age;
	this.disease=disease;
}
public void display()
{
   System.out.println("Patient sl.no: "+slno);	
   System.out.println("Patient name: "+name);
   System.out.println("Gender: "+gender);
   System.out.println("Age: "+age);
   System.out.println("Disease: "+disease);
}
}
public class PatientDataConstructor {
         //driver method
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("***WELCOME TO DARKWORLD STELLAR CLINIC***");
		System.out.println();
		System.out.println("Enter Patient Name:");
		String name=sc.next();
		System.out.println("Gender:");
		String gender=sc.next();
		System.out.println("Age:");
		int age=sc.nextInt();
		System.out.println("Disease:");
		String disease=sc.next();
		Patie p1=new Patie(1,name,gender,age,disease);
		p1.display();
	}
}
