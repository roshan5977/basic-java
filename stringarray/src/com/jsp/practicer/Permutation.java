package com.jsp.practicer;

public class Permutation {
   public static void main(String[] args) {
	   //System.out.println(swap("abc",0,1));
permutation("abc",0,2);
}
   public static String swap(String s,int i,int j) {
	   char []a=s.toCharArray();
	   char t=a[i];
	   a[i]=a[j];
	   a[j]=t;
	   return new String(a);	
}
   public static void permutation(String s,int start,int end) {
	if (start==end) {
		System.out.println(s);
		return;
	}
	   for(int i=start;i<=end;i++)
	{
		String f=swap(s,start,i);
		  permutation(f,start+1,end);
	}
	
}
}
