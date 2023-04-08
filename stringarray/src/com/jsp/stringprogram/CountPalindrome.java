package com.jsp.stringprogram;
import java.util.Scanner;
public class CountPalindrome {
	public static void main(String[] args) {
		System.out.println("ENTER A WORD");
    String s=new Scanner(System.in).next();
		for(int i=0;i<s.length()-1;i++) {
			for(int j=i+2;j<=s.length();j++) {
		String str=s.substring(i, j);
          if (ispalindrome(str))System.out.println(str);
			}
		}
	}
	public static boolean ispalindrome(String s) {
		s=s.toLowerCase();
		for(char i=0	;i<((s.length())/2);i++) if (s.charAt(i)!=s.charAt(s.length()-i-1)) return false;
		return true;
	}
}

