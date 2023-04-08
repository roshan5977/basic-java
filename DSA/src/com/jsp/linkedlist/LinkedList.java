package com.jsp.linkedlist;

public class LinkedList {

	private Node first = null;
	private int count = 0;

	public void add(Object ele) {
		if (first == null) {
			first = new Node(ele, null);
			count++;
			return;
		}
		Node last = first;
		while (last.next != null)
			last = last.next;
		last.next = new Node(ele, null);
		count++;
	}

	public int size() {
		return count;
	}

	public Object get(int index) {
		if (index <= -1 || index > size() - 1)
			throw new IndexOutOfBoundsException();
		Node curr = first;
		for (int i = 1; i <= index; i++)
			curr = curr.next;
		return curr.ele;
	}

	public void remove(int index) {
		if (index <= -1 || index > size() - 1)
			throw new IndexOutOfBoundsException();
		if (index == 0) {
			first = first.next;
			count--;
			return;
		}
		Node curr = first;
		Node last = first;
		for (int i = 1; i < index; i++)
			curr = curr.next;
		curr.next = curr.next.next;
		count--;
		if (index == size() - 1)
			last = curr;
	}
	public void reverse()
	{
		Node next=null;
		Node curr =first;
		Node prev=null;
		while(curr!=null)
		{
			next=curr.next;
			curr.next=prev;
			prev=curr;
            curr=next;
		}
		first=prev;
	}

	public void add(int index, Object ele) {
		if (index <= -1 || index > size() - 1)
			throw new IndexOutOfBoundsException();
		Node curr=first;
		if (index == 0) {
			first = new Node(ele, curr);
			count++;
			return;
		}
		for (int i = 1; i < index; i++)
			curr = curr.next;
		curr.next = new Node(ele, curr.next);
		count++;
	}
      @Override
     public String toString() {
		if(first==null)return"[]";
		Node curr=first;
		String s="["+curr.ele;
		for(int i=1;i<size();i++) {
			curr=curr.next;
			s+=","+curr.ele;
		}
		s+="]";
		return s;
	} 
	
	public void clear() {
		first = null;
		count = 0;
	}
}
