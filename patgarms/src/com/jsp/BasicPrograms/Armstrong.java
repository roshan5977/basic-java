package com.jsp.BasicPrograms;

import java.util.Iterator;
import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		for(int i=a;i<=b;i++)
		{
			int count,temp=i;
			for(count=0;i>0;i/=10)count++;
			i=temp;
			int sum=0;
			while (i>0) {
				int hold=i%10,prod=1;    
		     for(int j=1;j<=count;j++)prod*=hold;
		     sum+=prod;
				i/=10;
			}
			i=temp;
			if (sum==i) System.out.println(i);
		}
	}

}
