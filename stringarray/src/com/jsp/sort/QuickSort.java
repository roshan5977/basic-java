package com.jsp.sort;
public class QuickSort {
	static int c1=0,c2=10,c3=100;
	public static void main(String[] args) {
    int a[]= {2,7,9,8,2,4,5,6};
    sort(a,0,a.length-1);
    for(int x:a)System.out.print(x+" ");
    System.out.println("last");
	}
	public static void sort(int []a,int start,int end){
		if(start>=end)return;
		int i=start,j=end;
		int pivot=a[(start+end)/2];
		while(i<=j) {
		while(a[i]<pivot)i++;
		while(a[j]>pivot)j--;
		if(i<=j) {
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		i++;
		j--;
		}
		}
	    for(int x:a)System.out.print(x+" ");
	    System.out.println(++c1);
		sort(a,start,j);
	    for(int x:a)System.out.print(x+" ");
	    System.out.println(++c2);
		sort(a,i,end);
	    for(int x:a)System.out.print(x+" ");
	    System.out.println(++c3);
	}
}