package com.jsp.stringprogram;
import java.util.Scanner;
public class ReverseWordInSenten {
	//WITHOUT USING STRING BUILT-IN
	public static void main(String[] args) {
    String s=new Scanner(System.in).nextLine();
    String n="hlo world hyy java";
    String n1="";
    int i=0,j=0,k;
    char[] arr =n.toCharArray();
    while (i<arr.length) {
		while (i<arr.length&&arr[i]!=' ') i++;
		k=i-1;
		while (k>=j) {
			n1+=arr[k];
			k--;
		}
	if (i<arr.length) n1+=" ";
		i++;
		j=i;
	}
    System.out.println(n1);
}
//	//WITHOUT USING STRING BUILT-IN
//public static void main(String[] args) {
//	String s="ROSHAN IS A GOOD BOY",s2="";
//	char [] a=s.toCharArray();
//	      for(int i=s.length()-1,j=s.length()-1;i>=0;i--,j=i)
//	      {
//	    	  while(i>=0&&a[i]!=' ')i--;
//	    	  for(int t=i+1;t<=j;t++)s2+=a[t];
//	    	  if(i>=0)s2+=" ";
//	      }
//	   System.out.println(s2);
//}
	public static void main(String[] args) {
    String s=new Scanner(System.in).nextLine();
    String n="";
    String [] s1=s.split(" ");
    for(int i=s1.length-1;i>=0;i--)
    {
       n+=s1 [i];
       n+=" ";
    }
    n=n.trim();
    System.out.println(n);
	}
}
