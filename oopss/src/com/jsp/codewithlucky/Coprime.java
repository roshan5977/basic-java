package com.jsp.codewithlucky;

import java.util.Scanner;

class Gcd{

	public int gcd(int a, int b)
{
		int g=a<b?a:b;
		int gcd=1;
		while (true) {
			if (a%g==0&&b%g==0) {
				gcd=g;
				break;
			}
			else
			{
				g--;
			}
		}
		return gcd;
}
}

public class Coprime extends Gcd
{

	public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  int a=sc.nextInt();
	  int b=sc.nextInt();
	  Coprime g1 = new Coprime();
	  if (g1.gcd(a,b)==1) {
		  System.out.println("Two num "+a+"and "+b+" are coprime num.");
	}
	  else
	  {
		  System.out.println("Two num "+a+"and "+b+" are not coprime num.");
	  }

	}

}
