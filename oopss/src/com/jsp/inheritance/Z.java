package com.jsp.inheritance;

class X
{
    private int i=100;//private data members are not visible its security for acessing it we need
    //to use functionality.
    
    public void accessI()
    {
    	System.out.println(i);
    }
}
class Y extends X
{
   void m1()
   {
	   accessI();
	   //System.out.println(i);
   }
}
public class Z {

	public static void main(String[] args) {
       Y y=new Y();
       y.accessI();
       y.m1();
       
	}

}
