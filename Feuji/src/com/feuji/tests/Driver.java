package com.feuji.tests;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("welcome to Driver group \n" + "press 1 to know about activa \n"
				+ "press 2 to know about Mercedes \n" + "press 3 to know about mahindra auto");
		int presss = sc.nextInt();

		switch (presss) {
		case 1:
                      System.out.println("what u wanna know about activa \n"
                      		+ "press 1 for  ");
			break;
		case 2:

			break;

		case 3:

			break;

		default:System.out.println("invalid input");
			break;
		}
	}

}
