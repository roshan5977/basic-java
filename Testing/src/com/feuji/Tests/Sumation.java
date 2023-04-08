package com.feuji.Tests;

public class Sumation {
	public static int sum(int num) {
		int sum = 0;
		int len = num + "".length();
		for (int i = 1; i < len; i++, num /= 10)
			sum += num % 10;
		return sum;
	}
}
