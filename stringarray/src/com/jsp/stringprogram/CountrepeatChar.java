package com.jsp.stringprogram;

import java.util.Scanner;

public class CountrepeatChar {

	public static void main(String[] args) {
		String s="ENGINEERING";
		char c='E';
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if (c==s.charAt(i)) count++;
		}
		System.out.println(count);

	}

}
