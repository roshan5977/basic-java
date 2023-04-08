package com.jsp.stringprogram;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//           i/p=aaabbcbbaaaaaaa  
//          0l.;o/p=3a2b1c2b7a
public class SpecialdemoProgram {

	public static void main(String[] args) {
     System.out.println("ENTER  STRING");
	String s=new Scanner(System.in).next();
   //  pattern(s);
     normal(s);
	}
	public static void pattern(String s) {
		Pattern p=Pattern.compile("([a-z])//*");
		Matcher m=p.matcher(s);
			String s1="";
		while(m.find())
		{
		String f=m.group();
		s1=s1+f.length()+f.charAt(0);
		}	
	}
	public static void normal(String s) {
		//aabbbcc
		char a[]=s.toCharArray();
		int i=0;String s1="";
		while(i<a.length) {
		char c=a[i];
		i++;
		int count=1;
		while(i<a.length&&c==a[i])
		{
			count++;
			i++;
		}
		s1=s1+count+c;
		}
		System.out.println(s1);
	}
}
