package com.jsp.Array;

import java.util.Scanner;

public class Lcm {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("eneter the size of array elemenets");
		int size = sc.nextInt(), ele = 0;
		int[] a = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.println("ENTER THE ELEMENT " + (++ele));
			a[i] = sc.nextInt();
		}
		System.out.println("LCM OF THE ARRAY IS " + lcm(a));
	}

	public static void print(int a[]) {
		for (int x : a) {
			System.out.print(x + "\t");
		}
	}

	public static int lcm(int a[]) {
		int g = greatestnum(a), lcm = 0;
		for (int i = 0, k = 1; i < a.length; i++) {
			if ((g * k) % a[i] != 0) {
				k++;
				i = -1;
			}
			lcm = g * k;
		}
		return lcm;
	}

	public static int greatestnum(int a[]) {
		int res = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > res)
				res = a[i];
		}
		return res;
	}
}
