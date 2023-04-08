package com.jsp.stringprogram;

import java.util.Scanner;

public class CountNumOfVowels {

	public static void main(String[] args) {
       String s=new Scanner(System.in).next();
       s=s.toLowerCase();
       s.trim();
       int count=0;
       for(int i=0;i<s.length();i++)
       {
    	   switch (s.charAt(i)) {
		case 'a':
        case 'e':
         case 'i':
         case 'o':
         case 'u':count++;
		}
       }
       System.out.println("vowels are: "+count);
       
	}
}
