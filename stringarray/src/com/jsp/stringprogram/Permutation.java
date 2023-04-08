package com.jsp.stringprogram;

import java.util.Scanner;

public class Permutation {
	static String swap(String s, int i, int j) {
		char[] a = s.toCharArray();
		char t = a[i];
		a[i] = a[j];
		a[j] = t;
		return new String(a);
	}

	public static void permutation(String s1, int start, int end) {
		if (start == end) {
			System.out.println(s1);
			return;
		}
		for (int i = start; i <= end; i++) {
			String s2 = swap(s1, start, i);
			permutation(s2, start + 1, end);
		}
	}

	public static void main(String[] args) {

		String s = new Scanner(System.in).next();
		String tem = s;
		permutation(s, 0, s.length() - 1);
	}
}
