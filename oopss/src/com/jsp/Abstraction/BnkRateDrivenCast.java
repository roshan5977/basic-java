package com.jsp.Abstraction;

import java.util.Scanner;

/*
import java.util.Scanner;
class Bank
{
	public double rateOfInterest()
	{
		return 0.0;
	}
}
class SBI extends Bank
{
	@Override
	public double rateOfInterest()
	{
		return 0.05;
	}
}
class HDFC extends Bank
{
	@Override
	public double rateOfInterest()
	{
		return 0.14;
	}
}
class ICICI extends Bank
{
	@Override
	public double rateOfInterest()
	{
		return 0.09;
	}
}
class SalesMan extends Bank
{
	public void salesForLoans(Bank bank, double amount) {
		//System.out.println(bank.rateOfInterest());
		double rateOfInterestt=bank.rateOfInterest();
		double roiamount=amount*rateOfInterestt;
		System.out.println(roiamount+" is the amount for the interest of"+rateOfInterestt+" to be paid ");
		int percent=(int)(roiamount*100);
		System.out.println(percent+"");
		double totalAmount =amount+roiamount;
	}
}
class ChooseBank
{
	public Bank choosingBank(int choose) {
		switch (choose) {
		case 1:
			return new SBI();
case 2:
			return new HDFC();
case 3:
	      return new ICICI();
		default:{
			System.out.println("INVALD INPUT");
			return null;
		}
		}
	}
}
public class BnkRateDrivenCast {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("WHICH BANK U WANNA CHOOSE "
				+ "1. SBI  \n"
				+ "2.HDFC \n"
				+ "3.ICICI \n");
		int op=sc.nextInt();
		System.out.println("ENTER THE AMOUNT ");
		  double amount =sc.nextDouble();
		  
		  SalesMan sales = new SalesMan();
		  sales.salesForLoans(new HDFC(), amount);
	}
}
*/
@FunctionalInterface
interface Bank
{
	abstract double rateOfInterest();//perform only one task at a time;
	//we can have n numb of default and static methods,but one abstract.
}
//marker interface
interface Tun
{
	
}
class SBI implements Bank,Tun
{
	@Override
	public double rateOfInterest() {
		return 0.09;
	}
}
class ICICI implements Bank,Tun
{
	@Override
	public double rateOfInterest() {
		// TODO Auto-generated method stub
		return 0.12;
	}
}
class DarkWorldBank 
{
	public void rateOfInterest() {
		
	}
}
class Salesman extends Obj
{
	public void loansForSales(Bank bank,double amount)
	{
		double roi=bank.rateOfInterest();
		int percent=(int)(roi*100);
		double interest = roi*amount;
		double total= interest+amount;
		System.out.println("This bank is with rate of interest "+percent+" % \n"
				+ "The total interest is "+interest+" \n"
						+ "So the total payble money is Rs."+total);
	}
}
class Obj
{
	public Bank choose(int choice) {
		switch (choice) {
		case 1:return new SBI();
        case 2:return new ICICI();
       case 3: return null;
		default:System.out.println("ENTER A VALID INPUT");
		return null;
		}
		
	}
}
class BnkRateDrivenCast
{
	public static void main(String[] args) {
		System.out.println("WELCOME TO DARK BANK INQUIRY  CONSULTANACY \n"
				+ "ENTER THE BELOW CHOICES \n"
				+ "1.SBI \n"
				+ "2.ICICI \n"
				+ "3. Dark world bank");
		Scanner sc=new Scanner(System.in);
		int choice =sc.nextInt();
		System.out.println("enter the amount");
		double amount=sc.nextDouble();
		Salesman salesman = new Salesman();
		salesman.loansForSales(	salesman.choose(choice), amount);
	}
}

































