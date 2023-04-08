package com.jsp.exception;

import java.util.Scanner;

public class Sbi {

	public static void main(String[] args) {
		Account a1 = new Account(1000);
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		while (flag) {
			System.out.println("enter the amout  u wanna withdraw");
			int n = sc.nextInt();
			try {
				a1.withdraw(n);
				flag = false;
				System.out.println("amout withdrawn Successsfully");
				System.out.println("current balance :" + a1.getBal());
			} catch (InsufficientBal ib) {
				System.out.println(ib.getMessage());
			}
			
	}

}
}
