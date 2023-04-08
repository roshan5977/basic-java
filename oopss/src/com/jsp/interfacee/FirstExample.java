package com.jsp.interfacee;

interface Iter
{
	void m1();
	void m2();
}


class It implements Iter
{
	@Override
	public void m1() {
		System.out.println("m1 defined");
	}
	@Override
	 public void m2()
	{
		System.out.println("m2 defined");
	}
	void  m3()
	{
		System.out.println("specific method");
	}
	
}


public class FirstExample {

	public static void main(String[] args) {
         Iter i = new It();
         i.m1();
         i.m2();

	}

}
