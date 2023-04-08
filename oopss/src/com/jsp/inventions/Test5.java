package com.jsp.inventions;

class Aman
{
	int i ;
//	private Aman(int j)
//	{
		
//	}
	
}
class AmanChild extends Aman
{
	String name;
	int j;
	private AmanChild()
	{
		
	}
	public static Aman name() {
		return new AmanChild();
	}
	 
	 
	
	
}


public class Test5 {

	public static void main(String[] args) {
              AmanChild name = (AmanChild) AmanChild.name();
              //so as method having return type as 
              System.out.println(name.j);
	}

}



class D
{
	D(int i)
	{
		this(2,4);
	}
	D(int j, int i)
	{
		
	}
	
	
}
class E extends D
{
	E(int j)
	{
		super(2);
	}
	
	
}
class Tering
{
	 E a = new E(3);
	 
	 
}



























