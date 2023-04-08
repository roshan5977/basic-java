package com.free.practice;


import java.util.Scanner;

class Factoria
{
   public int factorial(int num)
   {
	   int fact=1;
	   for(int i=1;i<=num;i++) fact*=i;
	   return fact;
   }
}
class Strong extends Factoria
{
	public int strong(int n)
	{
		int res=0;
		while(n>0)
		{
			int hold=n%10;
			res+=factorial(hold);
			 n/=10;
		}
		return res ;
	//	int res;
	//	for(res=0;n>0;n/=10) res+=factorial(n%10);
		
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
		System.out.println("enter a num");
	   int number=new Scanner(System.in).nextInt();
	   Strong sc = new Strong();
	   if (number==sc.strong(number)) System.out.println("strong num");
	   System.out.println(" not a strong num");

	}

}
