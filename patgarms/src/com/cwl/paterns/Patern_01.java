package com.cwl.paterns;

import java.util.Scanner;

public class Patern_01 {

	public static void main(String[] args) {
		System.out.println("ENTER A NUM");
		int n=new Scanner(System.in).nextInt();
		int stars=1,spaces=n-1,star=1;
      for(int i=1;i<=n;i++)
      {
    	  for(int j=1;j<=stars;j++)
    	  {
    		  System.out.print("+");
    	  }
    	  for(int j=1;j<=spaces;j++)
    	  {
    		  System.out.print(" ");
    	  }
    	  for(int j=1;j<=star;j++)
    	  {
    		  System.out.print("+");
    	  }
    	  System.out.println();
    	  if (i<=n/2) {
			stars++;
		spaces-=2;
			star++;
		}
    	  else
    	  {
    		  stars--;
  		spaces+=2;
  			star--;
    	  }
      }
	}

}
