package com.sp.lambda;

import com.sp.lambda.A.B;

//nested class
class A {
	private int i=39;
	class B {
      public void get() {
		System.out.println(i);
	}
      public static void name() {
		System.out.println("static of B");
	}
	}
}

//inner class
class C {
	private int j=8;
	static class D {
		
public void get() {
//	System.out.println(j);
	System.out.println("get");
}

public static void name() {
	System.out.println("static of D");
}
	}
}

public class TestInner {

	public static void main(String[] args) {
		//how to acess
      A a1= new A();
      B a =a1.new B();
      a.get();
      
      //How to acess
      C.D c=new C.D();
      c.get();
	}

}
