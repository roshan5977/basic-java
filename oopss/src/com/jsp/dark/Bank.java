package com.jsp.dark;

import java.util.Scanner;

public class Bank {

	private CheckingAccount person1;
	private CheckingAccount person2;
	private CheckingAccount person3;
	private CheckingAccount person4;

//non primitive non static reference dm made private
	public Bank() {
		person1 = new CheckingAccount("ROSHAN", 39200287, 1000);
		person2 = new CheckingAccount("RAHIM", 392076867, 2000);
		person3 = new CheckingAccount("SIMRAN", 39200287, 3000);
		person4 = new CheckingAccount("PRATIK", 39200287, 5000);
	}

//constructor initialise non static private refernce dm of bank class
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (;;) {
			System.out.println("SWIPE UR CARD and wait");
			System.out.println("enter ur pin");
			int pin = sc.nextInt();
			Bank b = new Bank();
			System.out.println("HLO WELCOME TO DARK WORLD BANK");
			System.out.println("DO U WANNA DEPOSIT MONEY or WITHDRAW MONEY PRESS D OR PRESS W");
			char press = sc.next().charAt(0);
			if (pin == 8249 && (press == 'd' || press == 'D')) {
				System.out.println("enter the amount u wanna deposit");
				long dep = sc.nextLong();
				b.person1.addFunds(dep);
				System.out.println("MONEY " + dep + " DEPOSITED SUCCESSFULLY !!");
				b.person1.display();
			} else if (pin == 8249 && (press == 'w' || press == 'w')) {
				System.out.println("enter the amount u wanna withdraw");
				long with = sc.nextLong();
				b.person1.withdrawAmount(with);
				System.out.println("MONEY " + with + " WITHDRAWN SUCCESSFULLY !!");
				b.person1.display();
			} else if (pin == 8020 && (press == 'd' || press == 'D')) {
				System.out.println("enter the amount u wanna deposit");
				long dep = sc.nextLong();
				b.person2.addFunds(dep);
				System.out.println("MONEY " + dep + " DEPOSITED SUCCESSFULLY !!");
				b.person2.display();
			} else if (pin == 8020 && (press == 'w' || press == 'w')) {
				System.out.println("enter the amount u wanna withdraw");
				long with = sc.nextLong();
				b.person2.withdrawAmount(with);
				System.out.println("MONEY " + with + " WITHDRAWN SUCCESSFULLY !!");
				b.person2.display();
			} else if (pin == 2056 && (press == 'd' || press == 'D')) {
				System.out.println("enter the amount u wanna deposit");
				long dep = sc.nextLong();
				b.person3.addFunds(dep);
				System.out.println("MONEY " + dep + " DEPOSITED SUCCESSFULLY !!");
				b.person3.display();
			} else if (pin == 2056 && (press == 'w' || press == 'W')) {
				System.out.println("enter the amount u wanna withdraw");
				long with = sc.nextLong();
				b.person3.withdrawAmount(with);
				System.out.println("MONEY " + with + " WITHDRAWN SUCCESSFULLY !!");
				b.person3.display();
			} else if (pin == 9337 && (press == 'd' || press == 'D')) {
				System.out.println("enter the amount u wanna deposit");
				long dep = sc.nextLong();
				b.person4.addFunds(dep);
				System.out.println("MONEY " + dep + " DEPOSITED SUCCESSFULLY !!");
				b.person4.display();
			} else if (pin == 9337 &&( press == 'w' || press == 'w')) {
				System.out.println("enter the amount u wanna withdraw");
				long with = sc.nextLong();
				b.person4.withdrawAmount(with);
				System.out.println("MONEY " + with + " WITHDRAWN SUCCESSFULLY !!");
				b.person4.display();
			}
		}

	}
}
