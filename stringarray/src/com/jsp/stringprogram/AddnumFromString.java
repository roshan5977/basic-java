package com.jsp.stringprogram;

public class AddnumFromString {

	public static void main(String[] args) {
		String s = "roshan123";
		char[] a = s.toCharArray();
		int sum = 0;
		for (int i = 0; i <= s.length(); i++) {
			if (s.charAt(i) >= 48 && s.charAt(i) <= 57)
				sum += Integer.parseInt(a[i] + "");
		}
		System.out.println(sum);
	}
}
