package com.jsp.BasicPrograms;

import java.util.Scanner;

public class Stringnum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt(),fact ;
		int b=sc.nextInt();//153
		for(int i=a;i<=b;i++)
		{
			int sum=0,temp=i;
			while (i>0) {
				int hold=i%10;
				fact=1;
				for(int j=1;j<=hold;j++)fact*=j;
				sum+=fact;
				i/=10;
			}
			i=temp;
			if (sum==i) System.out.println(i);
		}
	}
}
