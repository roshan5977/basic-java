package com.jsp.developerdesignforcar;

public class CookDriverTawa{

	public static void main(String[] args) {
		MummyChef mummy = new MummyChef();
		mummy.cooks(new Potato());
		mummy.putsSauce(new Potato());
		System.out.println("++++++++++++++++++++++");
		mummy.cooks(new Carrot());
	   mummy.putsSauce(new Carrot());
	   System.out.println("++++++++++++++++++++++");
	   mummy.cooks(new Onion());
	   
		//mummy.cooks(new Potato());
		//mummy.cooks(new Carrot());
	}
}
