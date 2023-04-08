package com.jsp.solves;

public class CountTripletSumSmaller {

	public static void main(String[] args) {
    int a[]= {5,1,3,4,7};
    int sum=12;
    System.out.println(countTripletSumSmaller(a,sum));//2
	}
	public static int countTripletSumSmaller(int a[],int k)
	{
		int count=0;
		for(int i=0;i<a.length-2;i++) {
			if(a[i]+a[i+1]+a[i+2]<k)count++;
		}
		return count;
	}

}
