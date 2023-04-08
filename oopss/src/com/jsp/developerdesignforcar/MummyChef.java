package com.jsp.developerdesignforcar;

public class MummyChef {

	public void cooks(Vegetables vegetables)
	{
		 vegetables.cooking();
	}
	
	public void putsSauce(Vegetables vegetables)
	{
		if (vegetables instanceof Potato  ) ((Potato)vegetables).sauce();
		if (vegetables instanceof Carrot) ((Carrot)vegetables).sauce();
		}
	
	/*
	public void cooks(Potato potato)
	{
		potato.cooking();
	}
	public void cooks(Carrot carrot)
	{
		carrot.cooking();
	}*/
}
