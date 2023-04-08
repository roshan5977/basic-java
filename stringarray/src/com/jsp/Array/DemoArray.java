package com.jsp.Array;

import java.util.Scanner;

public class DemoArray {
//          int []x;
//          DemoArray(int []y)
//          {
//        	  x=y;
//          }
	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		System.out.println("num of elements");
		int n = sc.nextInt(),ele=1;
		int []a=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("enter the elements "+ele++);
        	a[i]=sc.nextInt();
        }
        for(int x:a)
        {
        	System.out.print(x+" ");
        }
	}

}
