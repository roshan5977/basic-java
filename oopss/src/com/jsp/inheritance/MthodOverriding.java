package com.jsp.inheritance;

class Parent
{
	public void call()
	{
		System.out.println("8249802056");
	}
}

class Child extends Parent
{
	public void call()
	{
		System.out.println("7683195788");
	}
	public void belongings()
	{
		System.out.println("i have a bi cycle");
	}
}

public class MthodOverriding {

	public static void main(String[] args) {
     Child ch = new Child();
     ch.belongings();
     ch.call();

	}

}
