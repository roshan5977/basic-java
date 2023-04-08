package com.jsp.queue;

public class Queue {

	private Node first=null;
	private int count=0;
	private Node last=null;
	public void add(Object e) {
		if(first==null) {
			first=new Node(null,e);
			last=first;
			count++;
			return;
		}
		last.next= new Node(null,e);
		count++;
		last=last.next;
	}
	public int size()
	{
		return count;
	}
	public boolean isEmpty()
	{
		if(size()==0)return true;
		return false;
	}
	public Object peek()
	{
		if(isEmpty())return null;
	     return first.ele;
	}
	public Object poll()
	{
		if(isEmpty())return null;
		Object ele=first.ele;
		first=first.next;
		count--;
		if(isEmpty())last=null;
		return ele;
	}
}
