package com.jsp.inheritance;

class Dibya
{
	int i;
	int j;
	
	public Dibya()
	{
	  
	}
	public Dibya(int i, int j)
	{
		this.i=i;
		this.j=j;
	}
	
	public void bedho()
	{
		System.out.println("GOOD MORNING");
	}
}
class DibyaChua extends Dibya
{
	int i;
	int j;
	
	
	public DibyaChua(int i, int j)
	{
		super(90,56);
		this.i=i;
		this.j=j;
	}
	
	public void bedho()
	{
		System.out.println(this.i);
		System.out.println(super.i);
		super.bedho();
		System.out.println("GOOD EVENING");
	}
}

public class SuperNdCallToSuper {

	public static void main(String[] args) {
	DibyaChua dcObj = new DibyaChua(2,4);
	System.out.println(dcObj.i);
	dcObj.bedho();
	}

}
