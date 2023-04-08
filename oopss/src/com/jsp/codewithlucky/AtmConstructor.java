package com.jsp.codewithlucky;
import java.util.Scanner;
class Atm{
     double balance;
     
     public void transferfund() {
    	 	
     }
     public void balanceinquiry()
     {
    	 System.out.println("Boss your current balance is "+balance);
     }
     public void ministatement() {
    	 
     }
     public void mobilerecharge() {
    	 
     }
     public void fastcash(double fastcas) {
    	 if (fastcas<100) {
    		 System.out.println("THE AMOUNT MUST BE ATLEAST 100");	
		}
    	 if (fastcas%100!=0) {
    		 System.out.println("THE AMOUNT MUST BE MULTIPLE OF 100");	
		}
    	 if (fastcas>balance) {
    		 System.out.println("INSUFFICIENT BALANCE");	
		}
    	 else
    	 {
    		 balance=balance-fastcas;
    		 
    		 System.out.println(fastcas+" withdrawn sucessfully.");
    		 
    	 }
    	 
     }
     public void withdrawal(double amtwithdrawal) {
    	 if (amtwithdrawal<100) {
    		 System.out.println("THE AMOUNT MUST BE ATLEAST 100");	
		}
    	 if (amtwithdrawal%100!=0) {
    		 System.out.println("THE AMOUNT MUST BE MULTIPLE OF 100");	
		}
    	 if (amtwithdrawal>balance) {
    		 System.out.println("INSUFFICIENT BALANCE");	
		}
    	 else
    	 {
    		 balance=balance-amtwithdrawal;
    		 
    		 System.out.println(amtwithdrawal+" withdrawn sucessfully.");
    		 
    	 }
     }
     public void cashdeposit() {
    	 
     }
     public void pinchange() {
    	 
     }
}

public class AtmConstructor {
       //driver method
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("WELCOME TO DARK WORLD BANK");
		System.out.println("PLEASE SWIPE UR CARD AND WAIT");
		System.out.println("BOSS KINDLY ENTER  UR NAME");
		String name=sc.next();
		System.out.println("HELLO "+name+" WELCOME TO DARK WORLD BANK");
		//do u want mini statement
		System.out.println();
		System.out.println(name+" please enter ur four digit pin");
		int pin=sc.nextInt();
		if (pin==8249||pin==8020||pin==2056) {
			
			System.out.println("Hello boss press what u want \n "
					+ "press 1 : for transfer fund \n "
					+ "press 2 : for balance inquiry \n "
					+ "press 3 : for mini statement \n "
					+ "press 4 : for mobile recharge \n "
					+ "press 5 : for fast cash \n "
					+ "press 6 : for withdrawal \n "
					+ "press 7 : for cash deposit \n "
					+ "press 8 : for pin change \n");
			int press =sc.nextInt();
			if (press==1) {
				Atm a1=new Atm();
				a1.transferfund();
			}
            if (press==2) {
            	Atm a2=new Atm();
            	a2.balance=50000;
            	a2.balanceinquiry();
			}
            if (press==3) {
            	Atm a3=new Atm();
            	a3.ministatement();
			}
            if (press==4) {
            	Atm a4=new Atm();
            	a4.mobilerecharge();
			}
            if (press==5) {
            	Atm a5=new Atm();
            	a5.balance=100000;
            	System.out.println("BOSS ENTER THE AMOUNT U WANNA WITHDRAW");
            	double fast=sc.nextDouble();
            	a5.fastcash(fast);
			}
            if (press==6) {
            	Atm a6=new Atm();
            	a6.balance=5000;
            	System.out.println("BOSS ENTER THE AMOUNT U WANNA WITHDRAW");
            	double with=sc.nextDouble();
            	a6.withdrawal(with);
			}
            if (press==7) {
            	Atm a7=new Atm();
            	a7.cashdeposit();
			}
            if (press==8) {
            	Atm a8=new Atm();
            	a8.pinchange();
			}
		}
	}
}
