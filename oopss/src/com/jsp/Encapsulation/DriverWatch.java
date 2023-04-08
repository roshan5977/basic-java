package com.jsp.Encapsulation;

import java.util.Scanner;

public class DriverWatch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Watch w=null;
		boolean flag=true;
		do {
		System.out.println("WELCOME TO DARK EYE PLUS ");
		System.out.println("CHOOSE THE FOLLOWING ::  \n"
				+ "1: ADD WATCH \n"
				+ "2: SHOW DETAILS \n"
				+ "3: CHOOSE COLOR \n"
				+ "4: EXIT ");
		int cas=sc.nextInt();
		switch (cas) {
		case 1:
		{
			System.out.println("ENTER WATCH BRAND");
			String brand=sc.next();
			System.out.println("ENTER WATCH COLOR");
			String color=sc.next();
			System.out.println("ENTER WATCH PRICE");
			long price=sc.nextLong();
			w = new Watch(brand,color,price);
			System.out.println("WATCH ADDED SUCESSFULLY");
		}
			
			break;
        case 2:
        {
        	if (w==null) {
				System.out.println("NO WATCH FOUND");
			}
			else
			{
				w.Showdetails();
			}
        	
        }
			
			break;
        case 3:
        {
        	if (w==null) {
				System.out.println("NO WATCH FOUND");
			}
			else
			{
				System.out.println("ENTER THE COLOR OF WATCH  U WANT ");
				String wat=sc.next();
				w.setColor(wat);
				System.out.println("WATCH COLOR ADDED SUCESSFULLY U CAN CHECK IT OUT ");
			}
        }
			
			break;
        case 4:
        {
        	flag=false;
        	System.out.println("THANK U BOSS VISIT AGAIN");
        }
			break;
		default:
			System.out.println("PRESS VALID INPUT");
			break;
		}
			
		}while(flag);
		
		
	}

}
