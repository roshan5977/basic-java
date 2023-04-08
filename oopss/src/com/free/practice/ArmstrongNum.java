package com.free.practice;

import java.util.Scanner;

public class ArmstrongNum {

	public static void main(String[] args) {
		System.out.println("ENTER THE FIRST NUM");
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		System.out.println("ENTER THE SECOND NUM");
		int num2=sc.nextInt();
		for(int i=num1;i<=num2;i++)
		{
			int len,temp=i;
			for(len=0;i>0;i/=10)len++;
			i=temp;int sum;
			for(sum=0;i>0;i/=10)
			{
				int hold=i%10,prod=1; 
		for(int j=1;j<=len;j++) prod*=hold;
				sum+=prod;
			}
			i=temp;
			if (sum==i) System.out.println(i);
		}
	}
}
