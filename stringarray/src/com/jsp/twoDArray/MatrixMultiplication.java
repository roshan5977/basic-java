package com.jsp.twoDArray;

public class MatrixMultiplication {
	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3 }, { 2, 3, 4 }, { 5, 6, 7 } };
		int[][] b = { { 3, 5, 6 }, { 9, 7, 3 }, { 2, 5, 7 } };
		print(matrixMultiply(a, b));
	}

	public static void print(int[][] c) {
		for (int[] f : c) {
			for (int x : f)
				System.out.print(x + " ");
			System.out.println();
		}
	}

	public static int[][] matrixMultiply(int[][] a, int[][] b) {
		int[][] c = new int[3][3];
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++)
				for (int k = 0; k < 3; k++)
					c[i][j] += a[i][k] * b[k][j];
		return c;
	}
}
