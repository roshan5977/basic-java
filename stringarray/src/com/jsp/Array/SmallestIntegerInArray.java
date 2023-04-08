package com.jsp.Array;

public class SmallestIntegerInArray {

	public static void main(String[] args) {
   int []a= {4,7,2,8,2,9,2,5,1,8,4,9};
   smallestIntegerInArray(a);
	}

	public static void smallestIntegerInArray(int[] a) {
		int temp = a[0];
		for (int i = 1; i < a.length; i++) {
         if(a[i]<temp)temp=a[i];
		}
		System.out.println(temp);

	}

}
