package com.jsp.Abstraction;

class Sa
{
	
}

class Sb extends Sa
{
	int i=50;
	private static Sb j;
	//private static 
	private Sb()
	{
		System.out.println("hii");
		
	}
	//factory method
	public static Sb getInstance()
	{
	if (j==null) j=new Sb();
		return j;
	}
	public void m1()
	{
		System.out.println(i);
	}
	
	
}
public class SingletonclassTest {

	public static void main(String[] args) {
System.out.println("hlooo");
		Sb s =Sb.getInstance();
		System.out.println(s);
		s.m1();
		Sb s1 =Sb.getInstance();
		System.out.println(s1);
		Sb s2 =Sb.getInstance();
		System.out.println(s2);
		System.out.println(s==s2);
		System.out.println(s2==s1);
		System.out.println(s1==s);


		
	}

}
