package com.jsp.map;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StngPrgm {
	public static void main(String[] args) {
		String s = "banana";
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c != ' ') {
				String s1 = "[" + c + "]";
				Pattern p = Pattern.compile(s1);
				Matcher m = p.matcher(s);
				System.out.print(c + "=");
				while (m.find())
					System.out.print(m.start() + ",");
				s = s.replace(c + "", " ");
				System.out.println();
			}
		}
	}
}
