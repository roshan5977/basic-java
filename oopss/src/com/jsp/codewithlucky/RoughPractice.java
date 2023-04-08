package com.jsp.codewithlucky;

class Sun{
     public void m1()
     {
    	 System.out.println("0");
     }
}
class Moon extends Sun
{
      public void m2()
      {
    	  System.out.println("10");
      }
}

public class RoughPractice {

	public static void main(String[] args) {
     Moon m1 = new Moon();
     m1.toString();

	}

}
