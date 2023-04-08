package doublelinkedlist;

public class DoubleLinkedList {
	private Node first = null;
	private int count = 0;
	private Node last = null;

	public void add(Object e) {
		if (first == null) {
			first = new Node(null, e, null);
			last = first;
			count++;
			return;
		}
		last.next = new Node(last, e, null);
		last = last.next;
		count++;
	}

	@Override
	public String toString() {
		if (first == null)
			return "[]";
		Node curr = first;
		String s = "[" + curr.ele;
		for (int i = 1; i < count; i++) {
			curr = curr.next;
			s += "," + curr.ele;
		}
		return s + "]";
	}

	public int size() {
		return count;
	}

	public Object get(int index) {
		if (index <= -1 || index > size())
			throw new IndexOutOfBoundsException();
		Node curr = first;
		for (int i = 1; i <= index; i++)
			curr = curr.next;
		return curr.ele;
	}

	public void add(int index, Object ele) {
		if (index <= -1 || index > size())
			throw new IndexOutOfBoundsException();
		Node curr = first;
		if (index == 0) {
			first = new Node(null, ele, curr);
			curr.prev = first;
			count++;
			return;
		}
		for (int i = 1; i < index; i++)
			curr = curr.next;
		curr.next = new Node(curr, ele, curr.next);
		 if(curr.next.next!=null) curr.next.next.prev=curr.next;
		count++;
	}

	public void reverse() {
		Node curr = first;
		while(curr.prev!=null) {
			Node tem = curr.prev;
			curr.prev = curr.next;
			curr.next = tem;
			if(curr.prev!=null)curr=curr.prev;
		}
		first = curr;
	}

	public void remove(int index) {
		if (index <= -1 || index > size())
			throw new IndexOutOfBoundsException();
		Node curr = first;
		if (index == 0) {
			curr.next.prev = null;
			first = curr.next;
			curr.next = null;
			count--;
			return;
		}
		for (int i = 1; i < index; i++)
			curr = curr.next;
		if (index == size() - 1) {
			last = curr;
			curr.next = null;
			count--;
			return;
		}
		curr.next.next.prev = curr;
		curr.next = curr.next.next;
		count--;
	}

}
