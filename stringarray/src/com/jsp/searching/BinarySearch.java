package com.jsp.searching;

public class BinarySearch {

	public static void main(String[] args) {
		int a[] = { 8, 2, 4, 9, 8, 3, 6, 1, 7 };
		sort(a);
		int b[]=new int [a.length];
		int i=0,j=0,k=b.length-1-j;
		while(i<a.length&&j<b.length)
		{
			if(i%2==0)b[j++]=a[i++];
			else b[k--]=a[i++];
		}
		print(b);
		
	}

	public static void print(int a[]) {

		for (int x : a) {
			System.out.print(x + " ");
		}
	}

	public static void sort(int a[]) {
		if (a.length == 1)
			return;
		int[] b = new int[a.length / 2];
		int[] c = new int[a.length - b.length];
		int i = 0;
		for (i = 0; i < b.length; i++) {
			b[i] = a[i];
		}
		for (int j = 0; j < c.length; j++, i++) {
			c[j] = a[i];
		}
		sort(b);
		sort(c);
		merge(b, c, a);
	}

	public static int[] merge(int a[], int b[], int c[]) {
		int i = 0, j = 0, k = 0;
		while (i < a.length && j < b.length) {
			if (a[i] < b[j])
				c[k++] = a[i++];
			else
				c[k++] = b[j++];
		}
		while (i < a.length)
			c[k++] = a[i++];
		while (j < b.length)
			c[k++] = b[j++];
		return c;
	}
}
