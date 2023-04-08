package com.jsp.stringprogram;

import java.util.Scanner;

public class Permutation_next {
	public static void main(String[] args) {
		String s=new Scanner(System.in).next();
		int fact=1;
		for(int i=1;i<s.length();i++)fact*=i;
		String []a=new String[fact];
		int k=-1;
        permutation(s,0,s.length()-1,s,a,k);
	}
	public static void permutation(String p,int start,int end,String t,String[] a,int k)
	{
		if(start==end)
      {
    	// if(p.compareTo(t)>0)
    	 // System.out.println(p);
    	  a[++k]=p;
    	 // System.out.println();
    	  return;
      }
      for(int i=start;i<=end;i++)
      {
    	 String s=swap(p,start,i);
    	  permutation(s,start+1,end,t,a,k);
      }
	}
	public static String swap(String s,int i,int j)
	{
		char []a=s.toCharArray();
		char temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		return new String(a);
	}

}
