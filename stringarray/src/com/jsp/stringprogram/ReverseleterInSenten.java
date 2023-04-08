package com.jsp.stringprogram;

import java.util.Scanner;

public class ReverseleterInSenten {
//without built in
//	public static void main(String[] args) {
//		String s=new Scanner(System.in).nextLine();
// //   String s="Roshan is a good boy",
//		String s1="";
//    char  [] a=s.toCharArray();
//    int i=a.length-1,j=a.length-1,c=0;
//    while (i>=0) {
//    while (i>=0&&a[i]!=' ') {
//		i--;
//	}
//    int k=i+1;
//    while (k<=j) {
//		s1+=a [k];
//		k++;
//	}
//   if (i>0) s1+=" ";
//    i--;
//    j=i;
//}
//    System.out.println(s1);
//	}
	
	public static void main(String[] args) {
		String s="i am a good boy",s2="";
		char[] t=s.toCharArray();
		for(int i=0,j=0;i<s.length();i++,j=i)
		{
			while(i<s.length()&&t[i]!=' ')i++;
			for(int k=i-1;k>=j;k--)s2+=t[k];
			if(i<s.length())s2+=" ";	
		}
		System.out.println(s2);
	} 
//	public static String reverseWord(String s)
//	{
//		String s2="";
//		for(int i=s.length()-1;i>=0;i--) s2+=s.charAt(i);
//		return s2;
//	}
//public static void main(String[] args) {
//		String s=new Scanner(System.in).nextLine();
//		String s1="";
//		String[] ar=s.split(" ");
//		for(String s3:ar)
//		{
//			s1+=reverseWord(s3);
//			s1+=" ";
//		}
//		System.out.println(s1);
//
//	}

}
