package com.feuji.tests;

import java.util.ArrayList;

public class Feb7FeujiTests {

	public static void main(String[] args) {
		int arr[] = { 1, 6, 9, -4, 2, -3, -6, 8, 2, -2, 4, -1, 4, 6, 0, -1 };
		subArraysum(arr);
	}

	public static void subArraysum(int a[]) {
		int count = 0;
		for (int i = 0; i < a.length; i++)
			if (a[i] < 0)
				count++;
		int negArr[] = new int[count];
		int posArr[] = new int[a.length - count];
		for (int t = 0; t < a.length; t++)
			if (a[t] < 0)
				for (int j = 0; j < negArr.length; j++)
					negArr[j] = a[t];
		for (int t = 0; t < a.length; t++)
			if (a[t] > 0)
				for (int j = 0; j < posArr.length; j++)
					posArr[j] = a[t];

		for(int i=0;i<negArr.length;i++) {
			int negsum=negArr[i];
			for(int j=0;j<posArr.length;j++) {
				int possum=posArr[i];
				if(negsum==possum)System.out.println(possum+" , "+negsum);
				
				
			}
			
		}
	}
	public static void subArraysum0(int a[]) {
		int sum;
		for (int i = 0; i < a.length; i++) {
			sum = a[i];
			if (sum == 0)
				System.out.println("[" + a[i] + "]");
			for (int j = i + 1; j < a.length - 1; j++) {
				sum += a[j];
				int k = j;
				if (sum == 0) {
					System.out.print("[");
					while (k >= i) {
						System.out.print(a[k] + " ");
						k--;
					}
					System.out.println("]");
				}
			}
		}
	}

	public static void subArrleaderRight(int[] a) {

	}

}
