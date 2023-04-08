package com.DARK_WORLD_CODING.CODE_WITH_LUCKY;

import java.util.Iterator;
import java.util.Scanner;

public class Cwl_2 {

	public static void main(String[] args) {
	  System.out.println("ENTER A NUM");
	  Scanner sc = new Scanner(System.in);
	   int n=sc.nextInt();
	   patern1(n);
	}
	public static void patern1(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void patern2(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void patern3(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=(n-i);j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void patern4(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
	public static void patern5(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if (j==i||i+j==n) {
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");	
				}
				
			}
			for(int j=1;j<=n;j++)
			{
				System.out.print(" ");
			}
			
			System.out.println();
		}
	}
}
