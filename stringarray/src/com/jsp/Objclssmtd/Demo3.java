package com.jsp.Objclssmtd;
//equals() method
class Rectangle
{
	int length;
	int breadth;
	public Rectangle(int l,int b)
	{
		length=l;
		breadth=b;
	}
}
class Rhombus
{
	int length;
	int breadth;
	public Rhombus(int l,int b)
	{
		length=l;
		breadth=b;
	}
//	public boolean equals(Object arg)
//	{
//		return this==arg;
//		
//	}
	@Override
	public boolean equals(Object arg)
	{
		if (!(arg instanceof Rhombus)) return false; 
		Rhombus r=(Rhombus)arg;
		return this.length==r.length&& breadth==r.breadth;
	}
}
public class Demo3 {
	public static void main(String[] args) {
     Rectangle r1 = new Rectangle(10,30);
     Rectangle r2 = new Rectangle(20,30);
     Rectangle r3 = new Rectangle(10,30);
     Rhombus r4 = new Rhombus(10,30);
     System.out.println(r1);
     System.out.println(r1.toString());//printing String type directly
     System.out.println(r2);
     System.out.println(r3);
     System.out.println(r4);//calling tostring mtd inside Object class inside Println(Object obj) in printstream class
     System.out.println(r1==r2);
     System.out.println(r1==r3);
     System.out.println("**********************");
     System.out.println(r1.equals(r2));//default equals method implementation is called from Object class
     //this==arg;false as two address are not same;so override it
     Rhombus rh1=new Rhombus(10,30);
     Rhombus rh2 = new Rhombus(56,66);
     System.out.println(rh1);
     System.out.println(rh1==rh2);//false reference compared
     System.out.println(rh1.equals(rh2));//false properties compared
     System.out.println(rh1.equals(r4));//true
     System.out.println(rh1.equals(r1));//false compared with rectangle properties
	}
}
