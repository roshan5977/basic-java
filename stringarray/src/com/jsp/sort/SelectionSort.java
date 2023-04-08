package com.jsp.sort;

public class SelectionSort {

	public static void main(String[] args) {
		int[] a = {4,8,3,6,9,2,4,2,8,5,7};
		sort(a);
	}

	public static void sort(int[] a) {

		for(int i=0;i<a.length-1;i++)
		{
			int index=i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]<a[index])index=j;
			}
			if(i!=index)
			{
				int temp=a[index];
				a[index]=a[i];
				a[i]=temp;
			}
		}
			for (int x : a) {
			System.out.print(x+",");
		}
	}
}
