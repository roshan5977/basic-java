package doublelinkedlist;

public class CircularLinkedList {
	private Node first = null;
	private Node last = null;
	private int count = 0;

	public void add(Object e) {
		if (first == null) {
			first = new Node(null, e, null);
			last = first;
			count++;
		}
		last.next = new Node(last, e, first);
		last = last.next;
		first.prev = last;
		count++;
	}
	public void add(Object e,int index) {
	
	}
	public void remove(int index) {
		
	}


}
