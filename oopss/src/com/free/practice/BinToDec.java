package com.free.practice;

import java.util.Scanner;

public class BinToDec {

	public static void main(String[] args) {
       int num=new Scanner(System.in).nextInt();
       BinToDec name = new BinToDec();
       //name.binTodec(num);
       name.Dectobin(num);

	}
	public void Dectobin(int n)
	{
		int places=1;
		int bin=0;
		while (n>0) {
			int hold=n%2;
//			bin*=places+hold;
			bin=hold*places+bin;
			places*=10;
			n/=2;
		}
		System.out.println(bin);
	     	
	}
	public void binTodec(int n)
	{
		int dec=0;
		int i=0;
		while (n>0) {
			int hold=n%10;
			if (hold==1) dec+=(int)Math.pow(2,i);
			i++;
			n/=10;
		}
		System.out.println(dec);
	}
	

}
