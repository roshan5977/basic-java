package com.jsp.developerdesignforcar;

public class Benz extends Car {
	private static Benz bu;
	private Benz()
	{
		
	}
	public static Benz getInstance()
	{
		if (bu==null) bu=new Benz();
		return bu;
		
	}
	@Override
	public void start()
	{
		System.out.println("Touch Start");
	}
	
	@Override
	public void accelerate()
	{
		System.out.println("Automatic  Drive");
	}
	
	@Override
	public void stop()
	{
		System.out.println("Touch Stop");
	}
}
