package com.jsp.codewithlucky;

import java.util.Scanner;

class Prime
{ 
	public void prime(int i)
	{
	boolean flag=true;
	for(int j=2;j<=i/2;j++)
	{
		if (i%j==0) {
			flag=false;
		}
			break;
		}
	if (flag) {
		System.out.println(i);
	}
	}
}
class Fib{
	public void fib(int i)
	{
	int m=0,n=1,o;
    System.out.println(m);
	o=m+n;
	m=n;
	n=o;
	}
}

public class PrimeCumFib {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	int m=0,n=1,o;
	for(int i=a;i<=b;i++)
	{
	    System.out.println(m);
		o=m+n;
		m=n;
		n=o;

		boolean flag=true;
		for(int j=2;j<=i/2;j++)
		{
			if (i%j==0) {
				flag=false;
			}
				break;
			}
		if (flag&i>1) {
			System.out.println(i);
		}
	}
	}
}
