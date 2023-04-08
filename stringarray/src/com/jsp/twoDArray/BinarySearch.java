package com.jsp.twoDArray;
public class BinarySearch {
	public static void main(String[] args) {
    int a[]= {1,2,3,4,5,6,7,8};
		System.out.println(searchrecur(a,6,0,a.length-1));
		System.out.println(search(a,60));
	}
	public static int search(int []a,int n) {
		int i=0,j=a.length-1;
		int mid=(i+j)/2;
	while(i<=j)
	{
			if(n==a[mid])return mid;
			else if(n<a[mid])j=mid-1;
			else i=mid+1;
	}
	return -1;	
	}
	public static int searchrecur(int []a,int n,int start,int end) {
		if(start>end)return -1;
		int mid=(start+end)/2;
		if(n==a[mid])return mid;
		else if(n<a[mid])return searchrecur(a,n,start,mid-1);
		else return searchrecur(a,n,mid+1,end);
	}

}
