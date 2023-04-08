package com.jsp.stack;

import java.util.Scanner;
import java.util.Stack;

public class BalancedString {
	public static void main(String[] args) {
		while (true) {
			System.out.println("ENTER CHARACTER I WILL CHECK ITS BALANCED OR NOT");
			if (isbalanced(new Scanner(System.in).next()))
				System.out.println("yaaa its balanced.");
			else
				System.out.println("na naaa naahhh its not balanced.");
			System.out.println("++++++++++++++++++++++++++++++++++");
		}
	}

	static boolean isbalanced(String s) {
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			char t = s.charAt(i);
			if (t == '[' || t == '(' || t == '{') {
				stack.push(t);
			} else if (t == ']' || t == ')' || t == '}') {
				if (stack.isEmpty() || !pair(stack.pop(), t))
					return false;
			}
		}
		return stack.isEmpty();// return false if condition
	}

	public static boolean pair(char c1, char c2) {
		if (c1 == '{' && c2 == '}' || c1 == '[' && c2 == ']' || c1 == '(' && c2 == ')')
			return true;

		return false;
	}
}
