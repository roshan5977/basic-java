package com.jsp.inheritance;

import java.util.Scanner;
class Factoriall
{
	private int num;
   //getter
	public int getNum( A n)
	{
		int fact=1;
//		for(int i=1;i<n;i++) fact*=i;
		return fact;
	}
	//setter
	public void setNum(int num)
	{
		this.num=num;
	}
	

}


public class Test6 {

	public static void main(String[] args) {

   int num=new Scanner(System.in).nextInt();
     System.out.println("enter a  num");
     Factoriall n1 = new Factoriall();
     // System.out.println(n1.num);
    //   n1.getNum();
	}

}
