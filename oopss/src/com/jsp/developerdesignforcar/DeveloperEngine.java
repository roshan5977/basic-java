package com.jsp.developerdesignforcar;

import java.util.Scanner;

public class DeveloperEngine {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
		Driver driver1 = new Driver();
		while (true) {
		System.out.println("CHOOSE WHICH CAR U WANNA RIDE: \n"
				+ "1.Audi  \n"
				+ "2.Benz  \n"
				+ "3.Swift   \n");
		int opt=sc.nextInt();
		switch (opt) {
		case 1:
			driver1.drive(Audi.getInstance());
			System.out.println("+++++++++++++++++++++");

			break;
case 2:driver1.drive(Benz.getInstance());
	driver1.accessBluetooth(Benz.getInstance());
System.out.println("---------------------------------");

			
			break;

case 3:driver1.drive(Swift.getInstance());
	driver1.accessBluetooth(Swift.getInstance());
	System.out.println("---------------------------------");

	break;


		default:System.out.println("entr a valid input");
			break;
		}
		}
						
		
		/*
		Driver driver1 = new Driver();
		driver1.drive(new Swift());
		
		System.out.println("+++++++++++++++++");
		
		driver1.drive(new Audi());
		
		System.out.println("++++++++++++++++++");
		
		driver1.drive(new Benz());

	*/
	}
}
