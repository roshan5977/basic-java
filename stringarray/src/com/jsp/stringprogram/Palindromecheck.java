package com.jsp.stringprogram;
import java.util.Scanner;
public class Palindromecheck {
public static String ispalindrome(String s) {
	s=s.toLowerCase();
	for(char i=1;i<(s.length())/2;i++)if (s.charAt(i)!=s.charAt((s.length()-1)-i)) return "is not a palindrome";
	return "is palindrome";
}
public static boolean isPalindrome(String s) {
	         s=s.toLowerCase();
	        char[] a=s.toCharArray();//malayalam
	       for(int i=0,j=a.length-1;i<j; i++,j--) if (a[i]!=a[j]) return false;
	       return true;
}
public static void main(String[] args) {
	 System.out.println("ENTER THE NAME");
     String s=new Scanner(System.in).next();
	//	System.out.println(isPalindrome(s));
		System.out.println(ispalindrome(s));
	}
}




