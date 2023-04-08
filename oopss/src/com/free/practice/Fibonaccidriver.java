package com.free.practice;

import java.util.Scanner;

class Fib1
{
	int a=0,b=1,c;
	public void fi(int n) {
		for(int i=1;i<=n;i++)
		{
		System.out.println(a);
		c=a+b;
		a=b;
		b=c;
		}
	}
}
public class Fibonaccidriver   {

	public static void main(String[] args) {

	        Scanner sc=new Scanner(System.in);
	        int a=sc.nextInt();
			Fib1 f1 = new Fib1();
			f1.fi(a);
		
	}

}
