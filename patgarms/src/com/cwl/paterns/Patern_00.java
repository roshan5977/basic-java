package com.cwl.paterns;

import java.util.Scanner;

interface P
{
	public void patern(int n);
}
class Patern01 implements P
{
	@Override
	public void patern(int n)
	{
		int y=1,t=1;
		for(int i=1;i<=n;i++)
		{
			if (i%2==0) {
				for(int j=1;j<=y;j++)
				{
					System.out.print("*");
				}
			}
			else {
				for(int j=1;j<=n;j++)
			{
				System.out.print(" ");
			}
			}
			y++;
			System.out.println();
		}
	}
}
class Patern02 implements P
{
	@Override
	public void patern(int n)
	{
	int m,t=1;
		for(int i=1;i<=n;i++)
		{
			m=(n-i)+1;
				for(int j=1;j<=i;j++)
				{
					System.out.print(m);
		     m++;
				}	
			System.out.println();
		}
	}
}
class Patern03 implements P
{
	@Override
	public void patern(int n)
	{
		for(int i=1;i<=n;i++)
		{
				for(int j=1;j<=n;j++)
				{
					if (i==(n/2)||j==(n/2)||(i==1&&j<=n/2)||(i==n&&j>=n/2)||(j==1&&i>=n/2)||(j==n&&i<=n/2)) {
						System.out.print("*");
					}
					else System.out.print(" ");
				}	
			System.out.println();
		}
	}
}
class Patern04 implements P
{
	@Override
	public void patern(int n)
	{
		int spaces=2,stars=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=spaces;j++) System.out.print(" ");
				for(int j=1;j<=stars;j++)
				{
					System.out.print("* ");
				}	
				if (i<=(n-1)/2)
				{
					spaces--;
					stars+=2;
				}
				else
				{
					spaces++;
					stars-=2;
				}
			System.out.println();
		}
	}
}
class Patern05 implements P
{
	@Override
	public void patern(int n)
	{
		int spaces=n-1,stars=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=spaces;j++) System.out.print(" ");
				for(int j=1;j<=stars;j++)
				{
					System.out.print(" ");
				}	
				
			System.out.println();
		}
	}
}
class Patern06 implements P
{
	@Override
	public void patern(int n)
	{
		int spaces=n-1,stars=1;
		int a=0,b=1,c;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=spaces;j++) System.out.print(" ");
				for(int j=1;j<=stars;j++)
				{ 
					for(int k=1;k<=i;k++) {
					System.out.print(a +" ");
					c=a+b;
					a=b;
					b=c;
					}
				}	
				
			System.out.println();
		}
	}
}


public class Patern_00 {

	public static void main(String[] args) {
	int n=new Scanner(System.in).nextInt();
		Patern06 p06 = new Patern06();
		p06.patern(n);
	}

}
