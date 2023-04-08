package com.jsp.java8featureinterface;

@FunctionalInterface
interface Bank
{
	void rateofinterest();
}
public class LamdaExp {
	public static void main(String[] args) {
		Bank bank = () -> System.out.println("rate of interest is 12%");
		bank.rateofinterest();
	}
}
