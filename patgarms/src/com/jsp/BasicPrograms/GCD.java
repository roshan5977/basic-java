package com.jsp.BasicPrograms;
import java.util.Scanner;
public class GCD {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=a<b?a:b;
		while (true) {
			if (a%c==0&&b%c==0) {
				break;
			}
			c--;
		}
		System.out.println(c);
	}

}
