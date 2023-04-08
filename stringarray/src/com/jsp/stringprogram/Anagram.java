package com.jsp.stringprogram;

import java.util.Scanner;

public class Anagram {

//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("ENTER THE FIRST WORD");
//		String s1 = sc.next(), s3 = "";
//		System.out.println("ENTER THE SECOND WORD");
//		String s2 = sc.next();
//		for (int i = 0; i < s1.length(); i++)
//			s2 = s2.replace(s1.charAt(i) + "", "");
//		System.out.println(s2.length() == 0 ? "Anagram" : "not Anagram");
//		sc.close();
//	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE FIRST WORD");
		String s1 = sc.next();
		System.out.println("ENTER THE SECOND WORD");
		String s2 = sc.next();
		System.out.println(anagram(s1,s2) ? "Anagram" : "not Anagram");
		sc.close();
	}
	public static boolean anagram(String s1,String s2) {
		while(true)
		{
			if(s1.length()!=s2.length())return false;
			if(s1.length()==0&&s2.length()==0)return true;
			char c=s1.charAt(0);
			s1=s1.replace(c+"", "");
			s2=s2.replace(c+"", "");
		}
	}

}
