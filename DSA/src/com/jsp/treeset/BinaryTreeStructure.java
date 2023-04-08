package com.jsp.treeset;

public class BinaryTreeStructure {

	private Node root = null;
	private int count = 0;
	boolean flag = false;

	public int size() {
		return count;
	}

	public String toString() {
		if (size() == 0) return "[]";
		String k = display(root).replace("  ", " ").trim();
		String s1[] = k.split(" "), s = "[" + s1[0];
		for (int i = 1; i < s1.length; i++) s += "," + s1[i];
		return s + "]";
	}

	private String display(Node king) {
		if (king == null) return "";
		if (king.left == null && king.right == null) return king.key + "";
		return display(king.left) + " " + king.key + " " + display(king.right);
	}

	public boolean add(int k) {
		flag = false;
		root = addNode(k, root);
		return flag;
	}

	private Node addNode(int k, Node n) {
		if (n == null) {
			n = new Node(k);
			flag = true;
			count++;
			return n;
		}
		if (k < n.key)
			n.left = addNode(k, n.left);
		else if (k > n.key)
			n.right = addNode(k, n.right);
		return n;
	}

//	public boolean add(int k) {
//		if (root == null) {
//			root = new Node(k);
//			count++;
//			return true;
//		}
//		Node prev = null,curr = root;
//		while (curr != null) {
//			if (k == curr.key)
//				return false;
//			else if (k < curr.key) {
//				prev = curr;
//				curr = curr.left;
//			} else {
//				prev = curr;
//				curr = curr.right;
//			}
//		}
//		if (k < prev.key)
//			prev.left = new Node(k);
//		else
//			prev.right = new Node(k);
//		count++;
//		return true;
//	}

}
