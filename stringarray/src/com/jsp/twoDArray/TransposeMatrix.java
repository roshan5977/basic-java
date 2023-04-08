package com.jsp.twoDArray;

public class TransposeMatrix {

	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3 }, { 2, 3, 4 }, { 5, 6, 7 } };
		MatrixMultiplication.print(transpose(a));
	}
	public static int[][] transpose(int[][] a) {
		int[][] c = new int[a.length][a.length];
		for (int i = 0; i < a.length; i++) 
			for (int j = 0; j < a.length; j++) 
				c[i][j] = a[j][i];
                return c;
	}
}
