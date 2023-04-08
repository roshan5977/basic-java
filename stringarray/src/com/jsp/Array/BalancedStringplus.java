package com.jsp.Array;

public class BalancedStringplus
 {
	public static void main(String[] args) {

	}

	static String BalancedString(int N) {
		String s = "";
		if (N > 26) {
			for (char c = 'a'; c <= 'z'; c++)
				s += c;
			N -= 26;
		}
		int even = 0, sum = 0, odd = 0, oddd = 0;
		for (char c = 'a'; c <= 'z'; c++) {
			if (N % 2 == 0) {
				even++;
				if (even <= N / 2 || even > (26 - (N / 2))) {
					s += c;
				}
			} else if (N % 2 != 0) {
				even++;
				for (int temp = N; temp > 0; temp /= 10)
					sum += temp % 10;
				if (sum % 2 == 0) {
					if (even <= (N + 1) / 2 || even > (26 - ((N - 1) / 2))) {
						s += c;
					}
				} else {
					if (even <= (N - 1) / 2 || even > (26 - ((N + 1) / 2))) {
						s += c;
					}
				}
			}
		}
		return s;
	}

}
