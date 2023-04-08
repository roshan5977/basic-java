package com.jsp.practicer;

public class Palin {

	public static void main(String[] args) {
		String s = "malayalam", s1 = "";
		for (int i = 0; i < s.length() - 1; i++) {
			for (int j = i+2; j <= s.length(); j++) {
				s1 = s.substring(i,j);
				if (isPalindrome(s1))System.out.println(s1);
			}
		}

	}

	public static boolean isPalindrome(String s) {
		for (int i = 0; i < s.length() / 2; i++)
			if (s.charAt(i) != s.charAt((s.length() - 1) - i))
				return false;
		return true;
	}

}
