package com.jsp.unsolves;

import java.util.Arrays;

public class PairOfMaxProd {

	public static void main(String[] args) {
		int a[] = { 8, 2, 4, 9, 3, 6 };
	//	System.out.println(maxProd(a));
       print(maxProd(a, 54));
	}
	public static void print(int a[])
	{
		for(int x:a)System.out.print(x+" ");
	}

	public static int maxProd(int[] a) {
		Arrays.sort(a);
		return a[a.length - 1] * a[a.length - 2];
	}

	public static int[] maxProd(int []a,int k) {
		//search
		int b[]=new int [2];
		b[0]=-1;
		b[1]=-1;
		Arrays.sort(a);
		
		for(int i=a.length-1;i>=0;i--) {
			for(int j=0 ;j<a.length;j++) {
          if(k==a[i]*a[j]) {
        	  b[0]=a[i];
        	  b[1]=a[j];
        	  return b;
          }
			}
		}
		return b;
	}

}
