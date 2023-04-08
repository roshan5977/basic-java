package com.jsp.inheritance;

class A1{
	public void m1()
	{
		System.out.println("m1() method defined");
	}
}
class B1 extends A1
{
     public void m2()
     {
    	 this.m1();
    	 System.out.println("m2() method defined");
     }
}

public class Test {

	public static void main(String[] args) {
        B1 b1 = new B1();
        b1.m2();

	}

}
