package com.jsp.inheritance;

//if a class is final then it cannot be innherited means it cant be parent class
//but it can be child clss or sub class .
//if a method is final only non static method can be final then it cant be 
//overridden 
class Pen
{
	final String ink="Black";
	final int refil;
	
	public Pen(int refil)
	{
		this.refil=refil;
	}
	
    final public void tip()
	{
	System.out.println(ink);
	System.out.println(refil);	
	}

}
class BallPen extends Pen
{
	public BallPen(int refil) {
		super(40);
		this.refil=refil;
	}

	final String ink="Black";
	final int refil;
	
	final public void tipI()
	{
	System.out.println(this.ink);
	System.out.println(super.ink);
	System.out.println(this.refil);
	System.out.println(super.refil);
	
	}
}
public class FinalClass {

	public static void main(String[] args) {
     BallPen bp = new BallPen(5);
     bp.tipI();
     bp.tip();
	}

}
