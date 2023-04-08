package com.jsp.inheritance;

class N {
	public Object m1() {
		System.out.println("m1 mthod executed");
		return new M();
	}
}
//covarient means same return type in overriding methods in parent and child.
//this is contravarient super class has object return type bt sub class 
//return type is different
class O extends N {
	@Override
	  public M m1() {
		System.out.println("m2 method executed");
		return new M();
	}
}

public class M {

	public static void main(String[] args) {
		O o = new O();
		o.m1();

	}

}
