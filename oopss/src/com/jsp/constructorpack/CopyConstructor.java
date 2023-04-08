package com.jsp.constructorpack;
//copy constructor
class Cc
{
     int i;
     String name;
     
    Cc(int i,String name)
     {
    	 this.name=name;
    	 this.i=i;
     }
     Cc(Cc a,Cc a1)
     {
    	this.i=a.i;
    	this.name=a1.name;
     }
     Cc(Cc a)
     {
    	 this.i=a.i;
    	 this.name=a.name;
     }
    public void display()
    {
    	System.out.println(i+" : "+name);
    }
}
public class CopyConstructor {

	public static void main(String[] args) {
		Cc a1=new Cc(10,"asish");
		Cc a2=new Cc(20,"Roshan");
		Cc a3=new Cc(a1,a2);
		Cc a4=new Cc(a1,a1);
		Cc a5=new Cc(a1);
		a1.display();
		a2.display();
		a3.display();
		a4.display();
		a5.display();
	}

}
