package com.jsp.codewithlucky;

class Mo
{
	int i;
	int j;
	public void M()
	{
		i=5;
		j=7;
	}
	public void M(int n)
	{
		i=n;
		j=n;
	}
	public void M(int i, int j)
	{
		this.i=i;
		this.j=j;
	}
	public void display()
	{
		System.out.println("i="+i+" and j= "+j);
		
	}
}
public class MtdOverloading {
          //driver method
	public static void main(String[] args) {
		System.out.println("WELCOME TO METHOD OVERLOADING");
	    Mo m1=new Mo();
	    m1.M();
	    m1.display();
	    m1.M(90);
	    m1.display();
	    m1.M(40,67);
	    m1.display();
	}
}
