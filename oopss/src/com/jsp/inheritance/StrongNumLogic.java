package com.jsp.inheritance;
import java.util.Scanner;
class Factorial{
	
	public int factorial(int num)
	{
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact*=num;
		}
		return fact;
	}
}
class StrongNum extends Factorial
{
	public int strong(int num)
	{
		int strong=0;
		while (num>0) {
			int LastDigit=num%10;
			strong+=factorial(LastDigit);
			num/=10;
		}
		return strong;
	}
}
public class StrongNumLogic {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		StrongNum s1 = new StrongNum();
		int k=s1.strong(num);
		if (num==k) {
			System.out.println("strong num");
		}
		else System.out.println("not a strong num");
	}
}
