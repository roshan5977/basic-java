package com.jsp.Wastage;

import java.util.Scanner;

abstract class Bank
{
	abstract public double rateOfInterest();

}
class Sbi extends Bank
{
	private static  Sbi sbi;
	private Sbi()
	{
		
	}
	public static Sbi getInstance()
	{
		if (sbi==null) sbi=new Sbi();
		return sbi;
	}
	public double rateOfInterest() {
		return 0.06;
	}
}
class ICICI extends Bank
{
	private static ICICI icici;
	private ICICI()
	{
		
	}
	public static ICICI getInstance() {
		if (icici==null) icici=new ICICI();
		return icici;
	}
	
public double rateOfInterest() {
		return 0.09;
	}
}
class Hdfc extends Bank
{
	private static Hdfc hdfc;
	private Hdfc()
	{
		
	}
	public static Hdfc getInstance()//factory method making singleton 
	{
		if (hdfc==null) hdfc=new Hdfc();
		return hdfc;
	}
public double rateOfInterest() {
		return 0.12;
	}
}
class getObject
{
	public Bank  ObjectGet(int n)
	{
		switch (n) {
		case 1:
			return Sbi.getInstance();
       case 2:
			return ICICI.getInstance();
      case 3:
	    return Hdfc.getInstance();

		default:System.out.println("ENTER VALID INPUT!!!");
		
			return null;
		}
	}
}
class Salesman extends getObject 
{
	public void salesForLoans(Bank b,double amount)
	{
			System.out.println("For this bank the interest is "+(int)(b.rateOfInterest()*100)+"\n"
					+ "the total amount of interest is "+(b.rateOfInterest()*amount)+"\n"
							+ "And total amount is "+((b.rateOfInterest()*amount)+amount));
	}
	public void salesForFixedDeposit(Bank b,double amount)
	{
		System.out.println("For this bank the interest is "+(int)(b.rateOfInterest()*100)+"\n"
				+ "the total amount of interest is "+(b.rateOfInterest()*amount)+"\n"
						+ "And total amount is "+((b.rateOfInterest()*amount)+amount));
	}
	public void salesForRecuringDeposit(Bank b,double amount)
	{
		System.out.println("For this bank the interest is "+(int)(b.rateOfInterest()*100)+"\n"
				+ "the total amount of interest is "+(b.rateOfInterest()*amount)+"\n"
						+ "And total amount is "+((b.rateOfInterest()*amount)+amount));
	}
	
}
public  class Bankdriven {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Salesman sales=new Salesman();
		boolean flag=true;
		System.out.println("WELCOME TO DARK WORLD BANKING SERVICES \n"
				+ "FOR WHICH BANK U WANNNA TAKE LOAN FROM \n"
				+ "1.SBI \n"
				+ "2.ICICI \n"
				+ "3.HDFC \n"
				+ "choose from above");
		int choose=sc.nextInt();
		System.out.println("ENTER THE AMOUNT::");
		double amt=sc.nextDouble();
		sales.salesForLoans(sales.ObjectGet(choose), amt);
		System.out.println("do u wnt to continue yes or no");
		String d0=sc.nextLine();
	}
}
