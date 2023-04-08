package com.jsp.Sbi;

import java.util.Scanner;

public class BnkDriver {
	public static void main(String[] args) {
		SBI_BANK sb = new SBI_BANK();
		User u = null;
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		System.out.println("WELCOME TO SBI BANK");
		System.out.println("HLO BOSS");

		do {
			System.out.println("---------------------------------------------------------------");
			System.out.println("CHOOSE THE FOLLOWING WHAT U WANT \n" + "0. CREATE ACCOUNT \n" + "1. DEPOSIT AMOUNT \n"
					+ "2. WIHDRAW AMOUNT \n" + "3. CHECK BALANCE   \n" + "4. CHANGE PASSWORD \n"
					+ "5. ACCOUNT DETAILS \n" + "6. WANNA EXIT");
			System.out.println("press the choice");
			int choose = sc.nextInt();
			if (choose == 0) {

				System.out.println("WELCOME TO SBI THANKS FOR CHOOSING SBI");
				System.out.println("ENTER UR NAME");
				String name = sc.next();
				System.out.println("ENTER UR CONTACT NUMBER");
				String contact = sc.next();
				System.out.println("ENTER AMOUNT MINIMUM 3000 TO CREATE AN ACCOUNT ");
				double amt = sc.nextDouble();
				u = new User(name, contact, new Account("123",amt, sb));
				u.a3.s1.createAccount(u.a3.getAccountNum(), name, contact, u.a3.getCif());
				//System.out.println("NOW U NEED TO CREATE A 7 DIGIT PASSWORD");
				//long pass = sc.nextLong();
				//u.a3.setPassword(pass);
				//System.out.println("PASSWORD CREATED SUCCESSFULLY");
				System.out.println("ur default pass is 123");
				System.out.println("*******************************************************");

			} else {
				if (u == null) {
					System.out.println("CREATE ACCOUNT FIRST ");
				} else {
					System.out.println("ENTER UR PASSWORD");
					while (true) {
					String pass = sc.next();
					if (pass.equals(u.a3.getPassword())) {
						switch (choose) {
						case 1: {
							System.out.println("BOSS ENTER THE AMOUNT U WANNA DEPOSIT:");
							double bal = sc.nextDouble();
							u.a3.setBalance(u.a3.getBalance() + bal);
							System.out.println("UR CURRENT ACCOUNT BLANCE IS:" + u.a3.getBalance());

						}
							break;
						case 2: {
							System.out.println("BOSS ENTER THE AMOUNT U WANNA WITHDRAW:");
							double with = sc.nextDouble();
							System.out.println(with+" WITHDRAWN SUCCCESSFULLY");
							u.a3.setBalance(u.a3.getBalance() - with);
							System.out.println("UR CURRENT ACCOUNT BLANCE IS:" + u.a3.getBalance());
						}
							break;
						case 3: {
							System.out.println("UR CURRENT ACCOUNT BLANCE IS:" + u.a3.getBalance());
						}
							break;
						case 4: {
							System.out.println("SO U WANNA CHANGE PASSWORD ");
							System.out.println("ENTER THE OLD PASS");
						    String p = sc.next();
							if (p.equals(u.a3.getPassword())) {
								System.out.println("ENTER NEW PASSWORD");
								String pa = sc.next();
								u.a3.setPassword(pa);
								System.out.println("password changed successfully");
							}

						}
							break;
						case 5: {
							System.out.println("     STATE BANK OF INDIA     \n " + "BRANCH NAME: " + u.a3.s1.branch
									+ "\n" + "IFSC CODE: " + u.a3.s1.ifsc + "\n" + "ACCOUNT NUM: "
									+ u.a3.getAccountNum() + "\n" + "CIF NUM: " + u.a3.getCif() + "\n"
									+ "CURRENT ACCOUNT BALANCE: " + u.a3.getBalance());
						}
							break;
						case 6: {
							flag = false;
							System.out.println("THANK U FOR CHOOSING SBI ");
						}
							break;
						default:
							System.out.println("ENTER A VALID INPUT");
							break;
						}
						break;
					} else
					{
						System.out.println("INCORRECT PASSWORD !!!!\n" + "ENTER CORRECT PASSWORD>>>");
						continue;
					}
						
					}
				}

			}
		} while (flag);
	}
}
