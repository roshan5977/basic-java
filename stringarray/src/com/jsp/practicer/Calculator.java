package com.jsp.practicer;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		String s = new Scanner(System.in).next(),s3="";
				int sum=0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '+' || s.charAt(i) == '-' || s.charAt(i) == '*' || s.charAt(i) == '/')
			{
				s3=""+s.charAt(i);
				switch (s3) {
				case "+":
					String []s2=s.split("+");
					sum=Integer.parseInt(s2[0])+Integer.parseInt(s2[1]);
					System.out.println(sum);
					break;
				case "-":
					String []s6=s.split("-");
					sum=Integer.parseInt(s6[0])-Integer.parseInt(s6[1]);
					System.out.println(sum);
					break;
				case "*":
					String []s7=s.split("*");
					sum=Integer.parseInt(s7[0])*Integer.parseInt(s7[1]);
					System.out.println(sum);
					break;
				case "/":
					String []s8=s.split("/");
					sum=Integer.parseInt(s8[0])/Integer.parseInt(s8[1]);
					System.out.println(sum);
					break;

				default:
					break;
				}
			}
		}

	}

}
