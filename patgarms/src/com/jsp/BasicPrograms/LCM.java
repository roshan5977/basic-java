package com.jsp.BasicPrograms;
import java.util.Scanner;
public class LCM {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("first num");
		int a =sc.nextInt();
		System.out.println("second num");
		int b=sc.nextInt();
		m1(a,b);
		/*int c=a>b?a:b;
		while (true) {
			if (c%a==0&&c%b==0)break;
			c++;
		}
		System.out.println("lcm is "+c);
		*/
	}
	public static void m1(int a,int b)
	{
		int g=a>b?a:b,s=a<b?a:b,i=1;
		for( i=1;i<=g;i++)if (g*i%s==0) break;
		System.out.println(g*i);
		
	}
}
