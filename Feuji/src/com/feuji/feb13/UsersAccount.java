package com.feuji.feb13;

import java.util.Scanner;

public class UsersAccount {

	public static void main(String[] args) throws Exception {
		Bank hdfc;
		Bank canara;
		canara= new Bank();
		Scanner sc = new Scanner(System.in);
		boolean flag = true, falg = false;
		do {
			System.out.println("Welcome to Dark world bank \n" + "Press 1 for deposit amount \n"
					+ "Press 2 for withdraw amount \n" + "Press 3 for balance enquiry");
			int press = sc.nextInt();
			switch (press) {
			case 1:
				System.out.println("Enter the amount u wanna deposit");
				double amtdep = sc.nextDouble();
				canara.deposit(amtdep);

				break;
			case 2:
				System.out.println("Enter the amount u wanna withdraw");
				double amtwith = sc.nextDouble();
				canara.withdraw(amtwith);
				break;

			case 3:
				canara.checkBalance();
				break;

			default:
				System.out.println("invalid press!!!!");
				break;
			}
			while (true) {
				System.out.println("do u wanna continue  press y or n");
				char cont = sc.next().charAt(0);
				if (cont == 'y' || cont == 'Y') {
					flag = true;
					break;
				} else if (cont == 'n' || cont == 'N') {
					System.out.println("thanks for visiting canara bank ");
					flag = false;
					break;
				} else {
					System.out.println("invalid input try again");
					continue;
				}
			}
		} while (flag);
	}

}
