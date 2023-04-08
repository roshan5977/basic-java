package com.jsp.Sbi;

import java.util.Scanner;

public class SBI_BANK extends Bank{
 
	final long ifsc=123455678l;
	final String branch="SAHADEVKHUNTA BRANCH";
	
	
	void createAccount(long accountNum,String userone,String contactnum,long cifNum)
	{
		System.out.println("*******************************************************");
		System.out.println("     STATE BANK OF INDIA     \n "
				+ "BRANCH NAME: "+branch +"\n"
				+ "IFSC CODE: "+ifsc+"\n"
				+ "ACCOUNT NUM: "+accountNum+"\n"
				+ "CIF NUM: "+cifNum);
		System.out.println("ACCOUNT CREATED SUCCESSFULLY");
		
	}
	void depositeAmount()
	{
		
		
	}
	void withdrawAmount()
	{
		
	}
	void checkBalance()
	{
		
	}
	void changePassword()
	{
		
	}
}
