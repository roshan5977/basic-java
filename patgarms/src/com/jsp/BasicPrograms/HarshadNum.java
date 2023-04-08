package com.jsp.BasicPrograms;

import java.util.Scanner;

public class HarshadNum {
	public static void main(String[] args) {
		System.out.println("ENTER A NUM");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		for(int n=a;n<=b;n++) {
			int sum=0;
		for(int temp=n;temp>0;temp/=10)sum+=(temp%10);
		if(n%sum==0)System.out.println(n);
		}
	}

}
