package com.jsp.association;

class A1 {
	void m1() {
		System.out.println("m1() method defined");
	}
}

class B1 {
	A1 a;
	B1(A1 a1) {
		this.a = a1;
	}

	void m2() {
		System.out.println("m2() method defined");
		a.m1();
	}
}

public class Composition {

	public static void main(String[] args) {
		// B1 b1 = new B1(new A1());
		// b1.m2();
		A1 a = new A1();
		B1 b = new B1(a);
		b.m2();

	}

}
