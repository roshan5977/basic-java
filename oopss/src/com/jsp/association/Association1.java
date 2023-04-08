package com.jsp.association;

class Abhijit
{
	void m1()
	{
		System.out.println("method m1() is defined");
	}
}
class Sukanya
{
	void m2()
	{
		Abhijit a1 = new Abhijit();
		a1.m1();
		System.out.println("method m2() is defined");
	}
}
public class Association1 {

	public static void main(String[] args) {
    System.out.println("main method is defined");
    Sukanya s1 = new Sukanya();
    s1.m2();
	}

}
