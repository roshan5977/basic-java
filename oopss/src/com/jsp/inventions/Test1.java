package com.jsp.inventions;
//create parametrised constructor this() not give cgance to supr(obj
class Test
{
	int i;
	Test(int k)
	{//super!!!
		System.out.println("22 "+i);
	}
	Test()
	{
		this(2);
		System.out.println("21");
	}
	public void m1()
	{
		System.out.println("33");
	}
	{
		System.out.println("hii");
		i=3;
	}
}
class Testing extends Test
{  
	int j;
	
	Testing(int i)
	{
		this();
	 System.out.println("24");
	}
	Testing()
	{
		
		System.out.println(super.i+" 99");
	}
	public void m1()
	{
		super.m1();
		System.out.println("31");
	}
}
public class Test1 {

	public static void main(String[] args) {
    new Testing(2);
	

	}

}
