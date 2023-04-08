package com.jsp.inheritance;

import java.util.Scanner;

class Factor
{
	private int fact=1;

	public int getFact() {
		return fact;
	}

	public void setFact(int num) {
		for(int i=1;i<=num;i++)
		{
			fact*=i;
		}
		this.fact = fact;
	}
	
}
public class Testingfactorial {

	public static void main(String[] args) {
	Factor n1 = new Factor();
	//n1.fact;
	System.out.println("enetr a  num");
	Scanner sc=new Scanner(System.in);
	n1.setFact(sc.nextInt());
	System.out.println(n1.getFact());

	}

}
