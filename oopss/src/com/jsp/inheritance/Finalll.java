package com.jsp.inheritance;

class Shirt
{
    final int button=8;
   public void wearshirt()
   {
	  System.out.println(button); 
   }
}
class Tshirt extends Shirt
{
	 int  button=6;

   public void weartshirt()
   {
	   System.out.println(this.button);  
	   System.out.println(super.button);
   }
}
public class Finalll {

	public static void main(String[] args) {
	 Tshirt ts = new Tshirt();
        
	}

}
