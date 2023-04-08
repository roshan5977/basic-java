package com.jsp.stack;

import java.util.Stack;

public class Demo {

	public static void main(String[] args) {
      Stack<Character>stack=new Stack<Character>();
      stack.push('{');
      stack.push('(');
      stack.push('[');
      
      System.out.println("stack is empty or not "+stack.isEmpty());
      
      stack.pop();
      System.out.println(stack.pop());
      System.out.println(stack.pop());
      
      System.out.println("stack is empty or not "+stack.isEmpty());
    		  
	}

}
