package com.jsp.codewithlucky;

class A
{
	int i;  //non static data member
	//default constructor
public A()
{
System.out.println("hello cwl");
}
public A(int a,int b)
{
	i=a+b;
}
}
public class BasicConstructor1 {

	public static void main(String[] args) {
		
         A a1 = new A(2,5);
         A a2 = new A();
         System.out.println("a1.i="+a1.i);
         System.out.println("a2.i="+a2.i);
	}

}
