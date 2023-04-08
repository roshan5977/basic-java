package com.jsp.regexx;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demoreg00 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int count = 0;
		Pattern p = Pattern.compile("wow[0-9]");
		Matcher m = p.matcher(s);
//		while (m.find())
//			count++;
//		System.out.println(count);
		//The find method scans the input sequence
		//looking for the next subsequence that matches
		//the pattern.
//System.out.println(m.matches());
//System.out.println(m.lookingAt());
		sc.close();
	}

}
