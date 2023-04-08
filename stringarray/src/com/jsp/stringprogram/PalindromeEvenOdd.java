package com.jsp.stringprogram;

public class PalindromeEvenOdd {

	public static void main(String[] args) {
		String s = "axcybdcyax";// acbca//xydyx
		System.out.println((isPalindrome(even(s)) && isPalindrome(odd(s))) ? "pal" : "not pal");
	}

	public static String even(String s) {
		String s1 = "";
		for (int i = 0; i < s.length(); i++) {
			if (i % 2 == 0)
				s1 += s.charAt(i);
		}
		return s1;
	}

	public static String odd(String s) {
		String s1 = "";
		for (int i = 0; i < s.length(); i++) {
			if (i % 2 != 0)
				s1 += s.charAt(i);
		}
		return s1;
	}

	public static boolean isPalindrome(String s) {
		for (int i = 0; i < s.length() / 2; i++)
			if (s.charAt(i) != s.charAt(s.length() - 1 - i))
				return false;
		return true;
	}

}
