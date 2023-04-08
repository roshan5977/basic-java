package com.jsp.Encapsulation;
import com.free.practice.*;
class A3
{
    protected int getI() {
		return i;
	}

	protected void setI(int i) {
		this.i = i;
	}

	private int i;
    
}

public class Test3 extends W
{
	public static void main(String[] args) {
		Test3 a1 = new Test3();
		System.out.println(a1.getI());
		a1.setI(200);
		//System.out.println(a1.i);

	}

}
