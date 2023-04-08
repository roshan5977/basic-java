package com.cwl.paterns;

import java.util.Scanner;

public class Patern_03 {

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     sc.close();
     for(int i=1;i<=n;i++)
     {
    	 int k=i,t=(2*n)-i+1;
    	 for(int j=1;j<=n;j++)
    	 {
    		 if(j%2!=0)
    		 {
    			 System.out.print(k+" ");
    			 k+=10;
    		 }
    		 else
    		 {
    			 System.out.print(t+" ");
    			 t+=10;
    		 }
    	 }
    	 System.out.println();
     }
    
	}

}
