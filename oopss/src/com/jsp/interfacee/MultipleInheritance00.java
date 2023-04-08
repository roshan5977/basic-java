package com.jsp.interfacee;

interface m
{
	void m1();
	void m2();
}
interface n
{
	void m1();
	void m3();
}
class A implements m,n
{
	@Override
	public void m1() {
		System.out.println("m1() defined");
	}
	@Override
	public void m2() {
		System.out.println("m2() defined");
	}
	@Override
	public void m3() {
		System.out.println("m3() defined");
	}
	
}

public class MultipleInheritance00 {

	public static void main(String[] args) {

		               m mref = new A();
		               mref.m1();
		               mref.m2();
		               System.out.println("+++++++++++++++++++++++++++++");
		               n nref=new A();
		               nref.m1();
		               nref.m3();
		               
		               
		               
	}

}
