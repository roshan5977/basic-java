package com.feujiamma.test;

public class Glass<T extends Juice& Liquid> {
	
	private T liquid;
	
	public  String getTaste() {
		return liquid.taste();
	}

}
