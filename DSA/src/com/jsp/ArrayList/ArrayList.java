package com.jsp.ArrayList;

public class ArrayList<A> {
	private Object[] a = new Object[5];
	private int pos = 0;

	public void add(A e) {
		if (pos >= a.length)
			increase();
		a[pos++] = e;
	}

	private void increase() {
		Object b[] = new Object[a.length + 4];
		for (int i = 0; i < a.length; i++)
			b[i] = a[i];
		a = b;
	}

	public int size() {
		return pos;
	}

	public void add(int index, A e) {
		if (index <= -1 || index > pos)
			throw new IndexOutOfBoundsException();
		if (pos + 1 >= a.length)
			increase();
		for (int i = pos - 1; i >= index; i--) {
			a[i + 1] = a[i];
		}
		a[index] = e;
		pos++;
	}

	public void remove(int index) {
		if (index <= -1 || index > pos)
			throw new IndexOutOfBoundsException();
		for (int i = index; i <= pos; i++) {
			a[i] = a[i + 1];
		}
		pos--;
		a[pos] = null;
	}

	public String toString() {
		if (pos == 0)
			return "[]";
		String f = "[" + a[0];
		for (int i = 1; i < pos; i++)
			f += "," + a[i];
		return f + "]";
	}

	public A get(int index) {
		if (index <= -1 || index > pos)
			throw new IndexOutOfBoundsException();
		return (A)a[index];
	}

}
