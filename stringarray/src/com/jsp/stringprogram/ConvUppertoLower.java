package com.jsp.stringprogram;
import java.util.Scanner;
public class ConvUppertoLower {
	public static void main(String[] args) {
		/*
		System.out.println("ENTER A WORD");
		String s = new Scanner(System.in).next();
		String res = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
				res += (char) (s.charAt(i) + 32);
		}
		System.out.println(res);
		*/
		System.out.println("ENTER A WORD");
		String s=new Scanner(System.in).next();
		String res="";
		//String.intern();
		for(int i=0;i<s.length();i++)
		{
			if (s.charAt(i)>='A'&&s.charAt(i)<='Z') res+=(char)(s.charAt(i)+32);
		}
		System.out.println(res);
	}

}
