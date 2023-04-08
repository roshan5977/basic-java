package com.jsp.Stringclss;

public class StringMtds {

	public static void main(String[] args) {
		String s1="rahim";
		String s2="roshan";
		s1.codePointAt(0);
		s1.codePointBefore(0);
		s1.codePointCount(0, 1);
		s1.codePoints();//dout
		s1.compareTo(s2);
		s1.compareToIgnoreCase(s2);
		s1.concat(s2);
		s1.contains("h");
		s1.contentEquals("roshan");//string buffer parameter
		s1.contentEquals(s2);//charsequence parameter
		s1.endsWith(s2);//
		//s1.formatted(null);
		s1.intern();
		s1.isBlank();//space if still true
		s1.isEmpty();
		//s1.join(s2, null)//
		s1.matches(s2);//
		s1.regionMatches(0, s2, 0, 0);
		s1.replaceAll(s1, s2);
		s1.replaceFirst(s1, s2);
		s1.strip();
		s1.subSequence(0, 0);
		s1.valueOf(0);
	}

}
