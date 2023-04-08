package com.jsp.association;

import java.util.Scanner;

class Gcd
{
public static void m1()
{  System.out.println("enetr a num");
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	int gcd=1;
	int t=a<b?a:b;
	while (true) {
		if (a%t==0&&b%t==0) 
			{
			gcd=t;
		   break;
	        }
		else t--;
	}
	System.out.println(gcd);
}
}
