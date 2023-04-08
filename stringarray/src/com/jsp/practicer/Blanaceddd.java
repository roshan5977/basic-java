package com.jsp.practicer;

import java.util.Stack;

public class Blanaceddd {

	public static void main(String[] args) {
       String s="[{()()}]";
       System.out.println(isbalanced(s));
     	}
	public static boolean isbalanced(	String s) {
		 Stack<Character> stack= new Stack<Character>();
	       for(int i=0;i<s.length();i++)
	       {
	    	   char g=s.charAt(i);
	    	   if(g=='{'||g=='['||g=='(')stack.push(g);
	    	   else if(g=='}'||g==']'||g==')')
	    		   if(stack.isEmpty()||!pair(stack.pop(),g))return false;
	    } 
	        return stack.isEmpty();


	}
	public static boolean pair(char c1,char c2)
	{
		if(c1=='['&&c2==']'||c1=='{'&&c2=='}'||c1=='('&&c2==')')return true;
		return false;
	}
	
	

}
