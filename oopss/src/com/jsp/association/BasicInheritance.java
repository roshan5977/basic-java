package com.jsp.association;

class A2
{
	int i;
public void m1()

{
   System.out.println("m1() method defined");	
}

}
class B2 extends A2
{
	int j;
	public void m2()
	{
   System.out.println("m2() method defined");
	}

}
public class BasicInheritance {

	public static void main(String[] args) {
		B2 b1 = new B2();
		b1.m1();
		b1.m2();
		
		System.out.println(b1.i+" : "+b1.j);
	}

}
