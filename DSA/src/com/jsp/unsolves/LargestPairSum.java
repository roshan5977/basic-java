package com.jsp.unsolves;

public class LargestPairSum {

	public static void main(String[] args) {
    int a[]= {8,2,4,9,8,0,3,6};
    System.out.println(largestPairSum(a));
	}
	public static int largestPairSum(int a[])
	{
		int l=a[0];
		int s=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>l) {
				s=l;
				l=a[i];
			}
			else if(a[i]>s&a[i]!=l) {
				s=a[i];
			}
		}
		return l+s;
	}
}
