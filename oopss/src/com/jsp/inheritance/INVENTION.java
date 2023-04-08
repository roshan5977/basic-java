package com.jsp.inheritance;

class A10
{
	final int i=6;
	public A10()
	{
		//super();
		m1();//this.m1()
		System.out.println("super constructor called");
	}
	public void m1()
	{
		System.out.println("m1 method of parent class");
		
	}
	
}
class B10 extends A10
{
	 int j=6;
	 B10()
	 {
		//super();
		 System.out.println("constructor of child class");
		 m1();
	 }
	{
		
		System.out.println("non static block");
		j=2;
	}
	static 
	{
		System.out.println("static block");
	}
	public void m1()
	{
		System.out.println(i+" i : j "+j);
		super.m1();
		
	}
}
public class INVENTION {

	public static void main(String[] args) {
        B10 b = new B10();
        System.out.println( b instanceof A10);
        System.out.println(b instanceof B10);
        b.m1();
        
	}

}
