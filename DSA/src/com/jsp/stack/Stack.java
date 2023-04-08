package com.jsp.stack;

import java.util.EmptyStackException;

public class Stack {
	private Node first = null;
	private int count = 0;

	public void add(Object e) {
		if (first == null) {
			first = new Node(null, e);
			count++;
			return;
		}
		first = new Node(first, e);
		count++;
	}

	public int size() {
		return count;
	}

	public boolean isEmpty() {
		if (size() == 0)
			return true;
		return false;
	}
	public Object pop()
	{
		if(isEmpty())throw new EmptyStackException();
		Object ele=first.ele;
		first=first.next;
		count--;
		return ele;
	}	
	public Object peek()
	{
		if(isEmpty())throw new EmptyStackException();
       return first.ele;
	}
}
