package com.jsp.java8featureinterface;

import java.util.Scanner;

interface Bank1
{
	void rateofInterest();
}

public class LamdaExp1 {

	public static void main(String[] args) {
		boolean falg=true;
		do {

		System.out.println("choose the bank u wanna know interest \n"
				+ "1.SBI  \n"
				+ "2.ICICI  \n"
				+ "3.CANARA \n"
				+ "4.EXIT \n");
		int key =new Scanner(System.in).nextInt();
        Bank1 sbi=() -> System.out.println(" sbi rate of interest is 9%");
        Bank1 icici=( ) -> System.out.println("sbi rate of interest is 12%");
        Bank1 canara=() -> System.out.println("canara bank rate of interest is 15%");
         switch (key) {
		case 1:  sbi.rateofInterest();
			break;
        case 2: icici.rateofInterest();
			break;
       case 3: canara.rateofInterest();
			break;
       case 4: falg=false;
		break;
		default: System.out.println("enter valid input");
			break;
		}
         System.out.println("+++++++++++++++++++++++++++++++");
		} while (falg);
	}
}
