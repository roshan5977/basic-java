package com.jsp.inheritance;

import java.util.Scanner;

class Factoria {
	public int factorial(int num) {
		int fact = 1;
		for (int i = 1; i <= num; i++)
			fact *= i;
		return fact;
	}
}

class Strong extends Factoria {
	@ Override
	public int factorial(int num) {
		if (num == 0 && num == 1)
			return 1;
		else
			return num * factorial(num - 1);
	}

	public int strong(int n) {
//		int res=0;
//		while(n>0)
//		{
//			int hold=n%10;
//			res+=factorial(hold);
//			 n/=10;
//		}
		int res;
		for (res = 0; n > 0; n /= 10)
			res += factorial(n % 10);
		return res;
	}
}

public class DeveloperEngineStrongNumOverriding {

	public static void main(String[] args) {
		System.out.println("enter a num");
		int number = new Scanner(System.in).nextInt();
		Strong sc = new Strong();
		if (number == sc.strong(number))
			System.out.println("strong num");
		else
			System.out.println(" not a strong num");

	}

}
