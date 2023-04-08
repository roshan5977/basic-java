package com.jsp.interfacee;

interface M1
{
	void m1();
	void m2();
}
interface N1 extends M1
{
	void m1();
	void m3();
}
class A1 implements N1
{
	public void m1()
	{
		System.out.println("m1() declared");
	}
	public void m2()
	{
		System.out.println("m2() declared");
	}
	public void m3()
	{
		System.out.println("m3() declared");
	}

	
}
public class MultipleInheritance01 {

	public static void main(String[] args) {

		N1 nref = new A1();
		nref.m1();
		nref.m2();
		nref.m3();
	}

}
