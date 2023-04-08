package com.jsp.java8featureinterface;
//why default and static introduced in java8 by oracle intake sunmicrosystem explain!!!!
//in java 8 introduced concrete methods in interface
interface Iter4
{
	 default void m1()
	{
		System.out.println("default method for every class ");
	}
	 void m2();
	 static void m3()
	 {
		 System.out.println("static method for every class");
	 }
	
}
class A3 implements Iter4
{
	@Override
	public void m2()
	{
		System.out.println("m2() defined ");
	}
}
public class InterfaceDefault_Static {

	public static void main(String[] args) {
 
	   Iter4 mref = new A3();
		mref.m2();
		Iter4.m3();
		mref.m1();
		
	}

}
