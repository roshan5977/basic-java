package com.jsp.constructorpack;
//this() //call to this 
//this() is used to pass the value from one constructor to another constructor
//this() is not used in static or non static method ;
//this() is only used in first line inside constructor;
class Rani
{
	int i,j;
	Rani(int a,int b)
	{
		this(a+b);
		System.out.println("2-argumented constructed");
	}
	Rani(int i)
	{
		this();
		System.out.println("1-argumented constuctor");
	}
	Rani()
	{
		System.out.println("no argument construtor called using call to this this()");
	}
}
public class Tester {

	public static void main(String[] args) {
		Rani r1=new Rani(20,30);
		System.out.println("Thank you");
	}

}
