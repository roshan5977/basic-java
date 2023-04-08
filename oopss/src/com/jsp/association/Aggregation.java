package com.jsp.association;
class A
{
	void m1()
	{
		System.out.println("m1() method defined");
	}
}
class B
{
	void m2(A a)
	{
		a.m1();
		System.out.println("m2() method defined");
	}
}
public class Aggregation {

	public static void main(String[] args) {
         B b = new B();
         //b.m2(new A());
         A a = new A();
         b.m2(a);
	}
}
