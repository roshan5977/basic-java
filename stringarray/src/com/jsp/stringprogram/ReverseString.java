package com.jsp.stringprogram;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		System.out.println("Enter a word");
		String s=new Scanner(System.in).next();
		s=s.toLowerCase();
		String res="";
     for(int i=s.length()-1;i>=0;i--)
     {
    	 res+=s.charAt(i);
     }
     System.out.println(res);
	}

}
