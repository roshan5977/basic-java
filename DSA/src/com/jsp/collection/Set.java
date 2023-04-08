package com.jsp.collection;

class Node {
	Object key;
	Node next;

	Node(Object k, Node n) {
		key = k;
		next = n;
	}
}

public class Set {
	private Node[] a = new Node[10];
	int count = 0;

	public boolean add(Object k) {
		int index = k.hashCode() % 10;
		index = Math.abs(index);
		if (a[index] == null) {
			a[index] = new Node(k, null);
			count++;
			return true;
		}
		Node curr = a[index];
		Node prev = null;
		while (curr != null) {
			if (k.equals(curr.key))
				return false;
			prev = curr;
			curr = curr.next;
		}
		prev.next = new Node(k, null);
		count++;
		return true;
	}

	public void display() {
		for (int i = 0; i <= 9; i++) {
			Node curr = a[i];
			while (curr != null) {
				System.out.println(curr.key);
				curr = curr.next;
			}
		}
	}

}
