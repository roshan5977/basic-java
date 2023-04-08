package com.jsp.Encapsulation;

class A1 {
	private String name;

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}
}

public class Test2 {
	public static void main(String[] args) {
		A1 a1 = new A1();
		System.out.println(a1.getName());
		a1.setName("Roshan");
		System.out.println(a1.getName());
	}

}
