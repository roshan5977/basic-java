package com.jsp.inventions;

class Testt31
{
	int i;
	Testt31()
	{
		this(2,3);
		System.out.println("hlo "+i);
	}
	Testt31(int k,int j)
	{
		this(2);
		System.out.println("4 "+i);
	}
	Testt31(int f )
	{
		System.out.println("3 "+i);
	}
}
class Testing3 extends Testt31
{
	int i;
	Testing3()
	{
		this(2);
		System.out.println("1");
	}
	
	Testing3(int j)
	{
		super(2,3);
		System.out.println("2");
	}
}
public class Test3 {

	public static void main(String[] args) {
	new Testing3();

	}

}
