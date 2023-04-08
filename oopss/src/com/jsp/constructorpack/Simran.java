package com.jsp.constructorpack;
//find area of rectangle by constructor overloading and copy constructor

class Rectangle
{
	int length;//non static dm;
	int breadth;//non static dm only after object creation default value will be allocated
	
	Rectangle(int length,int breadth)//default modifier constructor only accessed inside package
	{
		this.length=length;//here this.non static dm=local var;
		this.breadth=breadth;//this is used to point current object;
	}
	public Rectangle(Rectangle r,int breadth)//we cant write any return type even no void
	{
		this.length=r.length;
		this.breadth=breadth;
	}
	Rectangle(Rectangle r100,Rectangle r2000)//overloading constructor with different args #order of occurance #datatypes #num
	{
		this.length=r100.length;
		this.breadth=r2000.breadth;
	}
	Rectangle(Rectangle r)
	{
		this.length=r.length;
		this.breadth=r.breadth;
	}
	void AreaOfRectangle() //non static method with default modifier(acessed only in current package)
	{
		System.out.println("AREA OF RECTANGLE WITH "+length+"and"+breadth+" is "+(length*breadth));
	}
}
public class Simran {
	
	public static void main(String[] args) {
		Rectangle r1=new Rectangle(6,12);
		Rectangle r2=new Rectangle(20,46);
		Rectangle r3=new Rectangle(r1,90);
		Rectangle r4=new Rectangle(r2);
		Rectangle r5=new Rectangle(r4,r3);
		r1.AreaOfRectangle();
		r2.AreaOfRectangle();
		r3.AreaOfRectangle();
		r4.AreaOfRectangle();
		r5.AreaOfRectangle();
	}
}
//In a class we can have only properties var for declaration and initialisation and methods; 
//We cannot write system.out.println() inside a class directly;