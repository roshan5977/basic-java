package com.jsp.sort;
public class InsertionSort {
public static void main(String[] args) {
     int a[]= {2,9,5,7,8,2,3,9,1,5};
     sort(a);
     for(int x:a)System.out.print(x+" ");
	}
public static void sort(int a[]) {
	for(int i=0;i<a.length;i++)
	{
		int key=a[i];
		int j=i-1;
		while(j>-1&&a[j]>key)
		{
			a[j+1]=a[j];
			j--;
		}
		a[j+1]=key;
	}
}

}
