package com.jsp.Abstraction;

abstract class A1
{
	int i;
	static int j;
	public void m1()//concrete or specific method
	{
		System.out.println("welcome to ODISHA");
	}
	abstract public void m2();//abstract method
	public static void m3()
	{
		System.out.println("welcoming all");
	}
	
	
}
class B1 extends A1
{
	@Override
	public void m2() {  //method overriding
		System.out.println("WELCOME ROSHAN");
	}
	public static void m3()//method hiding
	{
		System.out.println("WELCOME SUBHAM");
	}
	
}
public class Test1 {
	public static void main(String[] args) {
		A1 a=new B1();//upcasting
		a.m2();
		a.m1();
		a.m3();
	}
}
