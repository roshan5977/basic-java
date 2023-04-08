package com.feujiamma.test;

public class RoshanDrinks {

	public static void main(String[] args) {

		Glass<AppleJuice> glass=new Glass<AppleJuice>();
//		System.out.println(glass.getTaste());
		Tray tray=new Tray();
//		tray.add(new Glass<LemonJuce>());
//		tray.add(new Glass<Object>());
//		tray.add(new Glass<LemonJuice>());
		tray.add(new Glass<AppleJuice>());
		
		
		
	}

}
