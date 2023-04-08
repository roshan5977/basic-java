package com.feuji.bankApplication;

import java.util.Scanner;

public class BankApplicationForUser {
	public static void main(String[] args) {
		Account user1 = new Account();
		boolean continuee=true;
		Scanner sc = new Scanner(System.in);
		while(continuee) {
		System.out.println("WELCOME TO DARK WORLD BANK \n" + "press 1 for creating account \n"
				+ "press 2 for deposit amount \n" + "press 3 for withdrawing amount \n"
				+ "press 4 for balance inquiry \n" + "press 5 for taking loans ");
		int press = sc.nextInt();
		switch (press) {
		case 1:

			break;
		case 2:
			System.out.println("enter the amount u waana deposit");
			int amt = sc.nextInt();
			user1.deposit(amt);

			break;
		case 3:
			System.out.println("enter the amount u wanna withdraw");
			int amtwith = sc.nextInt();
			user1.withdraw(amtwith);

			break;
		case 4:
			System.out.println(" if u wanna know current balance press 1");
			if (sc.nextInt() == 1)
				user1.balanceEnquiry();

			break;
		case 5:
			System.out.println("Enter the amount of money u wanna take loans");
			user1.loanAmount = sc.nextInt();
			System.out.println("take loan amount u waana know how much interest is  in our bank  \n"
					+ "press 2 for sbi and press 3 for canara");
			int loansint = sc.nextInt();
			if (loansint == 2)
				user1.loans(new Sbi());
			else if (loansint == 3)
				user1.loans(new Canara());

			break;

		default:
			System.out.println("press valid input");
			break;
			
		}
		System.out.println("do u want to continue press y or n");
		char cont=sc.next().charAt(0);
		if(cont=='y'||cont=='Y')continue;
		}
	}

}
