package com.jsp.practicer;

import java.util.Stack;

public class Balanced {

	public static void main(String[] args) {
                if(isBalanced("[{}()]"))System.out.println("its balanced");
                else System.out.println("not balanced");
	}
	public static boolean isBalanced(String s) {
	Stack<Character> stack=	new Stack<>();
	       for(int i=0;i<s.length();i++)
	       {
	    	   char c1=s.charAt(i);
      	   if (c1=='['||c1=='{'||c1=='(') stack.push(c1);
	    	   else if (c1==']'||c1=='}'||c1==')') {
				if (stack.isEmpty()||!pair(stack.pop(),c1)) return false;
			}
	       }
		return stack.isEmpty();
		
	}
	public static boolean pair(char c1,char c2) {
		if (c1=='['&&c2==']'||c1=='{'&&c2=='}'||c1=='('&&c2==')') return true;
		return false;
		
	}

}
