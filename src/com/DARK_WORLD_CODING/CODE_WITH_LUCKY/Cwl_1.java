package com.DARK_WORLD_CODING.CODE_WITH_LUCKY;

import java.util.Scanner;

public class Cwl_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a num");
		int a=sc.nextInt();
		System.out.println("enter a num");
	 int b=sc.nextInt();
		
		//System.out.println(sum(a));
		//System.out.println(gcd(a,b));
		System.out.println(primerange(a,b));
	}
	//sum
	static int sum(int n)
	{
		int s=0;
		while (n>0) 
		{         
			int hold=n%10;
             s+=hold;
             n/=10;
		}
		return s;
	}
	//length
	static int length(int n)
	{
		int len=0;
		while (n>0) {
			len++;
			n/=10;	
		}
		return len;
	}
	//factorial
	static int factorial(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++) {
              fact*=i;
		}
		return fact;
	}
	//power
	static int power(int base,int exp)
	{ 
		int pow=1;
		for(int i=1;i<=exp;i++)
		{
		 pow*=base;
		}
		return pow;
	}
	//reverse
	static int reverse(int n)
	{
		int reverse=0;
		while (n>0) {
			int remainder=n%10;
			reverse=(reverse*10)+remainder;
			n/=10;
		}
		return reverse;
	}
	//multiple table
	static void multiple(int n)
	{
		for(int i=1;i<=10;i++)
		{
		System.out.println(n+" X "+i+" = "+i*n);
		}
	}
	//lcm
	static int lcm(int a,int b)
	{
		int c=a>b?a:b;
		while (true) {
			if (c%a==0&&c%b==0) 
				break;
                 c++;
		}
		return c;
	}
	//gcd
	static int gcd(int a, int b)
	{
		int gcd=1;
		for(int i=1;i<=a&&i<=b;i++)
		{
			if (a%i==0&&b%i==0)
				gcd=i;	
		}
		return gcd;
	}
	//even
	static String even(int a)
	{
		if (a%2==0) 
		{
			String even=a+"is even";
			return even;
		}
		else 
		{ 
			String odd=a+"is odd";
			return odd;
		} 
	}
	static String fibonacci(int n)
	{
		int a=0,b=1,c;
		String sum="";
		for(int i=1;i<=n;i++)
		{
		    sum+=a+"\n"; 
			c=a+b;
			a=b;
			b=c;	
		}
		return sum;
	}
	static String fibonacciupto(int n)
	{
		int a=0,b=1,c;String print="";
		while (a<n) {
			print+=a+"\n";
			c=a+b;
			a=b;
			b=c;
		}
		return print;
	}

	static String fibonaccirange(int k,int l)
	{
		int a=0,b=1,c;
		String print="";
		while (a<l) {
			if (a>k) {
				print+=a+"\n";
				}
				c=a+b;
				a=b;
				b=c;
			
		}
		return print;
	}
	static String primerange(int a,int b)
	{
		boolean quad=true;
		String flagg="";
		String k="";
		for(int i=a;i<=b;i++)
		{
			boolean flag =true;
			if (i<2) continue;
			for(int j=2;j<=i/2;j++)
			{
				if (i%j==0) {
					flag=false;
					break;
				}
			}
			if (flag) {
				quad=true;
				 flagg+=i+"\n";	
			}		
		}
		if (quad) {
			return flagg;
		}
		else
		{
			return k;
		}
	}
	
}
