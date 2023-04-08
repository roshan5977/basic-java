package com.jsp.practicer;

import java.util.Scanner;

public class Armstrongnum {

	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int b=sc.nextInt(),sum;
      for(int i=a;i<=b;i++)
      {
    	  int temp=i,count=0;
    	  for(;i>0;i/=10)count++;
    	  System.out.println(count);
    	  i=temp;
    	  sum=0;
    	  for(;i>0;i/=10)
    	  {
    		  int hold=i%10;
    		  sum+=(int)Math.pow(hold,count);
    	  }
    	  i=temp;
    	  if (i==sum) System.out.println(i);
      }
      
	}

}
