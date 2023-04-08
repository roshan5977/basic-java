package com.jsp.stringprogram;
import java.util.Scanner;
public class ChngStringIntSum {
	public static void main(String[] args) {
		System.out.println("enter a word");
	     int sum=0;boolean falg=true;
		String s=new Scanner(System.in).next();
		//char [] a=s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			String s2=s.substring(i, ++i);
			String s3=s2.toLowerCase();
			String s4=s2.toUpperCase();
			for(int  i1=0;i1<=9;i1++)
			{
				String i2=i1+"";
				if (s2.equals(i2)) {
					sum+=Integer.parseInt(s2);
					falg=false;
				}
			}
			if (falg) {
		 if (s2==s3) System.out.print(s2.toUpperCase()); 
		else if (s2==s4) System.out.print(s2.toLowerCase());
			}
			--i;
		}
		System.out.print(sum);
		
	}

}
