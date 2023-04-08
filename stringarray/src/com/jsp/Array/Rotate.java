package com.jsp.Array;

public class Rotate {

	public static void main(String[] args) {
      int a[]= {8,2,4,9};
     Lcm.print(clockwiseRotate(a,1));
	}
	public static int[] clockwiseRotate(int [] a,int r) {
		for(int i=a.length;i>=0;i--)
		{
			if(i<=r)
			else a[i]=a[i-r];
		}
		return a;
		}
}
