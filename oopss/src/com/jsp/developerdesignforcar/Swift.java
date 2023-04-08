package com.jsp.developerdesignforcar;

public class Swift extends Car {
	private static Swift su;
	private Swift()
	{
		
	}
	public static Swift getInstance()
	{
		if (su==null) su=new Swift();
		return su;
		
	}

	public void start()
	{
		System.out.println("Key Start");
	}
	public void accelerate()
	{
		System.out.println("Half Clutch Drive");
	}
	public void stop()
	{
		System.out.println("Key Stop");
	}
	public void Bluetooth()
	{
		System.out.println("jbl bluetooth speaker");
	}
	
}
