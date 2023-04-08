package com.jsp.stringprogram;
//convert upper to lower
import java.util.Scanner;
public class ConvlowertoUpper {
	public static void main(String[] args) {
		/*
		System.out.println("ENTER A WORD");
		String s=new Scanner(System.in).next();
		String res="";
	    for(int i=0;i<s.length();i++)
	    {
	    	if (s.charAt(i)>='a'&&s.charAt(i)<='z')res+=(char)(s.charAt(i)-32);
	    }
	    System.out.println(res);
	    */
		System.out.println("enter a num");
		String s=new Scanner(System.in).next();
		String res="";
		for(int i=0;i<s.length();i++)
		{
			if (s.charAt(i)>='a'&&s.charAt(i)<='z') res+=(char)(s.charAt(i)-32);
		}
		System.out.println(res);
	}
}
