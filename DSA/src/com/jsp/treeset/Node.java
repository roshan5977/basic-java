package com.jsp.treeset;

public class Node {
   int key;
	Node left;
	Node right;
	Node(int k,Node l,Node r)
	{
		key=k;
		left=l;
		right=r;
	}
	Node(int k)
	{
		key=k;
	}
}
