package com.jsp.drivenDarkWorld;

import java.util.Scanner;

public class DarkWorldMenu {
static long pass;
	public static void main(String[] args)  {
		Scanner sc =new Scanner(System.in);
		System.out.println("WELCOME U TO THE BEST PLACE IN DARK WORLD");
		System.out.println();
		System.out.println("BOSS PLEASE ENTER UR NAME");
	    String name=sc.next();
		System.out.println("WELCOME "+name+" I  WILL TAKE U TO THE BEST PLACE IN DARK WOLRD");
		System.out.println();
		System.out.println("PLEASE ENTER UR PIN");
		int pin=sc.nextInt();
		 pass=pin++ + ++pin - ++pin + pin++ + --pin + pin-- + pin++ ;
		System.out.println(name+" Ur pin for nexttime is "+pass+" please note it for future reference");
		System.out.println("Enter ur mobile num");
		long mobile=sc.nextLong();
		System.out.println(name+" WE HAVE A LOT OF AREAS WHICH U CAN VISIT PLEASE SAY WHERE U WANNA GO \n"
				+ "PRESS 1 FOR DARK PROGRAM WORLD \n"
				+ "PRESS 2 FOR DARK PATERN WORLD \n "
				+ "PRESS 3 FOR DARK WORLD ATM \n"
				+ "PRESS 4 FOR DARK WORLD UPI SERVICES \n"
				+ "PRESS 5 FOR DARK \n");
		int press=sc.nextInt();
		
	}

}
