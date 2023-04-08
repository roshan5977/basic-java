package com.jsp.exception;

public class Demo {

	public static void main(String[] args) {
          System.out.println("main starts");
          m1();
          System.out.println("main ends");
	}
	public static void m1()
	{
		System.out.println("m1() starts");
		try {
		m2();
		}catch(Exception e) {
			System.out.println("handled");
		}
		System.out.println("m2() ends");
	}
	public static void m2()
	{
		System.out.println("m2 strts");
		int k=10/0;
		System.out.println("m2() ends");
	}

}
