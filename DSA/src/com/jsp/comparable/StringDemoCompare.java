package com.jsp.comparable;

public class StringDemoCompare {

	public static void main(String[] args) {
		String s="roshan";
		String s1="roshbn";
		System.out.println(comparing(s,s1));
	}
	public static int comparing(String s1,String s2) {
	return s1.compareTo(s2);
	}

}
