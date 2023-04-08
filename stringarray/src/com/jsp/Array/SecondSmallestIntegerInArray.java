package com.jsp.Array;

public class SecondSmallestIntegerInArray {

	public static void main(String[] args) {
  int []a= {5,5,8,2,2,9,2,9,2,5,3,6,2,8,4,3};
	//  int []a= {5,6,7,8};
    secondSmallestIntegerInArray(a);
	}
	public static void secondSmallestIntegerInArray(int[]a) {
		int r1=a[0];
		int r2=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<r1) 
			{
				r2=r1;
				r1=a[i];
			}
			else if((r1!=a[i])&&(a[i]<r2||r1==r2))
			{
				r2=a[i];
			}
		}
		System.out.println(r2);
	}
	}
