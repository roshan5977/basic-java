package com.jsp.Array;

public class MaxSubarray {

	public static void main(String[] args) {
		int[] a = { 1, -2, 0, 3 };
		System.out.println(maxsubarray(a));
	}

	public static int maxsubarray(int[] a) {
		int resu = a[0];
		for (int i = 0; i < a.length - 1; i++) {
			int res = i, sum = 0;
			for (int j = i + 1; j < a.length; j++) {
				sum += j;
				if (sum > res)
					res = sum;
			}
			if (res > resu)
				resu = res;
		}
		return resu;
	}

}
