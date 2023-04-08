package com.jsp.stringprogram;

import java.util.Scanner;

public class CountnumOfletter {
//	public static void main(String[] args) {
//		String s="anamika";int count =0;
//		while(s.length()>0)
//		{ 
//			char t=s.charAt(0);
//			String s1=s.replace(t+"", "");
//			count =s.length()-s1.length();
//			System.out.println(s.charAt(0)+" : "+count);
//			s=s1;
//		}
//	}
//
	public static void main(String[] args) {
     String s=new Scanner(System.in).next();//malayalam;
     s=s.toLowerCase();
     int count=0;
     for(int i=0;i<s.length();i++)
     {
    	 count=0;
    	 for(int j=0;j<s.length();j++)
    	 {
    		 if (s.charAt(i)==s.charAt(j)) 
    		 {
    			 count++;
    		 }
    	 }
    	  if(s.charAt(i)>='a'&&s.charAt(i)<='z') System.out.println(s.charAt(i)+" counted as :"+count); 
    	 if (count>=2) {
			 String s2=""+s.charAt(i);
			s=s.replace(s2, " ");
			
		}
     }
	}
}
