package com.jsp.association;

import java.util.Scanner;

class Factorial
{   
	public int Factor(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact*=i;
		}
		return fact;
	}
}
public class Strongnum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a  num");
		int n=sc.nextInt();
		Factorial f1=new Factorial();
		int temp=n;
		int strong=0;
		while (n>0) {
			int hold=n%10;
			strong+=f1.Factor(hold);
			n/=10;
		}
		if (strong==temp) System.out.println("strong num");
		else
		{
			System.out.println("not a strong num");
		}
	}
}
