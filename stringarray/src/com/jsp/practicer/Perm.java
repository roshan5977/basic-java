package com.jsp.practicer;

public class Perm {

	public static void main(String[] args) {
              permutation("abc",0,2);
	}
	public static void permutation(String s,int start,int end) {
		if(start==end)
		{
			System.out.println(s);
			return;
		}
		String s1="";
		for(int i=start;i<=end;i++)
		{
			s1=swap(s,start,i);
			permutation(s1,start+1,end);
		}
	}
	public static String swap(String s,int i,int j) {
		char [] c=s.toCharArray();
		char t=c[i];
		c[i]=c[j];
		c[j]=t;
		return new String (c);
	}

}
