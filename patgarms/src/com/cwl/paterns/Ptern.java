package com.cwl.paterns;

import java.util.Scanner;

public class Ptern {

	public static void main(String[] args) {
      int n=new Scanner(System.in).nextInt();
      int star1=(n/2),star2=(n/2),spaces=0;
      for(int i=0;i<=n;i++)
      {
    	  for(int j=1;j<=star1;j++)
    	  {
    		  System.out.print("*");
    	  }
    	  for(int j=1;j<=spaces;j++)
    	  {
    		  System.out.print(" ");
    	  }
    	  for(int j=1;j<=star2;j++)
    	  {
    		  System.out.print("*");
    	  }
        if(i<=n/2)
        {
        	star1--;
        	spaces++;
        	star2--;
        }
        else
        {
        	star1++;
        	spaces--;
        	star2++;
        }
    	  System.out.println();
      }
  
	}
//	public static void main(String[] args) {
//	      int n=new Scanner(System.in).nextInt();
//	      for(int i=1;i<=n;i++)
//	      {
//	    	  for(int j=1;j<=n;j++)
//	    	  {
//	    		  if(j==(n+1)/2&&i>1&&i<n||i==(n+1)/2&&j>1&&j<n||i==(n+2)/2&&j==n/2||i==(n+2)/2&&j==n/2)
//	    		  {
//	    			  System.out.print(" ");
//	    		  }
//	    		  else {
//	    		  System.out.print("*");
//	    		  }
//	    	  }
//	    		    System.out.println();
//	      }
//		}
}
