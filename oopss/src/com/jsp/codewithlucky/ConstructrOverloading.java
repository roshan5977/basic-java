package com.jsp.codewithlucky;

class Co
{
	int i;
	int j;
	public Co()
	{
		i=5;
		j=7;
	}
	public Co(int n)
	{
		i=n;
		j=n;
	}
	public Co(int i, int j)
	{
		this.i=i;
		this.j=j;
	}
	public void display()
	{
		System.out.println("i="+i+" and j= "+j);
		
	}
}
public class ConstructrOverloading {
          //driver method
	public static void main(String[] args) {
		System.out.println("WELCOME TO CONSTRUCTOR OVERLOADING");
	    Co m1=new Co();
	    m1.display();
	    Co m2=new Co(324);
	    m2.display();
	    Co m3=new Co(70,46);
	    m3.display();
	}
}
