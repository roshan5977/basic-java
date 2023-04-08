package com.jsp.BasicPrograms;

import java.util.Scanner;

public class Lcmm {

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int a=sc.nextInt();
     int b=sc.nextInt(),lcm=0;
     int c=a<b?a:b;
     int d=a>b?a:b;
     for(int i=1;i<d;i++)
     {
    	 if ((d*i)%c==0) {
			lcm=d*i;
			break;
		}
     }
     System.out.println(lcm);
	}

}
