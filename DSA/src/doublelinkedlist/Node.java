package doublelinkedlist;

public class Node {
	Node prev;
	Node next;
	Object ele;

	Node(Node p, Object e, Node n) {
		prev = p;
		ele = e;
		next = n;
	}
}
