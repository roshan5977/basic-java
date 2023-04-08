package com.jsp.twoDArray;
import java.util.Scanner;
public class PascalTriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE SIZE OF TRIANGLE");
		int size = sc.nextInt();
		int[][] a = pascalTriangle(size);
		for (int x[] : a) {
			
			for (int y : x) {
				System.out.print(y + "\t");
			}
			System.out.println();
		}
	}

	public static int[][] pascalTriangle(int size) {
		int[][] a = new int[size][];
		for (int i = 0; i < a.length; i++) {
			a[i] = new int[i + 1];
			for (int j = 1; j < a[i].length; j++) {
				if (i == j || j == 0)
					a[i][j] = 1;
				else
					a[i][j] = a[i - 1][j - 1] + a[i - 1][j];
			}
		}
		return a;
	}
}
