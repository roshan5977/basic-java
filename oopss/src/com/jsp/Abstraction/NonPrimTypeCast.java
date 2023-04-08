package com.jsp.Abstraction;

class A{
   
	public void m1()
	{
		
	}
	public void m2() //specific method
	{
		System.out.println("specific method of class A");
	}
}

class B extends A {

	public void m1() //overridden method
	{
		System.out.println("overridden method of class B");
	}
	public void m3() //specific method
	{
		System.out.println("specific method of class B");
	}
}

public class NonPrimTypeCast {

	public static void main(String[] args) {
		//upcasting
		A a=new B();
		a.m1();
		a.m2();
		//a.m3(); specific method of class B
		//downcasting 
		//((B)a).m3();
		B b=(B)a;
		b.m3();

	}

}
