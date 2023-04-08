package com.jsp.BasicPrograms;

import java.util.Scanner;

public class Prime {
  
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		Prime1 prim = new Prime1(a,b);
		prim.primerange();
		//prim.evenprime();
	}
}
class Prime1
{
	int a,b;
	public Prime1(int a, int b) {
		this.a=a;
		this.b=b;
	}
	public void primerange()
	{
		int count=0;
		for(int i=a;i<=b;i++)
		{
			if (i<2) continue ;
			boolean flag=true;
			for(int j=2;j<=i/2;j++)
			{
				if (i%j==0) {
				flag=false;
				break;
				}
			}
			if (flag) {
				++count;
				System.out.println(count+" : "+i);
			}
		}
	}
	public void primereverse()
	{
		for(int i=b;i>=a;i--)
		{
			if (i<2) continue ;
			int countt=0;
			boolean flag=true;
			for(int j=2;j<=i/2;j++)
			{
				if (i%j==0) {
				flag=false;
				break;
				}
			}
			if (flag) {
				countt++;
				System.out.println(countt+" : "+i);
			}
		}
	}
	public void evenprime()
	{
		int counttt=0;
		for(int i=a;i<=b;i++)
		{
			if (i<2) continue ;
			boolean flag=true;
			for(int j=2;j<=i/2;j++)
			{
				if (i%j==0) {
				flag=false;
				break;
				}
			}
			if (flag) {
				counttt++;
				if (counttt%2==0) {
					System.out.println(counttt+" : "+i);
				}
			}
		}
	}

	
}


