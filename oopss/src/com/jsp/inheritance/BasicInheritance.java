package com.jsp.inheritance;
class A
{
	int i;
	public void m1()
	{
		System.out.println("m1() method defined");
	}
}
class B extends A
{
   int j;
   public void m2()
   {
	   System.out.println("m2() method defined");
   }
}
public class BasicInheritance {

	public static void main(String[] args) {
		B b1 = new B();
		b1.m1();
		b1.m2();
		System.out.println(b1.i+" : "+b1.j);
	}
}
