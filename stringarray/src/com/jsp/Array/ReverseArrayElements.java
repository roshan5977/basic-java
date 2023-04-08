package com.jsp.Array;

public class ReverseArrayElements {

	public static void main(String[] args) {
              int a[] = {6,9,2,6,3,9,4,6,3,7};
            Lcm.print(reverseArray(a));
	}
	public static int [] reverseArray(int[]a) {
	          for(int i=0;i<a.length/2;i++)
	          {
	        	 int  j=a.length-1-i;
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
	          }
	          return a;
	}
}