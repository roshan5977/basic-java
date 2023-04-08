package com.jsp.linkedlist;

import java.util.Scanner;

public class LengthEvenOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();// how many linked list!!!!
		while (n-- > 0) {
			int k = sc.nextInt();
			Node first = new Node(sc.nextInt(), null);
			Node last = first;
			for (int i = 1; i <= k - 1; i++) {
				last.next = new Node(sc.nextInt(), null);
				last = last.next;
			}
			Testing t = new Testing();
			if (t.isEvenOrOdd(first) == 0)
				System.out.println("even");
			else
				System.out.println("odd");
		}

	}

}

class Testing {
	public int isEvenOrOdd(Node first) {
		Node curr = first;
		if (first == null)
			return 0;
		int count = 1;
		while (curr.next != null) {
			count++;
			curr = curr.next;
		}
		if (count % 2 == 0)
			return 0;
		return 1;
	}

}
