package com.jsp.stringprogram;

import java.util.Scanner;
//aaabccddd   abd
public class SuperReducedString {
	public static void main(String[] args) {
		String s = new Scanner(System.in).next();
	   char a[]=s.toCharArray();
		for(int i=0;i<s.length()-1;i++)
		{
			if(a[i]==a[i+1]) {
			s=s.replace(s.charAt(i)+s.charAt(i+1)+"","");
			System.out.println(s);
			}
		}
		System.out.println(s);
    	}
}
