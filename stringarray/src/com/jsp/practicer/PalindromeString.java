package com.jsp.practicer;
import java.util.Scanner;
public class PalindromeString {
	public static void main(String[] args) {
		System.out.println("enetr the word");
 String t=new Scanner(System.in).next();
boolean isPalindrome=true;
 for(int i=0;i<=(t.length())/2;i++)
  {
	  if (t.charAt(i)!=t.charAt((t.length()-1)-i)) 
		  {
		  isPalindrome=false;
		  break;
		  }
	  }
 if (isPalindrome) System.out.println(t+" is palindrome");
 else System.out.println(t+" is not palindrome");
		}
}
