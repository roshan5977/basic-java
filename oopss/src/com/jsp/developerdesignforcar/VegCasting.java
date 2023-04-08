package com.jsp.developerdesignforcar;

import java.util.Scanner;

class Vegetable
{
	
}
class Potatos extends Vegetable
{
	public void prepareFrenchFries() {
		System.out.println("FRENCH FRIES prepared its delicious");
	}
	
}
class Carrots extends Vegetable
{
	public void prepareCarrotHalwa() {
		System.out.println("Gajar Halwa is good for health");
	}
}

class Shopkeeper
{
	public Vegetable  sell(String vegName) {
		if (vegName.equalsIgnoreCase("Carrot")) return new Carrots();
		if (vegName.equalsIgnoreCase("Potato")) return new Potatos();
		System.out.println("Vegetable not available");
		return null;
	}
}


public class VegCasting {

	public static void main(String[] args) {

		System.out.println("ENTER THE VEGETABLE NAME");
		String vegName=new Scanner(System.in).nextLine();
		
		Shopkeeper shop = new Shopkeeper();
		Vegetable veg= shop.sell(vegName);
		
	 //   if (veg instanceof Carrots) 
	  // 	 (Carrots)veg)
	    	 
     //   if (veg instanceof Potato) 
	    //		 (Potatos)veg).
			
		
		
	}

}
