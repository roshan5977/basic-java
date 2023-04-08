package com.jsp.BasicPrograms;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int rem=1,rev=0;
		while (a>0) {
			rem=a%10;
			rev=rev*10+rem;
			a/=10;
		}
		System.out.println(rev);
	}
}
