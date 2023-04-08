package com.jsp.stringprogram;

public class LongestPalindrome {

	public static void main(String[] args) {
		String s = "malayalam";
		String res = "";
		int count = 0;
		for (int i = 0; i < s.toLowerCase().length() - 1; i++) {
			for (int j = i + 2; j <= s.length(); j++) {
				String s1 = s.substring(i, j);
				if (ispal(s1))
					if (countNumOfchar(s1) > count) {
						res = s1;
						count = countNumOfchar(s1);
					}
			}
		}
		System.out.println("longest pal " + res);
	}

	public static boolean ispal(String s) {
		for (int i = 0; i < s.length() / 2; i++) {
			if (s.charAt(i) != s.charAt(s.length() - 1 - i))
				return false;
		}
		return true;
	}

	public static int countNumOfchar(String s) {
		int count = 0;
		while (s.length() > 0) {
			s = s.replace(s.charAt(0) + "", "");
			count++;
		}
		return count;

	}

}
