package com.jsp.Wastage;


class B1
{
	private static B1 b=new B1();
	private B1()
	{
		
	}
	public static B1 getInstance()
	{
		return b;
	}
	
	
}

public class Testtttttttt {

	public static void main(String[] args) {

		B1 c=B1.getInstance();
		System.out.println(c instanceof B1);
		B1 c1=B1.getInstance();
		System.out.println(c1 instanceof B1);
	}

}
