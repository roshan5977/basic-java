package com.jsp.BasicPrograms;
import java.util.Scanner;
public class NextPalindrome {
	public static void main(String[] args) {
   int s=new Scanner(System.in).nextInt(),rev=0,temp=0;
   while(true)
   {
	   ++s;
	   temp=s;
   while (s>0) {
	   int hold=s%10;
	   rev+=rev*10+hold;
	   s/=10;
         }
   s=temp;
   if (rev==s) {
	   System.out.println("jdj");
   }
	}
	}
	}
