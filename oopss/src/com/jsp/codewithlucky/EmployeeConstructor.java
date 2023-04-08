package com.jsp.codewithlucky;
import java.util.Scanner;
class Employ
{
int empid;
String name;
int age;
String designation;
Long salary;

public Employ(int empid,String name,int age,String designation,Long salary)
{
	System.out.println("***WELCOME TO DARKWORLD STELLAR INFOTECH***");
this.empid=empid;
this.name=name;
this.age=age;
this.designation=designation;
this.salary=salary;
}
public void display()
{
System.out.println("Emp id:"+empid);
System.out.println("Name:"+name);
System.out.println("Age:"+age);
System.out.println("Designation:"+designation);
System.out.println("Salary:"+salary);
}
}
public class EmployeeConstructor {
	//driver method
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER UR EMPLOYEE ID:");
		int empid=sc.nextInt();
		System.out.println("ENTER UR NAME");
		String name=sc.next();
		System.out.println("ENTER UR AGE");
		int age=sc.nextInt();
		System.out.println("ENETER UR DESIGNATION");
		String designation=sc.next();
		System.out.println("ENTER UR SALARY");
		long salary=sc.nextLong();
		System.out.println();
		System.out.println("******************************");
		Employ e1=new Employ(empid,name,age,designation,salary);
		e1.display();
	}

}
