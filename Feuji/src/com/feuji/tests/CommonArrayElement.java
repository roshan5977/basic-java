package com.feuji.tests;

public class CommonArrayElement {

	public static void main(String[] args) {
		int[] first = { 2, 3, 5, 1, 8, 43, 7, 4, 3, 5, 5, 7 };
		int[] second = { 5, 5, 3, 8, 3, 8, 0, 4, 5, 2, 8, 4, 4, 2, 7, 5, 9 };

		for (int i = 0; i < first.length; i++) {
			for (int j = 0; j < second.length; j++) {
				if (first[i] == second[j]) {
					System.out.print(first[i] + " ");
					break;
				}
			}
		}
	}

}
