package com.cwl.practice;

public class QuickSort {

	public static void main(String[] args) {
		int a[] = { 8, 2, 4, 9, 8, 3, 6 };
		sort(a, 0, 6);
		print(a);
	}
	public static void print(int[] a) {
		for (int x : a) 
			System.out.print(x);
	}
	public static void sort(int[] a, int start, int end) {
		if (start >= end)
			return;
		int i = start, j = end;
		int pivot = a[(i + j) / 2];
		while (i <= j) {
			while (a[i] < pivot)
				i++;
			while (a[j] > pivot)
				j--;
			if (i <= j) {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		sort(a, start, j);
		sort(a, i, end);
	}
}
