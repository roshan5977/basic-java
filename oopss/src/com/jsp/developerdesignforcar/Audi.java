package com.jsp.developerdesignforcar;

public class Audi extends Car {
	private static Audi au;
	private Audi()
	{
		
	}
	public static Audi getInstance()
	{
		if (au==null) au=new Audi();
		return au;
		
	}
	public void start()
	{
		System.out.println("Button Start");
	}
	public void accelerate()
	{
		System.out.println("Full Clutch Drive");
	}
	public void stop()
	{
		System.out.println("Button Stop");
	}
	public void Bluetooth()
	{
		System.out.println("sony bluetooth speaker");
	}
}
