package com.jsp.Abstraction;
import java.util.Scanner;
class Theatre
{
	int ticketsAvail=100;
	static int count=0;
	int ActicketsAvail=50;
	private static Theatre t;
	private Theatre()
	{
		
	}
	public static Theatre getInstance()
	{
		count++;
		if (t==null) t= new Theatre();
		return t;
	}
	public void reserveTickets(int numTickets)
	{
		if (numTickets>ticketsAvail) {
			System.out.println(numTickets+" are not available!         *");
			System.out.println("Only "+ticketsAvail+" are available         *");
			System.out.println("Customer num"+count);
			System.out.println("*****************************************");
		}
		else
		{
			System.out.println(numTickets+" tickets booked ");
			System.out.println("TICKET FARE IS 100 X"+numTickets+" :     "+(100*numTickets)+"\n"
					+ "Booking charge Rs.20 \n"
					+ "Total fare   :       "+((double)(100*numTickets)+20));
			ticketsAvail-=numTickets;
			System.out.println("Only "+ticketsAvail+" are available         *");
			System.out.println("Customer num"+count);
//			System.out.println("Choose the payment option :    \n"
//					+ "1.PAYTM    \n"
//					+ "2. CARD       \n"
//					+ "3.UPI");
	}
		
		
	}
	public void reserveACTickets(int numTickets)
	{
		if (numTickets>ActicketsAvail) {
			System.out.println(numTickets+" are not available!         *");
			System.out.println("Only "+ActicketsAvail+" are available         *");
			System.out.println("Customer num "+count);
			System.out.println("*****************************************");
		}
		else
		{
			System.out.println(numTickets+" tickets booked ");
			System.out.println("TICKET FARE IS 100 X"+numTickets+" :     "+(150*numTickets)+"\n"
					+ "Booking charge Rs.30 \n"
					+ "Total fare   :       "+((double)(100*numTickets)+30));
			ActicketsAvail-=numTickets;
			System.out.println("Only "+ActicketsAvail+" are available         *");
			System.out.println("Customer num "+count);
//			System.out.println("Choose the payment option :    \n"
//					+ "1.PAYTM    \n"
//					+ "2. CARD       \n"
//					+ "3.UPI");
	}
		
		
	}
}
class BookingApp
{
	public  void bookTickets()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("U wanna book tickets in AC OR non AC  \n"
				+ "1.AC   \n"
				+ "2.NON AC \n");
		int accc=sc.nextInt();
		System.out.println("How many tickets u wanna book");
		int ticket=sc.nextInt();
		Theatre t=Theatre.getInstance();
		if (accc==2) {
			t.reserveTickets(ticket);
		}
		else if (accc==1) {
			t.reserveACTickets(ticket);
		}
		else {
			System.out.println("enter  a valid input");
		}

			}
}
public  class BookMyShow {
	public static void main(String[] args) {
    //IT WILL GIVE DETAILS TO BOOKING APP!!!
		while (true) {
	System.out.println("HLO WELCOME TO BOOK MY SHOW");
	BookingApp ba=new BookingApp();
	ba.bookTickets();
		}
	}
}
