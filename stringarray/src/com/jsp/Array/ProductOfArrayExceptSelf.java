package com.jsp.Array;
import java.util.Scanner;
public class ProductOfArrayExceptSelf {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENETR HOW MANY ELEMENTS U WANT");
		int elements = sc.nextInt();
		int[] a = new int[elements];
		System.out.println("enetr the elements");
		for (int i=0;i<elements;i++) {
			a[i] = sc.nextInt();
		}
		print(prodOfArrayExSelf(a));
	//	int[] c={1,2,3,4,5};
	//	print(a);
	}
	public static void print(int a[]) {
		for (int x : a) {
			System.out.print(x + "\t");
		}
	}
	public static int[] prodOfArrayExSelf(int[] a) {
		int prod = 1;
		for (int j = 0; j < a.length; j++)
			prod *= a[j];
		for (int i = 0; i < a.length; i++) {
			int div = prod / a[i];
			a[i] = div;
		}
		return a;
	}
}
